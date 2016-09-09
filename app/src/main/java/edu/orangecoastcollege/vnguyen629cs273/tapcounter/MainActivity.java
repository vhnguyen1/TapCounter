package edu.orangecoastcollege.vnguyen629cs273.tapcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView counterTextView;
    private Button tapButton;

    Counter newCounter = new Counter();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        counterTextView = (TextView) findViewById(R.id.countTextView);

        tapButton = (Button) findViewById(R.id.tapButton);
        tapButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                newCounter.incrementCount();
                counterTextView.setText(newCounter.getCount());
            }
        });
    }
}