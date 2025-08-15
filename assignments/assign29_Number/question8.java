import java.io.*;

class Demo {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintStream out = new PrintStream(System.out);
        out.print("Enter Number : ");
        String numStr = br.readLine();

        // Check if first digit is zero
        if (numStr.charAt(0) == '0') {
            System.out.println("Not Duck Number");
            return;
        }

        boolean isDuck = false;
        for (int i = 0; i < numStr.length(); i++) {
            if (numStr.charAt(i) == '0') {
                isDuck = true;
                break;
            }
        }

        if (isDuck) {
            System.out.println("Duck Number");
        } else {
            System.out.println("Not Duck Number");
        }
    }
}
