package sg.edu.rp.c346.id21033293.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv346;
    TextView tv349;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv346 = findViewById(R.id.textView346);
        tv349 = findViewById(R.id.textView349);

        tv346.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, FirstModule.class);
                intent.putExtra("c346", " C346, Android Programming, 2020, 1, 4, W66M");
                startActivity(intent);
            }
        });

        tv349.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondModule.class);
                intent.putExtra("c349"," C349, iPad Programming, 2020, 1, 4, W66N");
                startActivity(intent);
            }
        });
    }
}