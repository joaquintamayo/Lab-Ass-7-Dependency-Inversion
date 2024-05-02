public class TestProgram {

    public static void main(String[] args) {
        
        StudentBook stud1 = new StudentBook("22-123-99", "Tamayo", "Joaquin", "Diary of a Wimpy Kid");
        BookProcess process1 = new BookProcess(stud1, new Book());
        process1.process();

        StudentBook stud2 = new StudentBook("22-456-88", "White", "Walter", "The Diary of Anne Frank");
        BookProcess process2 = new BookProcess(stud2, new Journal());
        process2.process();
    }
}