import Clothes.*;
import Pants.Jeans;
import Pants.Pants;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Jeans jeans = new Jeans();
		System.out.print("Please input Pants size : ");
		String size = scanner.nextLine();
		jeans.setSize(size);
		System.out.print("Please input Pants color : ");
		String color = scanner.nextLine();
		jeans.setColor(color);
		System.out.print("Please input Pants price : ");
		int price = scanner.nextInt();
		jeans.setPrice(price);
		System.out.printf("jeans size is %s", jeans.getSize());
		System.out.printf("\njeans color is %s", jeans.getColor());
		System.out.printf("\njeans price is %d", jeans.getPrice());
		Clothes raincoat = new Clothes();
		System.out.print("Please input Pants size : ");
		size = scanner.nextLine();
		raincoat.setSize(size);
	}

}
