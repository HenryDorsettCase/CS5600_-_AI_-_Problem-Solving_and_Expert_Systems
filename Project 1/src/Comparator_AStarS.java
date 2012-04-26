import java.util.Comparator;

//SortsBy f_value
public class Comparator_AStarS implements Comparator<Node>
{
    public int compare(Node o1, Node o2) 
    {
        return o1.f_value.compareTo(o2.f_value);
    }
}
