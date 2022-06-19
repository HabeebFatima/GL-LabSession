package com.GL.EmployeeDetails;

public class EmployeeDetails {
private String strFirstName;
public String getStrFirstName() {
	return strFirstName;
}

public void setStrFirstName(String strFirstName) {
	this.strFirstName = strFirstName;
}

private String strLastName;

public String getStrLastName() {
	return strLastName;
}

public void setStrLastName(String strLastName) {
	this.strLastName = strLastName;
}

public EmployeeDetails (String strFirstName,String strLastName)
{
	this.strFirstName=strFirstName;
	this.strLastName=strLastName;
	}
	

}
