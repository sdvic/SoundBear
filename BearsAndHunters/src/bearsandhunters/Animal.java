package bearsandhunters;

public class Animal
{
    int age;
    int height;
    int weight;
    String color;
    String nickName;
    Boolean angry;
    
    void run()
    {
	System.out.println("I'm out of here!");
    }
    
    void eat()
    {
	System.out.println("I'm easting...don't bother me!");
    }
    
    void printNickName()
    {
	System.out.println("My name is " + nickName);
    }
    
    void printAge()
    {
	 System.out.println("I am " + age + " years old.");
    }
    
}
