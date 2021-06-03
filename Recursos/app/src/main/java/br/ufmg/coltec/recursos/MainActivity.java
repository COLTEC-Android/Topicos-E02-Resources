package br.ufmg.coltec.recursos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt = findViewById(R.id.toast_id);

        Button btnRecursos = findViewById(R.id.button_id);
        btnRecursos.setOnClickListener(view -> {
            Toast.makeText(MainActivity.this, txt.getText(), Toast.LENGTH_LONG).show();
        });

    }
}