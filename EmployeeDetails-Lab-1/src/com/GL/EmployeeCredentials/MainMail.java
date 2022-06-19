package com.GL.EmployeeCredentials;
import java.util.Scanner;

import com.GL.EmployeeDetails.EmployeeDetails;


public class MainMail {

	public static void main(String[] args) {
		char[] password;
		String strGenerateEmailid;
		Scanner sc=new Scanner(System.in);
		String strFirstName,strLastName;
		System.out.println("Enter first Name");
		strFirstName=sc.nextLine();
		System.out.println("Enter Last Name");
		strLastName=sc.nextLine();
		CredentialService credentialService= new CredentialService();
		EmployeeDetails empDetails= new EmployeeDetails(strFirstName,strLastName);
		int option;
		
		
			 System.out.println(" Please Enter the department from the following list  ");
			 System.out.println(" 1.Technical \n 2.Admin\n 3.Human Resource\n 4.Legal "); 
			 option =sc.nextInt();
			
		 switch(option)
		 {
		 case 1:	 strGenerateEmailid=credentialService.generateEmailid(empDetails.getStrFirstName(), empDetails.getStrLastName(),
					 						"Technical");
			 password=credentialService.generatePassword();
			 credentialService.showCredentials(empDetails, strGenerateEmailid, password);
			 break;
		 case 2:	 strGenerateEmailid=credentialService.generateEmailid(empDetails.getStrFirstName(), empDetails.getStrLastName(),
					"Admin");
password=credentialService.generatePassword();
credentialService.showCredentials(empDetails, strGenerateEmailid, password);
break;
		 case 3:	 strGenerateEmailid=credentialService.generateEmailid(empDetails.getStrFirstName(), empDetails.getStrLastName(),
					"Human Resource");
password=credentialService.generatePassword();
credentialService.showCredentials(empDetails, strGenerateEmailid, password);
break;

		 case 4:	 strGenerateEmailid=credentialService.generateEmailid(empDetails.getStrFirstName(), empDetails.getStrLastName(),
					"Legal");
password=credentialService.generatePassword();
credentialService.showCredentials(empDetails, strGenerateEmailid, password);
break;

		 default: break;
		 
			 
		 }
		
		
	}

}
