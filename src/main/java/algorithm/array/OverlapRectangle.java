package algorithm.array;

public class OverlapRectangle {
    public static void main(String[] args) {
        System.out.println(checkOverlapRectangle(new Point(1,4), new Point(4,1), new Point(3, 7), new Point(7,3)));
    }

    private static boolean checkOverlapRectangle(Point S1, Point P1, Point S2, Point P2) {

        if(S1.x > P2.x || S2.x > P1.x)
            return false;

        if(S1.y < P2.y || S2.y < P1.y)
            return false;

        return true;
    }
}


class Point {
    int x;
    int y;
    Point(int x , int y){
        this.x = x;
        this.y = y;
    }
}