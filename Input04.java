package input04;

import java.util.Scanner;

public class Input04 {
    public static void main(String[] args){
        String fileContent = """
            Ball 210 660 N
            Goal 672 420
            BlueBumper 120 450
            BlueBumper 420 450
            //RedBumper 420 570
            RedBumper 420 210
            RedBumper 720 210
            LevelGeometry 150 0 BigTriangle NW
            LevelGeometry 780 0 BigTriangle NE
            LevelGeometry 630 480 BigSquare S
            LevelGeometry 630 600 BigSquare S
            No RotationWall
            No Fan
            No Blade
            """;

        Scanner sc = new Scanner(fileContent);

        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            if (line.startsWith("BlueBumper")) {
                Scanner lineScanner = new Scanner(line);
                lineScanner.next(); // Skip "BlueBumper"
                int xPosition = lineScanner.nextInt();
                int yPosition = lineScanner.nextInt();
                System.out.println("X: " + xPosition + ", Y: " + yPosition);
                lineScanner.close();
            }
        }

        sc.close();
    }
}