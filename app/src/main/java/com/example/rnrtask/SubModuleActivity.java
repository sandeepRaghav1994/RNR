package com.example.rnrtask;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Toast;

public class SubModuleActivity extends AppCompatActivity implements SubModuleListAdapter.OnItemClicked {


    SubModuleListData[] myListData = new SubModuleListData[]{
            new SubModuleListData("Why invest?", "Why you should invest in stock market?", R.drawable.sb1),
            new SubModuleListData("Basics of stock market.", "what you should see before investing?", R.drawable.sb2),
            new SubModuleListData("Finding greate companies.", "Where you should invest?", R.drawable.sb3),
            new SubModuleListData("Your investing life.", "Everithing you should know about investing.", R.drawable.sb4),
            new SubModuleListData("Gettinmg started", "How you should start investing?", R.drawable.sb5)

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_module);
       // getActionBar().hide();

       /* if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {

            getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                    WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        }*/
        RecyclerView recyclerView = findViewById(R.id.rviewSub);
        SubModuleListAdapter adapter = new SubModuleListAdapter(myListData,this);
        //recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
        adapter.setOnClick(SubModuleActivity.this);

        findViewById(R.id.img_back).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
    }

    @Override
    public void onItemClick(int position) {

        if(position==0){
            Intent intent = new Intent(SubModuleActivity.this,SubModuleViewpActivity.class);

            startActivity(intent);
        }else {

            Toast.makeText(this, "Under Development.", Toast.LENGTH_SHORT).show();
        }

    }

   /* @Override
    public void mClick(View v, int position) {

    }*/
}