package labs_examples.datastructures.linkedlist.labs;


public class CustomLinkedListStatement<T> {

    private MyNode head;

    public void CustomLinkedList(T... data) {

        if (data.length < 1) {
            head = null;
        } else {
            for (int i = 0; i < data.length; i++) {
                add(data[i]);
            }
        }
    }


    public void add(T data){
        insert(data);
    }

    public void insert(T data){
        if (head == null) {
            head = new MyNode(data);
        } else {
            // if we hit this "else" block, it means the user wants to attach the new node to the end of the list

            // make a new reference to the head node that we can use to traverse the list
            // we do this so we NEVER lose a secure reference to the head node
            MyNode iterator = head;

            // so we need to iterate all the way through list to find last node
            // we'll know we've hit the last node when "iterator.next" is equal to null
            while (iterator.next != null) {
                iterator = iterator.next;
            }

            // once we exit the loop above, "iterator.next" will be referencing the final node in the list
            // at this point we can attach the new Node to the "next" variable of the final node in th list
            iterator.next = new MyNode(data);

        }
    }

    public int size() {
        int count = 0;
        MyNode iterator = head;

        // iterate through list
        while (iterator != null) {
            count++;
            iterator = iterator.next;
        }

        return count;
    }

}
