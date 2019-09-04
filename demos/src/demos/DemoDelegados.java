package demos;


public class DemoDelegados {
	public enum Tipo {
		ASC, DES
	}
	@FunctionalInterface
	interface Comparar {
		int compara(String s1, String s2, Tipo tipo);
	}
	
	class OAsc implements Comparar {
		@Override
		public int compara(String s1, String s2, Tipo tipo) {
			if(tipo == Tipo.ASC)
				return s1.compareTo(s2);
			else
				return -s1.compareTo(s2);
		}
	}
	
	void ordena(String[] t, Comparar comp, Tipo tipo) {
		int i = 0;
		// ...
			if(comp.compara(t[i], t[i+1], tipo) == -1) {
				
			} else if(comp.compara(t[i], t[i+1], tipo) == 0) {
				
			} else {
				
			}
		// ...
	}
	
	void otro () {
		String[] cadStrings = null;
		
		ordena(cadStrings, new OAsc(), Tipo.ASC);
		ordena(cadStrings, new Comparar() {
			@Override
			public int compara(String s1, String s2, Tipo tipo) {
				if(tipo == Tipo.ASC)
					return s1.compareTo(s2);
				else
					return -s1.compareTo(s2);
			}
		}, Tipo.ASC);
		ordena(cadStrings, (s1, s2, t) -> (t == Tipo.ASC ? 1 : -1) * s1.compareTo(s2), Tipo.ASC);
		Comparar comparar = (s1, s2, t) -> (t == Tipo.ASC ? 1 : -1) * s1.compareTo(s2);
		ordena(cadStrings, comparar, Tipo.ASC);
		
//		Persona rsltPersona = listaDePersonas.find(item -> { 
//			int i = 0;
//			if(p.getNombre().equals("P"))
//				return 1;
//			else
//				return 2;
//		});
	}
}
