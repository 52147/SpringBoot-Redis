package com.example.springbootredispracticedemo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;
public class RedisUtils {
    private RedisTemplate<String, String> redisTemplate;

    /**
     * 讀取緩存
     * @param key
     * @return
     */
    public String get(final String key){
        return redisTemplate.opsForValue().get(key);
    }

    /**
     * 寫入緩存
     * @param key
     * @param value
     * @return
     */
    public boolean set(final String key, String value){
        boolean result = false;
        try{
            redisTemplate.opsForValue().set(key, value);
            result = true;
        }catch(Exception e){
            e.printStackTrace();
        }
        return result;
    }

    /**
     * 更新緩存
     * @param key
     * @param value
     * @return
     */
    public boolean getAndSet(final String key, String value){
        boolean result = false;
        try{
            redisTemplate.opsForValue().getAndSet(key, value);
            result = true;
        }catch(Exception e){
            e.printStackTrace();
        }
        return result;
    }

    /**
     * 刪除緩存
     * @param key
     * @return
     */
    public boolean delete(final String key){
        boolean result = false;
        try{
            redisTemplate.delete(key);
            result = true;
        }catch(Exception e){
            e.printStackTrace();
        }
        return result;
    }

}
