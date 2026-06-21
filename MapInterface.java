// map {1=sohail, 2=sam, 3=john, 4=danny}
// import java.util.*;
// public class MapInterface {
    
//     public static void main(String[] args){
//         Map<Integer,String> map = new HashMap<Integer,String>();
//         map.put(1,"sohail");
//         map.put(2,"sam");
//         map.put(3,"john");
//         map.put(4,"danny");
//         System.out.println(map);
//         map.get(1);
//         System.out.println(map.get(5));
//         map.remove(5);
//         System.out.println(map);
//         for(Map.Entry i : map.entrySet()){
//             System.out.println(i.getKey()+" "+i.getValue());
//         }
//         Map<Integer,String> map2 = new HashMap<Integer,String>();
//         map2.put(5,"sohaiil");
//         map2.put(6,"Verna");
//         // map.clear();
//         System.out.println(map);
//         System.out.println(map.entrySet());
//         System.out.println(map.hashCode());
//         System.out.println(map.isEmpty());
//         System.out.println(map.keySet());
//         map.putAll(map2);
//         System.out.println(map.values());
//         System.out.println(map.getOrDefault(1,"c"));
//         System.out.println(map.putIfAbsent(10,"sammm"));
//         System.out.println(map);


//     }
// }

// import java.util.*;
// import java.util.Arrays;
// public class MapInterface{
//     public static void main(String[] args){

//         Integer a[] = { 1, 13, 4, 1, 41, 31, 31, 4, 13, 2 };
//         List<Integer> a1 = new ArrayList<>(Arrays.asList(a));
//         Map<Integer,Integer> map = new HashMap<>();
//         for(int i=0;i<a1.size();i++){
//             map.putIfAbsent(a1.get(i),Collections.frequency(a1,a1.get(i)));

        // Map<Integer,Integer> map = new HashMap<>();
        // for(int i=0;i<a.length;i++){
        //     map.putIfAbsent(map.get(a[i]),Collections.frequency(a,a.get(i)));
        // }

      
//         System.out.println(map);
//     }
// }













// TreeMap
// import java.util.*;
// public class MapInterface{
//     public static void main(String[] args){
//         TreeMap<Integer,String> treeMap = new TreeMap<>();
//         treeMap.put(1,"sohail");
//         treeMap.put(2,"sammy");
//         treeMap.put(3,"danny");
//         treeMap.put(4,"ranny");
//         System.out.println(treeMap);

//         SortedMap<Integer,String> headmap = new TreeMap<>();
//         headmap = treeMap.headMap(3);
//         System.out.println(headmap);

//         SortedMap<Integer,String> tailmap = new TreeMap<>();
//         tailmap = treeMap.tailMap(3);
//         System.out.println(tailmap);

//         SortedMap<Integer,String> submap = new TreeMap<>();
//         submap = treeMap.subMap(2,3);
//         System.out.println(submap);

//         NavigableMap<Integer,String> map = new TreeMap<>();
//         map.put(10,"ten");
//         map.put(20,"twenty");
//         map.put(30,"thirty");
//         map.put(40,"forty");
//         map.put(50,"fifty");

//         System.out.println(map.lowerKey(20));
//         System.out.println(map.floorKey(20));
//         System.out.println(map.ceilingKey(20));
//         System.out.println(map.higherKey(20));
//         System.out.println(map);
//         System.out.println(map.descendingMap());
//         System.out.println(map.descendingKeySet());
//         System.out.println(map.pollFirstEntry());
//         System.out.println(map.pollLastEntry());
//         System.out.println(map);

//     }
// }




