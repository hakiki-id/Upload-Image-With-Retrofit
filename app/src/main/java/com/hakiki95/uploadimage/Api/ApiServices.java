package com.hakiki95.uploadimage.Api;

import com.hakiki95.uploadimage.Model.ResponseApiModel;

import okhttp3.MultipartBody;
import retrofit2.Call;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

/**
 * Created by hakiki95 on 4/26/2017.
 */

public interface ApiServices {

    @Multipart
    @POST("uploadimage.php")
    Call<ResponseApiModel> uploadImage (@Part MultipartBody.Part image);
}
