import polygons.IPolygon;

import javax.swing.*;
import java.awt.*;

public class PolygonView extends JComponent implements Observer {
    private PolygonModel model;

    public PolygonView(PolygonModel model) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setBounds(30,30,300,300);
        frame.getContentPane().add(this);
        frame.setVisible(true);

        this.model = model;
        model.addObserver(this);
    }

    @Override
    public void paint(Graphics g) {
        for (IPolygon currentPolygon : model.getPolygons()) {
            currentPolygon.paint(g);
        }
    }//paint

    @Override
    public void update() {
        repaint();
    }
}
