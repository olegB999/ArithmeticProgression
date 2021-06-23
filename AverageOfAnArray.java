package probleme_codeabbey;
import java.util.*;
public class AverageOfAnArray {
	//	Important branch of mathematics which heavily uses programming is statistics - i.e. calculation of characteristics for some data. (Just think of statistics of visitors / pageviews of the web-site etc.) Learning this discipline is usually started from acquaintance with an average value.
	//
	//	Average (or mean) value of some numbers could be calculated as their sum divided by their amount. For example:
	//
	//	avg(2, 3, 7) = (2 + 3 + 7) / 3 = 4
	//	avg(20, 10) = (20 + 10) / 2 = 15
	//	You will be given several arrays, for each of which you are to find an average value.
	//
	//	Input data will give the number of test-cases in the first line.
	//	Then test-cases themselves will follow, one case per line.
	//	Each test-case describes an array of positive integers with value of 0 marking end. (this zero should not be included into calculations!!!).
	//	Answer should contain average values for each array, rounded to nearest integer (see task on rounding), separated by spaces.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String result = "";
		int cases = sc.nextInt(); 
		for(int i=0; cases>i;i++) {
			float average = 0;
			float sum = 0;
			float cow = 0;
			int column = sc.nextInt();
			while(column !=0) {
				sum = sum+column;
				column = sc.nextInt();
				cow++;
			}
			average = sum/cow;
			result += Math.round(average) +" "; 

		}

		System.out.println(result);
	}

}
