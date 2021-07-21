import javax.swing.*;
public class Personer {

	public static void main (String[] args)
	{
		String namn1=JOptionPane.showInputDialog("Skriv ditt namn:");
		String adress1=JOptionPane.showInputDialog("Skriv in din adress:");
		int ålder1=Integer.parseInt(JOptionPane.showInputDialog("Skriv in året du föddes:"));

		String namn2=JOptionPane.showInputDialog("Skriv ditt namn:");
		String adress2=JOptionPane.showInputDialog("Skriv in din adress:");
		int ålder2=Integer.parseInt(JOptionPane.showInputDialog("Skriv in året du föddes:"));

		String namn3=JOptionPane.showInputDialog("Skriv ditt namn:");
		String adress3=JOptionPane.showInputDialog("Skriv in din adress:");
		int ålder3=Integer.parseInt(JOptionPane.showInputDialog("Skriv in året du föddes:"));

		Person människa=new Person(namn1,adress1,ålder1);
		Person människaett=new Person(namn2,adress2,ålder2);
		Person människatvå =new Person(namn3,adress3,ålder3);

		JOptionPane.showMessageDialog(null, människa); //människa.toString()
		JOptionPane.showMessageDialog(null, människaett);
		JOptionPane.showMessageDialog(null, människatvå);
		String svar=JOptionPane.showInputDialog("Vill du byta adress på någon av de följande inmatningarna?");
		String nyttsvar=jaellernej(svar);
	    if(nyttsvar.equalsIgnoreCase("Ja"))
	    {
		String adressvar=JOptionPane.showInputDialog("Vilken person? Ange 1,2 eller 3");
		if(adressvar.equalsIgnoreCase("1"))
		{
			människa.bytadress(JOptionPane.showInputDialog("Skriv adress här"));
			JOptionPane.showMessageDialog(null, människa);
		}
		else if(adressvar.equalsIgnoreCase("2"))
		{
			människaett.bytadress(JOptionPane.showInputDialog("Skriv adress här"));
			JOptionPane.showMessageDialog(null, människaett);
		}
		else if(adressvar.equalsIgnoreCase("3"))
		{
			människatvå.bytadress(JOptionPane.showInputDialog("Skriv adress här"));
			JOptionPane.showMessageDialog(null, människatvå);
		}}
	}
	public static String jaellernej(String svar)
	{
		String nyttsvar;
		if(svar.equalsIgnoreCase("Ja"))
		{
			nyttsvar=svar;
			return nyttsvar;
		}
		else if(svar.equalsIgnoreCase("Nej"))
		{
			return "Ingen ändring sker";
		}
		else
		{
			return "Inget rimligt svar.Ingen ändring sker";
		}
	}
