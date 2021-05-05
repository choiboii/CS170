import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class lab12{
	public static void main(String[] args) throws FileNotFoundException{
		double total = 0.0;
		try{
				// get file
				String fileInName = "items.txt";
				String fileOutName = "receipt.txt";

				// Read File
				File items = new File(fileInName);
				Scanner scan = new Scanner(items);

				File output = new File(fileOutName);
				FileWriter fw = new FileWriter(output);
				BufferedWriter out = new BufferedWriter(fw);


				// write File
				out.write("=========================================");
				out.newLine();
				out.write("        The Prancing Pony                ");
				out.newLine();
				out.write("Your server was: Barliman Butterbur      ");
				out.newLine();
				out.write("Meal: Second Breakfast                   ");
				out.newLine();
				out.write("ITEM                    QTY       COST($)");
				out.newLine();
				out.write("=========================================");
				out.newLine();

				while(scan.hasNextLine()){
					String temp = scan.nextLine();
					Pattern p = Pattern.compile("(\\d+.(?!^\\d))(\\D+)(\\d+.\\d+)");
					Matcher m = p.matcher(temp);
					m.find();
					out.write(String.format("%-25s%-10s%-10s",m.group(2),m.group(1),m.group(3)));
					out.newLine();
					try{
						total += Double.parseDouble(m.group(3));
					}	catch(NumberFormatException e){
						System.out.println("NumberFormatException");
					}
				}
				scan.close();

				out.write("=========================================");
				out.newLine();
				out.write("Tax:                        " + String.format("%.2f",total/10.0));
				out.newLine();
				out.write("Total:                      " + String.format("%.2f",(total + total/10.0)));
				out.newLine();
				out.write("Customer Name:   Pippin");
				out.newLine();
				out.write("Thank you!");
				out.newLine();
				out.write("=========================================");
				out.newLine();

				out.close();

			} catch (IOException e){
				System.out.println("IOException");
			}	catch (NumberFormatException e){
				System.out.println("NumberFormatException");
			}	catch (IllegalStateException e){
				System.out.println("IllegalStateException");
			}	catch (IndexOutOfBoundsException e){
				System.out.println("IndexOutOfBoundsException");
			}
	}
}
