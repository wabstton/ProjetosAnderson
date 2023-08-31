import requests
from bs4 import BeautifulSoup
import psycopg2

# Página que vamos trabalhar
url = 'https://www.pichau.com.br/hardware/placa-de-video'

headers = {
    'User-Agent': "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/86.0.4240.198 Safari/537.36"}

site = requests.get(url, headers=headers)
soup = BeautifulSoup(site.content, 'html.parser')
placas = soup.find_all('div', class_='product details product-item-details')
ultima_pagina = soup.find('span', class_='text-page last').get_text().strip()

# Configuração de conexão com o banco de dados PostgreSQL
conn = psycopg2.connect(
    dbname="seu_banco_de_dados",
    user="seu_usuario",
    password="sua_senha",
    host="seu_host",
    port="sua_porta"
)
cursor = conn.cursor()

for i in range(1, int(ultima_pagina)):
    url_pag = f'https://www.pichau.com.br/hardware/placa-de-video?p={i}'
    site = requests.get(url_pag, headers=headers)
    soup = BeautifulSoup(site.content, 'html.parser')
    placas = soup.find_all('div', class_='product details product-item-details')

    for placa in placas:
        # ... Seu código para extrair informações das placas ...

        # Inserir os dados no banco de dados PostgreSQL
        insert_query = "INSERT INTO placas (marca, preco, preco_boleto) VALUES (%s, %s, %s)"
        cursor.execute(insert_query, (marca, num_preco, num_preco_boleto))
        conn.commit()

# Fechar conexão com o banco de dados
cursor.close()
conn.close()
