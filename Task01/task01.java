// 1. Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.

package Task01;

import java.util.LinkedList;
import java.util.List;

public class task01 {
    public static void main (String[] args) {
        LinkedList<String> initialList = new LinkedList<>();
        
        initialList.add ("1-123456789");
        initialList.add ("2-abcdefghju");
        initialList.add ("3-processing");
        initialList.add ("4-inverted list");
        
        System.out.println(initialList);
        System.out.println(invertedList(initialList));
        
    }


    public static List<String> invertedList (List<String> startList) {
        
        LinkedList<String> reworkedList = new LinkedList<>();
        for (int i = startList.size() - 1; i >= 0; i--) {
            reworkedList.add(startList.get(i));
        }

        return reworkedList;
    }
}