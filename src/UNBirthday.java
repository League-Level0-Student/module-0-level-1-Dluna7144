import javax.swing.JOptionPane;

public class UNBirthday {

	public static void main(String[] args) {

String date = "11-14-17";
String birthday = JOptionPane.showInputDialog("When is your Birthday");
if(birthday.equals("11-14-17")){
	JOptionPane.showMessageDialog(null, "HAPPY BIRTHDAY");

}

	else
	JOptionPane.showMessageDialog(null, "Merry Un-Birthday");
	
	
	
}

}