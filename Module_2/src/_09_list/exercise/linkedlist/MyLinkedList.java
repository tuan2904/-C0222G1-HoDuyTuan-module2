package _09_list.exercise.linkedlist;

    public class MyLinkedList<E> {
        private Node head;
        private int numNodes;

        public MyLinkedList() {

        }

        public class Node{
            private Node next;
            private Object data;

            public Node(Object data) {
                this.data = data;
            }
            public Object getData(){
                return this.data;
            }
        }
        public MyLinkedList(Node head, int numNodes) {
            this.head = head;
            this.numNodes = numNodes;
        }
        public void add(int index, E element) {
            Node temp = head;
            Node holder;
            for (int i = 0; i < index - 1 && temp.next != null; i++) {
                temp = temp.next;
            }
            holder = temp.next;
            temp.next = new Node(element);
            temp.next.next = holder;
            numNodes++;

        }

        public void addFirst(E element) {
            Node temp = head;
            head = new Node(element);
            head.next = temp;
            numNodes++;
        }


        public void addLast(E element) {
            Node temp = head;
            while (temp != null) {
                if (temp.next == null) {
                    temp.next = new Node(element);
                    numNodes++;
                    break;
                }
                temp = temp.next;
            }
        }

        public E remove(int index) {
            Object valueRemove = null;
            Node temp = head;
            if (index == 0) {
                valueRemove = temp.data;
                head = head.next;
            } else {
                for (int i = 0; i < index && temp.next != null; i++) {
                    valueRemove = temp.next.data;
                    temp = temp.next;
                }
                temp.data = temp.next.data;
                temp.next = temp.next.next;
            }
            numNodes--;
            return (E) valueRemove;
        }

        public void  removeElement(int element){
            if (head.data.equals(element)){
                remove(0);
            }else{
                Node temp = head;
                while(temp.next != null){
                    if (temp.next.data.equals(element)){
                        temp.next = temp.next.next;
                        numNodes--; }
                    temp = temp.next;
                }
            }
            numNodes--;
        }

        public int size() {
            return numNodes;
        }

        public boolean contains(E element) {
            Node temp = head;
            for (int i = 0; i < numNodes; i++) {
                if (temp.data == element) {
                    return true;
                }
                temp = temp.next;
            }
            return false;
        }

        public int indexOf(E element) {
            Node temp = head;
            for (int i = 0; i < numNodes; i++) {
                if (temp.data == element) {
                    return i;
                }
                temp = temp.next;
            }
            return -1;
        }

        public E get(int index) {
            Node temp = head;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
            return (E) temp.data;
        }

        public E getFirst() {
            Node temp = head;
            return (E) temp.getData();
        }

        public E getLast() {
            Node temp = head;
            while (temp != null) {
                if (temp.next == null) {
                    return (E) temp.getData();
                }
                temp = temp.next;
            }
            return null;
        }

        public void clear() {
            Node temp = head;
            Node holder;
            for (int i = 0; temp != null; i++) {
                holder = temp.next;
                temp.next = null;
                temp = holder;
            }
             head = null;
            numNodes = 0;
        }


        @Override
        public String toString() {
            String str = "[";
            Node temp = head;
            while (temp != null) {
                str += temp.getData();
                if (temp.next == null) {
                    break;
                }
                str += ",";
                temp = temp.next;
            }
            str += "]";
            return str;

        }
    }

