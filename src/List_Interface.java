import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class List_Interface {
    /*  add(index, elem) - добавляет новый элем
        set(index, elem) - меняет имеющийся на новый

            ARRAYLIST - динамический массив
    */
    public static void main(String[] args) {
        List<String> arrList = new ArrayList<>();
        arrList.add("B");
        arrList.add("C");
        arrList.add(0, "A");
        arrList.add("D");
        arrList.add("E");
        arrList.add("F");

        List <String> removeArrList = List.of("C", "E", "G");
        arrList.removeAll(removeArrList);
        System.out.println(arrList);     // A, B, D, F
        arrList.addAll(removeArrList);
        System.out.println(arrList);     // A, B, D, F, C, E, G

        List <String> retainArrList = List.of("A", "B", "G", "K", "L"); // создает НЕИЗМЕНЯЕМЫЙ список
        arrList.retainAll(retainArrList);
        System.out.println(arrList);    // A, B, G

        arrList.add("A");
        arrList.retainAll(retainArrList);
        System.out.println(arrList);    // A, B, G, A

            // TOARRAY()
        // 1)
        String[] stringArray1 = new String[arrList.size()];
        arrList.toArray(stringArray1);
        System.out.println(Arrays.toString(stringArray1));

        // 2)
        String[] stringArray2 = arrList.toArray(new String[0]);
        System.out.println(Arrays.toString(stringArray2));
    }
}
