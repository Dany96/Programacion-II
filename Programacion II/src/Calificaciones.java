import java.util.Scanner;
public class Calificaciones {
	
public static void Ingresenotas (int notas[], int N){
	int ind;
	int cont=0;
	int re;
	Scanner x=new Scanner (System.in);
	
	for(ind =0; ind<N; ind++){
		do{
	
		System.out.print("INGRESE NOTA DEL ESTUDIANTE :"+ind);
		notas[ind]=x.nextInt();
	
	      }while(!(notas[ind]>=0 && notas[ind]<=100));
		   System.out.println("");
							  }
	for(ind =0; ind<N; ind++)
	
	  if (notas[ind]<=70)
			cont=cont+1;
				re=(cont*100)/N;
		System.out.println("EL PORCENTAJE DE REPROBADOS ES : "+re +"%");
	  					
	
													}
	
	public static void main(String[] args) {
		int notas[]=new int[50];
		int ind;
		final int N=50;
		
		Ingresenotas(notas,N);
		

		
		 	
		
		
		
										   }

                             }
