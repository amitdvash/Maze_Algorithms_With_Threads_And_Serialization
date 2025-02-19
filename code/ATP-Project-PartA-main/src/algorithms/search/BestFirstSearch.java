package algorithms.search;
import java.util.PriorityQueue;

public class BestFirstSearch extends BreadthFirstSearch {

    public BestFirstSearch() {
        super();
        this.aStateQueue = new PriorityQueue<AState>(new AStateComparator());
    }

    @Override
    public String getName() {return "BestFirstSearch";}

}
