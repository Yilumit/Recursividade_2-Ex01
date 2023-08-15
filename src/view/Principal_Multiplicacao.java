package view;
//Recebe 2 valores A e B e, por somas, apresenta o resultado da multiplicação de A por B.
import controller.MultiController;

public class Principal_Multiplicacao {

	public static void main(String[] args) {
		MultiController cMet = new MultiController();
		int A = 5; int B = 5;
		System.out.println("A multiplicacao de "+A+" x "+B+" = "+cMet.multiplica(A, B));

	}

}
