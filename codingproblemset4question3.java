import java.util.*;
public class codingproblemset4question3 {
    public static void main ( String []args){
        ArrayList<String> list = new ArrayList <> ();
        String target= "a";
        list.add("India");

        if(list.get(0).contains(target)){
            System.out.println("a contained");
        }
        else{
            System.out.println("a not contained");

        }
        

    }
}