import java.util.Random;
import java.util.Scanner;

public class Player {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Game obj=new Game();	
System.out.println("Want to play Hangman!!!!!!!!!");
System.out.println("Anwser Y or N..........   " );    
Scanner input=new Scanner(System.in);
char ans=input.next().charAt(0);
while(ans=='y'||ans=='Y') {
obj.gamestatus();
System.out.println("Want to play Hangman Againnnn!!!!!!!!!");
System.out.println("Anwser Y or N..........   " );    
ans=input.next().charAt(0);
}
	}
}
