//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0




import javax.swing.JOptionPane;

/*
* Everyone has a superpower. Mine is writing recipes. This program will store
* the superpowers of all the people in the classroom. E.g. When I type "June",
* your program should say "June's superpower is writing recipes".
*/
public class XGeeks {
public static void main(String[] args) {

		// 1. Save the superpower for each person in a variable.
String Dominique="Strength";
String Andrea="Mind Reading";
String Maribel="Speed";
String Helsy="Flying";
String Isaac="Invisibility";
		// 2. Ask the user to enter a name. Store their answer in a variable.
String name=JOptionPane.showInputDialog("Enter THE name");
		// 3. Show the superpower in a pop-up, depending on the name entered. 
if(name.equals("Dominique")){
	JOptionPane.showMessageDialog(null, "Dominqiue's superpower is "+Dominique);
	
}
if(name.equals("Andrea")){
	JOptionPane.showMessageDialog(null, "Andrea's superpower is "+Andrea);
	
	
}
if(name.equals("Maribel")){
	JOptionPane.showMessageDialog(null, "Maribel's superpower is "+Maribel);
	
	
}
if(name.equals("Helsy")){
	JOptionPane.showMessageDialog(null, "Helsy's superpower is "+Helsy);	
	
	
}
if(name.equals("Isaac")){
	JOptionPane.showMessageDialog(null,  "Isaac's superpower is "+Isaac);
	
	//do something
	
	
	
	
	
}
int x=5;
if(x==5){	
syso("A");
}
else if(x=10){
	syso("B");
}
else{
	syso("D");
}
}
	
	
}

	}


