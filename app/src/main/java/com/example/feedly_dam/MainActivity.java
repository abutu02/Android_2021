package com.example.feedly_dam;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btnLogin;
    private Button btnRegister;
    private final int MainActivityRequest = 100;
    private TextView tvUser;
    private TextView tvPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLogin = findViewById(R.id.button);


        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Succesful login!", Toast.LENGTH_LONG).show();

            }

        });

        btnRegister = findViewById(R.id.button2);
        tvUser = findViewById(R.id.tvUser);
        tvPass = findViewById(R.id.tvPass);
        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                //          startActivity(intent);
                startActivityForResult(intent, MainActivityRequest);
            }
        });
    }

   // @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == MainActivityRequest) {
            if (requestCode == RESULT_OK) {
                if (data != null) {
                    Bundle newBundle = data.getBundleExtra("raspBundle");
                    Persoana prs = (Persoana) newBundle.getSerializable("pers");
                    tvUser.setText(prs.getUser());
                    tvPass.setText(prs.getParola());


                }
            }
        }
    }
}