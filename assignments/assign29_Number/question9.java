import java.io.*;

class Demo {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintStream out = new PrintStream(System.out);
        out.print("Enter Number : ");
        int num = Integer.parseInt(br.readLine());

        int originalNum = num; // store original value
        int sumOfDigits = 0, rem;

        while (num > 0) {
            rem = num % 10;
            sumOfDigits += rem; // sum of digits
            num = num / 10;
        }

        if (originalNum % sumOfDigits == 0) {
            System.out.println("Harshad Number");
        } else {
            System.out.println("Not Harshad Number");
        }
    }
}
