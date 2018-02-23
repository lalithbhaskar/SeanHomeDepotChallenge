package test2.thehomedepot.com.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import test2.thehomedepot.com.myapplication.model.Response;
import test2.thehomedepot.com.myapplication.network.ApiClient;
import test2.thehomedepot.com.myapplication.network.ApiInterface;

public class MainActivity extends AppCompatActivity {
    private List<Products> productslist;
    RecyclerView recyclerView;
    List<String> urls;
    RVAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.rv);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        apiCall();
    }
    /*private void initializeData(){
        productslist = new ArrayList<>();
        productslist.add(new Products("Item A", "label A", R.drawable.ic_launcher_background));
        productslist.add(new Products("Item B", "label B", R.drawable.ic_launcher_background));
        productslist.add(new Products("Item C", "label C", R.drawable.ic_launcher_background));
        productslist.add(new Products("Item D", "label D", R.drawable.ic_launcher_background));
        productslist.add(new Products("Item E", "label E", R.drawable.ic_launcher_background));
    }*/
    private void apiCall(){
        ApiInterface apiInterface = ApiClient.getClient().create(ApiInterface.class);
        Call<Response> call = apiInterface.getResult("hammer","all","6557","20","21",
                "searchreport,skus,","json","mobileconsumer","8GdxXVBsFAzhkvLfn78NLnzQkDZme0KW");
        call.enqueue(new Callback<Response>() {
            @Override
            public void onResponse(Call<Response> call, retrofit2.Response<Response> response) {
                Toast.makeText(MainActivity.this, response.body().getSkus().get(0).getInfo().getBrandName(), Toast.LENGTH_SHORT).show();
                productslist = new ArrayList<>();
                for(int i = 0; i < response.body().getSkus().size(); i++){
                    productslist.add(new Products(response.body().getSkus().get(i).getInfo().getBrandName(), response.body().getSkus().get(i).getInfo().getProductLabel(),
                            response.body().getSkus().get(i).getInfo().getImageUrl().replace("<SIZE>","300")));
                }
                Log.d("check",productslist.get(0).getPhotoId().toString());
                adapter = new RVAdapter(productslist,MainActivity.this);
                recyclerView.setAdapter(adapter);
            }
            @Override
            public void onFailure(Call<Response> call, Throwable t) {

            }
        });

    }
}
