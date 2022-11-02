import java.util.Optional;

public class Optional_Klass {

    // ofNullable - Возвращает экземпляр Optional, содержащий переданное значение,
            // если оно не равно null, в противном случае возвращает пустой Optional
    Optional<Integer> optional = Optional.ofNullable(getInteger());
    private Integer getInteger(){
        Integer one = 1;
        return (one > 2) ? one : null;
    }

    // ifPresent()
    // isPresent()
    // orElse() - возвращает значение по умолчанию, если значение отсутствует
}
