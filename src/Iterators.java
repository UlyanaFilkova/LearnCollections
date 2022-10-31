import java.util.*;

public class Iterators {
    /*
            ITERATOR
    boolean hasNext() - true, если есть еще элементы
    E next() - возвращает следующий элемент. Если его нет, выдаст NoSuchElementException
    void remove() - удаляет текущий элемент. IllegalStateException, если вызвали remove(), которому не предшествовал вызов next()

            LISTITERATOR
    Двусторонний обход
    void add(Е obj) - вставляет obj перед элементом, который должен быть возвращен следующим вызовом next().
    void set(Е obj) - присваивает obj текущему элементу, возвращенному последним вызовом next() или previous().
    boolean hasNext()
    boolean hasPrevious()
    Е next()
    Е previous()
    int nextIndex() - возвращает индекс следующего элемента. Размер списка, если следующего нет
    int previousIndex() - возвращает индекс предыдущего элемента. -1, если предыдущего нет
    void remove() - удаляет текущий элемент из списка. Если remove() вызван до next() или previous(), инициируется исключение IllegalStateException.
   */
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("C");
        arrayList.add("A");
        arrayList.add("E");
        arrayList.add("B");
        arrayList.add("D");
        arrayList.add("F");

        Iterator<String> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }

        ListIterator<String> listIterator = arrayList.listIterator();
        while (listIterator.hasNext()) {
            System.out.print(listIterator.next() + " ");
        }
        //list.descendingIterator();
    }
}
