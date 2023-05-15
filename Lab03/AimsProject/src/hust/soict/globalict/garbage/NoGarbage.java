package hust.soict.globalict.garbage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class NoGarbage {
	public static void main(String[] args) {

		String filename = "D:\\test.txt";
		byte[] inputBytes = { 0 };
		long startTime, endTime;

		try {
			inputBytes = Files.readAllBytes(Paths.get(filename));
			startTime = System.currentTimeMillis();
			String outputString = "";
			for (byte b : inputBytes) {
				outputString += (char) b;
			}
			endTime = System.currentTimeMillis();
			System.out.println("Test String : " + (endTime - startTime));

			startTime = System.currentTimeMillis();
			StringBuilder outputBuilder = new StringBuilder();
			for (byte b : inputBytes) {
				outputBuilder.append((char) b);
			}
			endTime = System.currentTimeMillis();
			System.out.println("Test StringBuilder : " + (endTime - startTime));

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
