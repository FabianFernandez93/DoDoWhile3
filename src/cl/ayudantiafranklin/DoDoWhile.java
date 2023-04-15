package cl.ayudantiafranklin;

public class DoDoWhile {
	
	int inicio = 0;
	int termino = 5;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int inicio = 0;
		int termino = 5;
		
		while (inicio<termino) {
			System.out.println("Cualquier cosa en while: " +inicio);
			inicio++;			
		}
		for (int i = 0; i < termino ; i++) {
			System.out.println("Cualquier cosa en for: " +i);
			
					
		}
		
		{
			int n = 10;
			
			for (int i = 1;i <10; i++) {
				int mult = 1 * i;
				System.out.println("1 * " + i + " = " + mult);
			}System.out.println();			
		}
		
		//EJERCICIO DESAFIO
		{
			
			int i = 0;
/*			while (i<50) {
				i+=1;
				System.out.printf("iteracion %d\n", i);				
			}*/			
/*
 * do { i+=1; System.out.printf("iteracion %d\n", i); }
 * 
 * 
 */
		}
		
		
		
		/*
		 * do { if(inicio == termino){ System.out.println(inicio); }else {
		 * System.out.println(inicio); inicio++; } } }
		 */
	}

}
