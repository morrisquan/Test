package com.qphone.tools.guozhiquan;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

//redis�Ĺ�����
public class RedisTool {

	private static String ADDR_ARRAY = "localhost";

	// redis�������˿�
	private static int PORT = 6379;

	// �ȴ��������ӵ����ʱ�䣬��λ���룬Ĭ��ֵΪ-1����ʾ������ʱ����������ȴ�ʱ�䣬��ֱ���׳�JedisConnectionException��
	private static int MAX_WAIT = 5000;

	// ��������ʵ���������Ŀ��Ĭ��ֵΪ8��
	// �����ֵΪ-1�����ʾ�����ƣ����pool�Ѿ�������maxActive��jedisʵ�������ʱpool��״̬Ϊexhausted(�ľ�)��
	private static int MAX_ACTIVE = 10;

	// ����һ��pool����ж��ٸ�״̬Ϊidle(���е�)��jedisʵ����Ĭ��ֵҲ��8��
	private static int MAX_IDLE = 10;

	// redis���ӳ�
	private static JedisPool jedisPool = null;

	
	
	

	// ��ʼ��redis���ӳ�
	static {
		try {

			JedisPoolConfig poolConfig = new JedisPoolConfig();

			// ��������
			poolConfig.setMaxIdle(MAX_IDLE);
			// �������
			poolConfig.setMaxTotal(MAX_ACTIVE);
			// ���ȴ�ʱ��
			poolConfig.setMaxWaitMillis(MAX_WAIT);

			jedisPool = new JedisPool(poolConfig, ADDR_ARRAY, PORT);
			

		} catch (Exception e) {
			System.out.println("Initialize JedisPool error : " + e);
			e.printStackTrace();
		}

	}
	
	
	
	//�õ����ӳ�
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
