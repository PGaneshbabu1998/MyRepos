package com.camerarental.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.camerarental.bean.Camera;

public class CameraService {

	List<Camera> listOfCamera = new ArrayList<>();
	int id = 0;
	Scanner sc = new Scanner(System.in);
	public void addCamera() {
		System.out.println("Enter the camera brand");
		String brand = sc.next();
		System.out.println("Enter the camera model");
		String model = sc.next();
		System.out.println("Enter the camera per day amount");
		float amount = sc.nextFloat();
		Camera cc = new Camera();
		cc.setBrand(brand);
		cc.setModel(model);
		cc.setPerDayPrice(amount);
		
			//listOfCamera.add(cc);
		if(listOfCamera.add(cc)) {
			id++;
			cc.setId(id);
			cc.setStatus("Available");
		}
		System.out.println("YOUR CAMERA HAS BEEN SUCCESSFULLY ADDED TO THE LIST.");
	}
	
	public void removeCamera() {
		System.out.println("=========================================================================================");
		System.out.println("CAMERA ID              BRAND             MODEL          PRICE(PER DAY)             STATUS");
		System.out.println("=========================================================================================");
		viewAllCamera(); 
		System.out.println("ENTER THE CAMERA ID TO REMOVE - ");
		int id = sc.nextInt();
		int flag = 0;
		Iterator<Camera> li = listOfCamera.iterator();
		while(li.hasNext()) {
			Camera cam = li.next();
			if(cam.getId() == id) {
				flag++;
				listOfCamera.remove(id-1);
				System.out.println("CAMERA SUCCESSFULLY REMOVED FROM THE LIST.");
			}
		}
		if(flag == 0) {
			System.out.println("CAMERA NOT EXIST WITH THIS ID.");
		}
	}
	
	public void viewAllCamera() {
		Iterator<Camera> li = listOfCamera.iterator();
		while(li.hasNext()) {
			Camera cc = li.next();
			System.out.println(cc);  // toString method 
		}
	}
	
	public void myWallet() {
		float walletAmount = 500;
		System.out.println("YOUR CURRENT WALLET BALANCE IS INR."+walletAmount);
		System.out.println("DO YOU WANT TO DEPOSIT MORE AMOUNT INTO YOUR WALLET?(1.YES/0.NO) - ");
		int opt = sc.nextInt();
		if(opt == 1) {
			System.out.println("ENTER YOUR AMOUNT (INR) - ");
			int addWallet = sc.nextInt();
			walletAmount += addWallet;
			System.out.println("YOUR WALLET BALANCE UPDATED SUCCESSFULLY. CURRENT WALLET BALANCE (INR) - "+	walletAmount);
		}
	}
	
}
