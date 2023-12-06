package com.cemerarental.utitlity;

import java.util.Scanner;

import com.camerarental.service.CameraService;

public class CameraRentalUtility {

	static Scanner sc = new Scanner(System.in);
	
	public static void login() {
		
		System.out.print("USERNAME - ");
		String emailid = sc.next();
		System.out.print("PASSWORD - ");
		String password = sc.next();
		if(emailid.equals("admin") && password.equals("admin123")) {
			System.out.println("Successfully login");
			System.out.println();
			mainOption();
		}else {
			System.out.println("Failure try once again");
		}
	}
	
	private static void mainOption() {
		CameraService cs = new CameraService();
		int choice;
		String con="";
		do {
			System.out.println("1: MY CAMERA ");
			System.out.println("2: RENT CAMERA ");
			System.out.println("3: VIEW ALL CAMERAS ");
			System.out.println("4: MY WALLET ");
			System.out.println("5: EXIT");
			System.out.println("PLEASE ENTER YOUR CHOICE : ");
			choice = sc.nextInt();
			switch(choice) {
			case 1: subMenuOption();
				break;
			case 2: 
				break;
			case 3: cs.viewAllCamera();
				break;
			case 4: cs.myWallet();
				break;
			case 5: closeApp();
				break;
			default:System.out.println("Wrong choice");
			break;
			}
			System.out.println("Do you want to continue(yes/no)");
			con = sc.next();
			if(con.equalsIgnoreCase("yes")) {
				con = "1";
			}else {
				con = "0";
			}
		}while(con.equalsIgnoreCase("1"));
	}
	
	private static void subMenuOption() {
		int choice;
		String con="";
		CameraService cs = new CameraService();
		do {
			System.out.println("1: Add Camera");
			System.out.println("2: Remove Camera");
			System.out.println("3: View Camere details");
			System.out.println("4. Go to previous menu");
			choice = sc.nextInt();
			switch(choice) {
			case 1: cs.addCamera();
				break;
			case 2: cs.removeCamera();
				break;
			case 3: cs.viewAllCamera();
				break;
			case 4: mainOption();
				break;
			default:System.out.println("Wrong choice");
			break;
			}
			System.out.println("Do you want to continue(yes/no)");
			con = sc.next();
			if(con.equalsIgnoreCase("yes")) {
				con = "1";
			}else {
				con = "0";
			}
		}while(con.equalsIgnoreCase("1"));
	}
	
	private static void closeApp() {
		System.out.println("\nClosing your application... \nThank you!");
	}
}
