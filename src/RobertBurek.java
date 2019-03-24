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

        ArrayList<String> listaZdan = new ArrayList<>();

        listaZdan.add("Robert Burek");
        listaZdan.add("Jednak dodałem jeszcze inną linie w tym miejscu");
        listaZdan.add("Nowa linia w projekcie.");

        wypiszZdania(listaZdan);
    }
}
