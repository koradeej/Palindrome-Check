
/*
This project is checking if a given set of four digits is a palindrome. It initially prompts the user if
they want to enter a number of have it randomly generated, then it analyzes it.
*/



import java.util.Scanner;
public class PalindromeCheck{
	public static void main(String[] args){
		
		System.out.println("Enter 0 if you would like to enter a 4-digit number.  Enter 1 if you would like to have the computer generate it. ");	//prompts about if they want it randomized or custom
		Scanner input = new Scanner(System.in);
		int answer = input.nextInt();
		String finalStr = "0000";
		int finalNum = 0;
		
		if(answer==0){    								//prompts user for 4 digit code
			System.out.println("Enter a 4 digit integer: ");
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
			System.out.println("Incorrect input");	
		}
		
		
		if(finalNum <1000){  							//Makes sure number is the right size 
			System.out.println("Incorrect input");
		}
		else if (finalNum > 9999){						//
			System.out.println("Incorrect input");
		}
		
		else {
			
			if(finalStr.charAt(0) == finalStr.charAt(3)){				//Check if first and last char in string are the same
				if(finalStr.charAt(1) == finalStr.charAt(2)){			//Check if second and third characters match
					System.out.println(finalNum + " is a palindrome");
				}
			}
			else{
				System.out.println(finalNum + " is not a palindrome");
			}	
		}
	}
}
