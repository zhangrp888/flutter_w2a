package com.huntmobi.web2app.bean;

import java.util.List;
import com.alibaba.fastjson.annotation.JSONField;

public class eventpostinfo {

    @JSONField(name = "event_id")
    private String event_id;
    @JSONField(name = "event_name")
    private String event_name;

    public CustomrData getCustom_data() {
        return custom_data;
    }

    public void setCustom_data(CustomrData custom_data) {
        this.custom_data = custom_data;
    }
    @JSONField(name = "custom_data")
    private CustomrData custom_data;
    @JSONField(name = "w2a_data_encrypt")
    private String w2a_data_encrypt;

    public String getEvent_id() {
        return event_id;
    }

    public void setEvent_id(String event_id) {
        this.event_id = event_id;
    }

    public String getEvent_name() {
        return event_name;
    }

    public void setEvent_name(String event_name) {
        this.event_name = event_name;
    }



    public String getW2a_data_encrypt() {
        return w2a_data_encrypt;
    }

    public void setW2a_data_encrypt(String w2a_data_encrypt) {
        this.w2a_data_encrypt = w2a_data_encrypt;
    }

    public static class CustomrData {
        @JSONField(name = "event_id")
        private String event_id;
        @JSONField(name = "event_name")
        private String event_name;
        @JSONField(name = "currency")
        private String currency;
        @JSONField(name = "value")
        private String value;
        @JSONField(name = "content_type")
        private String content_type;
        @JSONField(name = "content_ids")
        private List<String> content_ids;

        public String getEvent_id() {
            return event_id;
        }

        public void setEvent_id(String event_id) {
            this.event_id = event_id;
        }

        public String getEvent_name() {
            return event_name;
        }

        public void setEvent_name(String event_name) {
            this.event_name = event_name;
        }

        public String getCurrency() {
            return currency;
        }

        public void setCurrency(String currency) {
            this.currency = currency;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        public String getContent_type() {
            return content_type;
        }

        public void setContent_type(String content_type) {
            this.content_type = content_type;
        }

        public List<String> getContent_ids() {
            return content_ids;
        }

        public void setContent_ids(List<String> content_ids) {
            this.content_ids = content_ids;
        }
    }
}
