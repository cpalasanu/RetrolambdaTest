package com.orange.retrolambdatest;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public abstract class ParentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getContentView());
        findViewById(R.id.button_parent).setOnClickListener(view -> Toast.makeText(this, "Parent onClick", Toast.LENGTH_LONG).show());
    }

    public abstract int getContentView();
}
