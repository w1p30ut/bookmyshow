package resources;

public class IdGenerator {
    private static Integer id = 0;
    public static Integer generateId() {
        id++;
        return id;
    }
}