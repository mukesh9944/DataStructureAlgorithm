package datastructure.problem.array;

public class RectangleOverlapProblem {

    public static void main(String[] args) {
        Point s1 = new Point(1, 4);
        Point p1 = new Point(3, 2);
        Point s2 = new Point(2, 3);
        Point p2 = new Point(4, 1);

        boolean result = checkOverlapRectangle(s1, p1, s2, p2);
        System.out.println(result ? "Overlapped" : "Not overlapped");
    }

    private static boolean checkOverlapRectangle(Point s1, Point p1, Point s2, Point p2) {
        if (s1.x > p2.x || s2.x > p1.x) {
            return false;
        }
        if (s1.y < p2.y || s2.y < p1.y) {
            return false;
        }
        return true;
    }
}

class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}