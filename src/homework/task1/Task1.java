package homework.task1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Task1 {
    public static <T> void findMinMax(Stream<? extends T> stream,
                                      Comparator<? super T> order,
                                      BiConsumer<? super T, ? super T> minMaxConsumer) {

        List<T> humanList = new ArrayList<>();
//        T min = null;
//        T max = null;
        humanList = humanList.stream().sorted((Comparator<? super T>) humanList).collect(Collectors.toList());
        if (humanList.size() != 0) {
            T min = humanList.stream().findFirst().get();
            T max = humanList.get(humanList.size() - 1);
            System.out.println(min);
            System.out.println(max);
//            min = humanList.get(0);
//            max = humanList.get(humanList.size() - 1);
            minMaxConsumer.accept(min, max);
        }
    }

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
//        System.out.println(findMinMax(humanList.stream().min(Human));    }
    }


}

//            for (Integer human:humanList) {
//                humanList = humanList.stream().sorted().collect(Collectors.toList());
//                System.out.println(humanList.stream().sorted().collect(Collectors.toList()));
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




