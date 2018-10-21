import java.util.Objects;

public class Conterster implements Comparable<Conterster> {
    private String firstName, lastName;
    private int score;

    public Conterster(String firstName, String lastName, int score) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.score = score;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Conterster that = (Conterster) o;
        return score == that.score &&
                Objects.equals(firstName, that.firstName) &&
                Objects.equals(lastName, that.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, score);
    }

    @Override
    public int compareTo(Conterster o) {
        if (lastName.compareTo(o.lastName) == 0) {
            if (firstName.compareTo(o.firstName) == 0) {
                if (this.score == o.score)
                    return 0;
                else if (this.score > o.score)
                    return 1;
                else
                    return -1;
            } else
                return firstName.compareTo(o.firstName);
        } else
            return lastName.compareTo(o.lastName);
    }

    @Override
    public String toString() {
        return String.format("%s %s %d", firstName, lastName, score);
    }
}

