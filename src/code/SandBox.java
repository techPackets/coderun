package code;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SandBox {

	public static void main(String[] args) throws IOException {
		List<String> arrList = new ArrayList<String>();
		arrList.add(1,"Shivang");
		
		System.out.println(arrList.get(0));
		System.out.println(arrList.get(1));
		System.out.println(arrList);
		}
	}
