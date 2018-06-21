import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
public class Game {


	static int chances=5;
	static boolean gameover=false;
	static String answer=new String();
	static Random  rand=new Random();
	 static int i=rand.nextInt(14);
public static String initialise(int i)       //creating a random string from a pool of strings
{
final String  words[] = {"apple", "banana", "orange", "grapes","abruptly","unworthy","knapsack","jawbreaker","jaundice","xylophone","buzzwords","syndrome","transcript","alluring"};
 

return words[i];
}
public static String word()       //returning the answer
{
	
	answer=initialise(i);
	
	
		
	return answer;
	}
public static char[] question() {  //generating question for the answer
	char question[]=new char[word().length()];
	for(int j=0;j<=word().length()-1;j++) {
		
		question[j]='#';}
	
		return question;
	
}
public static void gamestatus() {  //here is the whole game logic taking inputs from user on loop
	Scanner input=new Scanner(System.in);
	
	char question1[]=new char[word().length()];
	question1=question();
	System.out.println("\n");
	System.out.print("\n");
	System.out.print("Question : ");
	for(int j=0;j<word().length();j++)
         System.out.print(question1[j]);
	System.out.println();
	while(chances!=0) {
		gameover=false;
		System.out.print("Your ans :  ");
	 char input1=input.next().charAt(0);
	for(int k=0;k<word().length();k++) {
		 
		if(input1==word().toCharArray()[k]) {
			question1[k]=input1;
		    gameover=true;
		}
		
	}
	if(gameover==false)
	chances--;
	for(int j=0;j<word().length();j++)
        System.out.print(question1[j]);
	System.out.println("                    "+"Chances Left:"+ chances);
	if(Arrays.equals(question1, word().toCharArray()))
		{
		System.out.println("GREAT..............YOU WON!!!!!!!\n\n");
		trophy();
		System.exit(0);
		}
	
}
	System.out.println("answer is : "+word());
System.out.println("\n\nYOU LOSE.................GAME OVER!!!!!!!!!!!!!!\n\n");	
deadman();
}
public static void deadman() {             //Brings the hangman
	System.out.println("|"+"------------------");
	System.out.println("|"+"               |");
	System.out.println("|"+"               |");
	System.out.println("|"+"               |");
	System.out.println("|"+"               |");
	System.out.println("|"+"               |");
	System.out.println("|"+"             {-o_o} ");
	System.out.println("|"+"            // | \\") ;
	System.out.println("|"+"            // | \\");
	System.out.println("|"+"               |");
	System.out.println("|"+"              / \\");
	System.out.println("|"+"                   ");
	System.out.println("|"+"                     ");
	System.out.println("|"+"                       ");
	System.out.println("------------------------------->>>>");

}
	public static void trophy() {
	System.out.println("---------------------------");
	System.out.println("\\                        //  ");
	System.out.println(" \\                      //       ");
	System.out.println("  \\                    //");
	System.out.println("   \\_________________//");
	System.out.println("              ||");
	System.out.println("              ||");
	System.out.println("              ||");
	System.out.println("              ||");
	System.out.println("              ||");
	System.out.println("_______________||_______________");
 System.out.println("//________________________________\\");
}

}
