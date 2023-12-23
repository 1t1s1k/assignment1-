public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    //The distanceTo method is a way to calculate the distance between two points x and y
    public double distanceTo(Point destination) {
        double dx = this.x - destination.x;
        double dy = this.y - destination.y;
        return Math.sqrt(dx * dx + dy * dy);
    }
    //The toString method print out the coordinates of a point
    // we using "%F" to format coordinates as 2 points
    @Override
    public String toString() {
        return String.format("(%f, %f)", this.x, this.y);
    }
}
