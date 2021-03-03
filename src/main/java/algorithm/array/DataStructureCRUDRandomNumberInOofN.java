package algorithm.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * Design a data structure which performs the following operations
 * (Insert an element/Remove an element /find random element) in O(1) time complexity
 */
public class DataStructureCRUDRandomNumberInOofN {

    public static void main(String[] args) {

        MyDataStructure mds = new MyDataStructure();
        mds.insert(20);
        mds.insert(16);
        System.out.println(mds.find(20));
        mds.remove(20);
        System.out.println(mds.find(20));
        mds.insert(12);
        mds.insert(18);
        mds.insert(10);
        System.out.println(mds.getRandom());
        System.out.println(mds.getRandom());
        System.out.println(mds.getRandom());
    }
}

class MyDataStructure{
    ArrayList<Integer> arrayList = new ArrayList<>();
    Map<Integer, Integer> hashMap = new HashMap<>();

    void insert(int num){
        if(hashMap.get(num) != null){
            return;
        }
        arrayList.add(num);
        hashMap.put(num, arrayList.size()-1);
    }

    void  remove(int num){
        int index = hashMap.get(num);
        hashMap.remove(num);
        arrayList.add(index, arrayList.get(arrayList.size()-1));
        arrayList.remove(arrayList.size()-1);
        hashMap.put(arrayList.get(index), index);
    }

    int getRandom(){
        Random rand = new Random();
        int index = rand.nextInt(1000) % arrayList.size();
        return arrayList.get(index);
    }

    int find(int num){
        if(hashMap.get(num) != null) {
            return hashMap.get(num);
        }

        return -1;
    }
}
