package Data_Structure.List;

public interface List {

    // Method for check list is empty or not
    public boolean isEmpty();

    // Methods for add data in list
    public void add(Integer value);
    public void add(int index, Integer value);
    public void add(int[] arr);
    public void addFirst(Integer value);

    // Methods for delete data from list
    public void deleteFirst();
    public void deleteLast();
    public void delete(Integer value);
    public void delete(int position);

    public void set(Integer value, Integer newValue);
    public int indexOf(Integer number);
    public int size();
}
