package hashTables;

public class Wrestler 
{
	private String name;
	private int weight;
	/**
     * Constructor for objects of class Wrestler
     */
    public Wrestler( String theName, int theWeight)       
    {
        name= theName;
        weight=theWeight;
    }
    public int getWeight()
    {
    	int temp = weight;
    	//actually returns weight group
        temp = temp/10;
        return temp%10;
    }
    public String getName()
    {
        return name;
    }

    public String toString()
    {
        return name + ":  " +weight;

    }
}
