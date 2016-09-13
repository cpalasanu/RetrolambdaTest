package com.orange.retrolambdatest;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends ParentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        findViewById(R.id.button_child).setOnClickListener(view -> Toast.makeText(this, "Child onClick", Toast.LENGTH_LONG).show());
    }

    @Override
    public int getContentView() {
        return R.layout.activity_main;
    }
}
