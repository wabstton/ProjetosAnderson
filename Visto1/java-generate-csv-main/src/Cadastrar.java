import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Cadastrar {

    public void CadastrarNomes(String nome, String sobrenome, String url) {
        List<String> existentes = LinhaExistentes(url);
        String linha = nome + ";" + sobrenome + ";";
        existentes.add(linha);

        try {
            String todasLinhas = UnicaLinha(existentes);

            // Create the directory if it doesn't exist
            File directory = new File("Files");
            if (!directory.exists()) {
                directory.mkdirs();
            }

            FileWriter arquivo = new FileWriter(url);
            arquivo.write(todasLinhas);
            arquivo.close();
            System.out.println("Nome cadastrado com sucesso!");
        } catch (IOException error) {
            System.out.println("Erro ao gerar o arquivo " + url);
        }
    }

    public String UnicaLinha(List<String> existentes) {
        StringBuilder unicaLinha = new StringBuilder();
        for (String linha : existentes) {
            unicaLinha.append(linha).append(" \n");
        }
        return unicaLinha.toString();
    }

    public List<String> LinhaExistentes(String url) {
        List<String> result = new ArrayList<>();

        try {
            if (Files.exists(Paths.get(url))) {
                result = Files.readAllLines(Paths.get(url));
            }
        } catch (IOException erro) {
            System.out.println("Erro ao ler o arquivo.");
        }

        return result;
    }
}
