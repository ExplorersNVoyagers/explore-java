package Samples;

import java.util.*;

public class VarargsTest {
    public static void main(String[] args) {
        //new VarargsTest().display(5,"Infosys");
        //new VarargsTest().display(4,"Infosys","Limited");

//        Set<String> set=new TreeSet<String>();
//        set.add("Infosys");
//        set.add("Google");
//        set.add("IBM");
//        for(String s:set){
//            System.out.print(" "+s);
//            set.clear();
//        }

        Map<Integer, String> map = new TreeMap<Integer, String>();
        map.put(2, "A");
        map.put(1, "B");
        map.put(3, "C");
        //map.put(null,"E");  //1
        map.put(4,null);    //2
        map.put(1,"D");     //3
        Collection <String> collection = map.values();
        for(String element : collection){
            System.out.println(element);
        }
    }

    public void display(int b, String... strings) {
        System.out.print(strings[strings.length-1]+" ");
    }
}
