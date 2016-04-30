package com.jay.supportlibrarydemo;

import android.os.Bundle;
import android.view.View;

import com.jay.supportlibrarydemo.bottomsheet.BottomSheetActivity;

@SuppressWarnings("ConstantConditions")
public class MainActivity extends SimpleActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btnBottomSheet).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnBottomSheet:
                openActivity(BottomSheetActivity.class);
                break;
        }
    }
}
