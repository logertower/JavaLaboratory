package com.liutf.demo.util;/**
 * Created by ltf on 2018-06-17.
 */

import java.util.Map;

/**
 * java序列化redis工具
 *
 * @author ltf
 * @create 2018-06-17 上午 11:10
 */
public class RedisUtilForJavaSerializable implements RedisUtil {

    @Override
    public int set(String key, Object value) {

        //try {
        //
        //}catch (Jedids){
        //
        //}finally {
        //
        //}

        return 0;
    }

    @Override
    public int hset(String key, String field, Object value) {
        return 0;
    }

    @Override
    public int hmset(String key, Map<String, Object> fieldAndValue) {
        return 0;
    }
}
