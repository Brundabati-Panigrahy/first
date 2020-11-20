package com.mindtree.entity;

public class Watch {
	private int id;
	private int modelNumber;
	private float price;
	private int type;

	public Watch() {
		super();
	}

	public Watch(int id, int modelNumber, float price, int type) {
		super();
		this.id = id;
		this.modelNumber = modelNumber;
		this.price = price;
		this.type = type;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getModelNumber() {
		return modelNumber;
	}

	public void setModelNumber(int modelNumber) {
		this.modelNumber = modelNumber;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Watch [id=" + id + ", modelNumber=" + modelNumber + ", price=" + price + ", type=" + type
				+ "]";
	}

}
