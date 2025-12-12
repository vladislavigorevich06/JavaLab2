import java.util.ArrayList;
import java.util.Arrays;

public class Polyline {
    private ArrayList<Point> points;

    // 4.9 — пустой конструктор
    public Polyline() {
        points = new ArrayList<>();
    }

    // 4.9 — конструктор с набором точек
    public Polyline(Point... pts) {
        points = new ArrayList<>(Arrays.asList(pts));
    }

    // добавить одну точку
    public void addPoint(Point p) {
        points.add(p);
    }

    // добавить несколько точек
    public void addPoints(Point... pts) {
        points.addAll(Arrays.asList(pts));
    }

    // длина ломаной
    public double length() {
        double len = 0;
        for (int i = 1; i < points.size(); i++) {
            double dx = points.get(i).getX() - points.get(i - 1).getX();
            double dy = points.get(i).getY() - points.get(i - 1).getY();
            len += Math.sqrt(dx * dx + dy * dy);
        }
        return len;
    }

    // сдвинуть начало ломаной
    public void shiftStart(double dx, double dy) {
        if (!points.isEmpty()) {
            Point start = points.get(0);
            start.setX(start.getX() + dx);
            start.setY(start.getY() + dy);
        }
    }

    // сдвиг начала сразу нескольких ломаных
    public static void shiftStartForPolylines(double dx, double dy, Polyline... polylines) {
        for (Polyline poly : polylines) {
            poly.shiftStart(dx, dy);
        }
    }

    @Override
    public String toString() {
        return "Линия " + points.toString();
    }
}
