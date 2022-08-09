package com.example.homeworke;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText Text1 = findViewById(R.id.Text1);
        EditText Text2 = findViewById(R.id.Text2);
        EditText Text3 = findViewById(R.id.Text3);
        EditText Text4 = findViewById(R.id.Text4);
        Button button = findViewById(R.id.button);
        TextView Show = findViewById(R.id.Show);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int TExt1 = Integer.parseInt( Text1.getText().toString());
                int TExt2 = Integer.parseInt( Text2.getText().toString());
                int TExt3 = Integer.parseInt( Text3.getText().toString());
                int TExt4 = Integer.parseInt( Text4.getText().toString());

                int Result= TExt1 + TExt2 + TExt3 + TExt4 ;
                Show.setText(String.valueOf(Result));
            }

        });






    }

}