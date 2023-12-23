

import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class MyApplication {

    public static void main(String[] args) {
        // We create an ArrayList of points
        ArrayList<Point> points = new ArrayList<Point>();
        try {
            //importing points
            File file = new File("C:\\Users\\boyp2\\IdeaProjects\\Assignment\\src\\sourse.txt");

            //scanner
            Scanner scanner = new Scanner(file);

            //loop checking all points until the last one then dividing them into 2 parts
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                //and saving them in array coordinates
                String[] coordinates = line.split(" ");

                //x and y getting numbers from coordinates and making themselfs into number with 2 numbers after comma
                double x = Double.parseDouble(coordinates[0].replace(",", "."));
                double y = Double.parseDouble(coordinates[1].replace(",", "."));
                //there point object with x and y created and added to the list points
                Point point = new Point(x, y);
                points.add(point);
            }

            scanner.close();

        } catch (FileNotFoundException e) {
            // If we can't find the file, we print an error message
            System.out.println("File not found.");
        }
        // We create an object of the Shape class
        Shape shape = new Shape(points);
        //%.4f means that after ',' we will have 4 more numbers
        System.out.printf("Perimeter: %.4f\n", shape.perimeter());
        System.out.printf("Longest side: %.4f\n", shape.longestSide());
        System.out.printf("Average side: %.4f\n", shape.averageSide());
    }
}

