import java.util.Scanner;
public class maq {

	public static void main(String[] args) {
		
		float total=0;
		int leitura;
		
		Scanner pip = new Scanner(System.in);
		
			System.out.println("Programa da máquina:");
			while(total<0.44) {
				
				if (total==0.0) System.out.println("Insira uma moeda: ($0.25=1 ou $0.10=2)"); else System.out.println("Insira mais uma moeda: ($0.25=1 ou $0.10=2)");
				leitura = pip.nextInt();
				switch(leitura) {
				case 1:
					total+=0.25;
					break;
				case 2:
					total+=0.10;
					break;
				default:
					System.out.println("Valor incorreto inserido");
				}
				System.out.println(total);
				
			}
		
		System.out.printf("Toma aqui seu refri!  (A máquina comeu %.2f)",(total-0.45));

	}

}
