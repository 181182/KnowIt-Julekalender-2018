import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class parallel {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		try (BufferedReader br = new BufferedReader(new FileReader("input-rain.txt"))) {
			String line;

			float sum1 = 0;
			float sum2 = 0;
			float sum3 = 0;
			float sum4 = 0;
			float sum5 = 0;

			BufferedReader reader = new BufferedReader(new FileReader("input-rain.txt"));
			int lines = 0;
			while (reader.readLine() != null)
				lines++;

			float[] array = new float[lines];
			int teller = 0;
			while ((line = br.readLine()) != null) {
				String[] parts = line.split(";");
				String[] parts1 = parts[0].split(",");
				String[] parts2 = parts[1].split(",");

				String tall1 = parts1[0].replaceAll("[^\\d.]", "");
				String tall2 = parts1[1].replaceAll("[^\\d.]", "");
				String tall3 = parts2[0].replaceAll("[^\\d.]", "");
				String tall4 = parts2[1].replaceAll("[^\\d.]", "");

				sum1 = Integer.parseInt(tall1);
				sum2 = Integer.parseInt(tall2);
				sum3 = Integer.parseInt(tall3);
				sum4 = Integer.parseInt(tall4);
				sum5 = ((sum4 - sum2) / (sum3 - sum1));
//				System.out.println(sum5);
//				if (sum5 == 0) {
//					System.out.println("(" + sum1 + "," + sum2 + ");(" + sum3 + "," + sum4 + ")");
//				}
				array[teller] = sum5;
				teller++;
			}
			for (int i = 0; i < array.length; i++) {

				int count = 0;

				float val = array[i];

				for (int j = 0; j < array.length; j++) {

					if (val == array[j]) {

						count += 1;

					}

				}

				System.out.println(val + " occurs" + " " + count);

			}
//			sum5 = ((sum4-sum2)/(sum3-sum1));
//			System.out.println("Svaret er: " + sum5);
//			System.out.println("Tall1: " + sum1);
//			System.out.println("Tall2: " + sum2);
//			System.out.println("Tall3: " + sum3);
//			System.out.println("Tall4: " + sum4);
//			Map<Integer, Long> frequencies = Arrays.stream(array)
//		            .boxed()
//		            .collect(Collectors.groupingBy(i -> i, Collectors.counting()));
//		    if (frequencies.isEmpty()) {
//		        System.out.println("No data");
//		    } else {
//		        long topFrequency = frequencies.values()
//		                .stream()
//		                .max(Long::compareTo)
//		                .get();
//		        int[] topNumbers = frequencies.entrySet()
//		                .stream()
//		                .filter(e -> e.getValue() == topFrequency)
//		                .mapToInt(Map.Entry::getKey)
//		                .toArray();
//		        for (int number : topNumbers) {
//		            System.out.println("" + number + " => " + topFrequency);
//		        }
//		    }			
		}
	}

}
