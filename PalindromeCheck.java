
import java.util.Scanner;
public class PalindromeCheck{
	public static void main(String[] args){
		
		System.out.print("Enter 0 if you want to input your own 4-digit number. Enter 1 if you want it randomly generated: ");	//prompts about if they want it randomized or custom
		Scanner input = new Scanner(System.in);
		int answer = input.nextInt();
		String finalStr = "0000";
		int finalNum = 0;
		
		if(answer==0){    								//prompts user for 4 digit code
			System.out.print("Enter a 4 digit integer: ");
			int choseNum = input.nextInt();	
			finalStr = Integer.toString(choseNum);		//makes a string of the input
			finalNum = choseNum;						//copies the number of the input for math (checking if its right size)
			
		}
		else if (answer==1){							//Generates random code
			int randNum = (int)(1000 + (Math.random() * 8999));
			finalStr = Integer.toString(randNum);		//Makes string of random number
			System.out.println("your number is: " + randNum);
			finalNum = randNum;							//Copies random number for math
			
		}
		else{
			System.out.println("Thats not one of the options!");	
		}
		
		
		if(finalNum <1000){  							//Makes sure number is the right size 
			System.out.println("That number is too small! make it four digits.");
		}
		else if (finalNum > 9999){						//
			System.out.println("That number is too big! make it four digits.");
		}
		
		else {
			
			if(finalStr.charAt(0) == finalStr.charAt(3)){				//Check if first and last char in string are the same
				if(finalStr.charAt(1) == finalStr.charAt(2)){			//Check if second and third characters match
					System.out.println("That's a palindrome!");
				}
			}
			else{
				System.out.println("Thats not a palindrome.");
			}	
		}
	}
}