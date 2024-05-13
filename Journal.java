public class Journal implements LibraryResource {
    @Override
    public void borrowResource(String title) {
        System.out.println("Borrowing journal: " + title);

    }
}