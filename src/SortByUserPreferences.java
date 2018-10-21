import java.util.ArrayList;
import java.util.Collections;

public class SortByUserPreferences {

    public static void Sort(String sortPreferences, ArrayList list) {

        switch (sortPreferences) {
            case "imię":
                Collections.sort(list, new SortByFirstNameComparator());
                break;
            case "nazwisko":
                Collections.sort(list, new SortByLastNameComparator());
                break;
            case "punkty":
                Collections.sort(list, new SortByScoreComparator());
                break;
        }
    }
}
