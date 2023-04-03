package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest {
    public static void main(String[] args) {

        // tworzenie strumienia

        List<String> names = Arrays.asList("Tom","John","Mat","Paul");

        Stream<String> streamNames = names.stream();
        Stream<Integer> streamInt = Arrays.asList(new Integer[]{1,2}).stream();
        DoubleStream doubleStream = DoubleStream.of(3,3,2,1,2,4);
        IntStream intStream = IntStream.range(1,100);

        // @ Przetwarzanie danych
        // filtr - filtrowanie
        // map - zmiana elementu na coś innego
        // limit - zwraca określoną liczbe lementów
        // peek - pozwala przprowadzic operacje na każdym elemenci

        // @ końćzenie struminia
        // forEach - wyonanie akcji dla każdego z elementówstrumienia
        // count - zwróci ilość elementów strumieniu
        // all Match - sprawdza czy elementy spełniają jakis warunek
        // collect - zwraca nowy typ na podstwaie strumienia

        List<String> modufiedNamed = streamNames.filter( el -> el.startsWith("T"))
                .map(el -> el.toUpperCase())
                .collect(Collectors.toList());
        System.out.println(modufiedNamed.get(0));
        System.out.println(modufiedNamed.size());

        long count = intStream.filter(el -> el>20)
                .map(el -> el*2)
                //.limit(10)
                .count();
                //.forEach(el -> System.out.println(el));

        System.out.println(count);
    }
}
