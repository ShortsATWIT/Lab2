package Practice;
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.util.*;
import java.util.ArrayList;
import java.util.Random;
import java.io.File; 
import java.io.FileNotFoundException; 
import java.text.DecimalFormat;

public class PracticeCode {

	public static void main(String[] args) {
		
		 try {
			 String[] strArray = new String[25];
			 double[] array = new double[15];
			 double avg = 0;
			 int i = 0;
			       File myObj = new File("comp1050.txt");
			       Scanner myReader = new Scanner(myObj);
			       while (myReader.hasNextLine()) {
			          strArray[i] = myReader.nextLine();
			           i++;
			       }
			       myReader.close();  

			       for (int a = 0; a < array.length; a++) {
			             array[a] = Double.valueOf(strArray[a]);
			             avg = (array[0] + array[1] + array[2] + array[3] + array[4] + array[5]
			 + array[6] + array[7] + array[8] + array[9] + array[10] + array[11] + array[12] + array[13] + array[14])/15;
			       }
			       double gr1 = array[0] - avg;
			       double gr2 = array[1] - avg;
			       double gr3 = array[2] - avg;
			       double gr4 = array[3] - avg;
			       double gr5 = array[4] - avg;
			       double gr6 = array[5] - avg;
			       double gr7 = array[6] - avg;
			       double gr8 = array[7] - avg;
			       double gr9 = array[8] - avg;
			       double gr10 = array[9] - avg;
			       double gr11 = array[10] - avg;
			       double gr12 = array[11] - avg;
			       double gr13 = array[12] - avg;
			       double gr14 = array[13] - avg;
			       double gr15 = array[14] - avg;
			       System.out.println("Grade differences from the average " + String.format("%.2f",avg) + ":" 
			 + "\n" + "Grade 1: " +String.format("%.2f",gr1)
			 + "\n" + "Grade 2: " +String.format("%.2f",gr2)
			 + "\n" + "Grade 3: " +String.format("%.2f",gr3)
			 + "\n" + "Grade 4: " +String.format("%.2f",gr4)
			 + "\n" + "Grade 5: " +String.format("%.2f",gr5)
			 + "\n" + "Grade 6: " +String.format("%.2f",gr6)
			 + "\n" + "Grade 7: " +String.format("%.2f",gr7)
			 + "\n" + "Grade 8: " +String.format("%.2f",gr8)
			 + "\n" + "Grade 9: " +String.format("%.2f",gr9)
			 + "\n" + "Grade 10: " +String.format("%.2f",gr10)
			 + "\n" + "Grade 11: " +String.format("%.2f",gr11)
			 + "\n" + "Grade 12: " +String.format("%.2f",gr12)
			 + "\n" + "Grade 13: " +String.format("%.2f",gr13)
			 + "\n" + "Grade 14: " +String.format("%.2f",gr14)
			 + "\n" + "Grade 15: " +String.format("%.2f",gr15));

			     } catch (FileNotFoundException e) {
			       System.out.println("An error occurred.");
			       e.printStackTrace();
			     }
			   }
			 }