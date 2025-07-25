

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(1, 3, 643, 3, 2, 6, 7, 8, 43, 2));

        List<String> newList = list.stream()
                .map(String::valueOf)
                .toList();

        System.out.println(newList);
        StringBuilder str = new StringBuilder();
        for (String x : newList) {
            str.append(x).append(" ");
        }
        System.out.println(str);


        List<Integer> newestList = newList.stream()
                .map(Integer::parseInt)
                .map(x -> x * 2)
                .toList();

        System.out.println(newestList);

        boolean q = newestList.stream().anyMatch(x -> x > 0);
        System.out.println(q);
        boolean qq = newestList.stream().allMatch(x -> x > 0);
        System.out.println(qq);
        boolean qqq = newestList.stream().noneMatch(x -> x < 0);
        System.out.println(qqq);
    }
}


