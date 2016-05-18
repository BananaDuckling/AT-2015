package hsftc;

public class Hadhadhad {
	public static void main(String[] args)
	{
		int pCorr = 2;
		int pInc = 1;
		double incorrects = 0;
		
		//loop calculates number of hads in each incorrect iteration
		for(int x = 0; x<100; x++)
		{
			incorrects += 6 + 2*pInc + pCorr;
		}
		
		System.out.println(incorrects);
	}
}
