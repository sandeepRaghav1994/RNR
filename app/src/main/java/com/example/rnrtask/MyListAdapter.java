package com.example.rnrtask;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import androidx.recyclerview.widget.RecyclerView;

class MyListAdapter extends RecyclerView.Adapter<MyListAdapter.ViewHolder>{
private List<MyListData>  listdata;

// RecyclerView recyclerView;

public MyListAdapter(ArrayList<MyListData> listdata) {

   /* listdata.remove(0);
    listdata.remove(1);
    listdata.remove(2);*/

    List<MyListData> ll= listdata.subList(3,listdata.size()-1);
        this.listdata =  ll;

        }
@Override
public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem= layoutInflater.inflate(R.layout.list_item, parent, false);
        ViewHolder viewHolder = new ViewHolder(listItem);
        return viewHolder;
        }

@Override
public void onBindViewHolder(ViewHolder holder, int position) {

//final MyListData myListData = listdata[position];
        holder.rank.setText(String.valueOf(position+4));
        holder.name.setText(listdata.get(position).getName());
        holder.points.setText(listdata.get(position).getPoints());
        holder.imageView.setImageResource(listdata.get(position).getImgId());

       /* holder.relativeLayout.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View view) {
        Toast.makeText(view.getContext(),"click on item: "+myListData.getDescription(), Toast.LENGTH_LONG).show();
        }
        });*/

        }


@Override
public int getItemCount() {
        return listdata.size();
        }

public static class ViewHolder extends RecyclerView.ViewHolder {
    public ImageView imageView;
    public TextView rank;
    public TextView name;
    public TextView points;

    public ViewHolder(View itemView) {
        super(itemView);
        this.imageView = (ImageView) itemView.findViewById(R.id.img);
        this.rank = (TextView) itemView.findViewById(R.id.rank);
        this.name = (TextView) itemView.findViewById(R.id.name);
        this.points = (TextView) itemView.findViewById(R.id.points);

    }
}
}
