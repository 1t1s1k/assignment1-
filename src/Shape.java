import java.util.ArrayList;

public class Shape {
    private ArrayList<Point> points;

    public Shape(ArrayList<Point> points) {
        this.points = points;
    }

    public double perimeter() {

        double perimeter = 0;
        // this loop using all points from source.txt
        // then finding distance between every pair of points
        // using all distance summarising perimeter

        for (int i = 0; i < this.points.size(); i++) {
            Point current = this.points.get(i);
            Point next = this.points.get((i + 1) % this.points.size());
            perimeter += current.distanceTo(next);
        }

        return perimeter;
    }

    public double longestSide() {

        double longest = 0;
        // this loop iterates over all the points stored in the points list and
        // calculates the distance between each pair of adjacent points
        // Then it stores the distance in the distance variable 1
        for (int i = 0; i < this.points.size(); i++) {
            Point current = this.points.get(i);
            Point next = this.points.get((i + 1) % this.points.size());
            double distance = current.distanceTo(next);

            if (distance > longest) {
                longest = distance;
            }
        }
        return longest;
    }

    public double averageSide() {

        double sum = 0;
        /*
        this loop passes through all points stored in the points list and calculates
        the distance between each pair of adjacent points
        then summarizes all the distances to obtain the perimeter
         */
        for (int i = 0; i < this.points.size(); i++) {
            Point current = this.points.get(i);
            Point next = this.points.get((i + 1) % this.points.size());
            sum += current.distanceTo(next);
        }

        return sum / this.points.size();
    }
}
