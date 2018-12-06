package com.liutf.demo.demoTest;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.apache.commons.lang3.math.NumberUtils;

import java.lang.reflect.Array;
import java.util.*;

/**
 * @author ltf
 * @create 2018-11-30 11:00
 */
public class DemoTest {

    public static void main(String[] args) {
        //JSONArray array = new JSONArray();
        //
        //for (int i = 0; i < 5; i++) {
        //    JSONObject obj = new JSONObject();
        //
        //    obj.put("num",i+1);
        //
        //    array.add(obj);
        //}
        //
        //System.out.println(array.subList(0, 4));

        //Map<String,Boolean> map = new HashMap<>();
        //
        //try {
        //    if(map.get("test")){}
        //}catch (Exception e){
        //    e.printStackTrace();
        //}
        //String[] strings = new String[]{"test1", "test2"};
        ////List<String> propertyTypeEnums = Arrays.asList(strings);
        //List<String> propertyTypeEnums = new ArrayList<String>(Arrays.asList(strings));
        //try {
        //    propertyTypeEnums.add("test3");
        //} catch (Exception e) {
        //    e.printStackTrace();
        //}


        JSONObject json = new JSONObject();
        Test test = new Test();
        test.setNum(null);
        try {
            //json.put("key", test == null ? 0 : test.getNum());
            //Integer i = (test == null ? 0 : test.getNum());
            //int i = test.getNum();
            boolean b = 0 == test.getNum();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class Test{
    private Integer num;

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }
}
