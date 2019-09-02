package demos;

public class principal {

	public static void main(String[] args) {
		int i = 123214560;
		char c, c1 = 0;
		c = (char)i;
		c = '7';
			System.out.println((int)c1);
			System.out.println((int)c);
			System.out.println((int)(c - '0'));
		if (c == c1) { 
		}
		int [][] t = new int[10][10];
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
		
		//if(v != null & v[1] == 4)
		v = new int[] { 1, 2, 3};
		
		i = v[0];
		i = t[0][0];
		t = null;
	}

}
