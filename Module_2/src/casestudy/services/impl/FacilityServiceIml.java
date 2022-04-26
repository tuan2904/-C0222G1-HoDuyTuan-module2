package casestudy.services.impl;

import casestudy.models.Facility;
import casestudy.models.House;
import casestudy.models.Room;
import casestudy.models.Villa;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FacilityServiceIml implements FacilityService {
    public static final String REGEX_NAME="^[A-Z][a-z]+$";
    public static final String REGEX_ID="^(SVVL)-[\\d]{4}$";
    public static final String REGEX_Person="[1-9]|([1][0-9])|(20) ";
    public static final String REGEX_AREA="^([3-9]\\d|[1-9]\\d{2,})$";
    private static Map<Facility,Integer> facilityIntegerMap=new LinkedHashMap<>();
    static {
        facilityIntegerMap.put(new Villa("1","villa 1",13,100,18,
                "Day","Vip",15,3),0);
        facilityIntegerMap.put(new Villa("1","villa 2",13,100,18,
                "Day","Vip",15,3),0);
    }
    private static Scanner scanner=new Scanner(System.in);
    @Override
    public void displayList() {
        for (Map.Entry<Facility,Integer> element:facilityIntegerMap.entrySet() ) {
            System.out.println(" Service: " + element.getKey() + " số lần thuê: " +element.getValue() );
        }
    }

    @Override
    public void displayMaintain() {

    }
//    idFacility,
//    String nameService,
//    double areaUse,
//    int rentalPrice,
//    int rentalPeopleMax,
//    String styleRental,
//    String standardVilla,
//    double arePool,
//    int floor
    @Override
    public void addNewVilla() {
        System.out.println("Nhập id: ");
        String id=scanner.nextLine();
        System.out.println("Nhập tên cơ sở: ");
        String name=scanner.nextLine();
        System.out.println("Nhập diện tích: ");
        double area=Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập giá: ");
        int price =Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập số người thuê: ");
        int person=Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập style: ");
        String style =scanner.nextLine();
        System.out.println("Nhập tiêu chuẩn phòng: ");
        String standard=scanner.nextLine();
        System.out.println("Nhập diện tích hồ bơi: ");
        double pool=Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập tầng: ");
        int floor=scanner.nextInt();
        Villa villa=new Villa(id,name,area,price,person,style,standard,pool,floor);
        facilityIntegerMap.put(villa,0);
        System.out.println("Thêm villa thành công. ");


        
    }

    @Override
    public void addNewHouse() {
        System.out.println("Nhập id: ");
        String id=scanner.nextLine();
        System.out.println("Nhập tên cơ sở: ");
        String name=scanner.nextLine();
        System.out.println("Nhập diện tích: ");
        double area=Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập giá: ");
        int price =Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập số người thuê: ");
        int person=Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập style: ");
        String style =scanner.nextLine();
//        System.out.println("Nhập tiêu chuẩn phòng: ");
//        String standard=scanner.nextLine();
        House house=new House(id,name,area,price,person,style);
        facilityIntegerMap.put(house,0);
        System.out.println("Thêm house thành công. ");
    }

//    tring idFacility,
//    String nameService,
//    double areaUse,
//    int rentalPrice,
//    int rentalPeopleMax,
//    String styleRental,
//    String buffet,
//    String outDoorPlaying)
    @Override
    public void addNewRoom() {
        System.out.println("Nhập id: ");
        String id=scanner.nextLine();
        System.out.println("Nhập tên cơ sở: ");
        String name=scanner.nextLine();
        System.out.println("Nhập diện tích: ");
        double area=Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập giá: ");
        int price =Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập số người thuê: ");
        int person=Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập style: ");
        String style =scanner.nextLine();
        System.out.println("Nhập tiêu chuẩn phòng: ");
        String standard=scanner.nextLine();
        System.out.println("Thời giản ăn buffet: Sáng or Tối. ");
        String buffet=scanner.nextLine();
//        System.out.println("Thời gian vui chơi: Sáng or Tối. ");
//        String play=scanner.nextLine();
        Room room=new Room(id,name,area,price,person,style,standard,buffet);
        facilityIntegerMap.put(room,0);
        System.out.println("Thêm room thành công. ");
    }
}