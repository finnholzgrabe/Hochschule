public class Main {
    public static void main(String[] args) {
        SingleLinkedList<Integer> test = new SingleLinkedList<Integer>(1);
        test.listInsertLast(3);
        System.out.println(test.toString());

        test.listInsertLast(5);
        test.listInsertLast(7);
        System.out.println(test.toString());
        
        System.out.println(test.listSearch(4));
        System.out.println(test.listSearch(5));
        
        test.listInsertFirst(18);
        System.out.println(test.toString());
        
        test.listDelete(3);
        System.out.println(test.toString());
        test.listDelete(18);
        System.out.println(test.toString());
        test.listInsertLast(567);
        System.out.println(test.toString());
        test.listDelete(567);
        System.out.println(test.toString());
        test.listDelete(567);
        System.out.println(test.toString());
    }
}