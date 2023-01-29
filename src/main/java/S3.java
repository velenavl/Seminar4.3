import java.util.ArrayList;
import java.util.Random;

public class S3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        Random rnd = new Random();

        for (int i = 0; i < 5; i++) {
            list.add(rnd.nextInt(5));
        }

        for (int i = 0; i < 5; i++) {
            list2.add(rnd.nextInt(5));
        }

        list.forEach(n-> System.out.print(n+" ")); //n - это новая переменная, можно по разному ее назвать; println - будет переносить каждый новый элемент на нлвую строку
        System.out.println(); // просто перенос строки
        list2.forEach(n-> System.out.print(n+" ")); // если просто print - в строку
        System.out.println();

        //list.removeAll(list2); // removeAll - это метод, к-ый удаляет в списке-источнике все цифры, к-ые есть во втором списке
        list.retainAll(list2); // удаляет все элементы из целевого списка, которые не найдены в другом списке
        list.forEach(n-> System.out.print(n+" "));
    }
}
