package map;
import java.util.*;
import java.util.function.BiConsumer;
public class showmap {
 public static void main(String[] args) {
    Map<String,String>  map = new TreeMap<>();
    map.put("test","1");
    map.put("test2","2");
    map.put("test3","3");
    map.put("test4","4");
    System.out.println(map);
    //step1 set
    Set<Map.Entry<String,String>> entryset = map.entrySet();
    Iterator<Map.Entry<String,String>> ite  = entryset.iterator();
    while(ite.hasNext()){   
        Map.Entry<String,String> mapnew  = ite.next();
        System.out.println("the-"+mapnew);
        System.out.println( mapnew.getKey()+"-"+mapnew.getValue());
        //System.out.println(ite.next().getKey());
         }
    //step2 keyset    
    Set<String> keyset = map.keySet();
    Iterator<String> iteset = keyset.iterator();
    while(iteset.hasNext()){
        //jump two value if using  two iteset.next()
        System.out.println(iteset.next()+"+"+map.get(iteset.next()));               
    }
    //foreach loop
    for(Map.Entry<String,String>  m  :  map.entrySet()){
        System.out.println(m.getValue()+"-"+m.getKey());
    }

    //test
    Map<Integer,Integer>  map3 = new HashMap<>();
    map3.put(1,23);
    map3.put(2,34);
    map3.put(3,45);
    map3.put(4,234234);
    System.out.println(map3);
   for(Map.Entry<Integer,Integer> a : map3.entrySet()){
       System.out.println(a.getKey()+a.getValue());
   }

//for each
BiConsumer<Integer,Integer> bi = new BiConsumer<>() {
    @Override
    public void accept(Integer k,Integer v){
        if(k>2){
        System.out.println(v);}
    }
};
 map3.forEach(bi);
 //lamda
 HashMap<Integer,Integer>  map4 = new  HashMap<>(map3);
 map4.forEach((v,k)->System.out.println(v));
 System.out.println(map4.values());
 System.out.println(map4.keySet());
  }   
 
}
