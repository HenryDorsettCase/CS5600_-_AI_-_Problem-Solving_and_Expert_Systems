import java.util.Comparator;

//Sorts by g_pathCost
public class Comparator_UCS implements Comparator<Node>
{
    public int compare(Node o1, Node o2) 
    {
        return o1.g_pathCost.compareTo(o2.g_pathCost);
    }
}

