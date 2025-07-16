package breakContinueEx;

public class CountChar {

    public static void main(String[] args) {

        String str = "www.oracle.com";
        int count = 0;

        // Loop through each character in the string
        for (int i = 0; i < str.length(); i++) {
            // Check if the current character is 'w'
            if (str.charAt(i) == 'w') {
                count++;
            }
        }

        System.out.println("Number of w : " + count);
    }
}