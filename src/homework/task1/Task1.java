package homework.task1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;
import static java.util.stream.Collectors.toList;

public class Task1 {
    public static void main(String[] args) {
        Human human1 = new Human("Ann", 17);
        Human human2 = new Human("Max", 27);
        Human human3 = new Human("Phill", 47);
        Human human4 = new Human("Sui", 26);
        Human human5 = new Human("Kate", 2);

        List<Integer> humanList = new ArrayList<>();
        humanList.add(human1.getAge());
        humanList.add(human2.getAge());
        humanList.add(human3.getAge());
        humanList.add(human4.getAge());
        humanList.add(human5.getAge());
        System.out.println(humanList);
        System.out.println("_____________");
        for (Integer human:humanList) {
            humanList = humanList.stream().sorted().collect(Collectors.toList());
//            System.out.println(humanList.stream().sorted().collect(Collectors.toList()));
        }
        System.out.println(humanList);
        Integer min = humanList.stream().findFirst().get();
        Integer max = humanList.stream().max(Integer::compareTo).get();
        System.out.println(min);
        System.out.println(max);
//        List<Integer> finalHumanList = humanList;
//        Consumer<Human> consumer = new Consumer<Human>() {
//            @Override
//            public void accept(Human human) {
//
//                if (!finalHumanList.isEmpty() || finalHumanList != null) {
//                    consumer.accept(min, max);
//                } else {
//                    consumer.accept(null);
//                }
////                humanConsumer.accept(m);
//                System.out.println(consumer.accept(min, max));

            }
        };
//        Stream<? extends T> stream,
//        Comparator<? super T> order,
//        BiConsumer<? super T, ? super T> minMaxConsumer

