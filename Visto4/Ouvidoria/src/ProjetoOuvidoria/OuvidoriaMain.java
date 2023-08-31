package ProjetoOuvidoria;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class OuvidoriaMain {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		List<Ouvidoria> list = new ArrayList<>();
		boolean parar = true;
		int id = 0;
		int opcao2 = 0;

		Scanner sc = new Scanner(System.in);

		while (parar) {

			Scanner ouvidoria = new Scanner(System.in);
			System.out.println("------------------------------------------------------------------------------");
			System.out.println("\t<<<<<<<<< BEM VINDO AO SISTEMA DE OUVIDORIA CONNECTA >>>>>>>>>");
			System.out.println("------------------------------------------------------------------------------");
			System.out.println();
			System.out.println("--------------------------------");
			System.out.println("1- CADASTRAR OCORRÊNCIAS");
			System.out.println("2- LISTAR OCORRÊNCIAS");
			System.out.println("3- APAGAR OCORRÊNCIAS");
			System.out.println("4- APAGAR OCORRÊNCIA POR ID");
			System.out.println("5- PESQUISAR OCORRÊNCIAS POR ID");
			System.out.println("6- PESQUISAR OCORRÊNCIAS POR NOME");
			System.out.println("7- SAIR");
			System.out.println("--------------------------------");
			System.out.println();

			System.out.println(">>>> DIGITE A OPÇÃO DESEJADA ->");

			int opcao = Integer.parseInt(ouvidoria.nextLine());

			switch (opcao) {

			case 1: {

				System.out.println("****** VOCÊ SELECIONOU A OPÇÃO CADASTRO DE OCORRÊNCIAS ******");

				boolean escolheu = false;

				while (escolheu == false) {
					System.out.println();
					System.out.println(">>>> QUAL OCORRÊNCIA VOCÊ DESEJA CRIAR? ");
					System.out.println();
					System.out.println("1 - Reclamação ");
					System.out.println("2 - Elogio ");
					System.out.println("3 - Sugestão ");
					System.out.println("0 - Voltar ");

					opcao2 = Integer.parseInt(ouvidoria.nextLine());

					switch (opcao2) {

					case 0: {
						escolheu = true;
						break;
					}

					case 1: {
						System.out.println("VOCÊ ESCOLHEU A OPÇÃO RECLAMAÇÃO");
						escolheu = true;
						break;
					}
					case 2: {

						System.out.println("VOCÊ ESCOLHEU A OPÇÃO ELOGIO");
						escolheu = true;
						break;
					}
					case 3: {

						System.out.println("VOCÊ ESCOLHEU A OPÇÃO SUGESTÃO");
						escolheu = true;
						break;
					}
					default: {
						System.out.println("<<<<<<< * OPÇÃO INVÁLIDA * >>>>>>>");
						break;
					}
					}
				}

				if (opcao2 == 0) {
					break;
				}

				System.out.println();
				System.out.println("DIGITE QUANTAS OCORRÊNCIAS DESEJA REGISTRAR: ");
				int N = Integer.parseInt(ouvidoria.nextLine());

				for (int i = 0; i < N; i++) {

					id += 1;
					System.out.println("DIGITE A OCORRÊNCIA Nº" + (id) + "  >>>>>>>>>>");
					String ocorrencias = sc.nextLine();
					System.out.println("Digite seu nome: ");
					String name = sc.nextLine();
					System.out.println("Digite o seu email:");
					String email = sc.nextLine();

					if (opcao2 == 1) { 
						Reclamacao reclamacao1 = new Reclamacao(id, ocorrencias, name, email);
					} else if (opcao2 == 2) { 
						Elogio elogio1 = new Elogio(id, ocorrencias, name, email);
					} else if (opcao2 == 3) { 
						Sugestao sugestao1 = new Sugestao(id, ocorrencias, name, email);
					}
				}

				System.out.println(">>>> OBRIGADO, EM BREVE ENTRAREMOS EM CONTATO <<<< ");

				System.out.println("");

				break;
			}

			case 2: {
				System.out.println();
				Ouvidoria.listarManifestacoes();
				break;
			}
			case 3: {

				System.out.println("\t****** VOCÊ APAGOU TODAS AS OCORRÊNCIAS ******");

				Ouvidoria.zerarLista();
				break;
			}
			case 4: {
				System.out.println("Digite o ID da ocorrência que deseja apagar: ");
				int idOcorrencia = Integer.parseInt(ouvidoria.nextLine());

				Ouvidoria.apagarId(idOcorrencia);

			}
				break;

			case 5: {
				System.out.println("Digite o ID da ocorrência que deseja visualizar: ");
				int idOcorrencia = Integer.parseInt(ouvidoria.nextLine());
				Ouvidoria.manifestacaoId(idOcorrencia);

				break;
			}

			case 6: {
				System.out.println("Digite o NOME da ocorrência que deseja visualizar: ");
				String nomePessoa = sc.nextLine();
				Ouvidoria.manifestacaoNome(nomePessoa);

				break;
			}

			case 7: {
				System.out.println("\t>>>>>  (( Agradecemos Por Utilizar Nosso Sistema!! ))  <<<<<");
				parar = false;
				ouvidoria.close();
				break;
			}
			default:
				System.out.println("****** OPÇÃO INVÁLIDA ******");
				System.out.println();
				break;

			}

		}
	}
}