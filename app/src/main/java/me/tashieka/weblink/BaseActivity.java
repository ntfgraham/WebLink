package me.tashieka.weblink;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base);
        TextView textView=(TextView) findViewById(R.id.textview);
        textView.setMovementMethod(LinkMovementMethod.getInstance());

        /*getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.container,new SplashFragment())
                .addToBackStack(null)
                .commit();*/
    }
}




