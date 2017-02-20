package com.example.nawaralqadhy.alqadhynawar2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.nawaralqadhy.alqadhynawar2.adapter.ListViewAdapter;
import com.example.nawaralqadhy.alqadhynawar2.adapter.ViewPagerAdapter;
import com.example.nawaralqadhy.alqadhynawar2.fragment.page1;
import com.example.nawaralqadhy.alqadhynawar2.fragment.page2;
import com.example.nawaralqadhy.alqadhynawar2.fragment.page3;
import com.example.nawaralqadhy.alqadhynawar2.fragment.page4;
import com.example.nawaralqadhy.alqadhynawar2.fragment.page5;
import com.example.nawaralqadhy.alqadhynawar2.fragment.page6;
import com.example.nawaralqadhy.alqadhynawar2.fragment.page7;
import com.example.nawaralqadhy.alqadhynawar2.fragment.page8;

import java.util.ArrayList;

public class ListViewActivity extends AppCompatActivity implements AdapterView.OnItemClickListener{

    private ListView listView;
    private ArrayList<String> listResult;
    private ViewPager viewPager;
    private ArrayList<Fragment> fragmentList = new ArrayList<Fragment>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        listResult=new ArrayList<String>();
        createFakeResult();
        initialView();
    }

    private void createFakeResult(){
        listResult.add("AAAAAAAAAAAAAAAAAAA");
        listResult.add("BBBBBBBB");
        listResult.add("CCC");
        listResult.add("DDDDDDDDDDDDDDD");
        listResult.add("E");
        listResult.add("F");
        listResult.add("G");
        listResult.add("H");
        listResult.add("I");
        listResult.add("J");
        listResult.add("K");
        listResult.add("L");
        listResult.add("M");
        listResult.add("N");
        listResult.add("O");
        listResult.add("P");
        listResult.add("Q");

    }
    private void initialView() {
        listView = (ListView) findViewById(R.id.list_view);
        ListViewAdapter listViewAdapter = new ListViewAdapter(this,listResult);

        View view= getLayoutInflater().inflate(R.layout.list_view_header,null);
        LinearLayout listViewHeader=(LinearLayout) view.findViewById(R.id.list_view_header);



        viewPager=(ViewPager) view.findViewById(R.id.pager_header);
        fragmentList.add(new page1());
        fragmentList.add(new page2());
        fragmentList.add(new page3());
        fragmentList.add(new page4());
        fragmentList.add(new page5());
        fragmentList.add(new page6());
        fragmentList.add(new page7());
        fragmentList.add(new page8());

        ViewPagerAdapter viewPagerAdapter= new ViewPagerAdapter(this.getSupportFragmentManager());
        viewPagerAdapter.setContent(fragmentList);
        viewPager.setAdapter(viewPagerAdapter);
        listView.addHeaderView(listViewHeader);


//





        TextView tv = new TextView(this);
        tv.setText("We have no more content.");
        tv.setTextSize(28);
        tv.setGravity(Gravity.CENTER);
        listView.addFooterView(tv);

        listView.setAdapter(listViewAdapter);
        listView.setOnItemClickListener(this);
    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(this,"listView was created at posiion: "+position,Toast.LENGTH_LONG).show();
        Log.d("textListViewActivity",String.valueOf(position));

    }

    @Override
    public void onBackPressed() {
        Intent intent =new Intent();
        intent.putExtra("message","ListView");
        setResult(RESULT_OK,intent);
        super.onBackPressed();
    }
}