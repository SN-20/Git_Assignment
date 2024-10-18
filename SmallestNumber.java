import java.util.Scanner;

public class SmallestNumber{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number 1: ");
		int n1 = sc.nextInt();

		System.out.println("Enter number 2: ");
                int n2 = sc.nextInt();

		System.out.println("Enter number 3: ");
                int n3 = sc.nextInt();

		if (n1<n2 && n1<n3){
			System.out.println("Number 1 is smallest");
		}
		if (n2<n1 && n2<n3){
                        System.out.println("Number 2 is smallest");
                }
		if (n3<n1 && n3<n2){
                        System.out.println("Number 3 is smallest");
                }
	}
}


