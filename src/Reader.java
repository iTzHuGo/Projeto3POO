public class Reader {
    private int id;
    private String name;
    private static int idCounter = 0;

    public Reader(String name) {
        this.id = ++idCounter;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Name= '" + name + '\'' + ", ID= '" + id + '\'';
    }
}
