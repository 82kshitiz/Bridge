package com.example.myapplication;

import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.support.v7.widget.CardView;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.content.Intent;




public class MainActivity extends AppCompatActivity {

    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
        public void goToAnActivity(View view) {
            Intent intent = new Intent(this, LoginActivity2.class);
            startActivity(intent);
        }
    public void goToAnotherActivity(View view) {
        Intent intent = new Intent(this, NFCActivity.class);
        startActivity(intent);
    }

}



