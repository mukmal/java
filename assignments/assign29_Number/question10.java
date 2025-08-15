import java.io.*;

class Demo {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintStream out = new PrintStream(System.out);
        out.print("Enter Number : ");
        int num = Integer.parseInt(br.readLine());

        int originalNum = num; // store original number
        int sum = 0, rem;

        // Count digits
        int digits = 0, temp = num;
        while (temp > 0) {
            digits++;
            temp /= 10;
        }

        // Calculate Armstrong sum without Math.pow
        temp = num;
        while (temp > 0) {
            rem = temp % 10;
            int power = 1; // will store rem^digits
            for (int i = 0; i < digits; i++) {
                power *= rem; // multiply rem 'digits' times
            }
            sum += power;
            temp /= 10;
        }

        if (sum == originalNum) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not Armstrong Number");
        }
    }
}
