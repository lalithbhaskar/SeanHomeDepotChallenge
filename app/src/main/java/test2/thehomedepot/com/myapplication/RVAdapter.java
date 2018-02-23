package test2.thehomedepot.com.myapplication;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by lalithbhaskar on 2/23/18.
 */

public class RVAdapter extends RecyclerView.Adapter<RVAdapter.ProductViewHolder>{
    List<Products> persons;
    Context context;

    RVAdapter(List<Products> persons,Context context){

        this.persons = persons;
        this.context = context;
    }
    @Override
    public RVAdapter.ProductViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent,false);
        ProductViewHolder pvh = new ProductViewHolder(v);
        return pvh;
    }

    @Override
    public void onBindViewHolder(RVAdapter.ProductViewHolder holder, int position) {
            holder.productName.setText(persons.get(position).name);
            holder.productLabel.setText(persons.get(position).label);
            Picasso.with(context).load(persons.get(position).photoId).into(holder.productPhoto);
    }

    @Override
    public int getItemCount() {
        return persons.size();
    }

    public static class ProductViewHolder extends RecyclerView.ViewHolder {
        CardView cv;
        TextView productName;
        TextView productLabel;
        ImageView productPhoto;

        ProductViewHolder(View itemView) {
            super(itemView);
            cv = itemView.findViewById(R.id.cv);
            productName = (TextView)itemView.findViewById(R.id.product_name);
            productLabel = (TextView)itemView.findViewById(R.id.product_lable);
            productPhoto = (ImageView)itemView.findViewById(R.id.product_image);
        }
    }
}
