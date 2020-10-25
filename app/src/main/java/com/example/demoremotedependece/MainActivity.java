package com.example.demoremotedependece;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.demolibraryremote.InitialHomeActivity;

public class MainActivity extends AppCompatActivity {

    final String TAG = MainActivity.class.getSimpleName();
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupView();
        actions();
    }

    private void setupView() {
        btn = (Button) findViewById(R.id.btnGoToLibrary);

    }

    private void actions() {
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "== goToLibrary() ==");
                Intent intent = new Intent(getBaseContext(), InitialHomeActivity.class);
                startActivity(intent);
            }
        });
    }
}