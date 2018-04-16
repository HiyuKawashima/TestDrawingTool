public class TestDrawingTool extend TestCase(){
    public void testDrawAllShapes(){
        Circle circle = new BigCircle(10, new Point(20,20));
        Square square = new BigSquare(50, new Point(10,10));
        circle.setPriority(0);
        square.setPriority(1);
        DrawingTool drawingTool = new DrawingTool();
        List<Shape> shapeList = new ArrayList<Shape>();
        shapeList.add(circle);
        shapeList.add(square);
        drawingTool.DrawAllShapes(shapeList);
    }
}

interface Shape {
    
}

public class Point(int p1, int p2){
    int x = p1;
    int y = p2;
}

public abstract class Circle implements Shape{
    double radius;
    Point point;
    int priority;

    abstract void Draw();
    abstract boolean Priority(int i);
    abstract setPriority(int p);
}

public class BigCircle(double r, Point p) extend Circle{
    radius = r;
    point = p;

    @override
    void Draw(){
        //rとpを使っていい感じに円を描画
    }

    @override
    boolean Priority(int i){
        if(priority == i){
            return true;
        } else{
            return false;
        }
    }

    @override
    public void setPriority(int p){
        this.priority = p;
    }
}

public abstract class Square implements Shape{
    int wide;
    Point point;
    int priority;

    abstract void Draw();
    abstract boolean Priorityint(int i);
    abstract setPriority(int p);

}

public class BigSquare(int w, Point p) extend Square{
    wide = w;
    point = p;

    @override
    void Draw(){
        //rとpを使っていい感じに四角を描画
    }

    @override
    boolean Priority(int i){
        if(priority == i){
            return true;
        } else{
            return false;
        }
    }

    @override
    public void setPriority(int p){
        this.priority = p;
    }
}

public class drawingTool(){
    public void DrawAllShapes(List<Shape> shapeList){
        int count = 0;
        int size = shapeList.size;
        int i = 0;

        while(count <= size){
            for(Shape shape : shapeList){
                if(shape.priority(i)){
                    shape.Draw();
                    count++;
                }
            }
            i++;
        }
    }
}