import java.util.Scanner;


class AreaTriangulo {
	
	
	public static void main (String args []){
		
		Scanner teclado = new Scanner (System.in);
	

	Float baseMenor;
	Float baseMaior;
	Float altura;
	Float soma;
	Float resultado;
	
	System.out.printf ("Insira a medida da base menor\n");
	baseMenor = teclado.nextFloat();
	
	System.out.printf ("Insira a medida da base maior\n");
	baseMaior = teclado.nextFloat();
	
	System.out.printf ("Insira a medida da altura\n");
	altura = teclado.nextFloat();
	
        soma =  baseMenor + baseMaior + altura;
	
	resultado = soma / 2;
	
	System.out.printf("A area do triangulo e de %f", resultado);
	
	
	System.exit(0);
	
	
	
		
		
		
		
		
	}
}	