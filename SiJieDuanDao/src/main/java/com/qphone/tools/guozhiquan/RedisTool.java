package com.qphone.tools.guozhiquan;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

//redis的工具类
public class RedisTool {

	private static String ADDR_ARRAY = "localhost";

	// redis服务器端口
	private static int PORT = 6379;

	// 等待可用连接的最大时间，单位毫秒，默认值为-1，表示永不超时。如果超过等待时间，则直接抛出JedisConnectionException；
	private static int MAX_WAIT = 5000;

	// 可用连接实例的最大数目，默认值为8；
	// 如果赋值为-1，则表示不限制；如果pool已经分配了maxActive个jedis实例，则此时pool的状态为exhausted(耗尽)。
	private static int MAX_ACTIVE = 10;

	// 控制一个pool最多有多少个状态为idle(空闲的)的jedis实例，默认值也是8。
	private static int MAX_IDLE = 10;

	// redis连接池
	private static JedisPool jedisPool = null;

	
	
	

	// 初始化redis连接池
	static {
		try {

			JedisPoolConfig poolConfig = new JedisPoolConfig();

			// 最大待机数
			poolConfig.setMaxIdle(MAX_IDLE);
			// 最大数量
			poolConfig.setMaxTotal(MAX_ACTIVE);
			// 最大等待时间
			poolConfig.setMaxWaitMillis(MAX_WAIT);

			jedisPool = new JedisPool(poolConfig, ADDR_ARRAY, PORT);
			

		} catch (Exception e) {
			System.out.println("Initialize JedisPool error : " + e);
			e.printStackTrace();
		}

	}
	
	
	
	//得到连接池
	public static Jedis getJedis(){
		
		Jedis jedis = null;
		
		try{
			
			if(jedisPool != null){
				
				jedis = jedisPool.getResource();
			}
			
			
			
		}catch(Exception e){
			
			
			
		}
		
		
		return jedis;
		
	}
	
	
	
	
	
	
	
	

}
