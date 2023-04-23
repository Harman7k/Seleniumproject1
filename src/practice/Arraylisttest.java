package practice;

import java.util.ArrayList;

public class Arraylisttest {
	public static void main(String[] args) {
		
		ArrayList<String> tools = new ArrayList<String>();
		
		tools.add("Selenium");
		tools.add("Java");
		tools.add("TestNG");
		tools.add("Junit");
		
		System.out.println(tools.size());
		System.out.println(tools.get(0));
		System.out.println(tools.get(1));
		System.out.println(tools.get(2));
		System.out.println(tools.get(3));
		
		tools.remove(1);
		System.out.println(tools.get(1));
		
		for (int i=0; i<tools.size(); i++) {
			System.out.println(tools.get(i));
		}
		
		
	
	}
	

}
