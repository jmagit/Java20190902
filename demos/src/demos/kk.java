package demos;

import java.awt.event.ItemEvent;

public class kk {
	@FunctionalInterface
	interface Comparar {
		int compara(String s1, String s2);
	}
	
	class OAsc implements Comparar {
		@Override
		public int compara(String s1, String s2) {
			return s1.compareTo(s2);
		}
	}
	
	void ordena(String[] t, Comparar comp) {
		int i = 0;
		// ...
			if(comp.compara(t[i], t[i+1]) == -1) {
				
			} else if(comp.compara(t[i], t[i+1]) == 0) {
				
			} else {
				
			}
		// ...
	}
	
	void otro () {
		String[] cadStrings = null;
		
		ordena(cadStrings, new OAsc());
		ordena(cadStrings, new Comparar() {
			@Override
			public int compara(String s1, String s2) {
				return -s1.compareTo(s2);
			}
		});
		ordena(cadStrings, (s1, s2) -> -s1.compareTo(s2));
		Comparar comparar = (s1, s2) -> -s1.compareTo(s2);
		ordena(cadStrings, comparar);
		
//		Persona rsltPersona = listaDePersonas.find(item -> { 
//			int i = 0;
//			if(p.getNombre().equals("P"))
//				return 1;
//			else
//				return 2;
//		});
	}
}
