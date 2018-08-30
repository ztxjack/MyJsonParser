package MyJsonParser;

import java.io.*;

/**
 * Created by ztx on 2018/8/31.
 *
 * https://blog.csdn.net/liudsl/article/details/79701774
 */
public class ReadJson {
    public static String largeFileIO(String fileName) {
        //读取文件
        BufferedReader br = null;
        StringBuffer sb = null;
        try {
            br = new BufferedReader(new InputStreamReader(new FileInputStream(fileName),"GBK")); //这里可以控制编码
            sb = new StringBuffer();
            String line = null;
            while((line = br.readLine()) != null) {
                sb.append(line);
            }
            return sb.toString();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                br.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return  sb.toString();

    }
}