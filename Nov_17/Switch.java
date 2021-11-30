package Nov_17;
//wap to print name of the month by passing number of the month
public class Switch {
    public static void main(String[]args){
        int n=3;
        
        switch (n)
        {
             case 1:
             System.out.println("jan");
             break;
             case 2:
             System.out.println("feb");
             break;
             case 3:
             System.out.println("march");
             break;
             case 4:
             System.out.println("April");
             break;

             default: //else
             System.out.println("Not valid");
        } 
    }
}