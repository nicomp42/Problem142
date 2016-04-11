package problem142;

public class Problem142 {

	public static void main(String[] args) {
		int result = solve();
		System.out.println("Problem 142 = " + result);
	}
	
	public static int solve() {
		int result = 0;
		int limit = 1006193;
		int x = 1, y = 1, z = 1;
		
		for (x = 3; x < limit; x++) {			
			for (y = 2; y < x; y++) {
				if ((x > y) && isSquare(x + y) && isSquare(x - y) ) {	
					for (z = 1; z < y; z++) {
						if (y > z) {
							if (isSquare(x + z)	&&
								isSquare(x - z)	&&
								isSquare(y + z)	&&
								isSquare(y - z)) {
								System.out.println("x = " + x + " y = " + y + " z = " + z + " x + y + z = " + (x + y + z));
							}
						}
					}
				}
			}
		}
		
		return x + y + z;
	}
	private static boolean isSquare(double num){
		boolean result = false;
		int x = (int)Math.sqrt(num);
		if (x * x == num) result = true;
		
		return result;
	}

}
