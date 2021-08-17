package synchronize;
import java.io.FileInputStream;
import java.util.*;
public class Reader {

	public synchronized static void main(String[] args) {
		try {
			FileInputStream file = new FileInputStream("D:\\testFile.txt");
		}catch(Exception e) {
			System.out.println("File not Found");
		}
		finally {
			System.out.println("Executed the program");
		}

	}

}
