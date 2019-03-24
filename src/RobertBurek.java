import java.util.*;

/**
 * Created by Robert Burek
 */
public class RobertBurek {

    public static void wypiszZdania(ArrayList listaZdan){
        int i = 1;
        for(Object s : listaZdan){
            System.out.print(i + " - ");
            System.out.println(s);
            i++;
        }
    }

    public static Set<Integer> sprawdzamListe = new HashSet<>();

    public static void wypiszZdaniaLosowo(ArrayList listaZdan){
        int i = 0;
        Random iLosowe = new Random();
        int z;
        String[] listaPierwotna = new String[3];
        for(Object s : listaZdan) {
            listaPierwotna[i] = s.toString();
            i++;
        }
        for (int j = 0; j < 3; j++){
            while (!sprawdzamListe.add(z = iLosowe.nextInt(3))){}
            System.out.println((z + 1) + " - " + listaPierwotna[z]);
        }
    }

    public static void main (String[] args){

        ArrayList<String> listaZdan = new ArrayList<>();

        listaZdan.add("Robert Burek");
        listaZdan.add("Jednak dodałem jeszcze inną linie w tym miejscu");
        listaZdan.add("Nowa linia w projekcie.");

        wypiszZdania(listaZdan);
        System.out.println("---------------LOSOWO----------------------");
        wypiszZdaniaLosowo(listaZdan);
    }
}
