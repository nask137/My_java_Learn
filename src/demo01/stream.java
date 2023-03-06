package demo01;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class stream {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        Collections.addAll(integers,1,2,3,4,5,6,7,8,9);
        List<Integer> collect = integers.stream().filter(s -> s % 2 == 0).collect(Collectors.toList());
        System.out.println(collect  );
        ArrayList<String> strings = new ArrayList<>();
        strings.add("zhangsan,23");
        strings.add("lisi,24");
        strings.add("wangnan,25");
        strings.add("zhaoliu,26");
        Map<String, Integer> collect1 = strings.stream()
                .filter(s -> Integer.parseInt(s.split(",")[1]) >= 24)
                .collect(Collectors.toMap(s -> s.split(",")[0], s -> Integer.parseInt(s.split(",")[1])));
        System.out.println(collect1);
        ArrayList<String> strings2 = new ArrayList<>();
        strings2.add("yangying,23");
        strings2.add("zhaosilu,24");
        strings2.add("yangmi,25");
        strings2.add("yushuxin,26");

        Stream<String> stream2 = strings2.stream()
                .filter(s -> Integer.parseInt(s.split(",")[1]) >= 24)
                .skip(1);
        Stream<String> stream1 = strings.stream()
                .filter(s -> Integer.parseInt(s.split(",")[1]) >= 24)
                .skip(1);
        List<Actor> collect2 = Stream.concat(stream1, stream2)
                .map( s -> new Actor(s.split(",")[0], Integer.parseInt(s.split(",")[1])))
                .collect(Collectors.toList());
        System.out.println(collect2);

    }
}
