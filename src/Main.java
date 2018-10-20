import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Conterster> contersters;
        contersters = readConsole.readContestansData();

        SortByUserPreferences.Sort(readConsole.getUserSortingPreferences(), contersters);

        for (Conterster conterster : contersters) {
            System.out.println("a" + conterster);
        }
    }

}
