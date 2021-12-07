import polygons.IPolygon;
import polygons.PolygonFactory;

import javax.swing.*;
import java.awt.Graphics;
import java.util.*;

public class DrawPolygons {
    public static void main(String[] args) {
        PolygonModel model = PolygonModelFactory.makeDefaultModel();
        PolygonView view = new PolygonView(model);
        PolygonController controller = new PolygonController(model, view);

        model.start();
    }//main
}//DIT953.polygons.DrawPolygons