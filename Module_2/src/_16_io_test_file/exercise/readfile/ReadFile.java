package _16_io_test_file.exercise.readfile;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {
    public static List<String []> readFile(String path) {
        File file=new File(path);
        List<String[]> listStr = new ArrayList<>();
        try (FileReader fileReader = new FileReader(file); BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            String line = "";
            while ((line = bufferedReader.readLine()) != null && !line.equals("")) {
                String[] arrStr = line.split(",");
                listStr.add(arrStr);
            }
            return listStr;
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

//    public static void writer(String filePath,String line) {
//        File file = new File(filePath);
//        try(FileWriter fileWriter=new FileWriter(file,true);
//            BufferedWriter  bufferedWriter= new BufferedWriter(fileWriter)) {
//            bufferedWriter.write(line);
//            bufferedWriter.newLine();
//        }catch (IOException e){
//            e.printStackTrace();
//        }
//    }

}
