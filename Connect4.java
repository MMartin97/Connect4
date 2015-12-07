
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Martin
 */
public class Connect4 {
    
    
            
    public void play(){
        
        String arr1 [][] = new String [6][7];


		// Variable de las piezas
		String p1 = " R ", p2 = " Y ";
		  


	        // Variable Scanner

		Scanner rd = new Scanner(System.in);
			
		

		// Variables de los espacios en blanco del tablero
		String relleno = " _ ";

		

		//Relleno del arreglo
		
		for( int f = 0; f<6 ; f++){
			for(int c = 0; c<7; c++){
				arr1[f][c] = relleno;
			}
		}


		

                            // Codigo para ver el tablero
                            for (String[] arr11 : arr1) {
                                    for (String arr111 : arr11) {
                                        System.out.print("|" + arr111 + "|");
                                    }
                                System.out.println("  ");
                            }
                            // Ingreso de Piezas
		

		
                Boolean player = true;
                
		//Contadores para el primer JUGADOR
		int cont1 =1;
		int cont2 =1;
		int cont3 =1;
		int cont4 =1;
		int cont5 =1;
		int cont6 =1;
		int cont7 =1;
		//Contadores para el segundo JUGADOR
		int cont8 =1;
		int cont9 =1;
		int cont10 =1;
		int cont11 =1;
		int cont12 =1;
		int cont13 =1;
		int cont14 =1;
		


		while (player){
			System.out.println("Ingrese el numero de la Columna");
				 int a = rd.nextInt();


				

			

		if ( a == 1 ){

			
			if(arr1[5][a-1].equals(" _ ")){
		 	
			arr1[5][a-1]= p1;
                        player = false;
			}
				else if(arr1[5-cont1][a-1].equals(p2)){

					arr1[5-cont8][a-1]= p1;
					cont8++;
                                        player = false;

				}
					else{
			

						arr1[5-cont1][a-1] = p1;


								cont1++;
                                                                player = false;
							}


		}
		if ( a == 2 ){
		 	
			if(arr1[5][a-1].equals(" _ ")){
		 	
			arr1[5][a-1]= p1;
                        player = false;
			}	
				else if(arr1[5-cont2][a-1].equals(p2)){

					arr1[5-cont9][a-1]= p1;
					cont9++;
                                        player = false;

				}
					else{
			

						arr1[5-cont2][a-1] = p1;


						cont2++;
                                                player = false;
							}
		}


		if ( a == 3 ){
		 	
			if(arr1[5][a-1].equals(" _ ")){
		 	
			arr1[5][a-1]= p1;
                        player = false;
			}

				else if(arr1[5-cont3][a-1].equals(p2)){

					arr1[5-cont10][a-1]= p1;
					cont10++;
                                        player = false;

				}
					else{
			

						arr1[5-cont3][a-1] = p1;


						cont3++;
                                                player = false;
							}
		}


		if ( a == 4 ){
		 	
			if(arr1[5][a-1].equals(" _ ")){
		 	
			arr1[5][a-1]= p1;
                        player = false;
			}	

				else if(arr1[5-cont4][a-1].equals(p2)){

					arr1[5-cont11][a-1]= p1;
					cont11++;
                                        player = false;

				}
					else{
			

						arr1[5-cont4][a-1] = p1;


						cont4++;
                                                player = false;
							}
		}


		if ( a == 5 ){
		 	
			if(arr1[5][a-1].equals(" _ ")){
		 	
			arr1[5][a-1]= p1;
                        player = false;
                        
			}
				else if(arr1[5-cont5][a-1].equals(p2)){

					arr1[5-cont12][a-1]= p1;
					cont12++;
                                        
                                        player = false;

				}
					else{
			

						arr1[5-cont5][a-1] = p1;


						cont5++;
                                                player = false;
                                                
							}
		}


		if ( a == 6 ){
		 	
			if(arr1[5][a-1].equals(" _ ")){
		 	
			arr1[5][a-1]= p1;
                        
                        player = false;
                        
			}
				else if(arr1[5-cont6][a-1].equals(p2)){

					arr1[5-cont13][a-1]= p1;
					cont13++;
                                        player = false;

				}
					else{
			

						arr1[5-cont6][a-1] = p1;


						cont6++;
                                                player = false;
							}
		}


		if ( a == 7 ){
		 	
			if(arr1[5][a-1].equals(" _ ")){
		 	
			arr1[5][a-1]= p1;
                        
                        player = false;
			}
				else if(arr1[5-cont7][a-1].equals(p2)){

					arr1[5-cont14][a-1]= p1;
					cont14++;
                                            
                                        player = false;
				}
					else{
			

						arr1[5-cont7][a-1] = p1;


						cont7++;
                                                
                                                player = false;
							}	
                       
                      
                        
		}
              

                //Jugador se retira del juego.
                if(a==-1){
                    System.out.println("El jugador 1 se retira del juego");
                    break;
                }
                

		  //Mensaje de numero de columna incorrecta        
                if (player == true){
                    System.out.println("--Numero de columna incorrecta--");
                    System.out.println("---Ingrese de nuevo el numero de la columna---");
                }
             
		 	
                         // Codigo para ver el tablero
                         for (String[] arr11 : arr1) {
                            for (String arr111 : arr11) {
                                System.out.print("|" + arr111 + "|");
                            }
                                        System.out.println("");
                                    }


	// While para el segundo jugador
	while (player == false){
				System.out.println("Ingrese el numero de la Columna");
				int b = rd.nextInt();
			


		if ( b == 1 ){

			if(arr1[5][b-1].equals(" _ ")){
		 	
			arr1[5][b-1]= p2;
                        
                        player = true;
		}
			else if(arr1[5-cont8][b-1].equals(p1)){

					arr1[5-cont1][b-1]= p2;
					cont1++;
                                        
                                        player = true;

				}
					else{
			

						arr1[5-cont8][b-1] = p2;


							cont8++;
                                                        player = true;
								}


	}

		if ( b == 2 ){
		 			if(arr1[5][b-1].equals(" _ ")){
		 	
			arr1[5][b-1]= p2;
                        player = true;
		}
			else if(arr1[5-cont9][b-1].equals(p1)){

					arr1[5-cont2][b-1]= p2;
					cont2++;
                                        player = true;

				}
					else{
			

					arr1[5-cont9][b-1] = p2;


							cont9++;
                                                        player = true;
								}
		 	
			
		}
		
		if ( b == 3 ){
		 	
				if(arr1[5][b-1].equals(" _ ")){
		 	
			arr1[5][b-1]= p2;
                        player = true;
		}
			else if(arr1[5-cont10][b-1].equals(p1)){

					arr1[5-cont3][b-1]= p2;
					cont3++;
                                        player = true;

				}
					else{
			

						arr1[5-cont10][b-1] = p2;


							cont10++;
                                                        player = true;
								}

		}


		if ( b == 4 ){
		 	
				if(arr1[5][b-1].equals(" _ ")){
		 	
			arr1[5][b-1]= p2;
                        player = true;
		}
			else if(arr1[5-cont11][b-1].equals(p1)){

					arr1[5-cont4][b-1]= p2;
					cont4++;
                                        player = true;

				}
					else{
			

						arr1[5-cont11][b-1] = p2;


							cont11++;
                                                        player = true;
								}


		}


		if ( b == 5 ){
		 	
				if(arr1[5][b-1].equals(" _ ")){
		 	
			arr1[5][b-1]= p2;
                        player = true;
		}
			else if(arr1[5-cont12][b-1].equals(p1)){

					arr1[5-cont5][b-1]= p2;
					cont5++;
                                        player = true;

				}
					else{
			

						arr1[5-cont12][b-1] = p2;


							cont12++;
                                                        player = true;
								}


		}


		if ( b == 6 ){
		 	
				if(arr1[5][b-1].equals(" _ ")){
		 	
			arr1[5][b-1]= p2;
                        player = true;
		}
			else if(arr1[5-cont13][b-1].equals(p1)){

					arr1[5-cont6][b-1]= p2;
					cont6++;
                                        player = true;

				}
					else{
			

						arr1[5-cont13][b-1] = p2;


							cont13++;
                                                        player = true;
								}
		}


		if ( b == 7 ){
		 	
				if(arr1[5][b-1].equals(" _ ")){
		 	
			arr1[5][b-1]= p2;
                        player = true;
		}
			else if(arr1[5-cont14][b-1].equals(p1)){

					arr1[5-cont7][b-1]= p2;
					cont7++;
                                        player = true;

				}
						else{
			

							arr1[5-cont14][b-1] = p2;


								cont14++;
                                                                player = true;
									}
		}
                
               
                
                //Jugador se retira del juego.
                if(b==-1){
                    System.out.println("El jugador 2 se retira del juego");
                    break;
                }

		
                 //Mensaje de numeor de columna incorrecta        
                if (player == false){
                    System.out.println("--Numero de columna incorrecta--");
                    System.out.println("---Ingrese de nuevo el numero de la columna---");
                }

		
		 	
                            // Codigo para ver el tablero
                            for (String[] arr11 : arr1) {
                                    for (String arr111 : arr11) {
                                        System.out.print("|" + arr111 + "|");
                                    }
                                System.out.println("");
                            }

	}


}

    
    
    }
    
}
