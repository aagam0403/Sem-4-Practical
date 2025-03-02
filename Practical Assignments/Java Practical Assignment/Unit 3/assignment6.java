
class Book {

    private String title;
    private int numPages;

    public Book(String title, int numPages) 
    {
        this.title = title;
        this.numPages = numPages;
    }

    public String getTitle() 
    {
        return title;
    }

    public void setTitle(String title) 
    {
        this.title = title;
    }

    public int getNumPages() 
    {
        return numPages;
    }

    public void setNumPages(int numPages) 
    {
        this.numPages = numPages;
    }

    public void displayBookInfo() 
    {
        System.out.println("Title: " + title);
        System.out.println("Pages: " + numPages);
    }
}

class Textbook extends Book 
{
    int gradeLevel;
    public Textbook(String title, int numPages, int gradeLevel) 
    {
        super(title, numPages);
        this.gradeLevel = gradeLevel;
    }

    public int getGradeLevel() 
    {
        return gradeLevel;
    }

    public void setGradeLevel(int gradeLevel) 
    {
        this.gradeLevel = gradeLevel;
    }

    @Override
    public void displayBookInfo() 
    {
        super.displayBookInfo();
        System.out.println("Grade Level: " + gradeLevel);
    }
}

public class assignment6 {

    public static void main(String[] args) 
    {
        Book book = new Book("The Oracle SQL", 180);
        System.out.println("Book Details:");
        book.displayBookInfo();

        System.out.println();

        Textbook textbook = new Textbook("Java Book", 350, 10);
        System.out.println("Textbook Details:");
        textbook.displayBookInfo();
    }
}
