package com.example.helloworld12;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private EditText edtName;

    private EditText edtPassword;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        edtName= findViewById(R.id.edtName);
        edtPassword= findViewById(R.id.edtPassword);
        
    }

    public void btnSubmitOnClick(View view) {

        String name = edtName.getText().toString();
        String pass = edtPassword.getText().toString();

        String msg = "name: "+name+ " ,pass: "+pass;
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();

    }
}