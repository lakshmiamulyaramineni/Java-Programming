/*Palindrome or Special word or both or none*/


import java.util.Scanner;

public class Words{
	public static void main(String[] args)
{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter word: ");
		String Word = sc.next(); 
        String word = Word.toLowerCase();
		char firstLetter = word.charAt(0);
		char lastLetter = word.charAt(word.length() - 1);
		if (firstLetter == lastLetter) 
		{
			System.out.print (Word+" is a Special word");
			String reverse = "";
    		for (int i = word.length() - 1; i >= 0; i--)
    		{
    			reverse = reverse + word.charAt(i);
    		}
    
    		if(word.equals(reverse)) {
    			System.out.println("\n"+Word+" is a Palindrome");
    		}
    		else
    		System.out.println(", but not a palindrome");
		}
        else
            System.out.println(Word+" not a Special word");
		
	}
}