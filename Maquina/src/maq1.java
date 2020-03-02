import java.util.Scanner;
public class maq1 {

	public static void main(String[] args) {
		
		int leitura,total=0;
		double resto=0;
		
		Scanner pip = new Scanner(System.in);
		
			System.out.println("Programa da máquina:");
			while(total<45) {
				
				if (total==0.0) System.out.println("Insira uma moeda: ($0.25=1 ou $0.10=2)"); else System.out.println("Insira mais uma moeda: ($0.25=1 ou $0.10=2)");
				leitura = pip.nextInt();
				switch(leitura) {
				case 1:
					total+=25;
					break;
				case 2:
					total+=10;
					break;
				default:
					System.out.println("Valor incorreto inserido");
				}
				System.out.println(total);
				
			}
		resto = (double)total/100;
		System.out.printf("Toma aqui seu refri!  (A máquina comeu %.2f)",(resto-0.45));

	}

}
