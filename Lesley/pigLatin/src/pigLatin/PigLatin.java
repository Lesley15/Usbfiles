package pigLatin;

import java.util.Scanner;

public class PigLatin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		String input;
		String output="";
		String[] words;
		
		
		System.out.println("Enter a sentence");
		input=in.nextLine();
		words=input.split(" ");
		for (int x=0;x<words.length;x++){
			String currentWord=words[x];
			if(currentWord.charAt(0)=='a'||currentWord.charAt(0)=='e'||currentWord.charAt(0)=='i'||currentWord.charAt(0)=='o'||currentWord.charAt(0)=='u'||currentWord.charAt(0)=='y'){
				currentWord=currentWord+"way";
			 }else{
				 currentWord=currentWord.substring(1)+currentWord.charAt(0)+"ay";
				/* MODIFY TO MOVE ALL LETTERS BEFORE THE FIRST VOWEL
				 *if(currentWord.charAt(1)=='a'||currentWord.charAt(1)=='e'||currentWord.charAt(1)=='i'||currentWord.charAt(1)=='o'||currentWord.charAt(1)=='u'||currentWord.charAt(1)=='y'){
		            currentWord=currentWord.substring(2)+currentWord.charAt(0,2)+"ay";
				 * 
				 * 
				 * 
				 * 
				 * 
				 * 
				 * 
				
				 */
			 
		}
		output=output+currentWord+" ";
		}
		System.out.println(output);
	}

}
