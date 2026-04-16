import java.util.ArrayList;
public class codingproblemset4{
    public static void main(String[] args){
        ArrayList<String>list = new ArrayList<>();
        list.add("henry");
        list.add("peter");
        list.add("oggy");
        list.add("cockroach");
        list.add("jack");
        for(int i=0;i<5;i++)
            System.out.println(list.get(i));
    }
}