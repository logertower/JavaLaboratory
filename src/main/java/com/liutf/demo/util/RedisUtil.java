package com.liutf.demo.util;/**
 * Created by ltf on 2018-06-17.
 */

import java.util.Map;

/**
 * @author ltf
 * @create 2018-06-17 上午 11:14
 */
public interface RedisUtil {

    int set(String key, Object value);

    int hset(String key, String field, Object value);

    int hmset(String key, Map<String, Object> fieldAndValue);
}
