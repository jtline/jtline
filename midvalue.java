import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

import static java.lang.System.out;
public class PlayerDemo {
    public static void main(String[] args) throws Exception{
    List<player> playerlist = List.of(new player("mom",31),new player("mom",44),new player("michael",33),new player("set",12),new player("vibo",27));
    
    //the first thing of finding mid value is to sorted value but not all the list is value so need to maptoind
    IntStream abz =playerlist.stream().mapToInt(x->x.getAge()).sorted();//map to int is  for  Intstream
    //DoubleStream is the same that mapToDouble
    //abz.forEach(out::println);
     //the second thing is to check list size is odd or even,because odd you can skip half and find first is the mid value
     // if list size is even  you need to take  two skip  +  limit and average and getAsDouble
    if(playerlist.size()!=0){
    int mid = playerlist.size()%2==0 ? 
    (int)abz.skip(playerlist.size()/2-1).limit(2).average().getAsDouble() : 
    abz.skip(playerlist.size()/2).findFirst().getAsInt();
    out.println(mid);
    }
    }
    
}
class player{
    private String name;
    private Integer age;
    public player(String name,Integer age){
        this.name  =  name;
        this.age =  age;
    }
    public String getName(){
        return name;
    }
    public Integer getAge(){
        return age;
    }
}
