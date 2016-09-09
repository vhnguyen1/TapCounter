package edu.orangecoastcollege.vnguyen629cs273.tapcounter;

/**
 * Counter that increments the count by 1 every time
 * the user clicks on the displayed button.
 * @author Vincent Nguyen
 */
public class Counter {

    private int mCount;

    public Counter() {
        this.mCount = 0;
    }

    public void incrementCount() {
        this.mCount++;
    }

    public int getCount() {
        return this.mCount;
    }
}
