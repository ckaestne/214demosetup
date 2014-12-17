package demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class HelloWorld {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(new HelloWorld().getMessage());
	}

	public String getMessage() {
		return "hi there.";
	}
	
	private void triggerFindbugs() throws FileNotFoundException {
		FileInputStream a = new FileInputStream(new File("a"));
		return;
	}

}
