package app.damian.com.learningapp1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("MainActivity", "Hello World");
        Log.e("MainActivity", "Hello World");

    }

    public void button_1_onClick(View view) {
        final TextView firstTextView = findViewById(R.id.textView);

        Button firstButton = findViewById(R.id.FirstButton);


        firstTextView.setText("You clicked");
    }
}
