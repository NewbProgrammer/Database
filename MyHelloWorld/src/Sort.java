import java.util.Arrays;
import java.util.Collections;


public class Sort {

	public static void main(String[] args) {
				
		        String[] str = new String[]{"BMW", "Audi", "Ferrari", "Mercedes", "Nissan", "Honda"};

		        try {
			 		if (args[0].equals("Ascending")) {
			 			Arrays.sort(str);
			      	} else if (args[0].equals("Descending")) {
			 			Arrays.sort(str, Collections.reverseOrder());
			 		} else if (!args[0].equals("Unsorted")){
			 			throw new IllegalArgumentException();
			 		}
		        } catch (IllegalArgumentException e) {
		        	 System.out.println("Incorrect argument in command line!");
		        	 System.exit(0);
		        }
		        System.out.println("Result: " + Arrays.toString(str));
	}
}
