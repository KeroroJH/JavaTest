package kro.ex01;

public class E004 {

	public static void main(String[] args) {
		String magictype = "CDF V2 Document, Little Endian, Os: Windows, Version 5.1, Last Saved By: InstallShield , Number of Characters: 0, Title: ADOBER~1.0|Adobe Reader 8, Comments: Contact:  Your local administrator, Keywords: Installer,MSI,Database, Subject: ADOBER~1.0|Adobe Reader 8, Author: Adobe Systems Incorporated, Number of Pages: 300, Name of Creating Application: InstallShield  Developer 8.0, Last Saved Time/Date: Mon May 14 00:18:48 2007, Create Time/Date: Mon May 14 00:18:48 2007, Last Printed: Mon May 14 00:18:48 2007, Revision Number: {BDA19CE3-D9E3-4BB9-8C98-7620E76D66D9}, Code page: 949, Template: Intel;1042, Number of Words: 2, Security: 2";
		
		int isAppCount = magictype.indexOf("Name of Creating Application");
		if(isAppCount == -1){
			magictype = magictype.substring(0 , (magictype.indexOf(",") == -1)?  magictype.length() : magictype.indexOf(",") );
		}else{
			magictype = magictype.substring(isAppCount);
			magictype = magictype.substring(magictype.indexOf(":")+2 , (magictype.indexOf(",") == -1)?  magictype.length() : magictype.indexOf(",") );
		}

	}

}
