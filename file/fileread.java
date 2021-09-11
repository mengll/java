import java.io.FileReader;

public class MyFileReader {
    public static void main(String[] args) {
        String filePath = "/Users/@@@/Desktop/mll.txt";;
        FileReader fd =  null;
        char[] buf = new char[8];
        int readLen = 0;
        try {
            fd = new FileReader(filePath);
            while((readLen = fd.read(buf)) != -1){
                    System.out.println(new String(buf,0,readLen));
                    // 读取当前的文本内容不一定每次都是读取的8个字符
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                fd.close();
            }catch (Exception e){
                e.printStackTrace();  // 打印函数的调用栈
            }
        }
    }
}

