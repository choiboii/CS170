/**
* Lab 6
* Group Members:
*	Andrew Choi, Sein Lee, Zhenke Liu, Alex Zheng
*
*/

public class lab6{

	public static void main(String[] args){
		System.out.println("\n");
		//call isPalindrome method to print true is string is Palindrome and else otherwise
		System.out.println("String \'cs170\' is palindrome: " + isPalindrome("cs170"));
		System.out.println("String \'racecar\' is palindrome: " + isPalindrome("racecar"));
		System.out.println("String \'2002\' is palindrome: " + isPalindrome("2002"));
		System.out.println("\n");

		//call checkEmotionalBias method to print the Number of Happy, Sad, and Neutral Faces of given string.
		checkEmotionalBias("I hate cloudy days :(, but I had lots of fun today :)."+
		"My cousin cooked a delicious lunch :), my uncle was working with his laptop all day :|,"+
		"and I got a chance to visit my friends after a few years :)!");
		System.out.println("\n");

		//call grammerChecker method to capitalize the first word of all sentences and print the text. Assuming all sentences end with "."
		String sentence = "jack is a student. he is a Good person. why are we asking These questions. not sure. Goodbye.";
		sentence = sentence.toLowerCase();
		grammerChecker(sentence);
		System.out.println("\n");

		//call grammerChecker_withPunctuations method to capitalize the first word of all sentences and print the text. Sentences can have "!","?",and "."
		sentence = "jack is a student! he is a Good person. why are we asking These questions! not sure? Goodbye!";
		grammerChecker_withPunctuations(sentence);
		System.out.println("\n");

		}

//-------------------------------------------------------------------------------------------------------------------
		/**	Problem 1
		* Find the emotional bias of a Tweet based on the number of Emojis in the text.
		* Print Number of Happy Faces, Number of Sad Faces, Number of Neutral Faces
		*/
		public static void checkEmotionalBias(String tweet){
			int tweetLength = tweet.length();
			int happyCount = 0;
			int sadCount = 0;
			int neutralCount = 0;

			for(int i = 0; i < tweet.length(); i++){
				if(tweet.charAt(i) == ':'){
					if(tweet.charAt(i+1) == ')'){
						happyCount++;
					}
					if(tweet.charAt(i+1) == '('){
						sadCount++;
					}
					if(tweet.charAt(i+1) == '|'){
						neutralCount++;
					}
				}
			}

			System.out.println("Happiness Score: "+happyCount +"\n"+"Sadness Score: "+
											 sadCount +"\n"+"Neutralness Score: "+neutralCount );
		}

//-------------------------------------------------------------------------------------------------------------------
		/**	Problem 2
		* Check if a string is palindrome
		*/
    public static boolean isPalindrome(String text){
			text = text.toLowerCase();
			String result = "";
			boolean isPal = false;
			for(int i = text.length() - 1; i >= 0; i--){
				result += text.substring(i,i+1);
			}
			if(result.equals(text) == true){
				isPal = true;
			}

      return isPal;		//change it to what ever is working for your code
    }


//-------------------------------------------------------------------------------------------------------------------
		/**	Problem 3
		* Capitalize the first word of each sentences and print the text. Assume sentences end with "."
		*/
		private static void grammarChecker(String text){
			while(text.indexOf('.') < text.length()-1){
				System.out.print(text.toUpperCase().charAt(0) + text.substring(1,text.indexOf('.')+2));
				text = text.substring(text.indexOf('.')+2);
			}
			System.out.print(text.toUpperCase().charAt(0) + text.substring(1));
		}

//-------------------------------------------------------------------------------------------------------------------
		/**	Problem 3 _ Bonus
		* Capitalize the first word of each sentence and print the text
		*/
		private static void grammerChecker_withPunctuations(String text){



		 System.out.print("");
	 }
}
