package application;

import java.util.Locale;
import java.util.Scanner;

import util.Champion;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite os dados do primeiro campeão:");
		System.out.print("Nome: ");
		String namePlayer1 = sc.next();
		System.out.print("Vida inicial: ");
		int lifePlayer1 = sc.nextInt();
		System.out.print("Ataque: ");
		int attackPlayer1 = sc.nextInt();
		System.out.print("Armadura: ");
		int armorPlayer1 = sc.nextInt();
		Champion champion1 = new Champion(namePlayer1,lifePlayer1,attackPlayer1,armorPlayer1);
		
		System.out.println();
		System.out.println("Digite os dados do segundo campeão:");
		System.out.print("Nome: ");
		String namePlayer2 =  sc.next();
		System.out.print("Vida inicial: ");
		int lifePlayer2 = sc.nextInt();
		System.out.print("Ataque: ");
		int attackPlayer2 = sc.nextInt();
		System.out.print("Armadura: ");
		int armorPlayer2 = sc.nextInt();
		Champion champion2 = new Champion(namePlayer2,lifePlayer2,attackPlayer2,armorPlayer2);
		
		System.out.print("Quantos turnos você deseja executar? ");
		int quantTurnos = sc.nextInt();
		
		for (int i = 0; (i<quantTurnos & champion1.getLife()>0 & champion2.getLife()>0); i++) {
			champion1.takeDamage(champion2);
			champion2.takeDamage(champion1);
			System.out.println("Resultado do turno "+ i++ + ":");
			System.out.println(champion1.status());
			System.out.println(champion2.status());
			System.out.println();
		}
		
		System.out.println("FIM DO COMBATE");
		
		
		
		sc.close();

	}

}
