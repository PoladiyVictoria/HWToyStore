package data;

import java.util.ArrayList;
import java.util.List;

public class Play {
    private List<Toy> prizeToys;

    public Play(){
        this.prizeToys = new ArrayList<>();
    }

    public List<Toy> getPrizeToys() {
        return prizeToys;
    }

    public void setPrizeToys(List<Toy> prizeToys) {
        this.prizeToys = prizeToys;
    }
}
