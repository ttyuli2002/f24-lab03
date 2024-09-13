package edu.cmu.cs.cs214.rec04;

/**
 * InheritanceSortedIntList -- a variant of a SortedIntList that keeps
 * count of the number of attempted element insertions (not to be confused
 * with the current size, which goes down when an element is removed)
 * and exports an accessor (totalAdded) for this count.
 *
 * @author Nora Shoemaker
 *
 */

public class InheritanceSortedIntList extends SortedIntList {
    private int totalAdded = 0;

    /**
     * Adds the specified int to the list.
     *
     * @param num an integer to be added to the list
     * @return true if the list is changed as a result of the call
     */
    @Override
    public boolean add(int num) {
        boolean result = super.add(num);
        if (result) {
            this.totalAdded += 1;
        }

        return result;
    }

    /*
     * Returns the total number that has successfully added
     * 
     * @return the number of success in adding numbers
     * 
     */
    public int getTotalAdded() {
        return this.totalAdded;
    }
}