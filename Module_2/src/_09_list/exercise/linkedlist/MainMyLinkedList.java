package _09_list.exercise.linkedlist;

public class MainMyLinkedList {
    public static void main(String[] args) {

        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();
        myLinkedList.addFirst(1);
        myLinkedList.addFirst(2);
        myLinkedList.addFirst(3);
        myLinkedList.addFirst(5);
        myLinkedList.addFirst(6);
        System.out.println(myLinkedList.toString());

        System.out.println("Thêm phần tử vô mảng: ");
        myLinkedList.add(2,6);
        System.out.println(myLinkedList.toString());

        System.out.println("Thêm phần tử vào đầu mảng: ");
        myLinkedList.addLast(4);
        System.out.println(myLinkedList.toString());

        System.out.println("Thêm phần tử vào cuối mảng: ");
        myLinkedList.addFirst(7);
        System.out.println(myLinkedList.toString());

        System.out.println("Lấy phần tử theo index: ");
        System.out.println(myLinkedList.get(4));

        System.out.println("Lấy phần tử đầu mảng: ");
        System.out.println(myLinkedList.getFirst());

        System.out.println("Lấy phần tử cuối mảng: ");
        System.out.println(myLinkedList.getLast());

        System.out.println("Xóa phần tử theo index: ");
        System.out.println(myLinkedList.remove(2));
        System.out.println(myLinkedList.toString());

        System.out.println("Tìm vị trí của phần tử trong mảng: ");
        System.out.println(myLinkedList.indexOf(4));

        System.out.println("Kiếm phần tử trong mảng: ");
        System.out.println(myLinkedList.contains(4));

        System.out.println("Xóa phần tử trong mảng: ");
        myLinkedList.removeElement(6);
        System.out.println(myLinkedList.toString());

        System.out.println("Xóa mảng: ");
        myLinkedList.clear();
        System.out.println(myLinkedList.toString());
    }
    }

