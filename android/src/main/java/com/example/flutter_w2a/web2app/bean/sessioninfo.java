package com.huntmobi.web2app.bean;
import com.alibaba.fastjson.annotation.JSONField;

public class sessioninfo {
    @JSONField(name = "w2a_data_encrypt")
    private String w2a_data_encrypt;
    @JSONField(name = "device_id")
    private DeviceId device_id;

    public String getW2a_data_encrypt() {
        return w2a_data_encrypt;
    }

    public void setW2a_data_encrypt(String w2a_data_encrypt) {
        this.w2a_data_encrypt = w2a_data_encrypt;
    }

    public DeviceId getDevice_id() {
        return device_id;
    }

    public void setDevice_id(DeviceId device_id) {
        this.device_id = device_id;
    }

    public static class DeviceId {
        @JSONField(name = "imei")
        private String imei;
        @JSONField(name = "android_ID")
        private String android_ID;
        @JSONField(name = "advertiser_ID")
        private String advertiser_ID;
        @JSONField(name = "idfv")
        private String idfv;
        @JSONField(name = "idfa")
        private String idfa;

        public String getImei() {
            return imei;
        }

        public void setImei(String imei) {
            this.imei = imei;
        }

        public String getAndroid_ID() {
            return android_ID;
        }

        public void setAndroid_ID(String android_ID) {
            this.android_ID = android_ID;
        }

        public String getAdvertiser_ID() {
            return advertiser_ID;
        }

        public void setAdvertiser_ID(String advertiser_ID) {
            this.advertiser_ID = advertiser_ID;
        }

        public String getIdfv() {
            return idfv;
        }

        public void setIdfv(String idfv) {
            this.idfv = idfv;
        }

        public String getIdfa() {
            return idfa;
        }

        public void setIdfa(String idfa) {
            this.idfa = idfa;
        }
    }
}
