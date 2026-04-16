import java.util.ArrayList;
import java.util.Collections;
public class codingproblemset4question5 {
    public static void main(String []args){
        ArrayList<String> list = new ArrayList <> ();
        
        list.add("India");
        list.add("UK");
        list.add("Aghanistsan");

        Collections.sort(list);
        Collections.reverse(list);
        

        System.out.println(list);
    }
}