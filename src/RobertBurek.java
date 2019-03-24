import java.util.ArrayList;

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

    public static void main (String[] args){
//        System.out.println("Robert Burek");
//        System.out.println("Robert Burek");
//        System.out.println("Jednak dodałem jeszcze inną linie w tym miejscu");
//        System.out.println("Jednak dodałem jeszcze inną linie w tym miejscu");
//        System.out.println("Nowa linia w projekcie.");
//        System.out.println("Nowa linia w projekcie.");

        ArrayList<String> listaZdan = new ArrayList<>();

        listaZdan.add("Robert Burek");
        listaZdan.add("Jednak dodałem jeszcze inną linie w tym miejscu");
        listaZdan.add("Nowa linia w projekcie.");

        wypiszZdania(listaZdan);
    }
}
