import java.util.Scanner;
public class Promedio_Calificaciones {
	
	public static void Ingreso(double calificaciones[],Scanner x){
		 for(int  ind=0; ind<calificaciones.length; ind++)
		 {
			 System.out.println(" INGRESE EL PROMEDIO DEL ALUMNO "+ind);
			 calificaciones[ind]=x.nextDouble();
		 }
													   			 }
	
	public static double Promedio(double calificaciones[]){
		double pro,sum=0;
		 for(int  ind=0; ind<calificaciones.length; ind++)
			 sum+=calificaciones[ind];
		 	 pro=sum/calificaciones.length;
		 	 return pro;	 
														  }
	
	public static void Presentar(double calificaciones[],double Promedio){
		
		System.out.println(" EL PROMEDIO GRUPAL ES :"+Promedio);		
																		 }
	
	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		
		double calificaciones[];
		int N;
		double Promedio;
		
		System.out.println(" INGRESE EL NUMERO DE PROMEDIOS ");
		N=x.nextInt();
		
		calificaciones= new double[N];
		
		Ingreso(calificaciones,x);
		Promedio = Promedio(calificaciones);
		Presentar(calificaciones,Promedio);
			
		
						                   }

								     }
