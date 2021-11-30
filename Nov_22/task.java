package Nov_22;

 class task {
    public static void main(String[] args) {
       
       int [] marks = {13,25,16,18,3,20,20};
       int count =0;
       for(int i=0; i<marks.length; i++)
       {
          if (marks[i]==20){
              count++;
          }
       }
       System.out.print(count);
    }
}   
