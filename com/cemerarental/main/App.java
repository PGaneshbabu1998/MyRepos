package com.cemerarental.main;

import com.cemerarental.utitlity.CameraRentalUtility;

public class App {

	public static void main(String[] args) {
		
		//printing welcome message
		System.out.println("+--------------------------------+");
		System.out.println("|  WELCOME TO CAMERA RENTAL APP  |");
		System.out.println("+--------------------------------+");
		System.out.println("PLEASE LOGIN TO CONTINUE - ");
		//calling login method
		CameraRentalUtility.login();
	}

}
