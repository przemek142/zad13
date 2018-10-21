import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class WriteFile {

    public static void writeToFile(ArrayList<Conterster> list) {
        FileWriter fileWriter;

        try {
            fileWriter = new FileWriter("C:\\Users\\przemo\\IdeaProjects\\zad13\\src\\stats.csv");
            BufferedWriter bfw = new BufferedWriter(fileWriter);

            bfw.write("imię;nazwisko;punkty\n");
            for (Conterster conterster : list) {
                bfw.write(String.format("%s;%s;%d\n", conterster.getFirstName(),
                        conterster.getLastName(),
                        conterster.getScore()));
            }
            bfw.close();
            System.out.println("Zapisano dane w pliku stats.csv");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
