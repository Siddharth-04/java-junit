package bridgelabz.basicJunitProblems;

import java.util.ArrayList;

public class ListManager {
    public ArrayList<Integer> addElement(ArrayList<Integer> list,int element) {
        list.add(element);
        return list;
    }

    public ArrayList<Integer> removeElement(ArrayList<Integer> list,int element) {
        list.remove(element);
        return list;
    }

    public int getSize(ArrayList<Integer> list) {
        return list.size();
    }
}
