public class App {
    public static void main(String[] args) throws Exception {
        Cadastrar cadastrar = new Cadastrar();
        String url = "Files/nomes.csv";

        cadastrar.CadastrarNomes("Deybson", "Ferreira", url);
        cadastrar.CadastrarNomes("Davi", "Souza", url);
        cadastrar.CadastrarNomes("Joao", "Paulo", url);
        cadastrar.CadastrarNomes("Pedro", "Silva", url);
        cadastrar.CadastrarNomes("Marcos", "Antonio", url);
        cadastrar.CadastrarNomes("fafa", "dada", url);
        System.out.println("Arquivo foi gerado com sucesso!");
    }
}
