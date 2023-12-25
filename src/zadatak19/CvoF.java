package zadatak19;
import java.util.Scanner;
public class CvoF {

	

	

		public static void main(String[] args) {
			double c,f;
			System.out.println("Vnesi vrednost za stepeni celziusovi: ");
			try (Scanner input = new Scanner(System.in)) {
				c=input.nextDouble();
			}
			f=9*c/5+32;
			System.out.println("Vrednosta vo farenhajtovi= "+f+" F ");
			System.out.println("Vrednosta za celziusovi= "+c+" C ");
			
			

		}
}