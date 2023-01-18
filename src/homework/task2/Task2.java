package homework.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
//        Random random2 = new Random((int) Math.random());
//        Random random3 = new Random((int) Math.random());
//        Random random4 = new Random((int) Math.random());
//        Random random5 = new Random((int) Math.random());
//
//        List<Random> randoms = new ArrayList<>();
//        randoms.add(random1);
//        randoms.add(random2);
//        randoms.add(random3);
//        randoms.add(random4);
//        randoms.add(random5);
//
//
//randoms.add(random1)
        Integer[] arr = new Integer[8];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
        }
            Stream.iterate(0, x -> x += 1).filter(x -> x % 2 == 0).limit(8).forEach(System.out::println);
        }
    }



//    public static void main(String[] args) {



