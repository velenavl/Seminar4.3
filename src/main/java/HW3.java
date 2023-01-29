import java.util.*;

public class HW3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        Random rnd = new Random();

        for (int i = 0; i < 10; i++) {
            list.add(rnd.nextInt(11));
        }

        for (int i = 0; i < 10; i++) {
            list2.add(rnd.nextInt(11));
        }

        list.forEach(n-> System.out.print(n+" "));
        System.out.println();
        list2.forEach(n-> System.out.print(n+" "));

        System.out.println();
        System.out.println("Первый список отсортирован методом sort класса Collections.:");
        Collections.sort(list);
        System.out.println(list);

        System.out.println();
        System.out.println("Из первого списка удалены элементы, отсутствующие во втором списке:");

        list.retainAll(list2);
        list.forEach(n-> System.out.print(n+" "));
        System.out.println();

        System.out.println();
        System.out.println("Второй список отсортирован методом sort списка и компаратором по уменьшению:");
        list2.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer t0, Integer t1) {
                return t1 - t0;
            }
        });
        System.out.println(list2);



    }
}
