package Dec_3;
class vehicle{
    int speed;
    int tyres;

    public void applyBreak(){
        this.speed = 0;
    }

    public void speedUp(int speedToIncrease){
        this.speed = this.speed + speedToIncrease;
    }
}

class cycle extends vehicle{
    int SeatHeight;
    int chain;

    public void setSeatHeight(int height){
       this.SeatHeight = height; 
    }

    public void setChain(int chain){
        this.chain = chain;
    }
}

public class Inheritance {
    public static void main(String[]args){
       
        cycle c = new cycle();
        c.speedUp(10);
        System.out.println(c.speed);

    }
    
}
