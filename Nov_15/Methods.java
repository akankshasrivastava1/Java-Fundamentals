package Nov_15;

public class Methods {
   
    public static void main(String[] args) {

        Methods obj1 =new Methods();
        Methods obj2 =new Methods();
        Methods obj3 =new Methods();

        add(5.5f,5.5f, 5.5f);

        isPositive(5);
    }



    static int add(int a, int b){
        int res=a+b;
        return res;
    }

    static float add(float a, float b){
        float res=a+b;

        res=res+10;
        return res;
    }

    static float add(float a, float b, float c){
        float res=a+b;
        return res;
    }

    float add(float a, float b, int c){
        float res=a+b;
        return res;
    }
//
//    static double add(double a, double b){
//        double res=a+b;
//        return res;
//    }



    static void isPositive(int a){

        if(a>0){
            System.out.println("Postive");
        }else {
            System.out.println("Negative");
        }




        if(a==5){
            System.out.println("Its five");
        }else {
            System.out.println("not five");
        }

        //   return;
        if(a==0){
            System.out.println("Its zero");
        }else {
            System.out.println("not zero");
        }
    }



    static void  say_hi(){
        System.out.println("Hi");
    }



}
    

