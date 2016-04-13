package heaps;

public class Monster implements Comparable<Monster> {
	private int height, weight, age;
	
	public String toString()
	{
		return "height: "+height+"\nweight: "+weight+"\nage: "+age+"\n";
	}
	
	public Monster(int h, int w, int a)
	{
		height = h;
		weight = w;
		age = a;
	}
	
	public Object clone()
	{
		return new Monster(height, weight, age);
	}
	
	public boolean equals(Object o)
	{
		Monster m = (Monster)o;
		return(m.getHeight() == this.height && 
				m.getWeight() == this.weight &&
				m.getAge() == this.age);
	}
	
	public int compareTo(Monster m)
	{
		if(this.height > m.getHeight())
			return 1;
		else if(this.height == m.getHeight())
		{
			if(this.weight > m.getWeight()	)
				return 1;
			else if(this.weight == m.getWeight())
			{
				if(this.age > m.getAge())
					return 1;
				else if(this.age == m.getAge())
					return 0;
				else
					return -1;
			}
			else 
				return -1;
		}
		else
			return -1;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
