// Abstract class (Abstraction + Encapsulation)
abstract class Document {
    private String name; // encapsulated data

    public Document(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // Common operations
    abstract void open();
    abstract void save();
    abstract void close();
}


// Text Document
class TextDocument extends Document {

    public TextDocument(String name) {
        super(name);
    }

    @Override
    void open() {
        System.out.println("Opening text document: " + getName());
        System.out.println("Displaying text content...");
    }

    @Override
    void save() {
        System.out.println("Saving text document...");
    }

    @Override
    void close() {
        System.out.println("Closing text document...");
    }
}


// Image Document
class ImageDocument extends Document {

    public ImageDocument(String name) {
        super(name);
    }

    @Override
    void open() {
        System.out.println("Opening image document: " + getName());
        System.out.println("Rendering image...");
    }

    @Override
    void save() {
        System.out.println("Saving image document...");
    }

    @Override
    void close() {
        System.out.println("Closing image document...");
    }
}


// Spreadsheet Document
class SpreadsheetDocument extends Document {

    public SpreadsheetDocument(String name) {
        super(name);
    }

    @Override
    void open() {
        System.out.println("Opening spreadsheet document: " + getName());
        System.out.println("Calculating cells...");
    }

    @Override
    void save() {
        System.out.println("Saving spreadsheet document...");
    }

    @Override
    void close() {
        System.out.println("Closing spreadsheet document...");
    }
}


// Main Class
public class DocumentEditor {
    public static void main(String[] args) {

        Document doc1 = new TextDocument("Notes.txt");
        Document doc2 = new ImageDocument("Photo.png");
        Document doc3 = new SpreadsheetDocument("Data.xlsx");

        // Text Document
        doc1.open();
        doc1.save();
        doc1.close();

        System.out.println();

        // Image Document
        doc2.open();
        doc2.save();
        doc2.close();

        System.out.println();

        // Spreadsheet Document
        doc3.open();
        doc3.save();
        doc3.close();
    }
}