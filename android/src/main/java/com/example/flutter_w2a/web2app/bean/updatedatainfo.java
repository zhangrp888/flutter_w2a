package com.huntmobi.web2app.bean;
import com.alibaba.fastjson.annotation.JSONField;
public class updatedatainfo {
    @JSONField(name = "device_id")
    private DeviceId device_id;
    @JSONField(name = "em")
    private String em;
    @JSONField(name = "fb_login_id")
    private String fb_login_id;
    @JSONField(name = "external_id")
    private String external_id;

    public String getPh() {
        return ph;
    }

    public void setPh(String ph) {
        this.ph = ph;
    }
    @JSONField(name = "ph")
    private String ph;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getZp() {
        return zp;
    }

    public void setZp(String zp) {
        this.zp = zp;
    }

    public String getCt() {
        return ct;
    }

    public void setCt(String ct) {
        this.ct = ct;
    }

    public String getGe() {
        return ge;
    }

    public void setGe(String ge) {
        this.ge = ge;
    }

    public String getFn() {
        return fn;
    }

    public void setFn(String fn) {
        this.fn = fn;
    }

    public String getLn() {
        return ln;
    }

    public void setLn(String ln) {
        this.ln = ln;
    }

    public String getDb() {
        return db;
    }

    public void setDb(String db) {
        this.db = db;
    }
    @JSONField(name = "country")
    private String country;
    @JSONField(name = "zp")
    private String zp;
    @JSONField(name = "ct")
    private String ct;
    @JSONField(name = "ge")
    private String ge;
    @JSONField(name = "fn")
    private String fn;
    @JSONField(name = "ln")
    private String ln;
    @JSONField(name = "db")
    private String db;

    public String getSt() {
        return st;
    }

    public void setSt(String st) {
        this.st = st;
    }
    @JSONField(name = "st")
    private String st;
    @JSONField(name = "w2a_data_encrypt")
    private String w2a_data_encrypt;

    public DeviceId getDevice_id() {
        return device_id;
    }

    public void setDevice_id(DeviceId device_id) {
        this.device_id = device_id;
    }

    public String getEm() {
        return em;
    }

    public void setEm(String em) {
        this.em = em;
    }

    public String getFb_login_id() {
        return fb_login_id;
    }

    public void setFb_login_id(String fb_login_id) {
        this.fb_login_id = fb_login_id;
    }

    public String getExternal_id() {
        return external_id;
    }

    public void setExternal_id(String external_id) {
        this.external_id = external_id;
    }

    public String getW2a_data_encrypt() {
        return w2a_data_encrypt;
    }

    public void setW2a_data_encrypt(String w2a_data_encrypt) {
        this.w2a_data_encrypt = w2a_data_encrypt;
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
