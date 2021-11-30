package Nov_22;

import java.util.Scanner;

class Arrays {
    public static void main(String[] args) {
        int [] marks = new int[5];

       // int [] arr = {3,5,6,8,3};
        //int value =0;
        Scanner sc= new Scanner(System.in);
        //filling the array
        for(int i =0; i< marks.length; i++){
           System.out.println("Enter marks");
          // value =sc.nextInt();
           marks[i] = sc.nextInt();
          // sc.close();
        }

        //getting the values in array
        System .out.println("array entered is:");
        for(int i =0; i< marks.length; i++){
            System.out.println(marks[i]);
        }
        sc.close();
    } 
}
