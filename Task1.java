package Lab1Task1;
public class Task1 {
	public static void main(String[] args) {
		System.out.println("Hello! Welcome to Java.");

		Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter second number: ");
        int num2 = input.nextInt();
        int sum = num1 + num2;
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
        input.close();
	}
}

