
public class Programming3_09 {

	public static void main(String[] args) {
		int array [][] = new int [4][4];
		for (int i=0; i<4; i++) {
			for (int k=0; k<4; k++) {
				array[i][k] = (int)(Math.random()*10+1); //1~10까지의 범위의 정수
				System.out.print(array[i][k]);
				System.out.print("\t");
			}
			System.out.println();
		}
	}
}
