import java.util.ArrayList;
import java.util.Collections;

class ArrayLists {
    public static void main(String[] args) {
        // System.out.println("Hello Array List");

        // ArrayList Can only be of objects not primitive datatypes!

        // ArrayList<int> al = new ArrayLists<int>(); // Generates Error;

        // In Java there are also classes for primitive data types;
        // Integer | Float | String | Boolean

        ArrayList<Integer> list = new ArrayList<Integer>();
        // ArrayList<String> list2 = new ArrayList<String>();
        // ArrayList<Float> list3 = new ArrayList<Float>();
        // ArrayList<Boolean> list4 = new ArrayList<Boolean>();

        // add elements into arraylist;
        list.add(4);
        list.add(0, 34);
        list.add(1, 13);

        // System.out.println(list);

        // get elements;
        // System.out.println(list.get(0));
        // System.out.println(list.get(1));

        // set element
        // System.out.println(list);
        // list.set(0, 22);
        // System.out.println(list);

        // delete element
        // list.remove(0);
        // System.out.println(list);

        // size of list
        // System.out.println(list.size());

        // traverse over the list;
        // int size = list.size();
        // for (int i = 0; i < size; i++) {
        //     System.out.println(list.get(i));
        // }

        // sorting
        Collections.sort(list);
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);

    }
}
