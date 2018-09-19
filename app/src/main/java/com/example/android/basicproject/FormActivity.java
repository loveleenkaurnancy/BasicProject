package com.example.android.basicproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.text.Normalizer;

public class FormActivity extends AppCompatActivity {

    Button button;
    EditText name,email,password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);

        
        button = findViewById(R.id.button);
        name = findViewById(R.id.name);
        email = findViewById(R.id.email);
        password = findViewById(R.id.password);



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String name1 = name.getText().toString();
                String email1 = email.getText().toString();
                String password1 = password.getText().toString();

                view = null;
                Boolean flag = false;

                if(TextUtils.isEmpty(name1))
                {
                    name.setError("This field is required");
                    view = name;
                    flag = true;
                }
                else if(TextUtils.isEmpty(email1))
                {
                    email.setError("This field is required");
                    view = email;
                    flag = true;
                }
                else if(TextUtils.isEmpty(password1))
                {
                    password.setError("This field is required");
                    view = password;
                    flag = true;
                }
                else
                {
                    Intent intent = new Intent(FormActivity.this, WebActivity.class);
                    startActivity(intent);
                }

            }
        });
    }
}
