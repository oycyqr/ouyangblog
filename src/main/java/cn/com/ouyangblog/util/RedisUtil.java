package cn.com.ouyangblog.util;

import org.springframework.stereotype.Component;

//import org.springframework.data.redis.core.RedisTemplate;
//import org.springframework.data.redis.serializer.JdkSerializationRedisSerializer;
//import org.springframework.data.redis.serializer.RedisSerializer;
//import org.springframework.data.redis.serializer.StringRedisSerializer;

@Component
public class RedisUtil {
/*
    @Autowired
private static RedisTemplate redisTemplate;

    @Autowired(required = false)
    public void setRedisTemplate(RedisTemplate redisTemplate) {
        final RedisSerializer<String> string = new StringRedisSerializer();
        final JdkSerializationRedisSerializer jdk = new JdkSerializationRedisSerializer();
        redisTemplate.setKeySerializer(string);
        redisTemplate.setValueSerializer(jdk);
        redisTemplate.setHashKeySerializer(string);
        redisTemplate.setHashValueSerializer(jdk);
        this.redisTemplate = redisTemplate;
    }

    *//**
     * 批量删除缓存
     *
     * @param keys
     *//*
    public static void remove(final String... keys) {
        for (String key : keys) {
            remove(key);
        }
    }

    *//**
     * 批量删除缓存(通配符)
     *
     * @param pattern
     *//*
    public static void removePattern(final String pattern) {
        Set<Serializable> keys = redisTemplate.keys(pattern);
        if (keys.size() > 0)
            redisTemplate.delete(keys);
    }

    *//**
     * 删除缓存
     *
     * @param key
     *//*
    public static Boolean remove(final String key) {
        if (exists(key)) {
            try {
                redisTemplate.delete(key);
                return true;
            } catch (Exception e) {
                return false;
            }
        }
        return false;
    }

    *//**
     * 判断缓存中是否有对应的value
     *
     * @param key
     * @return
     *//*
    public static boolean exists(final String key) {
        return redisTemplate.hasKey(key);
    }

    *//**
     * 读取缓存
     *
     * @param key
     * @return
     *//*
    public static Object get(final String key) {
        return redisTemplate.opsForValue().get(key);
    }

    *//**
     * 根据通配符获取keys
     *
     * @param pattern
     *//*
    public static Set<Serializable> getKeysPattern(final String pattern) {
        if (redisTemplate.keys(pattern) != null) {
            return (HashSet) redisTemplate.keys(pattern);
        }
        return null;
    }

    *//**
     * 写入缓存
     *
     * @param key
     * @param value
     * @return
     *//*
    public static boolean set(final String key, Object value) {
        try {
            redisTemplate.opsForValue().set(key, value);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    *//**
     * 写入缓存(可以配置过期时间)
     *
     * @param key
     * @param value
     * @param expireTime
     * @return
     *//*
    public static boolean set(final String key, Object value, Long expireTime) {
        try {
            redisTemplate.opsForValue().set(key, value);
            redisTemplate.expire(key, expireTime, TimeUnit.SECONDS);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    *//**
     * 设置过期时长
     *
     * @param key
     * @param timeout
     *//*
    public static Boolean setExpireByKey(final String key, Long timeout, TimeUnit timeUnit) {
        if (exists(key)) {
            return redisTemplate.expire(key, timeout, timeUnit);
        }
        return false;
    }

    *//**
     * 设置过期时长
     * getExpire(keyset)
     *//*
    public static Long getExpireByKey(final String key) {
        if (exists(key)) {
            return redisTemplate.getExpire(key);
        }
        return 0L;
    }*/
}