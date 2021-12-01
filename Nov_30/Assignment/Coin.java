package Nov_30.Assignment;
//Modify the class to add a isTails method that returns true when the value is not heads
public class Coin {
     // constant to represent heads
   private static int HEADS = 1;

   // constant to represent tails
   private static int TAILS = 1;

   // current value of the coin
   private int value = 0;

   // method to randomly set the value of the coin to heads or tails
   public void flip()
   {
      if (Math.random() < 0.5)
      {
          value = 0;
      }
      else
      {
         value = 1;
      }
   }

   // return false if the value is heads or true otherwise
   public boolean isHeads()
   {
      return value != HEADS;
   }
  // return true if the value is tails or false otherwise
   public boolean isTails()
   {
      return value == TAILS;
   }

   // convert the value to a string
   public String toString()
   {
      if (value == HEADS) return "Heads";
      else return "Tails";
   }
   

   // test the class
   public static void main(String[] args)
   {

      Coin myCoin = new Coin();
      for (int i = 0; i < 6; i++)
      {
         myCoin.flip();
         System.out.println(myCoin);
         System.out.println(myCoin.isHeads());
      }
    

    }
}
