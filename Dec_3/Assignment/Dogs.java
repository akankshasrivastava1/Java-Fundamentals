package Dec_3.Assignment;
//Edit this code so the class Beagle is a subclass of the Dog class. When you run the code it should print “woof!” and then “arf arf”
public class Dogs
{
    public void speak()
    {
        System.out.println("woof!");
    }

    public static void main(String[] args)
    {
        Dogs d = new Dogs();
        d.speak();
        Dogs b = new Beagle();
        b.speak();
    }
}

class Beagle extends Dogs
{
    @Override
    public void speak()
    {
        System.out.println("arf arf");
    }
}


