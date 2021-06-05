package u.util.utils;

import java.util.ArrayList;

public class intListBuilder {
    private ArrayList<Integer> list = new ArrayList<>();
    public intListBuilder onlyItem(int item){
        list.add(item);
        return this;
    }
    public intListBuilder itemWithIndex(int item, int index){
        list.add(index, item);
        return this;
    }
    public ArrayList<Integer> build(){
        return list;
    }
}
