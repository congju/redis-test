package com.sky.redis_test;

import redis.clients.jedis.Jedis;

/**
 * Redis 测试
 * @author sky0980
 *
 */
public class RedisTest {

	public static void main(String[] args) {

		//192.168.0.201 为虚拟机ip
		Jedis jedisClient = new Jedis("192.168.0.201",6379);
		jedisClient.auth("password");
		System.out.println(jedisClient.ping());
		
		jedisClient.set("name", "root");
		System.out.println(jedisClient.get("name"));
	}
}
