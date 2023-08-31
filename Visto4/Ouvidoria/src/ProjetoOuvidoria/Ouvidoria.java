package ProjetoOuvidoria;

import java.util.ArrayList;

public class Ouvidoria {

	static ArrayList<Ouvidoria> manifestacoes = new ArrayList<>();

	private Integer id;
	private String ocorrencias;
	private String name;
	private String email;

	public Ouvidoria(Integer id, String ocorrencias, String name, String email) {
		super();
		this.id = id;
		this.ocorrencias = ocorrencias;
		this.name = name;
		this.email = email;

		manifestacoes.add(this);
	}

	public static void listarManifestacoes() {
		System.out.println("MANIFESTAÇÕES");
		System.out.println();
		for (Ouvidoria ouvidoria : manifestacoes) {
			System.out.println(ouvidoria);
			System.out.println();
		}
	}

	public static void manifestacaoId(int id) {
		System.out.println("MANIFESTAÇÃO POR ID");
		System.out.println();
		for (Ouvidoria manifestacao : manifestacoes) {
			if (manifestacao.getId() == id) {
				System.out.println(manifestacao);
				System.out.println();
				break;
			}
		}
	}

	public static void manifestacaoNome(String nome) {
		System.out.println("MANIFESTAÇÃO POR NOME");
		System.out.println();
		for (Ouvidoria manifestacao : manifestacoes) {
			if (manifestacao.getName().equals(nome)) {
				System.out.println(manifestacao);
				System.out.println();
				break;
			}
		}
	}
	
	public static void apagarId(int id) {
		System.out.println("MANIFESTAÇÃO POR ID");
		System.out.println();
		for (Ouvidoria manifestacao : manifestacoes) {
			if (manifestacao.getId() == id) {
				manifestacoes.remove(manifestacao);
				break;
			}
		}
	}
	
	public static void zerarLista() {
		manifestacoes.clear();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getOcorrencias() {
		return ocorrencias;
	}

	public void setOcorrencias(String ocorrencias) {
		this.ocorrencias = ocorrencias;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String toString() {
		return "ID Ocorrência: " + id + "\nOcorrência: " + ocorrencias + "\nPessoa: " + name + "\nEmail: " + email;

	}

	public void pesquisarPorNome(String nome) {

	}

}