/**
* Lab 6
* Group Members:
*	Andrew Choi, Sein Lee, Zhenke Liu, Alex Zheng
*
*/

public class testlab6{

	public static void main(String[] args){
		//call grammerChecker method to capitalize the first word of all sentences and print the text. Assuming all sentences end with "."
		String sentence = "jack is a student. he is a Good person. why are we asking These questions. not sure. Goodbye.";
		sentence = sentence.toLowerCase();
		grammarChecker(sentence);
		System.out.println("\n");

		//call grammerChecker_withPunctuations method to capitalize the first word of all sentences and print the text. Sentences can have "!","?",and "."
		sentence = "jack is a student! he is a Good person. why are we asking These questions! not sure? Goodbye!";
		grammarChecker_withPunctuations(sentence);
		System.out.println("\n");

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
		private static void grammarChecker_withPunctuations(String text){
			


		 System.out.print("");
	 }
}
