import java.util.Scanner;
public class Valor_Recaudado {
	
	private static void Menu(){
		Scanner x= new Scanner(System.in);
		double venta, total,des;
		int op;
		System.out.println(" INGRESE EL VALOR DE LA VENTA ");
		venta=x.nextDouble();
		
		System.out.println(" SELECCIONE EL COLOR DE LA BOLITA ");	
		System.out.println(" 1.-ROJA ");
		System.out.println(" 2.-AMARILLA ");
		System.out.println(" 3.-BLANCA ");
		System.out.println(" ******************** ");
		
		System.out.println(" INGRESE SU OPCION ");
		op=x.nextInt();
		switch (op){
		case 1:
			des=venta*0.40;
			total=venta-des;
			System.out.println(" EL TOTAL A PAGAR CON DESCUENTO ES :"+total);
			Menu_1();
		break;
		
		case 2:
			total=venta*0.25;
			System.out.println(" EL TOTAL A PAGAR CON DESCUENTO ES :"+total);
			Menu_1();
		break;
		
		case 3:
			total=venta;
			System.out.println(" EL TOTAL A PAGAR CON DESCUENTO ES :"+total);
			Menu_1();
				    }
							  }
	
	private static void Menu_1(){
		Scanner x= new Scanner(System.in);
		int op;
		System.out.println(" DESEA INGRESAR OTRA VENTA ");
		System.out.println(" 1 si ");
		System.out.println(" 2 no ");
		op=x.nextInt();
		switch(op){
	     case 1:
	    	Menu();
	    	 break;
	    	 
	     case 2:
	    	 System.out.println(" GRACIAS POR UTILIZAR EL PROGRMA");
	    	 break;
				  }
								}
	
	public static void main(String[] args) {
		 Menu();
			               					}
				             }
