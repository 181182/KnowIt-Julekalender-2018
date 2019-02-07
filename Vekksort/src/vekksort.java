import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class vekksort {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		try (BufferedReader br = new BufferedReader(new FileReader("input-vekksort.txt"))) {
			String line;
			int sum = 0;
			int tall = 0;
			int forrige = 0;
			while ((line = br.readLine()) != null) {
				System.out.println(tall);
				tall = Integer.parseInt(line);
				if(forrige <= tall) {
				sum = sum + Integer.parseInt(line);
				forrige = Integer.parseInt(line);
				}
			}
			System.out.println(sum);
		}
	}
}
