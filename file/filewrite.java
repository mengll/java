import java.io.FileWriter;
import java.io.IOException;

public class MyFileWriter {
    public static void main(String[] args) {
        String filepath = "/Users/@@@/Desktop/mll.txt";
        FileWriter fw = null;
        try {
            fw = new FileWriter(filepath);
            fw.write("The word si so big as  you can do better!");
            fw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(fw != null) {
                    fw.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
