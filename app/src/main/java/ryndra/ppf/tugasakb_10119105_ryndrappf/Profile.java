package ryndra.ppf.tugasakb_10119105_ryndrappf;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    public void toHome(View view) {
        Intent intent = new Intent(Profile.this, MainActivity.class);
        startActivity(intent);
        onStop();
    }

    public void toProfile(View view) {
        return;
    }
}