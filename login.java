package com.example.newinsta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.login);
        EditText Name=findViewById (R.id.e1);
        EditText password=findViewById (R.id.e2);
        Button b=findViewById (R.id.b1);
        String name="Keerthika";
        String pass="Keerthi@18";
        b.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                if (name.matches (Name.getText ().toString ()) && pass.matches (password.getText ().toString ())) {
                    Intent i = new Intent (login.this, home.class);
                    startActivity (i);
                } else {
                    Toast.makeText (login.this, "Open agala", Toast.LENGTH_SHORT).show ();
                }
            }
        });

    }
}
