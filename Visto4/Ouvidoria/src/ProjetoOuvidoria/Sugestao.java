package ProjetoOuvidoria;

import java.util.ArrayList;

public class Sugestao extends Ouvidoria{
	
	static ArrayList<Sugestao> sugestoes = new ArrayList<>();
	
	public Sugestao(Integer id, String ocorrencias, String name, String email) {
		super(id, ocorrencias, name, email);
		sugestoes.add(this);
	}
	
	public static void listarSugestoes() {
		System.out.println("SUGESTÕES");
		for (Ouvidoria ouvidoria : sugestoes) {
			System.out.println(ouvidoria);
			System.out.println();
		}
	}

}
