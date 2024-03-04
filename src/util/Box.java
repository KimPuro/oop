package util;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

public class Box <T>{
    private Map<String, T> box;

    public Box() {
        this.box = new HashMap<>();
    }
    public T put(String key, T value){
        return box.put(key, value);
    }
    public T get(String key){
        return box.get(key);
    }
    public int size(){
        return box.size();
    }
    public void clear(){
        box.clear();
    }
    public void put(List<String> keys, Inventory<T> values){
        IntStream.range(0, keys.size())
                .forEach(i -> box.put(keys.get(i), values.get(i)));
    }
}
