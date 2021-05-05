/**
* Lab 7
* Group Members:
*	Andrew Choi, Seong Ug Kim, Ryan Gomez, Jay Lee
*
*/
import java.util.Arrays;
public class lab7{

	public static void main(String[] args){
     int[] array1 = {1, 2, 5, 8, 9, 5, 10};
     int[] array2 = {1, 0, 5, 15, 6, 4, 7, 0};

     System.out.println("\n");
     System.out.println("Array1 : " + Arrays.toString(array1));
     System.out.println("Array2 : " + Arrays.toString(array2));

     // the class example of finding common integer and print. with repetation!
     Print_Common_Elements_int(array1,array2);

     System.out.println("\n");
     String[] array3 = {"SQL", "JAVA", "PHP", "C#", "C++", "SQL"};
     String[] array4 = {"MySQL", "SQL", "JAVA", "Oracle", "PostgreSQL", "DB2", "JAVA"};

     System.out.println("Array1 : "+Arrays.toString(array3));
     System.out.println("Array2 : "+Arrays.toString(array4));

     // Exercise 1: Pront common String without repitation
     Print_Common_Elements_string(array3,array4);

     // Exercise 2: Pront common String without repitation
     System.out.println("\n");

     int[] array5 = {0, 3, -2, 4, 3, 2};
     int[] array6 = {10, 22, 10, 20, 11, 22};

     System.out.println("\n Original Array :" + Arrays.toString(array5));
     int[] array5_unique = unique_array(array5);
     System.out.println("\n Unique Array :" + Arrays.toString(array5_unique));

     System.out.println("\n Original Array :" + Arrays.toString(array6));
     int[] array6_unique = unique_array(array6);
     System.out.println("\n Unique Array :" + Arrays.toString(array6_unique));

  }

//------------------------------------------------------------------------------
  /**	Class Example
  * Write a method to find the common elements between two int arrays
  * Print the common elements
  */
  public static void Print_Common_Elements_int(int[] array1, int[] array2){
    System.out.print("Common element : ");
    for (int i = 0; i < array1.length; i++)
    {
        for (int j = 0; j < array2.length; j++)
        {
            if(array1[i] == (array2[j]))
            {
                System.out.print(array1[i]+" ");
            }
        }
    }
  }

//------------------------------------------------------------------------------
  /**	Problem 1
  * Write a method to find the common elements between two String arrays
  * Print the common elements without having repetation
  */
  public static void Print_Common_Elements_string(String[] array1, String[] array2){
		String result = "";

		for(int i = 0; i < array1.length; i++){
			for(int j = 0; j < array2.length; j++){
				if(array1[i].equals(array2[j]) && !result.contains(array1[i])){
					result += array1[i] + " ";
				}
			}
		}
		System.out.println(result);
  }


//------------------------------------------------------------------------------
  /**	Problem 2
  * Write a method to remove duplicates and return an array without duplication.
  */
  public static int[] unique_array(int[] my_array)
  {
      int[] uni_array = new int[my_array.length];  // change the size to what ever is right for your program
			int k = 0;
			for(int i = 0; i < my_array.length; i++){
				if(my_array[i] != 1000){
					uni_array[k++] = my_array[i];

					for(int j = i+1; j < my_array.length; j++){
						if(my_array[i] == my_array[j]){
							my_array[j] = 1000;
						}
					}

				}
			}

			int[] result = new int[k];
			for(int m = 0; m < k; m++){
				result[m] = uni_array[m];
			}
      return result;
  }
}
