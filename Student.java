public class Student {
    private String name;
    private int studentId;
    private LibraryResource resource;

    public Student(String name, int studentId, LibraryResource resource) {
        this.name = name;
        this.studentId = studentId;
        this.resource = resource;
    }

    public void borrowResource(String title) {
        resource.borrowResource(title);
    }
}