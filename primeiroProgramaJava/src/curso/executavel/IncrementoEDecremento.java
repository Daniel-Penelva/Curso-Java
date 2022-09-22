package curso.executavel;

public class IncrementoEDecremento {

	public static void main(String[] args) {

		int z = 100;

		++z;
		System.out.println(z); // 101

		z++;
		System.out.println(z); // 102

		System.out.println(++z); // 103
		System.out.println(z++); // 103

		System.out.println("\n");

		int x = 100;

		--x;
		System.out.println(x); // 99

		x--;
		System.out.println(x); // 98

		System.out.println(--x); // 97

		System.out.println(x--); // 97

		System.out.println("\n");
		
		int y = 10;

		y += 2; // y = y + 2
		System.out.println(y); // 12
	}

}
