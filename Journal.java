public class Journal implements LibraryResources {

    @Override
    public void borrow(String title) {
        System.out.println("Borrowing Journal: " + title);
    }
}