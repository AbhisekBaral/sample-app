package com.example.whatever;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.whatever.databinding.ActivityMainBinding;

import javax.security.auth.login.LoginException;

public
class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    private Button btn1;
    private Button btn2;
    private Button btnl1;
    private Button btnr;


    @Override
    protected
    void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(R.layout.activity_main);

        btn1=(Button)findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public
            void onClick(View v) {
                Toast.makeText(getApplicationContext(), "You got your Register Activity", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(MainActivity.this,RegisterActivity.class);
                startActivity(intent);

            }
        });

        btn2=(Button)findViewById(R.id.btnl1);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public
            void onClick(View v) {
                Toast.makeText(getApplicationContext(), "You got your Login Activity", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(MainActivity.this,LoginActivity.class);
                startActivity(intent);

            }
        });


    }
}