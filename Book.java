public class Book implements LibraryResource {
    @Override
    public void borrowResource(String title) {
        System.out.println("Borrowing book: " + title);

    }
}