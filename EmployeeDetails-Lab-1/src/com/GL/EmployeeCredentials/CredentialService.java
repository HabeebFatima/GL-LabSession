package com.GL.EmployeeCredentials;

import java.util.Random;

import com.GL.EmployeeDetails.EmployeeDetails;


public class CredentialService {
public char[] generatePassword()
{
String strCapitalLetters= "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
String strSmallLetters= "abcdefghijklmnopqrstuvwxyz";
String strNum="0123456789";
String splChar="!@#$%^&*()_+";

String strValues =strCapitalLetters+strSmallLetters+strNum+splChar;

Random rd =new Random();


char [] password =new char[8];

for(int i=0;i<8;i++)
{
password [i] = strValues.charAt(rd.nextInt(strValues.length()));

}

return password;

}
public String generateEmailid(String strFirstName,String strlastName,String strDepartment )
{
	String strEmailid=strFirstName+strlastName+"@"+strDepartment+"abc.com";
	return strEmailid;
	
	}
public void showCredentials(EmployeeDetails empDetails,String strEmailid,char[] password)
{
	System.out.println("Dear "+empDetails.getStrFirstName()+" "+empDetails.getStrLastName()+" **** Welcome to Company abc ****"
	+" \nPlease find your Credentials Below");
System.out.println("Email id : " + strEmailid);
System.out.println("Password : " + password);

}

}
