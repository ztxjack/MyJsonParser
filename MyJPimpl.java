package MyJsonParser;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;

import java.util.ArrayList;

/**
 * Created by ztx on 2018/8/30.
 */
public class MyJPimpl {
//    //json字符串-简单对象型
//    private static final String JSON_OBJ_STR = "{\"studentName\":\"lily\",\"studentAge\":12}";
//    //json字符串-数组类型
//    private static final String JSON_ARRAY_STR = "[{\"studentName\":\"lily\",\"studentAge\":12},{\"studentName\":\"lucy\",\"studentAge\":15}]";
//    //复杂格式json字符串
//    private static final String COMPLEX_JSON_STR = "{\"teacherName\":\"crystall\",\"teacherAge\":27,\"course\":{\"courseName\":\"english\",\"code\":1270},\"students\":[{\"studentName\":\"lily\",\"studentAge\":12},{\"studentName\":\"lucy\",\"studentAge\":15}]}";

    //wafer json
//    private static final String waferjson = "[{\"waferId\":\"1\",\"dieList\":[{\"die_num\":\"23\",\"location_x\":\"12\",\"location_y\":\"5\",\"result\":\"1\"},{\"die_num\":\"9\",\"location_x\":\"2\",\"location_y\":\"5\",\"result\":\"0\"},{\"die_num\":\"19\",\"location_x\":\"3\",\"location_y\":\"7\",\"result\":\"0\"},{\"die_num\":\"8\",\"location_x\":\"4\",\"location_y\":\"15\",\"result\":\"1\"}]},{\"waferId\":\"2\",\"dieList\":[{\"die_num\":\"43\",\"location_x\":\"7\",\"location_y\":\"1\",\"result\":\"1\"},{\"die_num\":\"9\",\"location_x\":\"2\",\"location_y\":\"5\",\"result\":\"0\"},{\"die_num\":\"11\",\"location_x\":\"3\",\"location_y\":\"3\",\"result\":\"1\"},{\"die_num\":\"10\",\"location_x\":\"6\",\"location_y\":\"4\",\"result\":\"0\"}]}]";

    public Wafer[] Json2Object() {

        String filepath="data/a.json";
        String waferjson=ReadJson.largeFileIO(filepath);
//        System.out.println(waferjson);
        JSONArray jsonArray = JSON.parseArray(waferjson);
//        System.out.println(jsonArray.toString());
        int size = jsonArray.size();
        Wafer[] wf = new Wafer[size];
        for (int i = 0; i < size; i++) {
            String jsonObject = jsonArray.getJSONObject(i).toJSONString();
             wf[i] = JSON.parseObject(jsonObject, new TypeReference<Wafer>() {});
        }

        return wf;
//        System.out.println(wf[1]);
//        System.out.println("");


        }
    }
