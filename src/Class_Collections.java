import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Class_Collections {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("красный", "синий", "зеленый");
        System.out.println("Перед сортировкой: " + list);

        // Collections.sort()
        Collections.sort(list);
        System.out.println("После сортировки: " + list);
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("После обратной сортировки: " + list);

        // binarySearch()
        System.out.println(Collections.binarySearch(list, "красный"));

        // reverse()
        Collections.reverse(list);
        System.out.println("После reversing: " + list);

        // shuffle() - перемешать
        Collections.shuffle(list);
        System.out.println("После shuffling: " + list);

        // max(), min()
        System.out.println("max " + Collections.max(list));
        System.out.println("min " + Collections.min(list));

        // copy() - заменяет нужное количество
        List<String> dest = Arrays.asList("белый", "", "", "охра");
        Collections.copy(dest, list);
        System.out.println(dest);

        // fill() - число таких элементов
        Collections.fill(list, "черный");
        System.out.println(list);

        // frequency()
        System.out.println(Collections.frequency(list, "черный"));

        // rotate() - сдвиг на указ число вправо
        List<String> list2 = Arrays.asList("a", "b", "c", "d", "e");
        System.out.println(list2);

        Collections.rotate(list2, 2);
        System.out.println(list2);

        Collections.rotate(list2, -1);
        System.out.println(list2);
    }
}
