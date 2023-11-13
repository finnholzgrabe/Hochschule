public class Test {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.listInsertLast(1);
        list.listInsertLast(2);
        list.listInsertLast(3);

        System.out.println("Linked List:");
        System.out.println(list.toString()); // 1 -> 2 -> 3 -> null

        System.out.println("List-First: " + list.listFirst()); // 1
        System.out.println("List-Search (2): " + list.listSearch(2)); // true
        list.remove(2);
        System.out.println("List-Search (2): " + list.listSearch(2)); // false
        System.out.println(list.toString()); // 1 -> 3 -> null

        list.listInsertFirst(0);
        list.listInsertLast(4);

        System.out.println("Linked List after Insertions:");
        System.out.println(list.toString()); // 0 -> 1 -> 3 -> 4 -> null

        list.listDelete(4);

        System.out.println("Linked List after List-Delete (4):");
        System.out.println(list.toString()); // 0 -> 1 -> 3 -> null
    }
}