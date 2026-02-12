import java.io.*;
import javax.swing.*;
import java.nio.file.Path;
import java.nio.file.Files;
import java.util.ArrayList;
import static java.nio.file.StandardOpenOption.CREATE;

public class ShortLister {
    public static void main(String[] args) {
        ShortWordFilter shortWordFilter = new ShortWordFilter();
        JFileChooser chooser = new JFileChooser();
        File selectedFile;
        String counter = "";
        ArrayList<String> lines = new ArrayList<>();
        String[] words = new String[0];
        try {
            File workingDirectory = new File(System.getProperty("user.dir"));
            chooser.setCurrentDirectory(workingDirectory);
            if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
                selectedFile = chooser.getSelectedFile();
                Path file = selectedFile.toPath();
                InputStream inStream = new BufferedInputStream(Files.newInputStream(file, CREATE));
                BufferedReader reader = new BufferedReader(new InputStreamReader(inStream));
                while (reader.ready()) {
                    counter = reader.readLine().trim();
                    lines.add(counter);
                    words = counter.split(" ");
                    for (String word : words) {
                        if (shortWordFilter.accept(word)) {
                            System.out.println(word);
                        }
                        else {
                        }
                    }
                }
                reader.close();
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found.");
            e.printStackTrace();
        }

        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}


/* import jdk.jfr.internal.test.DeprecatedMethods;

import javax.swing.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

import static java.nio.file.StandardOpenOption.CREATE;
import static jdk.jfr.internal.test.DeprecatedMethods.counter;

public class ShortLister {
    public static void main (String[] args) {
        JFileChooser chooser = new JFileChooser();
        File selectedFile;
        ShortWordFilter swf = new ShortWordFilter();
        try {
            File workingDirectory = new File(System.getProperty("user.dir"));
            chooser.setCurrentDirectory(workingDirectory);
            if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
                selectedFile = chooser.getSelectedFile();
                Path file = selectedFile.toPath();
                InputStream inStream = new BufferedInputStream(Files.newInputStream(file, CREATE));
                BufferedReader reader = new BufferedReader(new InputStreamReader(inStream));
                swf.file;
                int lineCount = 0;
                int words = 0;
                int numberOfCharacters = 0;
                while (reader.ready()) {
                    counter = reader.readLine().trim();
                    lines.add(counter);
                    lineCount++;
                    System.out.printf("\nLine %4d %-60s ", lineCount, counter);
                    String[] numberOfWords = counter.split(" ");
                    words += numberOfWords.length;

                    for(String word: numberOfWords) {
                        numberOfCharacters = numberOfCharacters + word.length();
                    }
                }
                reader.close();
                String[] characters = new String[0];
                for (String c : characters) {
                    characters = c.split("");
                    numberOfCharacters += characters.length;
                }

        }
    } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
*/