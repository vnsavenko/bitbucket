package bitbucket;

import java.util.ArrayList;
import java.util.Collections;

public class MyList extends ArrayList<Integer> {

    @Override
    public boolean add(Integer integer) {
        incrementAll(integer);
        return super.add(integer);
    }

    @Override
    public void add(int index, Integer element) {
        incrementAll(element);
        super.add(index, element);
    }

    @Override
    public Integer remove(int index) {
        decrementAll(this.get(index));
        return super.remove(index);
    }

    @Override
    public boolean remove(Object o) {
       boolean remove = super.remove(o);
        if(remove) decrementAll((Integer) o);
        return remove;
    }

    public int getMax(){
        return Collections.max(this);
    }

    public int getMin(){
        return Collections.min(this);
    }

    public double getMean(){
        int sum = 0;
        double mean = 0.0;
        for (int i : this
             ) {
            sum+= i;
        }
        mean = sum/this.size();
        return mean;
    }


    private void incrementAll(Integer a){

        for (int i = 0; i < this.size(); i++) {
            this.set(i, this.get(i) + a);
        }
    }

    private void decrementAll(Integer a){

        for (int i = 0; i < this.size(); i++) {
            this.set(i, this.get(i) - a);
        }
    }
}
