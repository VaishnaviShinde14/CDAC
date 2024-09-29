public class RightTrianglePattern {
	public static void main (String [] args){
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the number of rows:");
	int n = scanner.nextInt();
	scanner.close();
	printRightTriangle(n);
	}
	public static void printRightTringle(int n){
		for (int i = 1; i <= n; i++){
			for (int j = 1; j <= i; j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}