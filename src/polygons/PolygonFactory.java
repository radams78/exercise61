package polygons;

/**
 * Created by Niklas on 2016-02-19.
 */
public class PolygonFactory {

    public static IPolygon makeTriangle(int x, int y){
        return new Triangle(x,y);
    }
    public static IPolygon makeRectangle(int x, int y) { return new Rectangle(x,y); }
    public static IPolygon makeSquare(int x, int y) { return new Square(x,y); }

}
