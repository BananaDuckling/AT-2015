package linkedLists;

public class TermStore {
	private double coef, power;
	
	public TermStore(double c, double p)
	{
		coef = c;
		power = p;
	}
	
	public double getCoef() {
		return coef;
	}
	public void setCoef(double coef) {
		this.coef = coef;
	}
	public double getPower() {
		return power;
	}
	public void setPower(double power) {
		this.power = power;
	}
	public void decrementPower()
	{
		power --;
	}
	public void incrementPower()
	{	
		power++;
	}
	public void printTerm()
	{
		System.out.print(coef + "x^" + power);
	}
}
