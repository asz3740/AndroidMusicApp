package com.cookandroid.gsmmusicplayer;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button recommendationButton = (Button) findViewById(R.id.recommendation);
        Button mymusicButton = (Button) findViewById(R.id.mymusic);
        Button mychartButton = (Button) findViewById(R.id.mychart);
        Button siturecommendationButton = (Button) findViewById(R.id.siturecommendation);
        Button weatherButton = (Button) findViewById(R.id.weather);
        Button questionButton = (Button) findViewById(R.id.question);

        recommendationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent recommendationIntent = new Intent(MainActivity.this,RecommendationActivity.class);
                MainActivity.this.startActivity(recommendationIntent);
            }
        });
    }
}
