package Nov_15.Assignment;

public class Max {
    public static void main(String[] args) {
    System.out.println("The maximum between 3 and 4 is "+ max (3, 4));
    System.out.println("The maximum between 3, 5 and 8 is " + max (3, 5, 8));
    System.out.println("The maximum between 3, 6, 16 and 9 is " + max (3, 6, 16, 9));
    }

    public static int max (int a, int b){
        if (a>b){
            return a;
        }else {
            return b;
        }
    }

    public static int max (int a, int b, int c){
        return max(max(a, b), c);
 }

    public static int max (int a, int b, int c, int d){
        return max(max(a, b, c), d); 
    }
}    

