package com.jay.supportlibrarydemo;

import android.app.Activity;
import android.content.Intent;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

/**
 * Created by Q.Jay on 2016/4/30 15:21
 *
 * @version 1.0.0
 */
public class SimpleActivity extends AppCompatActivity {

    public void openActivity(Class<? extends Activity> cls) {
        startActivity(new Intent(this, cls));
    }

    public void setOnClickListener(View.OnClickListener listener,@IdRes int... ids) {
        for (int id : ids) {
            findViewById(id).setOnClickListener(listener);
        }
    }
    public void toast(String text){
        Toast.makeText(SimpleActivity.this, text, Toast.LENGTH_SHORT).show();
    }
}
