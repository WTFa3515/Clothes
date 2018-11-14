package Clothes;

import function.Antiwind;

public class Raincoat extends Clothes implements Antiwind {

	public Raincoat() {
		// TODO Auto-generated constructor stub
	}

	public Raincoat(String size) {
		super(size);
		// TODO Auto-generated constructor stub
	}

	public Raincoat(String size, String color) {
		super(size, color);
		// TODO Auto-generated constructor stub
	}

	public Raincoat(String size, String color, int price) {
		super(size, color, price);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void antiwind() {
		// TODO Auto-generated method stub
		System.out.println("¨¾­·«B¦ç");
	}

}
