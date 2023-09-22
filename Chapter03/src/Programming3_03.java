import java.util.Scanner;

public class Programming3_03 {

	 public static void main(String[] args){
	        System.out.print("정수를 입력하세요>> ");
	        Scanner scanner = new Scanner(System.in);
	        int n = scanner.nextInt();
	        for(int i = n; i > 0; i--){
	            for(int j = 0; j < i; j++){
	                System.out.print("*");
	            }
	            System.out.println();
	        }
	        scanner.close();
	}
}
