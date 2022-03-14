package Data_Structure.List;

public interface List {

    // Method for check list is empty or not
    public boolean isEmpty();

    /* ---- Methods for add data in list ---- */

    // Add data in list
    public void add(Integer value);
    // Add data at given index in list
    public void add(int index, Integer value);
    // Add all element of given array in list
    public void add(int[] arr);
    // Add data at start of the list
    public void addFirst(Integer value);

    /* ---- Methods for delete data from list ---- */

    // Delete head of the list
    public void deleteFirst();
    // Delete tail of the list
    public void deleteLast();
    // Delete given value from list
    public void delete(Integer value);
    // Delete data from given position from list
    public void deleteAt(int position);

    // Update given number with new number
    public void set(Integer value, Integer newValue);
    // Find index of given number
    public int indexOf(Integer number);
    //Reverse given list
    public void reverseList();
    // Return size of the current list
    public int size();
}
