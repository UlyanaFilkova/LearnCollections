/*  Два интерфейса: comparable и comparator
        COMPARABLE
   int compareTo(obj) - надо реализовать в классе, объекты которого хотим сравнивать/сортировать по возрастанию
   <0   this < obj
   >0   this > obj

   Klass implements Comparable<Klass>
      int compareTo(Klass obj){
         return Double.compare(this.h, obj.h);
      }
        COMPARATOR
    int compare(Klass obj1, Klass obj2)
    Сначала создаем отдельным класс с методом компаратора.
            (и таких классов можно насоздавать очень много, в зависимости от того,
             каким способом мы хотим сравнивать объекты изначального класса)
    public class KlassComparator implements Comparator<Klass> {
        @override
        public int compare(Klass obj1, Klass obj2)
            { ... }
    }
    Тогда когда потребуется comparator, сначала создаем его объект klassComparator:
        KlassComparator klassComparator = new KlassComparator();
    И при создании TreeSet в конструкторе передаем этот объект,
     чтобы при сравнении элементов использовал именно его
        SortedSet<Klass> set = new TreeSet <> (klassComparator);

    АЛЬТЕРНАТИВА: COMPARATOR - АНОНИМНЫЙ КЛАСC:
        Comparator klassComparator = new Comparator<Klass>(){
            @override
            public int compare(Klass obj1, Klass obj2)
            { ... }
        };

    АЛЬТЕРНАТИВА: COMPARATOR.COMPARING()
        Comparator klassComparator = Comparator.comparing(Klass::getName).thenComparing(Klass::getAge);
*/
