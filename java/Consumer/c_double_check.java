package com.example.fd1.Consumer;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

public class c_double_check extends StringRequest {

    //서버 url 설정(php파일 연동)
    final static private String URL = "http://foodelicious.dothome.co.kr/double_check.php";
    private Map<String, String> map;

    public c_double_check(String c_id, Response.Listener<String>listener){
        super(Request.Method.POST,URL,listener,null);

        map = new HashMap<>();
        map.put("c_id",c_id);
    }

    @Override
    protected Map<String, String> getParams() throws AuthFailureError {
        return map;
    }
}
