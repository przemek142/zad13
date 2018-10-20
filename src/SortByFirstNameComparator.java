import java.util.Comparator;

public class SortByFirstNameComparator implements Comparator<Conterster> {
    @Override
    public int compare(Conterster o1, Conterster o2) {
        if (o1.getFirstName().compareTo(o2.getFirstName()) == 0) {
            if (o1.getLastName().compareTo(o1.getLastName()) == 0) {
                if (o1.getScore() == o2.getScore())
                    return 0;
                else if (o1.getScore() > o2.getScore())
                    return 1;
                else
                    return -1;
            } else
                return o1.getLastName().compareTo(o2.getLastName());
        } else
            return o1.getFirstName().compareTo(o2.getFirstName());
    }
}
