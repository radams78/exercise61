import polygons.PolygonFactory;

import java.awt.*;
import java.awt.event.*;

/**
 * Created by Niklas on 2016-02-21.
 */
public class PolygonController {

    private PolygonModel model;
    private PolygonView view;

    public PolygonController(PolygonModel model, PolygonView view) {
        this.model = model;
        this.view = view;
        initInteraction();
    }

    private void initInteraction() {
        view.addMouseListener(new PolygonCreator());
    }

    private class PolygonCreator implements MouseListener {
        public void mouseEntered(MouseEvent e) {
        }

        public void mousePressed(MouseEvent e) {
        }

        public void mouseReleased(MouseEvent e) {
        }

        public void mouseExited(MouseEvent e) {
        }

        public void mouseClicked(MouseEvent e) {
            Point pointClicked = e.getPoint();
            model.addPolygon(PolygonFactory.makeRectangle(
                    pointClicked.x, pointClicked.y));
        }

    }

}
