package multiThreading;

import java.io.IOException;

public class Runtime1 {
//
	public static void main(String[] args) {

		try {
			Runtime.getRuntime().exec("notepad");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(Runtime.getRuntime().availableProcessors());
	}

}
