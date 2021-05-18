public interface SortedList <T extends Comparable<T>> {
    boolean add(Comparable<T> item);
    Comparable<T> remove(int pos);
    Comparable<T> get(int pos);
    int size();
}
