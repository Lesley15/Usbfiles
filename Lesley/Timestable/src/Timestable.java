import java.util.Random;
import java.util.Scanner;

public class Timestable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create 10 randomly generated times table questions 
		//Ask the user for their answer and check their score 
		//Print out their score when we finish
		int num1,  num2, answer, counter, score=0;
		Scanner in=new Scanner(System.in);
		Random rnd=new Random();
		
		//write a for loop counting from 1-10
		for (counter=1; counter<=10; counter++){
			//To get a random number between min and max
			//rnd.nextInt(max-min+1)+min;
			//So for 1-10, we use
			//rnd.nextInt(10-1+1)+1;
			num1=rnd.nextInt(10-1+1)+1;
			num2=rnd.nextInt(10-1+1)+1;
			System.out.println("what is"+num1+" + " +num2+ "?");
			answer=in.nextInt();
			if (answer==num1*num2){
				System.out.println("You got it!\n");
				score++;
			}else{
				System.out.println("wrong answer!");
				System.out.println("The correct answer is" +answer);
				
			}
		}
	}

}
