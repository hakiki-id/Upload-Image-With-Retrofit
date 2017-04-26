package com.hakiki95.uploadimage.Model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by hakiki95 on 4/26/2017.
 */

public class ResponseApiModel {
    @SerializedName("kode")
    String kode;
    @SerializedName("pesan")
    String pesan;

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getPesan() {
        return pesan;
    }

    public void setPesan(String pesan) {
        this.pesan = pesan;
    }
}
