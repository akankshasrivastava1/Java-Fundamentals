package Nov_22;

public class task2 {
    public static void main(String[] args) {
       
        int [] marks = {13,25,16,15,18,3,20,20,15};
        int t =15;
        int index = -1;
        boolean IsFound = false;
        for(int i=0; i<marks.length; i++)
        {
           // System.out.println("checking");
           if (marks[i]==t){
              IsFound =true;
              index =i;
              //break;

           }
           //System.out.print("checking");
        }
        int position =(index>9) ? index+1:-1;
        System.out.println(IsFound);
        //System.out.print(index+1);
        System.out.println(position);
    }
}
