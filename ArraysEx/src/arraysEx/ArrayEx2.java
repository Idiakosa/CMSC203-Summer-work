package arraysEx;

public class ArrayEx2 {
	public static void main(String args[]) {
        String[] browsers = new String[4];
        browsers[0] = "explorer";
        browsers[1] = "chrome";
        browsers[2] = "opera";
        browsers[3] = "firefox";
        System.out.print("size of array: " + browsers.length);
        
        // for loop 
        System.out.println("\nBrowsers stored in the array:");
        for (String browser : browsers) {
            System.out.println(browser);
        }

    }
}
