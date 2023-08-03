import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class Streams {

    public static void main(String[] args) {

        Random random = new Random();

        List<String> names = List.of("Artiom", "Ilia", "Aleksandr", "Ivan", "Dima", "Nicolas", "Simon", "Victor", "Alena", "Arina", "Artiom");

        List<Integer> list = new ArrayList<>();
        int n = 0;
        while (n < 30) {
            list.add(random.nextInt(1, 20));
            n++;
        }

        System.out.println(list);

        List<Integer> collect = list.stream()
                .distinct()
                .toList();
       // System.out.println(collect);

        List<Integer> collect1 = list.stream()
                .skip(6)
                .limit(11)
                .filter(el -> el % 2 == 0 )
                .toList();
        //System.out.println(collect1);

        List<Integer> list1 = list.stream()
                .map(el -> el * 2)
                .toList();

        //System.out.println(list1);

        List<Integer> list2 = list.stream()
                .sorted().limit(4)
                .toList();

        //System.out.println(list2);

        Long list3 = list.stream()
                .count();

        //System.out.println(list3);

        OptionalDouble average = list.stream()
                .mapToInt(Integer::intValue)
                .average();
        //System.out.println(average);

        long artiom = names.stream()
                .map(String::toLowerCase)
                .filter(s -> s.equals("artiom"))
                .count();
        //System.out.println(artiom);

        List<String> a = names.stream()
                .map(String::toLowerCase)
                .filter(s -> s.startsWith("a"))
                .toList();
        //System.out.println(a);

        Optional<String> list4 = names.stream()
                .sorted()
                .findFirst();
        System.out.println(list4);
    }
}
