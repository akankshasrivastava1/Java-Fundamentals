package Nov_17.Assignment;
import java.util.Scanner;

public class Courses {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the branch (in capital): CSE, ECE, MECH ");
        String branch =sc.nextLine();
        System.out.println(" Enter the year");
	int year=sc.nextInt();
        System.out.println("\nCourses :");
        if (year==1){
            System.out.println(" Courses are English, Maths, Science ");
        } else if (year ==2 ) { 
            switch (branch)
            {
                case "CSE":
                System.out.println("Courses are Operating System, Java, Data Structure");
                break;
                case "ECE":
                System.out.println("Courses are Micro processors, Logic switching theory");
                break;
                case "MECH":
                System.out.println("Courses are Drawing, Manufacturing Machines");
                break;
                default:	
                System.out.println("Invalid Choice");
            }  
        }else if (year == 3){
                switch (branch)
                {
                     case "CSE":
                     System.out.println("Courses are Computer Organization, MultiMedia");
                     break;
                     case "ECE":
                     System.out.println("Courses are Fundamentals of Logic Design, Microelectronics");
                     break;
                     case "MECH":
                     System.out.println("Courses are Internal Combustion Engines, Mechanical");
                     break;
                     default:	
		     System.out.println("Invalid Choice");
                }  
            }else if (year == 4){
                switch (branch)
                {
                     case "CSE":
                     System.out.println("Courses are Data Communication and Networks");
                     break;
                     case "ECE":
                     System.out.println("Courses are Embedded System, Image Processing");
                     break;
                     case "MECH":
                     System.out.println("Courses are Production Technology, Thermal Engineering");
                     break;
                     default:	
	             System.out.println("Invalid Choice");
                }  
            }else
            {
                System.out.println("Enter year of study between 1 to 4");
            }
            sc.close();
  }
}
