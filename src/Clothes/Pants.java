package Clothes;


public class Pants
{
	private String size;
	
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