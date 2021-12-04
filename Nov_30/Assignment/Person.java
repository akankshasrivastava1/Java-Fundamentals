package Nov_30.Assignment;

public class Person {
    // fields
   String name;
   String email;
   int age;
   int phoneNumber;

   // constructor
   Person(){
    this.name = "akanksha";
    this.email = "akanksha@gmail.com";
    this.age = 3;
    this.phoneNumber = 1234567890;

   }
   public Person(String theName)
   {
      this.name = theName;
   }
   public Person(String theName, int theage)
   {
      this.name = theName;
      this.age = theage;
   }
   public Person(String theName, int theage, String theEmail)
   {
      this.name = theName;
      this.age = theage;
      this.email = theEmail;
   }
   public Person(String theName, int theage, String theEmail, int thephoneNumber)
   {
      this.name = theName;
      this.age = theage;
      this.email = theEmail;
      this.phoneNumber = thephoneNumber;
   }

   // methods - getters
   public String getName() { return this.name;}
   public int getage() { return this.age;}
   public String getEmail() { return this.email;}
   public int getPhoneNumber() { return this.phoneNumber;}

   // methods - setters
   public void setage(int theage) { this.age = theage;}
   public void setName(String theName) { this.name = theName;}
   public void setEmail(String theEmail) {this.email = theEmail;}
   public void setPhoneNumber(int thePhoneNumber) { this.phoneNumber = thePhoneNumber;}
   public String toString()
   {
      return this.name + " " + this.email + " " + this.phoneNumber;
   }

   // main method for testing
   public static void main(String[] args)
   {
	   Person p = new Person("Sana");
           System.out.println(p);
          
	   Person p1  = new Person();
           System.out.println(p1.getName());
	   System.out.println(p1.getage());  
           System.out.println(p1.getEmail());  
	   System.out.println();

           Person p2  = new Person();
           p2.setName("akanksha_Srivastava");
	   p2.setage(5);
	   p2.setEmail("ak@gmail.com");
           p2.setPhoneNumber(1233445567);
           System.out.println(p2.getName());
	   System.out.println(p2.getage());
           System.out.println(p2.getEmail());
           System.out.println(p2);  
		  
   }
    
}
