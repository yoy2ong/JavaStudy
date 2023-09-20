import java.util.Scanner;

public class OpenChallenge {

    public static void main(String args[]){
        
        System.out.println("가위바위보 게임입니다. 가위, 바위, 보 중에서 입력하세요.");
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("철수 >> ");
        String user1 = scanner.next();
        System.out.print("영희 >> ");
        String user2 = scanner.next();

        if(user1.equals(user2)){
            System.out.println("비겼습니다.");
        }

        else if (user1.equals("가위")){
            if(user2.equals("바위"))
                System.out.println("영희가 이겼습니다.");
            else if(user2.equals("보"))
                System.out.println("철수가 이겼습니다.");
        }
        else if(user1.equals("바위")){
            if(user2.equals("보"))
                System.out.println("영희가 이겼습니다.");
            else if(user2.equals("가위"))
                System.out.println("철수가 이겼습니다.");
        }
        else if(user1.equals("보")){
            if(user2.equals("가위"))
                System.out.println("영희가 이겼습니다.");
            else if(user2.equals("바위"))
                System.out.println("철수가 이겼습니다.");
        }
        else
        	System.out.println("잘못된 정보를 입력했습니다.");

        scanner.close();
    }
}
