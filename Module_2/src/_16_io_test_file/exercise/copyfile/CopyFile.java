package _16_io_test_file.exercise.copyfile;

import _14_debug_exceptionhandling.exercise.IllegalTriangleException;
import _16_io_test_file.practice.th1.ReadAndWriteFile;
import jdk.internal.util.xml.impl.Input;

import java.io.*;

import java.util.ArrayList;
import java.util.List;

public class CopyFile {
    public static List<String> copyFile(String path)  {
        File file = new File(path);
        FileReader fileReader ;
        BufferedReader bufferedReader ;
        List<String> list = new ArrayList<>();
        int count=0;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                count += line.length();
                list.add(line);
            }
            bufferedReader.close();
//        }catch (FileNotFoundException e){
//            e.printStackTrace();
        } catch (IOException  e) {
            System.out.println("không tồn tại");
        }
        System.out.println("Số ký tự: " + count);
        return list;
    }

    public static void writer(String filePath,String line) {
        File file = new File(filePath);
        try(FileWriter fileWriter=new FileWriter(file,true);
            BufferedWriter  bufferedWriter= new BufferedWriter(fileWriter)) {
            bufferedWriter.write(line);
            bufferedWriter.newLine();
            if (file.exists()) {
                throw new Exception("Đã tồn tại");
            }
        }catch (IOException | Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        List<String> list = CopyFile.copyFile("src\\_16_io_test_file\\exercise\\copyfile\\sourcefile");
        for (String item:list) {
            CopyFile.writer("src\\_16_io_test_file\\exercise\\copyfile\\targetfile",item);
        }

    }
}
