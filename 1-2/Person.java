public class Person {
    private Name name;
    private int height;
    private Person parent;

    public Person(Name name, int height) {
        this.name = name;
        this.height = height;
    }

    public Person(Name name, int height, Person parent) {
        this(name, height);
        this.parent = parent;
        fillMissingFromParent();
    }

    private void fillMissingFromParent() {
        if (parent != null) {
            if ((name.getLastName() == null || name.getLastName().isEmpty()) &&
                    parent.name.getLastName() != null) {
                name.setLastName(parent.name.getLastName());
            }
            if ((name.getMiddleName() == null || name.getMiddleName().isEmpty()) &&
                    parent.name.getFirstName() != null) {
                name.setMiddleName(parent.name.getFirstName() + "ович");
            }
        }
    }

    @Override
    public String toString() {
        String s = "Имя: " + name.toString() + ", рост: " + height;
        if (parent != null) s += ", отец: " + parent.name.toString();
        return s;
    }
}
