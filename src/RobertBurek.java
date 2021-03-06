import java.util.*;

/**
 * Created by Robert Burek
 */
public class RobertBurek {

    public static void wypiszZdania(ArrayList listaZdan) {
        int i = 1;
        for (Object s : listaZdan) {
            System.out.print(i + " - ");
            System.out.println(s);
            i++;
        }
    }

    public static Set<Integer> sprawdzamListe = new HashSet<>();

    public static void wypiszZdaniaLosowo(ArrayList listaZdan) {
        int i = 0;
        Random iLosowe = new Random();
        int z;
        String[] listaPierwotna = new String[listaZdan.size()];
        for (Object s : listaZdan) {
            listaPierwotna[i] = s.toString();
            i++;
        }
        for (int j = 0; j < listaPierwotna.length; j++) {
            while (!sprawdzamListe.add(z = iLosowe.nextInt(listaPierwotna.length))) {
            }
            System.out.println((z + 1) + " - " + listaPierwotna[z]);
        }
    }

    private static void tworzenieListyZdan(ArrayList<String> listaZdan) {
        listaZdan.add("Robert Burek");
        listaZdan.add("Jednak dodałem jeszcze inną linie w tym miejscu");
        listaZdan.add("Nowa linia w projekcie.");
        listaZdan.add("Jeszcze jedna linia do wypisania.");
        listaZdan.add("Ktoś może dodać coś od siebie.");
        listaZdan.add("Szóste zdanie");
        listaZdan.add("Jest siedem zdań totalnie bez sensu.");
        listaZdan.add("Kolejne zdanie do listy zdań");
    }


    public static void main(String[] args) {

        ArrayList<String> listaZdan = new ArrayList<>();

        tworzenieListyZdan(listaZdan);

        wypiszZdania(listaZdan);
        System.out.println("---------------LOSOWO----------------------");
        wypiszZdaniaLosowo(listaZdan);
    }

}
