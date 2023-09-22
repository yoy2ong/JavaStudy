import java.util.Random;
import java.util.Scanner;

public class OpenChallenge3 {

	public static void main(String[] args) {
		Random number = new Random();
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			int computer = number.nextInt(100); //0~99사이의 난수 생성
			System.out.println("수를 결정하였습니다. 맞추어 보세요.");
			int count=1;
			int min=0;
			int max=99;
			
			while(true) {
				System.out.println(min+"-"+max);
				System.out.print(count+">>");
				int user = scanner.nextInt();
				
				if(user>computer) {
					System.out.println("더 낮게");
					max = user;
				}
				else if(user<computer) {
					System.out.println("더 높게");
					min = user;
				}
				else {
					System.out.println("맞았습니다.");
					break;
				}
				count++;
			}
			
			System.out.print("다시 하시겠습니까?(y/n)>> ");
			String answer = scanner.next();
			
			if(answer.equals("y"))
				continue;
			else
				break;
		}
		System.out.println("종료합니다.");
		scanner.close();
		return ;
	}
}
