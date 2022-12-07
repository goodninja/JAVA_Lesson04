// 2. Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди,
// dequeue() - возвращает первый элемент из очереди и удаляет его,
// first() - возвращает первый элемент из очереди, не удаляя.

package Task02;

import java.util.LinkedList;

public class task02 {
    public static void main (String[] args) {
        
        LinkedList<String> createQueue = new LinkedList<String>(); 
        
        enqueue (createQueue, "rand123");
        System.out.printf("Добавить элемент 0 -> %s\n", createQueue);
        
        enqueue (createQueue, "rand224466");
        System.out.printf("Добавить элемент 1 -> %s\n", createQueue);
        
        enqueue (createQueue, "rand6978");
        System.out.printf("Добавить элемент 2 -> %s\n", createQueue);
        
        enqueue (createQueue, "rand654321");
        System.out.printf("Добавить элемент 3 -> %s\n", createQueue);

        enqueue (createQueue, "rand777888");
        System.out.printf("Добавить элемент 4 -> %s\n", createQueue);

        System.out.printf("Первый элемент -> %s\n", dequeueFirst (createQueue));
        System.out.printf("Удалить первый элемент -> %s\n", createQueue);
        
        System.out.printf("Последний элемент -> %s\n", dequeueLast(createQueue));
        System.out.printf("Удалить последний элемент -> %s\n", createQueue);

        System.out.printf("Первый элемент -> %s\n", first (createQueue));
        System.out.printf("Не удалять первый элемент -> %s\n", createQueue);

        System.out.printf("Последний элемент -> %s\n", last (createQueue));
        System.out.printf("Не удалять последний элемент -> %s\n", createQueue);

    }

    
    public static void enqueue (LinkedList<String> test, String str) { // вставка элемента в конец очереди
        test.addLast(str);
    }
    
    
    public static String dequeueFirst (LinkedList<String> test) { // возвращение первого элемента из очереди и его удаление
        return test.pollFirst();
    }

   
    public static String dequeueLast (LinkedList<String> test) {  // возвращение последнего элемента из очереди и его удаление
        return test.pollLast();
    }

    
    public static String first (LinkedList<String> test) { // возвращение первого элемента из очереди, не удаляя его
        return test.peekFirst();
    }

    
    public static String last (LinkedList<String> test) { // возвращение первого элемента из очереди, не удаляя его
        return test.peekLast();
    }
}