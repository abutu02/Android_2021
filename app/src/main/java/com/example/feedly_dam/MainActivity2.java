package com.example.feedly_dam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Date;

public class MainActivity2 extends AppCompatActivity {

    private Button btnRegister;
    private EditText etNume;
    private EditText etPrenume;
    private EditText etData;
    private EditText etMail;
    private EditText etUser;
    private EditText etPass;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        btnRegister = findViewById(R.id.btn_reg);
        etNume = findViewById(R.id.etNume);
        etPrenume = findViewById(R.id.etPrenume);
        etData = findViewById(R.id.etData);
        etMail = findViewById(R.id.etMail);
        etUser = findViewById(R.id.etUser);
        etPass = findViewById(R.id.etPassword);

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isValid()) {
                    Persoana p1 = new Persoana();
                    p1.setNume(etNume.getText().toString());
                    p1.setPrenume(etPrenume.getText().toString());
                    p1.setDataNasterii(etData.getText().toString());
                    p1.setMail(etMail.getText().toString());
                    p1.setUser(etUser.getText().toString());
                    p1.setParola(etPass.getText().toString());

                    Toast.makeText(MainActivity2.this, p1.toString(), Toast.LENGTH_SHORT).show();

                    Bundle wrapperObj =new Bundle();
                    wrapperObj.putSerializable("pers",p1);
                    Intent intent=new Intent();
                    intent.putExtra("raspBundle",wrapperObj);

                    setResult(RESULT_OK,intent);

                    finish();
                }

            }
        });
    }

    boolean isEmailValid(CharSequence email) {
        return android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches();
    }

    private boolean isValid() {
        if (etNume.getText().toString().isEmpty()) {
            Toast.makeText(MainActivity2.this, "Last name is empty", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (etPrenume.getText().toString().isEmpty()) {
            Toast.makeText(MainActivity2.this, "First name is empty", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (etData.getText().toString().isEmpty()) {
            Toast.makeText(MainActivity2.this, "Date is empty", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (etMail.getText().toString().isEmpty()) {
            Toast.makeText(MainActivity2.this, "Mail is empty", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (!(isEmailValid(etMail.getText().toString()))) {
            Toast.makeText(MainActivity2.this, "Mail is invalid", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (etUser.getText().toString().isEmpty()) {
            Toast.makeText(MainActivity2.this, "User is empty", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (etPass.getText().toString().isEmpty()) {
            Toast.makeText(MainActivity2.this, "Password is empty", Toast.LENGTH_SHORT).show();
            return false;
        }
        return true;
    }
}