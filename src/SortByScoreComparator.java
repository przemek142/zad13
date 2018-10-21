import java.util.Comparator;

public class SortByScoreComparator implements Comparator<Conterster> {

    @Override
    public int compare(Conterster o1, Conterster o2) {
        if (o1.getScore() == o2.getScore()){
            if (o1.getFirstName().compareTo(o2.getFirstName()) == 0) {
                return o1.getLastName().compareTo(o2.getLastName());
            }
            else return  o1.getFirstName().compareTo(o2.getFirstName());
        }
        else if (o1.getScore() > o2.getScore())
            return -1;
        else return 1;

    }
}
