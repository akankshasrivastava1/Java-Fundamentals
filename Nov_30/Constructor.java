package Nov_30;
class Student{
    String name;
    int age;
    public String address;

    Student() {
        this("Akanksha",5);  // calling another constructor must be the first statement in a constructor 
        System.out.println("Creating object");
    }

    Student(String name1, int age1){
        this("bhopal"); 
        this.name= name1;
        this.age =age1;
        System.out.println("Creating object with name and age");
    }

    Student(String address){
        //this.name= name;
        this.address =address;
        System.out.println("Creating object with name and address");
    }

    public String add(String num1, String num2){
        return num1+ num2;
    }
   
    public int add(int num1, int num2){
        //String ans = add("1","2");
        //System.out.println(ans);
        return num1+ num2;
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }
   
}
 class Constructor {
    public static void main (String[]args){
        Student s1 = new Student();
        System.out.println(s1.name);
        System.out.println(s1.address);
        System.out.println(s1.age);
        
        //System.out.println(s1.add("1","2"));
    }
    
}
