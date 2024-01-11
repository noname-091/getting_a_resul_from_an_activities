package newapp.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {

    private Button btn1;
    private EditText edit1, edit2, edit3, edit4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        btn1 = findViewById(R.id.btn1);
        edit1 = findViewById(R.id.edit1);
        edit2 = findViewById(R.id.edit2);
        edit3 = findViewById(R.id.edit3);
        edit4 = findViewById(R.id.edit4);

        btn1.setOnClickListener(v -> {
            String email = edit1.getText().toString();
            String username = edit2.getText().toString();
            String password = edit3.getText().toString();
            String confirmPassword = edit4.getText().toString();

            Intent intent = new Intent();
            intent.putExtra("username", username);
            intent.putExtra("password", password);

            setResult(1, intent);


            finish();

        });
    }
}