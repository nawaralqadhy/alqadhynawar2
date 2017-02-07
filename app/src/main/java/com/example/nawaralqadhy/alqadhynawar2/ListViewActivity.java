package com.example.nawaralqadhy.alqadhynawar2;

import android.os.Bundle;
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

import java.util.ArrayList;

public class ListViewActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private ListView listView;
    private ArrayList<String> listResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        listResult = new ArrayList<String>();
        creatFakeResult();
        initialView();
    }
    private void  creatFakeResult(){
        listResult.add("A");
        listResult.add("B");
        listResult.add("C");
        listResult.add("D");
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
        View view  = getLayoutInflater().inflate(R.layout.list_view_header,null);

        LinearLayout listViewHeader = (LinearLayout) view.findViewById(R.id.list_view_header);
        ListViewAdapter listViewAdapter = new ListViewAdapter(this,listResult);
        listView.addHeaderView((listViewHeader));
        TextView tv = new TextView(this);
        tv.setText("We have no more content");
        tv.setTextSize(28);
        tv.setGravity(Gravity.CENTER);
        listView.addFooterView(tv);

        listView.setAdapter(listViewAdapter);
        listView.setOnItemClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(this,"Listview was clicked at position:"+position,Toast.LENGTH_LONG);
        Log.d("testD",String.valueOf(position));
    }
}
