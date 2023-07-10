package com.huntmobi.web2app.bean;
import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

public class advinfo {
    @JSONField(name = "adv_data")
    private List<String> adv_data;

    public List<String> getAdv_data() {
        return adv_data;
    }

    public void setAdv_data(List<String> adv_data) {
        this.adv_data = adv_data;
    }
}
