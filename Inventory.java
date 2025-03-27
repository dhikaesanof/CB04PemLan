package CB04;
import java.util.ArrayList;
import java.util.*;

public class Inventory<T> {
    private List<T> daftarItem = new ArrayList<>();

    public void addItem(T item){
        daftarItem.add(item);    
    }
    public void removeItem(T item){
        daftarItem.remove(item);        
    }
    public List<T> getItem(){
        return daftarItem;
    }
    public List<T> searchItems(String keyword){
        List<T> result = new ArrayList<>();
        for (T item : daftarItem) {
            if (item.toString().toLowerCase().contains(keyword.toLowerCase())) {
                result.add(item);
            }
        }
        return result;
    }
    public void displayItems(){
        for (T item : daftarItem) {
            System.out.println(item);
        }
    }
}
