package controller;
//receba 2 valores A e B e, por somas, apresente o resultado da multiplicação de A por B.
public class MultiController {

	public MultiController() {
		super();
	}
	public int multiplica(int numA, int numB) {
		
		if (numB==1) {		//Quando 'numA' está sendo multiplicado por '1' retorna ele mesmo
			return numA;	//Quando retorna 'numA', a funcao está retornando a multiplicacao de 'numA' por 1 
		}else {	//Quando isso não é verdadeiro
			
			int mult = numA + multiplica(numA, numB-1); //'mult' recebe a soma do 'numA' pela multiplicacao de 'numA' e ('numB'-1)
			return mult; 	//retorna a soma dos numeros
		}
		
	}

}
