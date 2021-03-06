import javax.swing.*;
public class Java3b_Aufgabe_3_4 
{
	private double number_01;
	private double number_02;
	private double result;
	private void getNumbers()
	{
		number_01 = Integer.valueOf(JOptionPane.showInputDialog("Bitte Sie erste Zahl angeben: "));
		number_02 = Integer.valueOf(JOptionPane.showInputDialog("Bitte Sie zweite Zahl angeben: "));
	}
	private void addition(){result=number_01+number_02;}
	private void substraction(){result=number_01-number_02;}
	private void multiplication(){result=number_01*number_02;}
	private void division(){result=number_01/number_02;}
	private void printResult(){JOptionPane.showMessageDialog(null, "Ergebnis betraegt: " + result);}
	public static void main(String[] args)
	{
		System.out.println("/* ####################################################");
		System.out.println("Einsendeaufgabe 3.4 ");
		System.out.println("#################################################### */");
		boolean end = false;
		
		Java3b_Aufgabe_3_4 calculator = new Java3b_Aufgabe_3_4();
		while(end!=true)
		{
			int choice;
			int temp;
			calculator.getNumbers();
			choice = Integer.valueOf(JOptionPane.showInputDialog("Welche mathematische Operation wuerden Sie gerne durchfuehren: 1-Addition 2-Subtraktion 3-Multiplikation 4-Division"));
			switch(choice)
			{
			case 1:
				calculator.addition();
				break;
			case 2:
				calculator.substraction();
				break;	
			case 3:
				calculator.multiplication();
				break;
			case 4:
				calculator.division();	
				break;
			}
			calculator.printResult();
			temp = Integer.valueOf(JOptionPane.showInputDialog("Wilst Du den Rechner zumachen: 1-ja, 0-nein"));
			if(temp==1){end=true;} else{end=false;}
		}
	}
}
