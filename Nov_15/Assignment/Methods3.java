package Nov_15.Assignment;
//write 3 different mathods each takes int, float, long numbers as input and returns its multiplication value
public class Methods3 {
   
    int multi(int a, int b){
        return a * b;
    }

   float multi(float a, float b){
        return a * b;
    }

    long multi(long a, long b){
        return a * b;
    }

    public static void main(String[] args) {
        Methods3 obj = new Methods3();
        int x = obj.multi(5,4);
        float y = obj.multi(5.1f,0.77f);
        long z = obj.multi(1112l, 00122l);
        System.out.println("Mutiply method: returns integer: " + x);
        System.out.println("Mutiply method: returns float: " +  y);
        System.out.println("Mutiply method: returns long: " +  z);

    }        
}
