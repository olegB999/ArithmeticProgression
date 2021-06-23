package probleme_codeabbey;

import java.util.Scanner;

public class MinimumofThree {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int lines = scan.nextInt();
		int a = 0;
		int b = 0;
		int c = 0;
		String returnString = "" ;
		for (int i=0; i < lines; i++){
			a = scan.nextInt();
			b = scan.nextInt();
			c = scan.nextInt();
			if(a<b) {
				if(a<c) {
				returnString += a + " ";
				}
			}
			if(b<a) {
				if(b<c) {
					returnString += b + " ";
				}
			}
			if(c<a){
				if(c<b)
				returnString += c + " ";
			}
		}
		System.out.println(returnString);

	}

}
