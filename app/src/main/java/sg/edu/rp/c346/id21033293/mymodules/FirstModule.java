package sg.edu.rp.c346.id21033293.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class FirstModule extends AppCompatActivity {

    TextView tvmod1;
    //create variable

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_module);

        tvmod1 = findViewById(R.id.textView);
        Intent intentReceived = getIntent();
        String value = intentReceived.getStringExtra("c346");
        tvmod1.setText("Module Code, Module name, Academic year, Semester, Module Credit, Venue:" + value);
    }
}