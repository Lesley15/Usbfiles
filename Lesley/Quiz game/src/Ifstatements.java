import java.util.Scanner;

public class Ifstatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//variables
		Scanner in=new Scanner(System.in);
		int score=0;
		String q1="1. What is the capital of Papua New Guinea?. \n1)Cape Town \n2)Port Moresby\n3)Brisbane\n4)Monte Cristo";
		String q2="2. Who is the current President of Liberia?.\n1) Ellen Johnson Sirleaf \n2) Kofi Annan \n3) Ban Ki Moon \n4) Alexis Tsipras ";
		String q3="3.What is the currency of Mongolia?.\n1) Togrog \n2) Dirham \n3) Yen \n4) Ruble";
		String q4="4. What is the capital Uraguay?.\n1)Montevideo \n2)Paris \n3)Sao Paolo \n4)Antananarivo";
		String q5="5. Who is the current chancellor of Germany?.\n1) Angela Merkle \n2) Hilary Clinton \n3)Dilma Rousseff \n4)Jorge Mario Bergoglio ";
		String q6="6. For how many years did the Russian Cold War last?.\n1)10 years\n2)44 years \n3)60 years \n4)8 years";
		String q7="7. What is Canada's national motto?.\n1)Goodmorning Eh! \n2) God and my right \n3) A Mari Usque Ad Mare \n4)Progress, Peace, Prosperity";
		String q8="8. What is France's national motto?.\n1) Liberté, Egalité, Fraternité \n2) Unité, Égalité, Paix  \n3)Unité, Travail, Justice \n4)L'union fait la force";
		String q9="9. In  what nation is Abu Dhabi located?.\n1)The United Arab Emirates \n2)Afghanistan \n3) Kazakhstan \n4)Malawi";
		String q10="10.What country's capital city is Kuala Lampur?.\n1)East Timor \n2)Malaysia \n3)The Gambia \n4)Guam";
		String q11="11.How many African nations list French as one of their official languages?.\n1)26 \n2)16 \n3)10 \n4)30";
		String q12="12.What is the birthname of the current Catholic Pope?.\n1)Pedro Juan Santos \n2)Jorge Mario Bergoglio \n3)Emilio Estevan \n4)Julio Iglesias";
		String q13="13. What is the former name of Ethiopia?.\n1)Ceylon \n2)Moravia \n3)	Bohemia \n4)Abyssinia";
		String q14="14. What colony existed on the land now known as the Republics of Rwanda and Burundi?.\n1)Ruanda-Urundi \n2)Abyssinia \n3)Mesopotamia \n4)Ur";
		String q15="15. In what nation is the city of Den Haag located?.\n1)The Netherlands \n2)Croatia \n3)Germany \n4)Liechtenstein";
		String a1="Port Moresby";
		String a2="Ellen Johnson Sirleaf";
		String a3="Togrog";
		String a4="Montevideo";
		String a5="Angela Merkle";
		String a6="44 years" ;
		String a7="A Mari Usque Ad Mare";
		String a8="Liberté, Egalité, Fraternité";
		String a9="The United Arab Emirates";
		String a10="Malaysia";
		String a11="26";
		String a12="Jorge Mario Bergoglio";
		String a13="Abyssinia";
		String a14="Ruanda-Urundi";
		String a15="The Netherlands";
		
		
		
		String answer;
		/*Program
		 * \n \n \n \n
		 */
		
		//Print out question 1
		System.out.println("Welcome to Lesley's fun  quiz!");
		System.out.println(q1);
		answer=in.nextLine();
		//Check the answer
		if (answer.equalsIgnoreCase(a1.trim())){
			System.out.println("You got it!");
			score=score+1;
		}else{
			System.out.println("Wrong!");
			score=score-1;
				}
		System.out.println("Your current score is "+score);
		//Print out question 2 
				System.out.println(q2);
				answer=in.nextLine();
				//Check the answer
				if (answer.equalsIgnoreCase(a2.trim())){
					System.out.println("You got it!");
					score=score+1;
				}else{
					System.out.println("Wrong!");
					score=score-1;
						}
				System.out.println("Your current score is "+score);
				//Print out question 3 
				System.out.println(q3);
				answer=in.nextLine();
				//Check the answer
				if (answer.equalsIgnoreCase(a3.trim())){
					System.out.println("You got it!");
					score=score+1;
				}else{
					System.out.println("Wrong!");
					score=score-1;
						}
				System.out.println("Your current score is "+score);
				//Print out question 4 
				System.out.println(q4);
				answer=in.nextLine();
				//Check the answer
				if (answer.equalsIgnoreCase(a4.trim())){
					System.out.println("You got it!");
					score=score+1;
				}else{
					System.out.println("Wrong!");
					score=score-1;
						}
				System.out.println("Your current score is "+score);
				//Print out question 5 
				System.out.println(q5);
				answer=in.nextLine();
				//Check the answer
				if (answer.equalsIgnoreCase(a5.trim())){
					System.out.println("You got it!");
					score=score+1;
				}else{
					System.out.println("Wrong!");
					score=score-1;
						}
				System.out.println("Your current score is "+score);
				//Print out question 6 
				System.out.println(q6);
				answer=in.nextLine();
				//Check the answer
				if (answer.equalsIgnoreCase(a6.trim())){
					System.out.println("You got it!");
					score=score+1;
				}else{
					System.out.println("Wrong!");
					score=score-1;
						}
				System.out.println("Your current score is "+score);
				//Print out question 7 
				System.out.println(q7);
				answer=in.nextLine();
				//Check the answer
				if (answer.equalsIgnoreCase(a7.trim())){
					System.out.println("You got it!");
					score=score+1;
				}else{
					System.out.println("Wrong!");
					score=score-1;
						}
				System.out.println("Your current score is "+score);
				//Print out question 8 
				System.out.println(q8);
				answer=in.nextLine();
				//Check the answer
				if (answer.equalsIgnoreCase(a8.trim())){
					System.out.println("You got it!");
					score=score+1;
				}else{
					System.out.println("Wrong!");
					score=score-1;
						}
				System.out.println("Your current score is "+score);
				//Print out question 9 
				System.out.println(q9);
				answer=in.nextLine();
				//Check the answer
				if (answer.equalsIgnoreCase(a9.trim())){
					System.out.println("You got it!");
					score=score+1;
				}else{
					System.out.println("Wrong!");
					score=score-1;
						}
				System.out.println("Your current score is "+score);
				//Print out question 10 
				System.out.println(q10);
				answer=in.nextLine();
				//Check the answer
				if (answer.equalsIgnoreCase(a10.trim())){
					System.out.println("You got it!");
					score=score+1;
				}else{
					System.out.println("Wrong!");
					score=score-1;
						}
				System.out.println("Your current score is "+score);
				//Print out question 11 
				System.out.println(q11);
				answer=in.nextLine();
				//Check the answer
				if (answer.equalsIgnoreCase(a11.trim())){
					System.out.println("You got it!");
					score=score+1;
				}else{
					System.out.println("Wrong!");
					score=score-1;
						}
				System.out.println("Your current score is "+score);
				//Print out question 12 
				System.out.println(q12);
				answer=in.nextLine();
				//Check the answer
				if (answer.equalsIgnoreCase(a12.trim())){
					System.out.println("You got it!");
					score=score+1;
				}else{
					System.out.println("Wrong!");
					score=score-1;
						}
				System.out.println("Your current score is "+score);
				//Print out question 13 
				System.out.println(q13);
				answer=in.nextLine();
				//Check the answer
				if (answer.equalsIgnoreCase(a13.trim())){
					System.out.println("You got it!");
					score=score+1;
				}else{
					System.out.println("Wrong!");
					score=score-1;
						}
				System.out.println("Your current score is "+score);
				//Print out question 14
				System.out.println(q14);
				answer=in.nextLine();
				//Check the answer
				if (answer.equalsIgnoreCase(a14.trim())){
					System.out.println("You got it!");
					score=score+1;
				}else{
					System.out.println("Wrong!");
					score=score-1;
						}
				System.out.println("Your current score is "+score);
				//Print out question 15 
				System.out.println(q15);
				answer=in.nextLine();
				//Check the answer
				if (answer.equalsIgnoreCase(a15.trim())){
					System.out.println("You got it!");
					score=score+1;
				}else{
					System.out.println("Wrong!");
					score=score-1;
						}
				System.out.println("Your current score is "+score);
				if(score==15){
					System.out.println("Awesome!. You got a perfect score");
				}else{
					System.out.println("Nice try. Better luck next time!.");
				}
	}

}
