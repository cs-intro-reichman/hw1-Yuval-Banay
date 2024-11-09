// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
	int x = Integer.parseInt(args[0]);
	int a = (int) (x * Math.random());
	int b = (int) (x * Math.random());
	int c = (int) (x * Math.random());

	// finding min and max
	int min = Math.min(a, Math.min(b, c));
	int max = Math.max(a ,Math.max(b, c));
	// Finding the middle number
	int sum = a + b + c;
	int mid = sum - min - max;

	System.out.println(a + " " + b + " " + c);
	System.out.println(min + " " + mid + " " + max);
	}
}
