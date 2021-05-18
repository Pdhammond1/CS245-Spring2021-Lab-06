import java.util.ArrayList;

public class SortedArrayList<T extends Comparable<T>> implements SortedList<T>{
    private ArrayList<Comparable<T>> data;

    public boolean add(Comparable<T> item){

        if(item=="NULL")
            throw new UnsupportedOperationException("Unacceptable data.");
        if(item!="NULL") {
            this.data.add(item);
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
        return this.data.remove(pos);
    }

    public Comparable<T> get(int pos){
        if (this.size()<=0 || pos>size()){
            throw new UnsupportedOperationException("No data.");
        }
        return this.data.get(pos);
    }

    public int size(){
        return this.data.size();
    }


}