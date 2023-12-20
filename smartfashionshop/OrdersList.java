/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smartfashionshop;

/**
 *
 * @author waths
 */
public class OrdersList {

    Node first;

    class Node {

        Orders order;
        Node next;

        Node(Orders order) {
            this.order = order;
        }
    }

    private boolean isEmpty() {
        return first == null;
    }

    public boolean add(Orders orders) {
        Node n1 = new Node(orders);
        if (isEmpty()) {
            first = n1;
        } else {
            Node lastNode = first;
            while (lastNode.next != null) {
                lastNode = lastNode.next;
            }
            lastNode.next = n1;
        }
        return true;
    }

    public int size() {
        int count = 0;
        Node temp = first;
        while (temp != null) {
            temp = temp.next;
            count++;
        }
        return count;
    }

    public Orders get(int index) {
        if (index >= 0 && index < size()) {
            Node temp = first;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }

            return temp.order;
        } 
        return null;

    }

    public Orders[] toArray() {
        Orders[] ar = new Orders[size()];
        Node temp = first;
        for (int i = 0; i < ar.length; i++) {
            ar[i] = temp.order;
            temp = temp.next;
        }
        return ar;

    }
    
    private boolean isValidIndex(int index) {
        return (index >= 0 && index < size());
    }

    public boolean remove(int index) {
        if (isValidIndex(index) && first != null) {
            Node temp = first;
            if (index == 0) {
                first = first.next;
            } else if (index > 0) {
                int count = 0;
                while (count < index - 1) {
                    temp = temp.next;
                    count++;
                }
                temp.next = temp.next.next;
            }
        }
        return true;
    }

}
