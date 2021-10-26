package whatever;

import java.util.ArrayList;
import java.util.Scanner;

public class Interface {

	

		ArrayList<String> items = new ArrayList<String>();

		Scanner sc = new Scanner(System.in);

		String strparar = "parar";

		int cont;

		int parar = 0;

								while (parar == 0) {
						
									System.out.println("Para parar Digite: parar");
									System.out.println("    ou");
									System.out.println("Digite um item:");
						
									String str = sc.nextLine(); // reads string
						
									if (str.compareTo(strparar) == 0) {
																			parar = 1;
																						} else {
																							items.add(str);
																							cont++;
																											}
								                   }

}


