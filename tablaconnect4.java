import java.util.Scanner;

	public class tablaconnect4{
		public static void main(String[] args){
			Scanner lea = new Scanner(System.in);

			String tabla[][] = new String[6][7];
			

			System.out.println(" ");
			System.out.println("CONNECT FOUR");
			for(int f =0; f<tabla.length;f++){
				for(int c=0; c<tabla[f].length; c++){
					tabla[f][c]= new String("_");
				}
			}

			for(int f =0; f<tabla.length;f++){
				for(int c=0; c<tabla[f].length; c++){
					System.out.print(tabla[f][c]);
					System.out.print(" ");
				}

				System.out.println(" ");
			}

			boolean turno=true;

				for(int conta=0;conta<=3;conta++){
			do{
		
			if (turno==true){
			
			System.out.println("Jugador1: Ingrese el Numero de Columna(1-7) en que Desea su Ficha");
			int colum;
			colum= lea.nextInt();			
			if(colum==0 || colum>7){
				System.out.println("Columna Incorrecta: No Existe"+"\n"+"Ingrese Nuevamente: Num.Columnas(1-7)"+"\n");
			 	colum= lea.nextInt();
			 }else{
/**
for(int f=0;f<tabla.length;f++){
					for(int c=0;c<tabla[f].length;c++){
						if (tabla[f][colum-1].equals("_"))
							tabla[f][colum-1]= "R";
							System.out.print(tabla[f][c]);
							System.out.print(" ");
*/
			 	for(int f=0;f<tabla.length;f++){
					for(int c=0;c<tabla[f].length;c++){x	
						if (tabla[f][colum-1].equals("_"))
							tabla[f][colum-1]= "R";
							System.out.print(tabla[f][c]);
							System.out.print(" ");
						}
						System.out.println(" ");

					}
				}		
			}	
		}while(turno==false);
		

			System.out.println("Jugador2: Ingrese el Numero de Columna(1-7) en que Desea su Ficha");

			int colum;
			colum= lea.nextInt();

			if(colum==0 || colum>7){
				System.out.println("Columna Incorrecta: No Existe"+"\n"+"Ingrese Nuevamente: Num.Columnas(1-7)"+"\n");
			}else{
				for(int f=0;f<tabla.length;f++){
					for(int c=0;c<tabla[f].length;c++){
						if (tabla[f][colum-1].equals("_"))
							tabla[f][colum-1]= "Y";
							System.out.print(tabla[f][c]);
							System.out.print(" ");
						}
						System.out.println(" ");
					}
				}
			}
		}		
	}