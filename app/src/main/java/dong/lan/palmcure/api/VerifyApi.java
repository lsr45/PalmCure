package dong.lan.palmcure.api;

import dong.lan.palmcure.model.BaseData;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;


public interface VerifyApi {
    @FormUrlEncoded
    @POST("user/doctor/verify.php")
    Call<BaseData> verify(@Field("uid") String uid,@Field("idcard") String idcard);
}
