import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Conterster> converters;
        converters = ReadConsole.readContestansData();

        SortByUserPreferences.Sort(ReadConsole.getUserSortingPreferences(), converters);

        WriteFile.writeToFile(converters);

    }

}
