package sg.edu.rp.c346.id21033293.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondModule extends AppCompatActivity {

    TextView tvmod2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_module);

        tvmod2 = findViewById(R.id.textView);
        Intent intentReceived = getIntent();
        String value = intentReceived.getStringExtra("c349");
        tvmod2.setText("Module Code, Module name, Academic year, Semester, Module Credit, Venue:" + value);
    }
}