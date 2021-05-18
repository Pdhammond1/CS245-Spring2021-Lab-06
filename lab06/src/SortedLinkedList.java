import java.util.LinkedList;

public class SortedLinkedList<T extends Comparable<T>> implements SortedList<T>{

    LinkedList<Comparable<T>> ll_data;


    public boolean add(Comparable<T> item){

        if(item=="NULL")
            throw new UnsupportedOperationException("Unacceptable data.");
        if(item!="NULL") {
            this.ll_data.add(item);
            return true;
        }
        else {
            return false;
        }


    }

    public Comparable<T> remove(int pos){
        if (this.size()<=0 || pos>size()){
            throw new UnsupportedOperationException("No data.");
        }
        return this.ll_data.remove(pos);
    }

    public Comparable<T> get(int pos){
        if (this.size()<=0 || pos>size()){
            throw new UnsupportedOperationException("No data.");
        }
        return this.ll_data.get(pos);
    }

    public int size(){
        return this.ll_data.size();
    }

}