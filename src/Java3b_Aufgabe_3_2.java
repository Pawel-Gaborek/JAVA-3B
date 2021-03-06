
public class Java3b_Aufgabe_3_2 
{
	private int number_of_loop;
	private String number_to_print;
	private void getLoopNumber(int number)
	{
		number_of_loop = number;
	}
	private void printNumbers()
	{
		for (int i=0 ; i<number_of_loop ; i++)
		{
			if(i==0)
			{
				number_to_print=Integer.toString(i+1);
			}
			else
			{
				number_to_print+=","+Integer.toString(i+1);
			}
		}
		System.out.println("Ergebnis wird gezeigt: ");
		System.out.println(number_to_print);
	}
	public static void main(String[] args)
	{
		System.out.println("/* ####################################################");
		System.out.println("Einsendeaufgabe 3.2 ");
		System.out.println("#################################################### */");
		Java3b_Aufgabe_3_2 numbers = new Java3b_Aufgabe_3_2();
		numbers.getLoopNumber(50);
		numbers.printNumbers();
	}
}
