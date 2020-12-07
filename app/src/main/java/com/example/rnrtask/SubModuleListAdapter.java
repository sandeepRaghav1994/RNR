package com.example.rnrtask;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;

class SubModuleListAdapter extends RecyclerView.Adapter<SubModuleListAdapter.ViewHolder> {
private SubModuleListData[] listdata;
private SubModuleActivity activity;
private int position;
    private OnItemClicked onClick;

// RecyclerView recyclerView;

public SubModuleListAdapter(SubModuleListData[] listdata,SubModuleActivity activity) {

        this.listdata = listdata;
        this.activity = activity;
        }
@Override
public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem= layoutInflater.inflate(R.layout.list_item_submodule, parent, false);
        ViewHolder viewHolder = new ViewHolder(listItem);
        return viewHolder;
        }

@Override
public void onBindViewHolder(ViewHolder holder, final int position) {

this.position=position;
final SubModuleListData myListData = listdata[position];


        holder.title.setText(listdata[position].getTitle());
        holder.subtitle.setText(listdata[position].getSubtilte());
        holder.imageView.setImageResource(listdata[position].getImgId());

    holder.rl.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            onClick.onItemClick(position);
        }
    });

     /*   holder.rl.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View view) {
*//*
    if (position==0){

        Intent intent = new Intent(context, SubModuleActivity.class);
        startActivity(intent);
    }*//*



       //start another activity
   // Toast.makeText(view.getContext(),"click on item: ", Toast.LENGTH_LONG).show();

        }
        });*/

        }


@Override
public int getItemCount() {
        return listdata.length;
        }



    public interface OnItemClicked {
        void onItemClick(int position);
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
    public ImageView imageView;
    public TextView title;
    public TextView subtitle;
    public RelativeLayout rl;
    public final Context context;

    public ViewHolder(View itemView) {
        super(itemView);
        this.context = itemView.getContext();
        this.imageView = (ImageView) itemView.findViewById(R.id.img);
        this.title = (TextView) itemView.findViewById(R.id.title);
        this.subtitle = (TextView) itemView.findViewById(R.id.subtitle);
        this.rl = (RelativeLayout) itemView.findViewById(R.id.rl_submodule);

    }
}

    public void setOnClick(OnItemClicked onClick)
    {
        this.onClick=onClick;
    }
}
