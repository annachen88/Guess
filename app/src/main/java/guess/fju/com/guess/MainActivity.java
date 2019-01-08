package guess.fju.com.guess;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText number;
    private TextView secret;
    private int a = (int) (Math.random() * 100 + 1);
    int b =1;
    int c = 100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        secret = findViewById(R.id.secret);
        number = findViewById(R.id.number);
        secret.setText(a + "");


    }

    public void send(View view) {
        //  int seccretNumber = Integer.parseInt(number.getText().toString())
        int result = Integer.parseInt(number.getText().toString());

        if (result > a) {

            new AlertDialog.Builder(MainActivity.this)
                    .setMessage(b + "  to " + result)
                    .setPositiveButton("ok",null)
                    .show();
            b = result;
        } else {
            if (result < a) {
                new AlertDialog.Builder(MainActivity.this)
                        .setMessage(result + " to " + c)
                        .setPositiveButton("ok", null)
                        .show();
                c = result;
            } else {
                if (result == a)
                    new AlertDialog.Builder(MainActivity.this)
                            .setMessage("Yes, the number is " + a)
                            .setPositiveButton("ok", null)
                            .show();
            }

        }

    }
}
