package test;

import java.io.*;

public class test extends ObjectOutputStream {

    public test(OutputStream out) throws IOException {
        super(out);
    }

    public static void main(String[] args) {
        Object s = "Bye World!";
        Object s2 = "Hello World!";
        try {
            // create a new file with an ObjectOutputStream
            FileOutputStream out = new FileOutputStream("test.txt");
            test oout = new test(out);

            // write something in the file
            oout.writeObject(s);
            oout.flush();

            // enable object replacing
            oout.enableReplaceObject(true);

            // replace object
            System.out.println("" + oout.replaceObject(s2));

            // close the stream
            oout.close();

            // create an ObjectInputStream for the file we created before
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("test.txt"));

            // read and print an int
            System.out.println("" + (String) ois.readObject());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}