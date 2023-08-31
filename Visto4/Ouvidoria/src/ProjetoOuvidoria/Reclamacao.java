package ProjetoOuvidoria;

import java.util.ArrayList;

public class Reclamacao extends Ouvidoria {
	
	static ArrayList<Reclamacao> reclamacoes = new ArrayList<>();
	
	public Reclamacao(Integer id, String ocorrencias, String name, String email) {
		super(id, ocorrencias, name, email);
		reclamacoes.add(this);
	}
	
	public static void listarReclamacoes() {
		System.out.println("RECLAMAÇÕES");
		for (Ouvidoria ouvidoria : reclamacoes) {
			System.out.println(ouvidoria);
			System.out.println();
		}
	}

}
