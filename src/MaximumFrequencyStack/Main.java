package MaximumFrequencyStack;

import java.io.*;
import java.nio.file.FileStore;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.Collection;

public class Main{
    public static void main(String[] args) throws FileNotFoundException, IOException {
//        File file = new File("D:\\Java_magic\\LeetCode\\src\\MaximumFrequencyStack\\data.txt");
//        File file2 = new File("D:\\Java_magic\\LeetCode\\src\\MaximumFrequencyStack\\newData.txt");
//        try (InputStream input = new FileInputStream(file); OutputStream output = new FileOutputStream(file2,true);
//             ByteArrayInputStream byteInput = new ByteArrayInputStream(input.readAllBytes())){
//            output.write(byteInput.readAllBytes());
//        }
//        catch(IOException ex){
//            System.out.println(ex.getMessage());
//        }
//        try(DataOutputStream outData = new DataOutputStream(new FileOutputStream("DataBin.bin", false))){
//            outData.writeUTF("50000");
//            outData.writeUTF("false");
//            outData.writeUTF("hello");
//
//
//        }
//        catch (IOException ex){
//            System.out.println(ex.getMessage());
//        }
//        try(DataInputStream inputData = new DataInputStream(new FileInputStream("dataBin.bin"))){
//            System.out.println(inputData.readUTF());
//            System.out.println(inputData.readUTF());
//            System.out.println(inputData.readUTF());
//        }
//        catch (IOException ex){
//            System.out.println(ex.getMessage());
//        }
        File catalog = new File("D:\\Java_magic\\");
        if (catalog.createNewFile()){
            System.out.println("Создан новый файл " + catalog.getName());
        }
//        if (catalog.delete()){
//            System.out.println("Удалён файл" + catalog.getName());
//        }
        if (catalog.exists()){
            System.out.println("Полный путь до файла " + catalog.getName()+ ": " + catalog.getAbsolutePath());
        }
        String[] files = catalog.list();
        System.out.println(Arrays.toString(files));

    }
}

