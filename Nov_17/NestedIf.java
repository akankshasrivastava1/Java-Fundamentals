package Nov_17;
//print num is b/w 0 and 10 when num is b/w 0 and 10 
public class NestedIf {
    public static void main(String[]args){
        
        int n=5;
        if (n>=0){
            if (n<=10){
                System.out.println("num is b/w 0 and 10");
            } 
        }
        if(n>=10 && n<=10){
            System.out.println("num is b/w 0 and 10");
        }
    }
}