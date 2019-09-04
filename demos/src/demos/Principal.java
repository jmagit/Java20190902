package demos;

public class Principal {
	static {
		System.out.println("Se carga la clase Principal");
	}
	public static void main(String[] args) {
		int i;
		IPersonas persona = new Alumno();
		persona.setNombre("Pepito");
		System.out.println(Persona.getCount());
		i = persona.valoracion();
		//((Alumno)persona).set
		//persona = new Profesor("Pepito", "Grillo");
		persona = null;
		System.runFinalization();
		System.out.println(Persona.getCount());
		
		persona = Profesor.create();
		persona = null;
		System.gc();
		System.out.println(Persona.getCount());
		
		Nominal n = Profesor.create();
		System.out.println(n.getNombre());
		n = new Alumno("Alumno", "uno");
		System.out.println(n.getNombre());
		n = new Curso();
		n.setNombre("Java");
		System.out.println(n.getNombre());
		
		Object o = new Alumno("Alumno", "uno");
		// ...
		
		if(o instanceof Nominal) {
			System.out.println(((Nominal)o).getNombreCompleto());
		}
		System.out.println(Calcula.divide(1, 0));
		
		Elemento<Integer> provincia = new Elemento<Integer>(28, "Madrid");
		Elemento<Character> estadoElemento = new Elemento<Character>('M', "Matriculado"); 
	}

	public static void ejemplos1(String[] args) {
		int i = 123214560;
		char c, c1 = 0;
		c = (char) i;
		c = '7';
		System.out.println((int) c1);
		System.out.println((int) c);
		System.out.println((int) (c - '0'));
		if (c == c1) {
		}
		int[][] t = new int[10][10];
		t = new int[10][];
		t[0] = new int[10];
		t[1] = new int[2];
		int v[] = t[0];
		t[0] = t[1];
		t[1] = v;
		v[0] = 1;
		boolean r = v[0] == t[0][0];

		v = t[0].clone();
		v[0] = 2;
		r = v[0] == t[0][0];
		i += 1;
		i = i + 1;

		// if(v != null & v[1] == 4)
		v = new int[] { 1, 2, 3 };

		i = v[0];
		i = t[0][0];
		t = null;
		int m = 0b0110_1001;
		i = m << 4 >> 4;
		i = ++m;
		i = 10;
		m = 3;
		if (i < 0) {
			if (m > 0)
				i = 1;
			else
				i = 0;
		}

		i = 1;
		switch (i) {
		case 1:
			i++;
		case 2:
			m = 1;
			break;
		case 4:
			m = 2;
			break;
		default:
			m = 3;
			break;
		}
		i = 0;
		while (v.length > i && v[i++] == 0)
			;
		superior: while (true) {
			// ...
			if (i > 0)
				continue;
			// ...
			if (v[i++] == 0)
				break;
			// ..
			for (int j = 0; j < v.length; j++) {
				m += v[j];
				if (m > 100)
					break superior;
			}
		}
		m = 0;
		for (int j = 0; j < v.length; j++) {
			m += v[j];
		}
		for (int j : v) {
			m += j;
		}
		double d;
		d = Utilidad.avg(1.0, 2.0);
		d = Utilidad.avg((long)1, 2, 3);
		d = Utilidad.avg(1, 2, 3, 4, 5, 6);
//		d = avg(1, new int[] {1,2,3});
//		d = avg(new int[] {1,2,3});
		d = Utilidad.avg("Algo");
	}

//	public static double avg(int... valores) {
//		if(valores.length == 0) return 0;
//		int rslt = 0;
//		for (int i : valores) {
//			rslt += i;
//		}
//		return (double)rslt / valores.length;
//	}
}
