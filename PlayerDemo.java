package javase9.ch12;
import java.util.*;
import static java.util.stream.Collectors.toList;
import static java.lang.System.out;
public class PlayerDemo {
    public static void main(String[] args) {
    player[] players = {new player("set",12),new player("vibo",27)};
    List<player> playerlist = List.of(new player("set",12),new player("vibo",27));
    playerlist.stream().filter(play->play.getAge()>15)
                       .map(player::getName)
                       .collect(toList())
                       .forEach(out::println);//import static method
    playerlist.stream().map(player::getName).forEach(out::println);                   
    List<String> listtest = new ArrayList<>();
    listtest.add("123");
    listtest.add("456");
    listtest.add("789");
    listtest.forEach(out::println);//consumer
    Map<String,String>  map = new HashMap<>();
    map.put("12","df");
    map.put("34","df43");
    map.forEach((v,k)->System.out.println(v));//biconsmer
    
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
