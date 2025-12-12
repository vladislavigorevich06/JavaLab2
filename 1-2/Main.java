public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1.3 — Имена");
        Name n1 = new Name(null, "Клеопатра", null);
        Name n2 = new Name("Пушкин", "Александр", "Сергеевич");
        Name n3 = new Name("Маяковский", "Владимир", null);
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);

        System.out.println("\n Задача 2.2 — Люди с именами ");
        Person p1 = new Person(n1, 152);
        Person p2 = new Person(n2, 167);
        Person p3 = new Person(n3, 189);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        System.out.println("\n Задача 2.3 — Люди с родителями ");
        Person ivan = new Person(new Name("Чудова", "Иван", null), 180);
        Person petr = new Person(new Name(null, "Петр", null), 170, ivan);
        Person boris = new Person(new Name(null, "Борис", null), 160, petr);
        System.out.println(ivan);
        System.out.println(petr);
        System.out.println(boris);
    }
}
