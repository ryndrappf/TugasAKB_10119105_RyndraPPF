package ryndra.ppf.tugasakb_10119105_ryndrappf;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

    }

    public void toMain(View view) {
        Intent intent = new Intent(Login.this, MainActivity.class);
        startActivity(intent);

    }
    public void toRegister(View view) {
        Intent intent = new Intent(Login.this, Register.class);
        startActivity(intent);
    }
}