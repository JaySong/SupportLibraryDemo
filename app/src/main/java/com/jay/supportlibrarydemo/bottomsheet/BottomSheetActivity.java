package com.jay.supportlibrarydemo.bottomsheet;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomSheetBehavior;
import android.support.design.widget.BottomSheetDialog;
import android.view.View;

import com.jay.supportlibrarydemo.R;
import com.jay.supportlibrarydemo.SimpleActivity;

/**
 * Created by Q.Jay on 2016/4/30 15:27
 *
 * @version 1.0.0
 */
public class BottomSheetActivity extends SimpleActivity implements View.OnClickListener {
    private static final String TAG = "BottomSheetActivity";
    private BottomSheetBehavior<View> behavior;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bottom_sheet_activity);

        setOnClickListener(this, R.id.btnBehavior, R.id.btnDialog);

        View bottomSheet = findViewById(R.id.bottom_sheet);
        if (bottomSheet != null) {
            behavior = BottomSheetBehavior.from(bottomSheet);
            behavior.setState(BottomSheetBehavior.STATE_COLLAPSED);
        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnBehavior:
                int state = behavior.getState();
                if (state == BottomSheetBehavior.STATE_EXPANDED) {
                    behavior.setState(BottomSheetBehavior.STATE_COLLAPSED);
                } else if(state == BottomSheetBehavior.STATE_COLLAPSED){
                    behavior.setState(BottomSheetBehavior.STATE_HIDDEN);
                }else if(state == BottomSheetBehavior.STATE_HIDDEN){
                    behavior.setState(BottomSheetBehavior.STATE_EXPANDED);
                }
                break;
            case R.id.btnDialog:
                BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(this);
                bottomSheetDialog.setContentView(R.layout.include_bottom_sheet_layout);
                bottomSheetDialog.show();
                break;
        }
    }
}
