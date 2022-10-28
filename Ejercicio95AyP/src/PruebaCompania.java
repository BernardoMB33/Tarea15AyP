import java.util.Arrays;
import java.util.Scanner;

public class PruebaCompania {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Compania cu = new Compania("Empaques S.A. de C.V.", " Av. Constitución 34 ", "Queretaro", "Sr. Perez");
		cu.toString();
		for (int i=0; i<12; i++) {
			System.out.printf("Introduzca las ventas para el mes %d: ", i+1);
			double quant= sc.nextDouble();
			cu.ventaMes(i, quant);	
		}
		sc.close();
		System.out.println();
		System.out.printf("Promedio Ventas: \t %.2f \n", cu.promedio());
		System.out.println();
		System.out.printf("Mes con más ventas: \t %d \n", cu.mesMayor());
		System.out.println();
		System.out.printf("Mes con menos ventas: \t %d \n", cu.mesMenor());
		System.out.println();
		System.out.printf("Meses arriba del promedio: \t %d \n", cu.arribaPromedio());
		System.out.println();
		System.out.printf("Total Ventas: \t %.2f \n", cu.totalVta());
		System.out.println();
		System.out.println(Arrays.toString(cu.getVentas()));
		

	}

}
