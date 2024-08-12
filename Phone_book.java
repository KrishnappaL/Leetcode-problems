package codes;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Phone_book {
public static void main(String[] args) {
	Map<String,String> phone_book=new HashMap<>();
	Scanner input=new Scanner(System.in);
	int ph_book=input.nextInt();
	input.nextLine();
	for(int i=0;i<ph_book;i++) {
		String name=input.nextLine();
		String phone=input.nextLine();
		phone_book.put(name, phone);
	}
	while(input.hasNext()) {
		String person_name=input.nextLine();
		if(phone_book.containsKey(person_name))
			System.out.println(person_name + "=" + phone_book.get(person_name));
		else System.out.println("not found");
	}
}
}
