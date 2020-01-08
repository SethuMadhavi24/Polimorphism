package polimorphismbasic;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the coalpieces:");
		int coalPieces=sc.nextInt();
		System.out.println("Enter the hairStrand:");
		float hairStrand=sc.nextFloat();
		System.out.println("Enter the coalMessage:");
		String coalMsg=sc.next();
		Machine mc=new Machine(coalPieces,hairStrand,coalMsg);
		mc.produceShoePolish();
		

	}

}
