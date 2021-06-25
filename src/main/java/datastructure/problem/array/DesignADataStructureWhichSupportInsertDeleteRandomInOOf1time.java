package datastructure.problem.array;

import java.util.*;

public class DesignADataStructureWhichSupportInsertDeleteRandomInOOf1time {

    public static void main(String[] args) {
        UserDataStructure userDataStructure = new UserDataStructure();
        userDataStructure.insert(12);
        userDataStructure.insert(13);
        userDataStructure.insert(14);
        userDataStructure.insert(15);
        userDataStructure.insert(16);
        userDataStructure.insert(17);
        System.out.println(userDataStructure);
        userDataStructure.remove(13);
        System.out.println(userDataStructure);
        System.out.println(userDataStructure.getRandom());

        System.out.println(userDataStructure);
    }


}
class UserDataStructure {
    List<Integer> lists = new ArrayList<>();
    Map<Integer, Integer> map = new HashMap<>();



     void insert(int value){
        if(map.get(value) != null){
            return;
        }
        int size = lists.size();
        lists.add(value);
        map.put(value, size);
    }

     void remove(int value){
        int index = map.get(value);
        map.remove(value);
        int size = lists.size();
        int lastElement = lists.get(size-1);
        Collections.swap(lists, index, size-1);
        lists.remove(size-1);
        map.put(lastElement, index);
    }

    int getRandom(){
         int index = (int) Math.random() % lists.size();
        return lists.get(index);
    }

    @Override
    public String toString() {
        return "UserDataStructure{" +
                "lists=" + lists +
                ", map=" + map +
                '}';
    }
}


