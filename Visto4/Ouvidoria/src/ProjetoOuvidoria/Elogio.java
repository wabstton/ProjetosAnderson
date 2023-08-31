package ProjetoOuvidoria;

import java.util.ArrayList;

public class Elogio extends Ouvidoria {
	
	static ArrayList<Elogio> elogios = new ArrayList<>();

	public Elogio(Integer id, String ocorrencias, String name, String email) {
		super(id, ocorrencias, name, email);
		elogios.add(this);
	}
	
	public static void listarElogios() {
		System.out.println("ELOGIOS");
		for (Ouvidoria ouvidoria : elogios) {
			System.out.println(ouvidoria);
			System.out.println();
		}
	}

}
