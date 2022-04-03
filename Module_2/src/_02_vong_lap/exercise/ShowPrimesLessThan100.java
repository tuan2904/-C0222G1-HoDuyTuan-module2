package _02_vong_lap.exercise;

public class ShowPrimesLessThan100 {

    public static void main(String[] args) {
        int count = 0;
        while (count < 100) {
            boolean check = true;
            if (count < 2) {
                check = false;
            } else {
                for (int i = 2; i < count; i++) {
                    if (count % i == 0) {
                        check = false;
                        break;
                    }
                }
                if (check){
                    System.out.println( count );
                }
            }
            count++;
        }
    }
}
