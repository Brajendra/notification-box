package com.todo.util;

import androidx.room.TypeConverter;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.Date;
import java.util.Map;

public class MapTypeConverter {

    @TypeConverter
    public static Map<String, String> toMap(String value) {
        if (value == null) {
            return null;
        }
        Type empMapType = new TypeToken<Map<String, String>>() {
        }.getType();
        return new Gson().fromJson(value, empMapType);
    }

    @TypeConverter
    public static String fromMap(Map<String, String> map) {
        if (map == null) {
            return null;
        }
        return new Gson().toJson(map);
    }
}
