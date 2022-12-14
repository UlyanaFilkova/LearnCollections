public class Map_Interface {
    /*
        Уникальность ключей определяет реализация метода equals()
        Для корректной работы необходимо переопределить equals() и hashCode()

        void clear()
        boolean containsKey(Object k) - true, если содержит ключ k
        boolean containsValue(Object v) - true, если содержит значение v
        boolean isEmpty() - возвращает true, если вызывающая карта пуста. В противном случае возвращает false.

        Set<Map. Entry<K, V> entrySet() - возвращает Set, содержащий все значения карты. Набор содержит объекты типа Мар.Entry, то есть этот метод представляет карту в виде набора.
        Set<K> keySet() - возвращает Set, который содержит ключи вызывающей карты. Этот метод представляет ключи вызывающей карты в виде набора.

        V get(Object K) - возвращает значение, ассоциированное с ключом k. Возвращает null, если ключ не найден.
        V put(К k, V v) - помещает элемент в вызывающую карту, перезаписывая любое предшествующее значение, ассоциированное с ключом.
            Возвращает null, если ключ ранее не существовал. В противном случае возвращается предыдущее значение, связанное с ключом.
        void putAll(Мар<? extends К, ? extends V> m) - помещает все значения из m в карту.
        V remove(Object k) - удаляет элемент, чей ключ равен k.
        int size() - возвращает число пар "ключ-значение" в карте.
        Collection<V> values() - возвращает коллекцию, содержащую значения карты. Этот метод представляет значения, содержащихся в карте, в виде коллекции.

            SORTEDMAP - интерфейс
        элементы размещаются в возрастающем порядке значений ключей
        Comparator<? super К> comparator() - возвращает компаратор вызывающей сортированной карты. Если картой используется естественный порядок (comparable), возвращается null.
        К firstKey() - возвращает первый ключ вызывающей карты.
        К lastKey() - возвращает последний ключ вызывающей карты.
        SortedМap<K, V> headМap(К end) - Возвращает сортированную карту, содержащую те элементы вызывающей карты, ключ которых меньше end.
        SortedМap<K, V> subMap(К start, К end) - возвращает карту, содержащую элементы вызывающей карты, чей ключ больше или равен start и меньше end.
        SortedМap<K, V> tailMap (К start) - возвращает сортированную карту, содержащую те элементы вызывающей карты, ключ которых больше start.

            NAVIGABLEMAP
        доп. методы

            HASHMAP
         использует хеш-таблицу для хранения карты

            LINKEDHASHMAP
        Сохраняет порядок вставки

            TREEMAP
        TreeMap – хранит элементы в порядке сортировки.
        TreeMap сортирует элементы по возрастанию от первого к последнему.
        Порядок сортировки может задаваться реализацией интерфейсов Comparator и Comparable.
        Реализация Comparator передается в конструктор TreeMap, Comparable используется при добавлении элемента в карту.
    */
}
