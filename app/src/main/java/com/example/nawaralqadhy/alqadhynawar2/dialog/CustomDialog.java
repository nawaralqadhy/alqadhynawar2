package com.example.nawaralqadhy.alqadhynawar2.dialog;


import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;

import com.example.nawaralqadhy.alqadhynawar2.R;

import butterknife.ButterKnife;
import butterknife.OnClick;





public class CustomDialog extends Dialog {

    @OnClick(R.id.dialog_ok2)
    public void okClick(){
        listener.onClickListener();
        dismiss();
    }

    private ICustomDialogEventListener listener;

    public interface ICustomDialogEventListener{
        public void onClickListener();
    }


    public CustomDialog(@NonNull Context context, ICustomDialogEventListener listener) {
        super(context, R.style.dialog);
        this.listener = listener;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.custom_dialog);
        ButterKnife.bind(this);
    }
}