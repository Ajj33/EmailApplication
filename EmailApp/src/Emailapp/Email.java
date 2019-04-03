/*Author: Ajjuthan Sarvananthan */
package Emailapp;
import java.util.Scanner;

public class Email {
private String firstName;
private String lastName;
private String	department;
private String	password;
private String email;
private int mailboxCapacity = 500;
private int defaultPasswordLength=10;
private String alternateEmail;
private String companySuffix ="aeycompany.com";

// constructor to receive first name and last name
public Email(String firstName,String lastName){
	this.firstName =firstName;
	this.lastName =lastName;
	//testing* System.out.println("EMAIl CREATED:" +this.firstName +""+this.lastName);
	//Call a method asking for the department - return the department 
	this.department= setDepartment();
	//testing* System.out.println("Department:"+this.department);
	//call a method that creates random password
	this.password= randomPassword(defaultPasswordLength);
	 System.out.println("Your Password is:" +this.password);
	// Combine elements to generate email
	email = firstName.toLowerCase() + "." + lastName.toLowerCase()+"@"+ department+ "." + companySuffix;
	
}
	//Ask for department
	private String setDepartment() {
		System.out.print("New memeber:"+firstName+".Enter department Codes: \n1 for Sales\n2 for Development\n3 for Accounting\n0 for none \nEnter codes:");
		Scanner in = new Scanner(System.in);
		int depChoice = in.nextInt();
		if (depChoice == 1){return "sales";}
		else if(depChoice == 2){return "dev";}
		else if(depChoice == 3){return "acct";}
		else{return"";}
		
	}
//generate a random password
	private String randomPassword(int length){
		String passwordSet= "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789£$@&%*-";
		char[] password = new char[length];
		for (int i= 0;i<length;i++){
			int rand = (int) (Math.random()* passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		return new String(password);
		
	}

// Set the mailbox Capacity
	public void setMailboxCapacity(int capacity){
		this.mailboxCapacity = capacity;
	}

//set the alternate email
	public void setAlternateEmail(String altEmail){
		this.alternateEmail =altEmail;
	}
// Change the password
	public void changePassword(String password){
		this.password =password;
	}
	public int getMailboxCapacity() { return mailboxCapacity;}
	public String getAlternateEmail(){ return alternateEmail; }
	public String getPassword(){ return password;}
	
	public String showInfo(){
		return "DISPLAY NAME: " +firstName+ "" +lastName +
				"\nCOMPANY EMAIL: "+email +
				"\n MAILBOX CAPACITY: " + mailboxCapacity + "mb";
		
	}
}
