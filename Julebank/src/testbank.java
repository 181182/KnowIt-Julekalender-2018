import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class testbank {
	public static void main(String[] args) {
		for (int j = 0; j < 10; j++) {

			outer: for (int i = 0; i < 10; ++i) {
				if (i % 2 == 0) {
					continue outer;
				}
//				System.out.println(i);
			}
		System.out.println(j);
		}
	}

}