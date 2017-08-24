package MyPointAndMyCircle;

public class MyTriangle {
    private MyPoint _v1 = new MyPoint(0, 0);
    private MyPoint _v2 = new MyPoint(0, 0);
    private MyPoint _v3 = new MyPoint(0, 0);

    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        _v1 = new MyPoint(0, 0);
        _v2 = new MyPoint(0, 0);
        _v3 = new MyPoint(0, 0);
    }

    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
        _v1 = v1;
        _v2 = v2;
        _v3 = v3;
    }

    public String toString() {
        return String.format("My Triangle[%d=, %d=, %d=]", _v1, _v2, _v3);
    }

}
