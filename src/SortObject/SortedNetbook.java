package SortObject;

import java.util.Comparator;

public class SortedNetbook implements Comparator<Notebook> {


    @Override
    public int compare(Notebook o1, Notebook o2) {
        if(o1.getPrice()==o2.getPrice()){
            if (o1.getRam()==o2.getRam()){
                return o1.getCompany().compareTo(o2.getCompany());
            }else{
                return Integer.compare(o1.getRam(),o2.getRam());
            }
        }else {
            return Integer.compare(o1.getPrice(),o2.getPrice());
        }
    }
}
