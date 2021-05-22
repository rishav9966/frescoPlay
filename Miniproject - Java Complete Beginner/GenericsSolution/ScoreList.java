// package Solution.DemoMavenEclipseProject;

import java.util.*;

public class ScoreList<T extends Number> {
    private ArrayList<T> input;

    ScoreList() {
        this.input = new ArrayList<T>();
    }

    public void addElement(T data) {
        // this.
        this.input.add(data);
    }

    public void removeElement(T data) {
        this.input.remove(data);
    }

    public T getElement(int n) {
        return this.input.get(n);
    }

    public double averageValues() {
        int i;
        // Number temp;
        double temp, res = 0;
        for (i = 0; i < this.input.size(); i++) {
            // sum += Integer.parseInt(this.input.getElement(i));
            temp = getElement(i).doubleValue();
            res += temp;
        }
        res = res / i;
        return res;
    }

}
