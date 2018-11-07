Package Clothes;

public class Clothes
{
	private String size;
	private String color;
	private int price;
	
	public Clothes(){}
	
	public Clothes(String size)
	{
		this();
		this.size = size;
	}
	
	public Clothes(String size, String color)
	{
		this(size);
		this.color = color;
	}
	
	public Clothes(String size, String color, int price)
	{
		this(size, color);
		this.price = price;
	}
	
	public Sting getSize()
	{	return this.size;	}
	
	public Sting getColor()
	{	return this.color;	}
	
	public void setSize(String size)
	{	this.size = size;	}
	
	public void setColor(String color)
	{	this.color = color;	}
	
	public int getPrice()
	{	return this.color;	}
	
	public void setPrice(int price)
	{	this.price = price;	}
}