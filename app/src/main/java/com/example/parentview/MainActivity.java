package com.example.parentview;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText username, password;
    private Button login;
    public static final String EXTRA_MASSAGE="com.example.parent view.MASSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username= (EditText) findViewById(R.id.editUsername);
        password= (EditText) findViewById(R.id.editPassword);
        login= (Button) findViewById(R.id.ButtonLogin);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ceklogin(v);
            }
        });

    }

    private void ceklogin (View v){
        String usernametext= username.getText().toString();
        String passwordtext= password.getText().toString();

        if (usernametext.equals("admin") && passwordtext.equals("admin")){
            //jika login berhasil
            Toast.makeText(getApplicationContext(), "LOGIN SUKSES",
                    Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(MainActivity.this, Main2Activity.class);
            intent.putExtra("username", username.getText().toString());
            startActivity(intent);
        }else {
            //jika login gagal
            AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
            builder.setMessage("Username atau Password Anda salah!")
                    .setNegativeButton("Retry", null).create().show();
        }
    }


}

