package com.pub.app.utility;

import com.alibaba.fastjson.JSONObject;
import com.google.gson.Gson;

import java.lang.reflect.Type;

public class JsonHelper {
    private JsonHelper(){}

    // 从一个对象信息生成Json串
    public static <T> String ObjectToJson(T t) {
        // 使用new方法
        Gson gson = new Gson();
        // toJson 将bean对象转换为json字符串
        return gson.toJson(t);
    }

    /// <summary>
    /// Json 反序列化
    /// </summary>
    /// <typeparam name="T"></typeparam>
    /// <param name="jsonString"></param>
    /// <returns></returns>
    public static <T> T JsonDeserialize(String jsonString,Class<T> classOfT){
        // 使用new方法
        Gson gson = new Gson();
        // 反序列化
        return gson.fromJson(jsonString,(Type)classOfT);
    }

    /// <summary>
    /// Json 反序列化
    /// </summary>
    /// <typeparam name="T"></typeparam>
    /// <param name="jsonString"></param>
    /// <returns></returns>
    public static <T> T JsonDeserialize(String jsonString,T t){
        // 使用new方法
        Gson gson = new Gson();
        // 反序列化
        return gson.fromJson(jsonString,(Type)t);
    }

    /// <summary>
     /// JSONObject 反序列化
     /// </summary>
     /// <param name="jsonString"></param>
     /// <returns>JSONObject</returns>
    public static JSONObject JsonDeserialize(String jsonString){
        return JSONObject.parseObject(jsonString);
    }

    /**
     * 复杂JSONObject到json格式字符串的转换
     */
    public String JSONObjectToJsonStr(JSONObject object) {
        return object.toJSONString();
    }

    /**
     * Object 转 JSONObject
     */
    public static JSONObject ObjectToJSONObject(Object object) {
        return JsonDeserialize(ObjectToJson(object));
    }
}
