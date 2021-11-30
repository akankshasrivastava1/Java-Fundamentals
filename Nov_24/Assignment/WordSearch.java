package Nov_24.Assignment;
import java.util.Scanner;
public class WordSearch {
    //search a word inside a string
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Sentence : "); 
		String str=sc.nextLine();
        System.out.println("Enter the word to be searched :");
		String search=sc.nextLine();
		int intIndex = str.indexOf(search);
		if(intIndex == - 1) {
			System.out.println("word not found");
		} else {
			System.out.println("word Found at index "+ intIndex);
		}
        sc.close();
	}
  
}
