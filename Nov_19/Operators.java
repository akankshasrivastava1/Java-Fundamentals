package Nov_19;

public class Operators {
    public static void main (String [] args){
        // assignment operator -> =
        int a = 5;
        int b = 2;
        double res = 0;

        // +, -, *, /

        res = a+b;
        System.out.println("add:"+res); //8

        res = a-b;
        System.out.println("subs:"+res); //4

        res = a*b;
        System.out.println("multi:"+res);

        res = (double)a/b; // quotient
        System.out.println("div:"+res);

        res = a%b; // remainder
        System.out.println("mod"+res);

        // Assignment operators

        int m = 5;
        // increment m by 1
        System.out.println(m);
        m+=1;
        m = m + 1;
        m++; //post increment // increment at next line can be incremented only by 1
        ++m; // pre increment -> incremented instantly

        m = 6;
        System.out.println(m++); //6
        System.out.println(++m); //8

        // --n >=1 => 4>=1 => true
        int n = 5;
        while(n>=1){
            n--;
        }

        System.out.println("actual"+res); //6
        System.out.println("during post inc"+m++); //6
        System.out.println("after post inc"+m); //7
        System.out.println("during pre inc"+ ++m); //8
        System.out.println("after pre inc"+res+m); //8

        // increment operators


        System.out.println(m);

        printRelation(4, 5);

        // logical operarots
        /*
        */
        int x=3;
        int y = 5;
         if (a>5 && ++b<3){
             System.out.println("entered");
         }
         System.out.println(b); //5
         if(!(x<5)){

         }

         //(OR operator)   (NOR OPERATOR - inverse the condition)  (AND OPERATOR)  (XOR OPERTAOR)
         /* A B RESULT     !(false) ->true                          A B RESULT     A B RESULT
            T T  T         !(true) -> false                         T T  T         T T  F
            T F  T                                                  T F  F         T F  T 
            F T  T                                                  F T  F         F T  T
            F F  F                                                  F F  F         F F  F
         */
        int x1=3;
        int y1 = 5;
         if (a>5 || ++b<3){
             System.out.println("entered");
         }
         System.out.println(b);

         //Add numbers without using + symbol

         //123 50

         // Bitwise Operator
        //  & AND , | OR, ^ XOR, >> RIGHT SHIFT , <<LEFT SHIFT
          
      // write a method which takes a number as input increments its value by 10 and returns result  

    }

    


    static void printRelation(int a, int b){

        if(a==b){
            System.out.println("Both are same");
        }else if (a>b){
            System.out.println("a is greater than b");
        }
        else if (b>a){
            System.out.println("a is greater than b");
        }
    }
}
