public class StudentID {

    private String name;
    private int id;
    private static int  nextId = 1000;

    public StudentID(String name) {
        this.name = name;
        this.id = nextId;
    }

    public void display() {
        System.out.println("Hoc sinh: " + name + " \n ID: " + nextId++);
    }
}
