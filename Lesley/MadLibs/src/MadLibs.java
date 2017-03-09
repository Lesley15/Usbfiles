import java.util.Scanner;

public class MadLibs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner in=new  Scanner(System.in);
       
       //variables
      //Store all of the values from the user
       String noun1;
       String noun2;
       String noun3;
       String noun4; 
        int num1;
        int num2;
        int num3;
        int num4;
        String adj1;
        String adj2;
        String adj3;
        String adj4;
          //Program 
         //Ask them  user for all the values and read them in
         System.out.println("Welcome to Lesley`s Mad Libs!");
         System.out.println("Give me a noun: preferably a name (Remember to capitalize) ");
        noun1=in.nextLine();
         System.out.println("Give me a number: ");
        num1=in.nextInt();
         in.nextLine();
         System.out.println("Give me an adjective");
         adj1=in.nextLine();
         System.out.println("Give me another noun:(does not have to be a name)");
         noun2 = in.nextLine();
         System.out.println("Give me a number");
         num2=in.nextInt();
         in.nextLine();
         System.out.println("Give me an adjective ");
         adj2=in.nextLine();
         System.out.println("Give me a noun:(does not have to be a name) ");
         noun3=in.nextLine();
         System.out.println("Give me a number");
         num3=in.nextInt();
         in.nextLine();
         System.out.println("Give me an adjective");
         adj3=in.nextLine();
        System.out.println("Give me a noun: (does not have to be a name)");
        noun4=in.nextLine();
        System.out.println("Give me a number");
        num4=in.nextInt();
        in.nextLine();
        System.out.println("Give me an adjective ");
         adj4=in.nextLine();
      
        //Print out the story 
    
        System.out.println("++++++++++++++++");
        System.out.println("One day a seal named "+noun1+ " ran swam away from their home in the Pacific Ocean.");
        System.out.println(" They weighed " +num1+ " kilograms they really hated " +adj1+ " sea lions.");
        System.out.println(noun2+" Is what all the other seals called "+noun1+". While swimming away from home "+num2+" "+noun3+" attacked.");
        System.out.println(noun1+" found the lost city of Atlantis one night "+adj2+" sea eurchins approached "+adj3+" they were accompanied by "+num3+" Seahorses with "+adj4+" corndogs ");
        System.out.println(noun4+" came crashing through the waves "+num4);
        System.out.println("THE END!");
        
        
         //Print out the story 
	}

}
