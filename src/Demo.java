import Clothes.*;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Pants pants = new Pants();
		System.out.print("Please input Pants size : ");
		String size = scanner.nextLine();
		pants.setSize(size);
		System.out.printf("pants size is %s", pants.getSize());
	}

}
