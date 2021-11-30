package Nov_17.Assignment;
import java.util.Scanner;

public class Grade {
    public static String grade(int marks){
    String Grade = " ";
    if (marks>=100)
    {
        Grade = " A+ ";
    } 
    else if(marks <89 && marks >=80)
    {
        Grade = "A"; 
    }
    else if (marks< 79 && marks>= 70)
    { 
        Grade = "B"; 
    }
    else if(marks <69 && marks >=60)
    {
        Grade = "C";
    } 
    else if(marks <59 && marks >=50)
    {
        Grade = "D";
    }
    else if(marks <50)
    {
        Grade = "Fail"; 
    }
     else
    {
        Grade = "invalid number"; 
    }
    return Grade;
}

  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    char ch;
    do{
    System.out.print("Enter the Percentage: ");
    int marks = sc.nextInt();
    String Grade=grade (marks);
	System.out.println("Your grade is: "+ Grade);
    System.out.println("Do you want to continue (Y/N)?: ");
    ch = sc.next().charAt(0);
    }while (ch=='y'|| ch=='Y');
    sc.close(); 
  }
}