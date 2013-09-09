package bearsandhunters;

public class Hunter extends Animal
{
    boolean married;
    
    void shoot()
    {
	System.out.println("Bang!");
    }
    
    void checkMaritalStatus()
    {
	if(married == true)
	{
	    System.out.println("I'm married.");
	    run();
	}
	
	if(married != true)
	{
	    System.out.println("I'm not married.");
	}
    }
    
}
