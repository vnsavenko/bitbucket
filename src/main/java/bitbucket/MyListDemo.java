package bitbucket;

import java.util.List;

public class MyListDemo {
    public static void main(String[] args) {
        MyList myList = new MyList();
        myList.add(2);
        myList.add(2);
        myList.add(2);
        myList.add(2);
        myList.add(0,100);
        printList(myList);
        myList.remove(new Integer(100));
        printList(myList);

        System.out.println("Максимальное значение: " + myList.getMax());
        System.out.println("Минимальное значение: " + myList.getMin());
        System.out.println("Среднее значение: " + myList.getMean());
    }

    private static void printList(List myList) {
        System.out.println("\nMyList:");
        for (int i = 0; i < myList.size(); i++) {
            System.out.print(myList.get(i) + " ");
        }
        System.out.println();
    }

}
