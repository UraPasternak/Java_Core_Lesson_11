package ua.lviv.lgs.hw11.zavdania2;

import java.util.Scanner;
import java.util.Arrays;

public class MainMenu {

	public static void main(String[] args) {
		Avto avto = new Avto(100, 2005, new Kermo(15), new Dvygun(4));
		Avto[] areyAvto = new Avto[RandomZ.ramdomZnach(1, 10)];
		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.println("Введіть \"а\", якщо бажаєте вивести toString() даних елементів масиву на консоль");
			System.out.println(
					"Введіть \"б\", якщо бажаєте для всіх обєктів даного масиву засетити одинаковий  обєкт класу Авто");
			String s = scan.nextLine();

			switch (s) {

			case "а": {
				for (int i = 0; i < areyAvto.length; i++) {
					areyAvto[i] = new Avto();
				}
				System.out.println(Arrays.deepToString(areyAvto));
				System.out.println("==========================================================================");
				break;
			}
			case "б": {
				Arrays.fill(areyAvto, avto);
				System.out.println(Arrays.deepToString(areyAvto));
				System.out.println("==========================================================================");
				break;
			}
			default: System.out.println("Введіть \"а\", або \"б\" !!!");
			}
		}

	}

}
