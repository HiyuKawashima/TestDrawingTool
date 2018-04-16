public class TestDrawingTool extend TestCase(){
    public void testDrawAllShapes(){
        Circle circle = new BigCircle(10, new Point(20,20));
        Square square = new BigSquare(50, new Point(10,10));
        DrawingTool drawingTool = new DrawingTool();
        List<Shape> shapeList = new ArrayList<Shape>();
        shapeList.add(circle);
        shapeList.add(square);
        drawingTool.DrawAllShapes(shapeList);
    }
}

public class Point(int p1, int p2){
    int x = p1;
    int y = p2;
}

public class Circle(){
    double radius;
    Point point;
}

public class BigCircle extend Circle(double r, Point p){
    radius = r;
    point = p;

    void Draw(){
        //rとpを使っていい感じに円を描画
    }
}

public class Square(){
    int wide;
    Point point;
}

public class BigSquare extend Square(int w, Point p){
    wide = w;
    point = p;

    void Draw(){
        //rとpを使っていい感じに四角を描画
    }
}

public class drawingTool(){
    public void DrawAllShapes(ArrayList<Shape> arr){
        for(int i = 0; i < arr.size; i++){
            arr[i].Draw();
        }
    }
}