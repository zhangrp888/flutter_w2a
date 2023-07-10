package com.huntmobi.web2app.bean;
import com.alibaba.fastjson.annotation.JSONField;

public class landingreadresponseinfo {
    @JSONField(name = "w2a_data_encrypt")
    private String w2a_data_encrypt;

    public String getW2a_data_encrypt() {
        return w2a_data_encrypt;
    }

    public void setW2a_data_encrypt(String w2a_data_encrypt) {
        this.w2a_data_encrypt = w2a_data_encrypt;
    }
}
