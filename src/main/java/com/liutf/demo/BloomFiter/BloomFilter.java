package com.liutf.demo.BloomFiter;

import com.google.common.collect.Sets;
import com.google.gson.JsonElement;
import orestes.bloomfilter.FilterBuilder;
import orestes.bloomfilter.HashProvider.HashMethod;
import orestes.bloomfilter.json.BloomFilterConverter;
import orestes.bloomfilter.redis.BloomFilterRedis;
import orestes.bloomfilter.redis.helper.RedisSentinelPoolBuilder;

public class BloomFilter {
    public static void main(String[] args) {
        BloomFilterRedis<String> bloomFilterRedis = new BloomFilterRedis<String>(
                new FilterBuilder(100000000, 0.0001D)
                        .hashFunction(HashMethod.Adler32)
                        .redisBacked(true)
                        .name("100")
                        .pool(new RedisSentinelPoolBuilder()
                                .master("byMaster8001")
                                .sentinels(Sets.newHashSet("192.168.96.98:28001"))
                                .redisConnections(1000)
                                .timeout(1000)
                                .database(1)
                                .build()
                        )
                        .overwriteIfExists(true) //存在则覆盖
                        .redisConnections(100).complete());
        JsonElement json = BloomFilterConverter.toJson(bloomFilterRedis);
        System.out.println(json);
//		System.out.println(bloomFilterRedis.add("haaehe"));
//		System.out.println(bloomFilterRedis.contains("hehe"));
        for (int i = 40; i < 60; i++) {
            System.out.println(bloomFilterRedis.add("hehe" + i));
            System.out.println(bloomFilterRedis.contains("hehe" + i));
        }
    }
}
