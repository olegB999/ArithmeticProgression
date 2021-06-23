package probleme_codeabbey;

import java.util.Scanner;

public class VowelCount {
	//	This is a simple problem to get introduced to string processing. We will be given several lines of text - and for each of them we want to know the number of vowels (i.e. letters a, o, u, i, e, y). Note: that y is regarded as vowel for purpose of this task.
	//
	//	Though simple, this technic is important in cipher-breaking approaches. For example refer to Caesar Cipher Cracker problem.
	//
	//	Input data contain number of test-cases in the first line.
	//	Then the specified number of lines follows each representing one test-case.
	//	Lines consist only of lowercase English (Latin) letters and spaces.
	//	Answer should contain the number of vowels in each line, separated by spaces.
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int nrWords = s.nextInt();
		String returnVowels = "";
		int words = 0;
		String word = s.nextLine();
		while(words<nrWords) {
			word = s.nextLine();
			char[] wordc = word.toCharArray();
			int vowels=0;
			for(int i = 0; i<wordc.length ;i++) {

				if(wordc[i] == 'a' || wordc[i] == 'e' || wordc[i] == 'i' || wordc[i] == 'o' || wordc[i] == 'u' || wordc[i]=='y') {
					vowels++;
				}


			}
			returnVowels += vowels + " ";
			words++;
		}
		System.out.println(returnVowels);

	}

}
