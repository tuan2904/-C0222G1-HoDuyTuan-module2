package _16_io_test_file.exercise.readfile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Run {
    public static void main(String[] args) throws IOException {
        List<String[]> list = ReadFile.readFile("src\\_16_io_test_file\\exercise\\readfile\\filecountry");
        for (String[] array: list) {
//            System.out.println(Arrays.toString(item));
            for (String items :array) {
                System.out.print(items);
            }
            System.out.println();
        }
    }
}
