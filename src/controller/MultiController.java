package controller;
//receba 2 valores A e B e, por somas, apresente o resultado da multiplica��o de A por B.
public class MultiController {

	public MultiController() {
		super();
	}
	public int multiplica(int numA, int numB) {
		
		if (numB==1) {		//Quando 'numA' est� sendo multiplicado por '1' retorna ele mesmo
			return numA;	//Quando retorna 'numA', a funcao est� retornando a multiplicacao de 'numA' por 1 
		}else {	//Quando isso n�o � verdadeiro
			
			int mult = numA + multiplica(numA, numB-1); //'mult' recebe a soma do 'numA' pela multiplicacao de 'numA' e ('numB'-1)
			return mult; 	//retorna a soma dos numeros
		}
		
	}

}
