package labs_examples.datastructures.linkedlist.labs;


public class MyNode<T>{

    T data;
    // a "link" to the "next" Node in the LinkedList
    MyNode next;

    // a simple constructor that takes in data
    public MyNode(T data) {
        this.data = data;
        this.next = null;
    }

    // an overloaded constructor we'll use to add Nodes to the front of the LinkedList
    public MyNode(T data, MyNode myNode) {
        this.data = data;
        this.next = myNode;

    }
}
