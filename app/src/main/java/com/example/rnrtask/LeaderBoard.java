package com.example.rnrtask;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link LeaderBoard#newInstance} factory method to
 * create an instance of this fragment.
 */
public class LeaderBoard extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public LeaderBoard() {
        // Required empty public constructor
    }

   ArrayList<MyListData> myListData = new ArrayList<>();
    /*new MyListData[]{
            ,
            ,
           ,
            ,
            ,
            ,
            ,
            ,
           ,

    };
*/
    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *

     * @return A new instance of fragment LeaderBoard.
     */
    // TODO: Rename and change types and number of parameters
    public static LeaderBoard newInstance() {
        LeaderBoard fragment = new LeaderBoard();
        Bundle args = new Bundle();

        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        myListData.add(new MyListData("Divya", "2000", R.drawable.u1));
        myListData.add(new MyListData("Sharang", "1700", R.drawable.u2));
        myListData.add( new MyListData("Abhijit", "1600", R.drawable.u3));
        myListData.add(new MyListData("Anjali", "1500", R.drawable.u4));
        myListData.add(new MyListData("Akshara", "1400", R.drawable.u5));
        myListData.add(new MyListData("Soni", "1300", R.drawable.u6));
        myListData.add(new MyListData("Deepa", "1200", R.drawable.u7));
        myListData.add(new MyListData("Gautam", "1100", R.drawable.u8));
        myListData.add( new MyListData("Manjeet", "1000", R.drawable.u9));
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }


    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_leader_board, container, false);



        ImageView imageView = view.findViewById(R.id.u1);
        ImageView imageView2 = view.findViewById(R.id.u2);
        ImageView imageView3 = view.findViewById(R.id.u3);

        TextView name1 = view.findViewById(R.id.name1);
        TextView name2 = view.findViewById(R.id.name2);
        TextView name3 = view.findViewById(R.id.name3);

        TextView points1 = view.findViewById(R.id.points1);
        TextView points2 = view.findViewById(R.id.points2);
        TextView points3 = view.findViewById(R.id.points3);

       /* Glide.with(context)
                .load(url)
                .circleCrop()
                .into(imageView);*/
        imageView.setImageResource(myListData.get(0).getImgId());
        imageView2.setImageResource(myListData.get(1).getImgId());
        imageView3.setImageResource(myListData.get(2).getImgId());

        name1.setText(myListData.get(0).getName());
        name2.setText(myListData.get(1).getName());
        name3.setText(myListData.get(2).getName());
        points1.setText(myListData.get(0).getPoints());
        points2.setText(myListData.get(1).getPoints());
        points3.setText(myListData.get(2).getPoints());

        RecyclerView recyclerView = view.findViewById(R.id.rview);
        MyListAdapter adapter = new MyListAdapter(myListData);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(adapter);
        return view;
    }

}