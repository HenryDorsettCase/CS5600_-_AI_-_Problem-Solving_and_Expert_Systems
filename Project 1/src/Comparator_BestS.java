import java.util.Comparator;

//sorts by h_value
public class Comparator_BestS implements Comparator<Node>
{
    public int compare(Node o1, Node o2) 
    {
        return o1.h_value.compareTo(o2.h_value);
    }
}
