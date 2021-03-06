import javax.swing.*;
public class Java3b_Aufgabe_3_1 
{
	private int year;
	private boolean leap_year;
	
	private void getYear(int numberObject)
	{
		year = Integer.valueOf(JOptionPane.showInputDialog("Bitte Sie Jahr fuer Objekt " + numberObject + " angeben: "));
	}
	private void checkYeear()
	{
		if ((year%4==0 && year%100!=0) || (year%4==0 && year%100==0 && year%400==0))
		{
			leap_year=true;
		}
		else
		{
			leap_year=false;
		}
	}
	private void printResult(int numberObject)
	{
		if(leap_year==true)
		{
			System.out.println("Das ist Ergebnis fuer Objekt: " + numberObject);
			System.out.println("Jahr " + year + " ist einem Schaltjahr.");
		}
		else
		{
			System.out.println("Das ist Ergebnis fuer Objekt: " + numberObject);
			System.out.println("Jahr " + year + " ist leider keinem Schaltjahr.");
		}
	}
	public static void main(String[] args)
	{
		System.out.println("/* ####################################################");
		System.out.println("Einsendeaufgabe 3.1 ");
		System.out.println("#################################################### */");
		Java3b_Aufgabe_3_1  Object_01 = new Java3b_Aufgabe_3_1();
		Java3b_Aufgabe_3_1  Object_02 = new Java3b_Aufgabe_3_1();;
		Object_01.getYear(1);
		Object_02.getYear(2);
		Object_01.checkYeear();
		Object_02.checkYeear();
		Object_01.printResult(1);
		Object_02.printResult(2);
	}
}
