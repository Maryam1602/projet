package puissance4;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class projet {
	public static int entierAleatoire(int a, int b){
		//Retourne un entier alÃ©atoire entre a (inclus) et b (inclus)
		return ThreadLocalRandom.current().nextInt(a, b + 1);	
	}
	
	static int[][]grilles = new int[6][7];
	
	public static void initialiseGrille() {
		for(int i = 0; i<6; i++)
			for(int j = 0; j<7;j++) {
				grilles[i][j]=0;
			
		}
		
	}
	
	public static void afficheTab2D(int[][]tab) {
		for(int i = 0; i<tab.length; i++) {
			for(int j = 0; j<tab[i].length; j++)
				System.out.print(tab[i][j] + " ");
			System.out.println();
		}
		System.out.println();
	}
	

	public static void main(String[] args) {
		afficheTab2D(grilles);

		
	}
}

