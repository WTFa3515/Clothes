package Pants;


public class Pants
{
	private String size;
	private String color;
	private int price;
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Pants(){}
	
	public Pants(String size){
		this();
		this.setSize(size);
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}
}