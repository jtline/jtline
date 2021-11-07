package javase9.ch12;
import static java.lang.System.out;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.io.*;
import java.nio.file.*;
public class streamtest {
    public static void main(String[] args) throws Exception{
        //pratice 1 Integer stream
        IntStream.range(1, 10).forEach(out::print);
        out.println("===");
        //pratice 2 Integer stream
        IntStream.range(1, 10).skip(5).forEach(x->out.print(x));
        //practice 3 sum
        IntStream.range(1, 10).sum();
        //practice 4
        Stream.of("Abc","ccc","ddd","A").sorted().findFirst().ifPresent(out::println);;
        //practice 5 start with
        String [] name ={"vi0","tes"};
        Arrays.stream(name).filter(x->x.startsWith("t")).sorted().forEach(out::println);
        //practice 6 with square and average
        int [] arrayint = {1,2,3,4,5,6,7};
        //Arrays.stream(arrayint).map(x->x*x).average().forEach(out::print);//no beacuse optional double
        Arrays.stream(arrayint).map(x->x*x).average().orElse(0);
        Arrays.stream(arrayint).map(x->x*x).sum();
        //practice 7
        List<String>people = Arrays.asList("ss","sss","hh");
        List<String>people2 = List.of("ss","sss","hh");
        System.out.println(people);
        System.out.println(people2);        
        people.stream().map(String::toUpperCase).filter(x->x.startsWith("H")).forEach(out::println);
        //practice 8 path is to Stream string is to Stream not to String
        //Stream<String> line = Files.lines(Paths.get(args[0]));
        //line.sorted().filter(x->x.length()>10).forEach(out::println);
        //line.close();
        //practice 9 path into list string
        //List<String> fileget = Files.lines(Paths.get(args[0])).collect(Collectors.toList());
        //practice 10 CSV file = comma seperated file
        String avc = "qwe-qwe-qwe-qwe-qwe" ;
        System.out.println(Arrays.toString(avc.split("-",3)));
        //Stream<String>row2 = Files.lines(Paths.get(args[0]));
        //int rowcount = row2.count().    
        Stream<String> nof = Files.lines(Paths.get(args[0]));
        //int count = (int)nof.filter(x->x.length()>9).count();
        List<String>namelist = nof.filter(x->x.length()>9).collect(Collectors.toList());
        //List<String>namelist = nof.collect(Collectors.toList());
        //practive 11
        Stream<String> nof2 = Files.lines(Paths.get(args[0]));
        out.print("csv file");
        nof2.map(x->x.split(",")).filter(x->x.length>2).filter(x->Integer.parseInt(x[1])>20).forEach(x->out.println(x[0]+" "+x[1]));
        //nof2.split("a").forEach(x->System.out.println(x));
        out.print(namelist);
        //out.println(count+"====");
        String aaa = "12";
        int abc = 12;
        String b = String.valueOf(abc);
        String c = Integer.toString(abc);
        int ddd = Integer.parseInt(c);
        int ddd2 = Integer.valueOf(c);
        String jj = "abc";
        String cc = "abc";
        String dd = cc;
        out.println(jj==cc);
        out.println(jj==dd);
        out.println(cc==dd);
        nof.close();
        //practice 12
        Stream<String> row3 = Files.lines(Paths.get(args[0]));
        Map<String,Integer>map = new HashMap<>();
        map = row3.map(x->x.split(",")).filter(x->x.length>6).collect(Collectors.toMap(x->x[0],x->Integer.parseInt(x[1])));
    }
    
    
}
