package com.camerarental.bean;

public class Camera {
	private int id;
	private String brand;
	private String model;
	private float perDayPrice;
	private String status;

	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public float getPerDayPrice() {
		return perDayPrice;
	}
	public void setPerDayPrice(float perDayPrice) {
		this.perDayPrice = perDayPrice;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Camera() {
		super();
	}
	public Camera(String brand, String model, float perDayPrice, int id, String status) {
		super();
		this.brand = brand;
		this.model = model;
		this.perDayPrice = perDayPrice;
		this.id = id;
		this.status = status;
	}
	
	@Override
	public String toString() {
		return "id="+ id+", brand=" + brand + ", model=" + model + ", perDayPrice=" + perDayPrice + ", status="
				+ status +"";
	}

}
