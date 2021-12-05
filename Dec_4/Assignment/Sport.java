package Dec_4.Assignment;
/* When a subclass inherits from a superclass, it also inherits its methods; 
however, it can also override the superclass methods (as well as declare and implement new ones). Consider the following Sports class:*/
class Sports{
    String getName(){
        return "Generic Sports";
    }
    void getNumberOfTeamMembers(){
        System.out.println( "Each team has n players in " + getName() );
    }
}
class Soccer extends Sports{

    @Override
    String getName(){
        return "Soccer Class";
    }
    void getNumberOfTeamMembers(int n){
        System.out.println( "Each team has " + n +  " players in " + getName() );
    }
}

public class Sport {
    public static void main(String args[]){
        Sports obj = new Sports();
        System.out.println(obj.getName());
        obj.getNumberOfTeamMembers();

        Soccer obj1 = new Soccer();
        System.out.println(obj1.getName());
        obj1.getNumberOfTeamMembers(11);
    }
    
}
