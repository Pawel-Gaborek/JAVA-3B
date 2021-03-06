public class Java3b_Aufgabe_3_3 
{
	private int number_to_print;
	private void getNumber(int number)
	{
		number_to_print=number;
	}
	private void printNumbers()
	{
		int i=1;
		int temp;
		while(i<=number_to_print)
		{
			temp=i*2;
			System.out.println(temp);
			i++;
		}
	}
	public static void main(String[] args)
	{
		System.out.println("/* ####################################################");
		System.out.println("Einsendeaufgabe 3.3 ");
		System.out.println("#################################################### */");
		Java3b_Aufgabe_3_3 numbers = new Java3b_Aufgabe_3_3();
		numbers.getNumber(100);
		numbers.printNumbers();
	}
}
