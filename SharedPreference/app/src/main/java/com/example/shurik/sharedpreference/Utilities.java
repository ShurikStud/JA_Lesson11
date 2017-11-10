package com.example.shurik.sharedpreference;

import android.content.Context;
import android.content.SharedPreferences;

import com.google.gson.Gson;

/**
 * Created by shurik on 10.11.2017.
 */

public class Utilities {

    private static final String USER_ENTITY = "user_entity";

    public static void saveUserEntity(Context context, EntityUser entityUser){
        SharedPreferences sharedPreferences = context.getSharedPreferences(USER_ENTITY, Context.MODE_PRIVATE);
        SharedPreferences.Editor    editor  = sharedPreferences.edit();

        Gson gson   = new Gson();
        String json = gson.toJson(entityUser);

        editor.putString(USER_ENTITY, json);

        editor.commit();
    }

    public static EntityUser loadUserEntity(Context context){

        SharedPreferences sharedPreferences = context.getSharedPreferences(USER_ENTITY, Context.MODE_PRIVATE);
        Gson gson   = new Gson();

        String json = sharedPreferences.getString(USER_ENTITY, "");

        return gson.fromJson(json, EntityUser.class);
    }
}
