package demos;

public final class Utilidad {
	static {
		System.out.println("Se carga la clase Utilidad");
	}
	private Utilidad() {}
	public static double avg(long primero, long... valores) {
		//if(valores.length == 0) return 0;
		long rslt = primero;
		for (long i : valores) {
			rslt += i;
		}
		return (double)rslt / (valores.length + 1);
	}
	public static double avg(double primero, double... valores) {
		//if(valores.length == 0) return 0;
		double rslt = primero;
		for (double i : valores) {
			rslt += i;
		}
		return rslt / (valores.length + 1);
	}
	public static double avg(int primero, int... valores) {
		//if(valores.length == 0) return 0;
		int rslt = primero;
		for (int i : valores) {
			rslt += i;
		}
		return (double)rslt / (valores.length + 1);
	}
	public static double avg(String primero) {
		return 0;
	}


}
