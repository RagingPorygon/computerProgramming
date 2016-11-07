//Brandon Isensee

public class HighLow

{
	public static void main(String [] arg)
	{
		double all[] = new double[10];
		double above[] = new double[10];
		double below[] = new double[10];
		double Avg = 0;
		int aboLogic = 0;
		int belLogic = 0;
		System.out.println(" 10 random real numbers");
		
		for(int i = 0; i < 10; i++)
		{
			double num = ((int)(Math.random() * 10000)) / 100.0;
			System.out.print(" " + num);
			all[i] = num;
		}
		
		System.out.println();

        Avg = ((all[0] + all[1] + all[2] + all[3] + all[4] + all[5] + all[6] + all[7]) / 8) * 100;
        Avg = Math.round(Avg);
        Avg /= 100;
		
		System.out.println();
		System.out.println(" Average = " + Avg);
		
		
		//Calculate positions of above/below numbers here
		
		for(int i = 0; i < 10; i++)
		{
			if(all[i] < Avg)  //if below
			{
				below[belLogic] = all[i];
				belLogic++;
			}
			
			if(all[i] > Avg)  //if above
			{
				above[aboLogic] = all[i];
				aboLogic++;
			}
			
		}
		
		//End of calculations, make arrays after?
		
		
		
		System.out.print(" Above = ");
			
		for(int i = 0; i < aboLogic; i++)
		{
			System.out.print(above[i] + " ");
		}
		
		System.out.println();
		System.out.print(" Below = ");
		
		for(int i = 0; i < belLogic; i++)
		{
			System.out.print(below[i] + " ");
		}
		
		System.out.println();
		System.out.println();
	}
}