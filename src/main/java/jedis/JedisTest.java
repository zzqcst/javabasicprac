package jedis;

import org.apache.commons.pool2.impl.GenericObjectPoolConfig;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

public class JedisTest {

    public static void main(String[] args) {
        GenericObjectPoolConfig poolConfig = new GenericObjectPoolConfig();
        JedisPool jedisPool = new JedisPool(poolConfig, "202.199.6.2", 6379);
        Jedis jedis = null;
        try {
            jedis=jedisPool.getResource();
            System.out.println(jedis.get("hello"));
        } catch (Exception e) {
            e.printStackTrace();
            if (jedis != null) {
                jedis.close();
            }
        }
    }
}
