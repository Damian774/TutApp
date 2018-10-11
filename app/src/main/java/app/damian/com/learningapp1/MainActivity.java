package app.damian.com.learningapp1;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.annotation.ColorInt;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;

import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int mCount = 0;
    private TextView mShowCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       mShowCount  = findViewById(R.id.show_count);

    }


    public void showToast(View view) {
        Toast toast = Toast.makeText(this,R.string.toast_message,Toast.LENGTH_SHORT);
        toast.show();

    }

    public void countUp(View view) {
        mCount++;
        if(mShowCount !=null)
             mShowCount.setText(Integer.toString(mCount));
        if(mCount>0){ View v = findViewById(R.id.button_zero);
        v.setBackgroundColor(Color.GRAY);
        }
        if(mCount%2==0) view.setBackgroundColor(Color.BLUE);
                else view.setBackgroundColor(Color.GREEN);


    }

    public void Reset(View view) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
            view.setBackgroundColor(Color.RED);
        }
        mCount=0;
        mShowCount.setText(Integer.toString(mCount));
    }
}
