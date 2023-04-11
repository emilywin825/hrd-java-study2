package day12.lamda;

@FunctionalInterface //람다 사용 가능
public interface GenericPredicate<T> {
    //지정된 타입에 대한 검사를 수행
    boolean test(T t);
}
