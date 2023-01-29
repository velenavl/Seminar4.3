import java.util.ArrayList;
import java.util.Random;

// список заполнить рандомно и отсортировать по уменьшению
public class ex01 {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Random rnd = new Random();
        for (int i = 0; i < 10; i++) {
            arrayList.add(rnd.nextInt(0, 1001));
        }
        System.out.println(arrayList);
    }

    public static ArrayList<Integer> sortList (ArrayList<Integer> list) {
//        ArrayList<Integer> arrayList = new ArrayList<>();
//        int tmp = list.get(0); //считать
//        list.set(0, 7); // установить
//        list.remove(0); // удалить
//        list.add(0, 7); // добавляет

        int index = list.size()-1;

        while (index >= 0) {
            int max = list.get(index);
            for (int i = 0; i < index-1; i++) {
                if(list.get(i) >= max) max = list.get(i);
                list.set(i, max);
            }
            index--;
        }

        return list;

    }
}
