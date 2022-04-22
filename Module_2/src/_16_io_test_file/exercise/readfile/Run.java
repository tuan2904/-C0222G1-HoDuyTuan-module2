package _16_io_test_file.exercise.readfile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Run {
    public static void main(String[] args) {
        List<Country> countries = new ArrayList<>();
        List<String[]> list = ReadFile.readFile("src\\_16_io_test_file\\exercise\\readfile\\filecountry.csv");
        Country country;
        for (String[] array : list) {
            country = new Country(Integer.parseInt(array[0]),
                    array[1], array[2]);
            countries.add(country);
        }
        for (Country items : countries) {
            System.out.println(items);

        }
//            System.out.println();
    }
//    }
}