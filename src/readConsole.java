import java.util.ArrayList;
import java.util.Scanner;

public class readConsole {

    public static ArrayList<Conterster> readContestansData() {
        ArrayList<Conterster> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String inputTemp;

        do {
            System.out.println("Wprowadź dane w formacie (lub stop): Imię Nazwisko Wynik");
            inputTemp = scanner.nextLine();
            if (inputTemp.compareTo("stop") != 0 && inputTemp != null && inputTemp.split(" ").length == 3) {
                String[] data = inputTemp.split(" ");
                try {
                    list.add(new Conterster(data[0], data[1], Integer.parseInt(data[2])));
                } catch (NumberFormatException e){

                }
            }
        } while (inputTemp != null && inputTemp.compareTo("stop") != 0);
        return list;
    }

    public static String getUserSortingPreferences() {
        Scanner scanner = new Scanner(System.in);
        String sortingOrder;
        do {
            System.out.println("Wybierz algorytm sortowania (imię/nazwisko/punkty)");
            sortingOrder = scanner.next();
            scanner.nextLine();
        } while (sortingOrder.compareTo("imię") != 0 &&
                sortingOrder.compareTo("nazwisko") != 0 &&
                sortingOrder.compareTo("punkty") != 0);

        return sortingOrder;
    }
}
