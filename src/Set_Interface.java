import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/*      SET
 Набор уникальных элементов
 При добавлении нового элемента сравнивает его методом equals() с объектами в коллекции
 Выводит элементы в рандомном порядке
*/

public class Set_Interface {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("one");
        set.add("two");
        set.add("three");
        Boolean b = set.add("three");
        set.add(new String("three")); // добавит лишь один three, ибо вызывается equals()
        System.out.println(set);
        System.out.println(b);

        // добавление с помощью анонимного класса
        Set<String> set2 = new HashSet<String>(){
            {                                       // логический блок
                this.add("first");
                this.add("second");
                this.add("third");
            }
        };
        System.out.println(set2);


        /*  Класс HASHSET
        Хранит элементы в хеш-таблице, т.е. в парах ключ-значение
        Ключ определяет бакет(ячейку), для хранения значения
        По ключу определяется hashcode
        Коллизия - два значения с одним hashcode попадают в один бакет
            Тогда ищем в этом бакете нужный элемент по equals()

        public int hashcode(все поля){} - переопределяем hashcode в классе объекта, который будем помещать в HashSet

            Класс LINKEDHASHSET
        Сохраняет порядок вставки
        */

        Set<String> hashSet = new LinkedHashSet<>(){
            {
                this.add("first");
                this.add("second");
                this.add("third");
            }
        };
        hashSet.forEach(System.out::println);

        /*  интерфейс SORTEDSET -> Интерфейс NavigableSet -> Класс TreeSet
                методы:
        subSet(E fromElement, E toElement) - возвращает SortedSet, содержащий элементы из вызывающего множества от from до to-1
        headSet(E toElement)- возвращает SortedSet, содержащий элементы из вызывающего множества до to-1
        SortedSet tailSet(E fromElement) - возвращает SortedSet, содержащий элементы от from
        E first()
        E last()
        Comparator<? super E> comparator() - возвращает компаратор сортированного множества.
            Если для множества применяется естественный порядок сортировки, возвращается null.

            TREESET
        Элементы сортируются по возрастанию
        Это определяется методом compareTo/compare (см. файл)
        Если согласно ему объекты равны, то в множестве останется лишь один из них

            NAVIGABLESET
            Добавляет методы к SortedSet:
        E ceiling(E obj) - наименьший элемент, т.ч.  е >= obj,  иначе null
        Е floor(Е obj)      е <= obj
        Е higher(Е obj)     е > obj
        Е lower(Е obj)      е < obj
        */

    }

}
