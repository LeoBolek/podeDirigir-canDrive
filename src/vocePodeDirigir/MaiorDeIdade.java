package vocePodeDirigir;
import java.util.Scanner;

public class MaiorDeIdade {
	
	public static void main(String[] args) {
		Scanner digiteIdade = new Scanner(System.in);
		System.out.print("Digite sua idade: ");
		int idade = digiteIdade.nextInt();
		
		if(idade >= 18)
			System.out.println("Voc� pode dirigir!");
		else
			System.out.println("Voc� n�o pode dirigir!");
	}

}
