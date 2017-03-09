import java.util.Random;
import java.util.Scanner;
public class TimesTableGame {
	public static void main(String[] args){
		//Create 10 randomly generated times table questions
		//ask the user for their answer and check their score
		//print out their score when we finish
		int num1, num2, answer, counter, score=0;
		Scanner in=new Scanner(System.in);
		Random rnd=new Random();
		
		//Write a for loop counting from 1-10
		for (counter=1;counter<=10;counter++){
			//To get a random number between min and max
			//rnd.nextInt(max-min+1)+min;
			//So for 1-10, we use
			//rnd.nextInt(10-1+1)+1;
			num1=rnd.nextInt(10-1+1)+1;
			num2=rnd.nextInt(10-1+1)+1;
			System.out.println("What is "+num1+" * "+num2+"?");
			answer=in.nextInt();
			if (answer==num1*num2){
				System.out.println("You got it!\n");
				score++;
			}else{
				System.out.println("Wrong answer! "
						+ "The correct answer is "+(num1*num2));
				
			}
		}
		System.out.println("Your score is "+score+" out of 10");
	}
}




