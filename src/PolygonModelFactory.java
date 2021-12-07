import polygons.PolygonFactory;

public class PolygonModelFactory {
    public static PolygonModel makeDefaultModel() {
        PolygonModel model = new PolygonModel();
        model.addPolygon(PolygonFactory.makeSquare(50, 50));
        model.addPolygon(PolygonFactory.makeTriangle(100,100));
        model.addPolygon(PolygonFactory.makeRectangle(50,150));
        return model;
    }
}
