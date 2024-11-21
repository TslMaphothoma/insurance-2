import javax.swing.JOptionPane;
public class Members
{
	public static void main(String[] args)
	{
		int date = 0,age = 0,selection = 0;
		String name = " ", surname = " ";
		boolean addMember;
		
		name = JOptionPane.showInputDialog(null,"Please enter your name: ");
		surname = JOptionPane.showInputDialog(null,"Please enter your surname: ");
		date = Integer.parseInt(JOptionPane.showInputDialog(null,"What year were you born in ?"));
		selection = JOptionPane.showConfirmDialog(null,"Do you want to add members");
		addMember = (selection == JOptionPane.YES_OPTION);
		age = 2024-date;
		
		if(addMember == true)
		{
			JOptionPane.showMessageDialog(null,"You're "+name+" "+surname+" who is "+age+" years old and you have selected to add members");
		}
		else
		{
			JOptionPane.showMessageDialog(null,"You're "+name+" "+surname+" who is "+age+" years old and you have selected to not add members");
		}
	}
}