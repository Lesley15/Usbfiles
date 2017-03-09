import java.util.Scanner;

public class HelloWorld2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner in=new Scanner(System.in);
        //Place all variables here
        String user;
        String colour;
        int age;
        System.out.println("What is your name?");
        user=in.nextLine();
        System.out.println("How old are you?");
        age=in.nextInt();
        //flush buffer
        in.nextLine();
        System.out.println("What's your favourite colour?");
        colour=in.nextLine();
        System.out.println("+++++++++++++");
        System.out.println("Hello "+user+" Your are "+age+" years old and your favourite colour is "+colour+"." );
        
	}

}
