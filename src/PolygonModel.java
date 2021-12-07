import polygons.IPolygon;
import polygons.PolygonFactory;

import java.util.ArrayList;
import java.util.List;

public class PolygonModel {
    private List<IPolygon> polygons;
    private boolean direction = true;
    private int ticker = 0;
    private List<Observer> observers;

    public PolygonModel() {
        polygons = new ArrayList<>(10);
        observers = new ArrayList<>();
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public List<IPolygon> getPolygons() {
        return polygons;
    }

    public void addPolygon(IPolygon polygon) {
        polygons.add(polygon);
    }

    private void update() {
        ticker++;
        int value = direction ? 10 : -10;
        for (IPolygon p: polygons){
            p.updateCenter(p.getCenter().x+value, p.getCenter().y+value);
        }
        if (ticker > 10) {
            direction = !direction;
            ticker = 0;
        }

        for (Observer observer : observers) {
            observer.update();
        }
    }

    public void start() {
        try {
            while (true) {
                Thread.sleep(500);
                update();
            }
        } catch (InterruptedException e) {}
    }
}
