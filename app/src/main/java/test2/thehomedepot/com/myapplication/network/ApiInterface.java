package test2.thehomedepot.com.myapplication.network;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by lalithbhaskar on 2/23/18.
 */

public interface ApiInterface {
    @GET("search")
    Call<test2.thehomedepot.com.myapplication.model.Response> getResult(@Query("keyword") String keyword, @Query("storefilter") String filter, @Query("storeid") String id, @Query("pagesize")
            String size, @Query("startindex") String index, @Query("show") String show, @Query("type") String json, @Query("channel") String channel, @Query("key") String key);
}
