package _09_list.exercise.arraylist;

public class MainMyList {
    public static void main(String[] args) {
        MyList<Integer> myList = new MyList<>();
        System.out.println("Mảng ban đầu: ");
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        System.out.println(myList);

        System.out.println("Thêm phần tử vào mảng: ");
        myList.add(2, 6);
        System.out.println(myList);

        System.out.println(" Xóa phần tử ở vị trí index: ");
        myList.remove(2);
        System.out.println(myList.toString());

        System.out.println("Tìm vị trí của phần tử trong mảng: ");
        System.out.println(myList.indexOf(1));


        System.out.println(" Tìm kiếm phần tử trong mảng: ");
        System.out.println(myList.contains(3));


        System.out.println(" Sau khi xóa mảng : ");
        myList.clear();
        System.out.println(myList.toString());

//
//        for (int i=0 ; i<myList.size();i++) {
//            Student s = ( Student ) myList.elements[i];
//            System.out.println(s.getId());
//            System.out.println(s.getName());
//        }


    }
}
