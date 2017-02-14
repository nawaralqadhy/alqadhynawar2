package com.example.nawaralqadhy.alqadhynawar2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import com.example.nawaralqadhy.alqadhynawar2.util.UtilLog;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends BaseActivity {

    private ImageButton bt1;
    private ImageButton bt3;

    @OnClick(R.id.bt2)
    public void button2Click(){
        toActivity(DialogActivity.class);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initialView();
        initialListener();
        ButterKnife.bind(this);
    }




    private void initialView(){

        bt1 = (ImageButton) findViewById(R.id.bt1);
        bt3 = (ImageButton) findViewById(R.id.bt3);

    }

    private void initialListener(){

        bt1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Toast.makeText(v.getContext(), "Button 1 was clicked", Toast.LENGTH_LONG).show();
                Intent intent = new Intent (v.getContext(),ViewPagerActivity.class);
                startActivity(intent);
            }

        });
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toActivity(ListViewActivity.class);
//                Intent intent = new Intent(v.getContext(),ListViewActivity.class);
//                startActivity(intent);

            }
        });
    }

    public void onClick(View v){
      //  Toast.makeText(this, "Button 2 was clicked", Toast.LENGTH_LONG).show();
        toastLong("Button2 was Clicked");
        UtilLog.logD("testD" , "Toast");
       // Log.e("testD" , "Toast");
        //Log.i("testD" , "Toast");
        //Log.v("testD" , "Toast");
        // Log.w("testD" , "Toast");
    }
}
