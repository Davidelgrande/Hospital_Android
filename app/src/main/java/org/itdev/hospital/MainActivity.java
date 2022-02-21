package org.itdev.hospital;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "DAAAAAAVID ES MUY ASPERO, ciErto quesi wilmer o verda que si luchito ", Toast.LENGTH_SHORT).show();
    }
}