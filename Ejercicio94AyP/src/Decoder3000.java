import java.util.*;

public class Decoder3000 {
	
	public static String decode(String fraseRaw) {
		char[] fraseCook = fraseRaw.toCharArray();
		StringBuilder sb = new StringBuilder();

		for (int i=0; i<fraseRaw.length(); i++) {

			switch (fraseCook[i]) {
			case '1':
				fraseCook[i]='a';
				break;
			case '2':
				fraseCook[i]='e';
				break;
			case '3':
				fraseCook[i]='i';
				break;
			case '4':
				fraseCook[i]='o';
				break;
			case '5':
				fraseCook[i]='u';
				break;
			default:
				fraseCook[i]=fraseCook[i];
			}
		
		}
		
		for (int i= 0; i<fraseRaw.length(); i++) {
			sb.append(fraseCook[i]);
		}
		
		return sb.toString();
	}
	
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce frase a decodificar (O -1 Para salir del menu): ");
		String frase= sc.nextLine();
		System.out.println(Decoder3000.decode(frase));
		sc.close();
	}

}
