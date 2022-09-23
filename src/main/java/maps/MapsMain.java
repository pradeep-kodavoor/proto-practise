package maps;

import practise.maps.MapsOuterClass;

import java.util.Map;

public class MapsMain {
    public static void main(String[] args) {
        MapsOuterClass.Maps map = MapsOuterClass.Maps.newBuilder()
                .putPerson(1, getPerson("Pradeep", 29))
                .putPerson(2, getPerson("Sahana" , 27))
                .putAllPerson(Map.of(3, getPerson("Prameela", 35), 4, getPerson("Anupam", 40)))
                .build();
        System.out.println(map);
    }

    private static MapsOuterClass.Value getPerson(String name, int age) {
        return MapsOuterClass.Value.newBuilder().setName(name).setAge(age).build();
    }
}
