public class SingleLinkedList<T> {
    private T value = null;
    private SingleLinkedList<T> tail = null;

    public SingleLinkedList(T value) {
        this.value = value;
        if (value != null) {
            tail = new SingleLinkedList<T>(null);
        }
    }

    public String toString() {
        if (this.value != null) {
            return this.value.toString() + " -> " + tail.toString();
        }
        return "null";
    }

    public T listFirst() {
        return this.value;
    }

    public int listSearch(T searchedValue) {
        if (value == searchedValue) {
            return 1;
        }

        if (tail == null) {
            return 0;
        }

        return tail.listSearch(searchedValue);
    }

    public void listInsertFirst(T value) {
        SingleLinkedList<T> newHead = new SingleLinkedList<>(this.value);
        newHead.tail = this.tail;
        this.value = value;
        this.tail = newHead;
    }

    public void listInsertLast(T value) {
        if (this.tail == null) {
            this.value = value;
            this.tail = new SingleLinkedList<T>(null);
        } else {
            tail.listInsertLast(value);
        }
    }

    public void listDelete(T value) {
        if (this.value.equals(value)) {
            this.value = null;
            if (this.tail != null) {
                this.value = this.tail.value;
                this.tail = this.tail.tail;
            } else {
                this.value = null;
            }
        } else if (this.tail != null && this.tail.value != null) {
            if (this.tail.value.equals(value)) {
                if (this.tail.tail != null) {
                    this.tail = this.tail.tail;
                } else {
                    this.tail.value = null;
                }
            } else {
                this.tail.listDelete(value);
            }
        }
    }
}
