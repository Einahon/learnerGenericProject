package generic;

import java.util.List;

public class GenericMethod {
    public static <T> void printList(List<T> list) {
        for (T lists : list) {
            System.out.println(lists);
        }
    }
}
