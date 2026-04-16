import java.io.*;

class Student implements Serializable {
    String name;
    int mark;

    Student(String name, int mark) {
        this.name = name;
        this.mark = mark;
    }
}

class CustomObjectOutputStream extends ObjectOutputStream {
    CustomObjectOutputStream(OutputStream objStream) throws IOException {
        super(objStream);
    }

    @Override
    protected void writeStreamHeader() throws IOException {
        reset(); // prevents header rewrite
    }
}

public class Serialisation {
    public static void main(String[] args) throws IOException {

        Student s = new Student("XYZ", 44);

        File file = new File("student.txt");
        FileOutputStream fo = new FileOutputStream(file, true);

        ObjectOutputStream objStream;

        if (file.length() == 0) {
            objStream = new ObjectOutputStream(fo);
        } else {
            objStream = new CustomObjectOutputStream(fo);
        }

        objStream.writeObject(s);

        objStream.close();
        fo.close();
    }
}