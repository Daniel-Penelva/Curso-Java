package curso.executavel.exemplosSimples;

import javax.swing.text.html.HTMLEditorKit.Parser;

public class ClasseTiposPrimitivos {

	public static void main(String[] args) {

		// Tipos primitivos

		short num1 = 1;
		byte num2 = 10;
		int num3 = 100;
		long num4 = 10000l;
		float num5 = 3.4f;
		double num6 = 3.555555;
		boolean flag = true;
		char a = 'a';

		// Classes Wrappers

		Short num7 = new Short((short) 1);

		Byte num8 = new Byte((byte) 10);

		Integer num9 = new Integer(100);

		Long num10 = new Long(10000000l);

		Float num11 = new Float(19.90f);

		Double num12 = new Double(12.88888);

		Boolean flag1 = new Boolean(true);

		Character a1 = new Character('b');

		// Todas as classes wrappers consegue fazer a conversão de um tipo.

		System.out.println(num11.intValue());

		// Outra maneira é fazendo com o parse -> Numero primitivo (int) para objeto do
		// tipo Integer

		int num13 = Integer.parseInt("11");
		System.out.println(num13);

		double num14 = Double.parseDouble("30.903434");
		System.out.println(num14);

		// Outro método da classe Wrappers é o valueOf -> Numero primitivo para uma
		// instancia de objeto
		Integer num15 = Integer.valueOf(1234);
		System.out.println(num15);

		// Autoboxing

		Short num16 = 1;

		Byte num17 = 10;

		Integer num18 = 100;

		Long num19 = 10000000l;

		Float num20 = 19.90f;

		Double num21 = 12.88888;

		Boolean flag3 = true;

		Character a2 = 'b';

		// auto un-boxing

		int num22 = num18;
		System.out.println(num22);

		// equivale a

		num18.intValue();

		// auto un-bixing em expressoes
		num18++;
		System.out.println(num18);

		Integer num23 = num22 / num18;
		System.out.println(num23);

		/*
		 * Mau uso - para calculos matematicos não é bom usar Classes Wrappers e sim
		 * tipos primitivos.
		 */
		Double x, y;
		x = 10.0;
		y = 5.0;

		Double media = (x + y) / 2;
		System.out.println(media);

	}

}
