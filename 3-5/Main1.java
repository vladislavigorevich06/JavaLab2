public class Main1 {
    public static void main(String[] args) {
        // === Задача 3.2 — Ломаные ===
        System.out.println("=== Задача 3.2 — Ломаные ===");

        // создаём первую ломаную (конструктор с набором точек)
        Polyline poly1 = new Polyline(
                new Point(1, 5),
                new Point(2, 8),
                new Point(5, 3)
        );

        // создаём вторую ломаную (первая и последняя точки совпадают)
        Polyline poly2 = new Polyline(
                new Point(1, 5),
                new Point(2, -5),
                new Point(4, -8),
                new Point(5, 3)
        );

        System.out.println("Первая ломаная: " + poly1);
        System.out.println("Вторая ломаная: " + poly2);

        // сдвигаем начало обеих ломаных одновременно
        Polyline.shiftStartForPolylines(1, 1, poly1, poly2);

        System.out.println("После сдвига:");
        System.out.println("Первая ломаная: " + poly1);
        System.out.println("Вторая ломаная: " + poly2);

        // === Задача 4.9 — Конструкторы ломаной ===
        System.out.println("\n=== Задача 4.9 — Конструкторы ===");

        // пустой конструктор
        Polyline emptyPolyline = new Polyline();
        System.out.println("Пустая ломаная: " + emptyPolyline);

        // конструктор с набором точек
        Polyline polyWithPoints = new Polyline(new Point(1, 5), new Point(2, 8));
        System.out.println("Ломаная с точками: " + polyWithPoints);

        // === Задача 5.7 — Длина ломаной ===
        System.out.println("\n=== Задача 5.7 — Длина ломаной ===");

        Polyline poly3 = new Polyline(
                new Point(1, 5),
                new Point(2, 8),
                new Point(5, 3)
        );

        System.out.println("Длина ломаной: " + poly3.length());

        // добавляем новые точки
        poly3.addPoints(new Point(5, 15), new Point(8, 10));

        System.out.println("Длина ломаной после добавления точек: " + poly3.length());
    }
}
