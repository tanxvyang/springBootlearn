package com.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonUtils {
    //定义Jackson对象
    private static ObjectMapper objectMapper = new ObjectMapper();
    public static String objectToJson(Object o){
        try {
            String jsonString = objectMapper.writeValueAsString(o);
            return jsonString;
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static <T> T JsonToObject(String jsonString,Class<T> clazz){
        try {
           return objectMapper.readValue(jsonString,clazz);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;
    }

}
