package u.util.utils;

import java.util.ArrayList;

public class StringListBuilder {
    private ArrayList<String> list = new ArrayList<>();
    public StringListBuilder onlyItem(String item){
        list.add(item);
        return this;
    }
    public StringListBuilder itemWithIndex(String item, int index){
        list.add(index, item);
        return this;
    }
    public ArrayList<String> build(){
        return list;
    }
}
