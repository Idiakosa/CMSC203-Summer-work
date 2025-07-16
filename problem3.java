package problem3;

public class problem3 {

    public static void main(String[] args) {
        createRectangle(5, 4);
        System.out.println();
        createTriangle(5);
    }

    public static void createRectangle(int width, int height) {
        if (width < 1 || height < 1) {
            System.out.println("Invalid dimensions. Width and height must be at least 1.");
            return;
        }

        for (int h = 0; h < height; h++) {
            for (int w = 0; w < width; w++) {
                System.out.print("#");
            }
            System.out.println(); 
        }
    }

    public static void createTriangle(int size) {
        if (size < 1) {
            System.out.println("Invalid size. Leg size must be at least 1.");
            return;
        }

        for (int row = 1; row <= size; row++) {
            for (int col = 0; col < row; col++) {
                System.out.print("#");
            }
            System.out.println(); 
        }
    }
}