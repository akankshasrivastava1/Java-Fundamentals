package Dec_3;

class Encapsulation{
    private String name;
    private int age;

    public int getAge(){
        return this.age;
    }

    public String getName(){
        return this.name;
    }

    public void setAge(int age){
        this.age =age;
    }

    public void setName(String name){
        this.name =name;
    }

}

public class Encapsulations {
    public static void main(String[]args){
        Encapsulation obj = new Encapsulation();
        System.out.println("before setting");
        System.out.println(obj.getAge());
        System.out.println(obj.getName());

        obj.setName("akanksha");
        obj.setAge(5);

        System.out.println("after setting");
        System.out.println(obj.getAge());
        System.out.println(obj.getName());

    }
    
}
