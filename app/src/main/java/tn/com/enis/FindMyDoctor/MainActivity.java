package tn.com.enis.FindMyDoctor;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static EditText username;
    private static EditText password;
    private static Button login_btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LoginButton();
    }

    public void LoginButton() {

        username = (EditText) findViewById(R.id.name_Text);
        password = (EditText) findViewById(R.id.pass_Text);
        login_btn = (Button) findViewById(R.id.login_button);

        login_btn.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        if (username.getText().toString().equals("") && password.getText().equals("")) {
                            Toast.makeText(getApplicationContext(), "Les champs sont vide !! Enter votre UserName et Password svp!", Toast.LENGTH_SHORT).show();

                        }
                        if (username.getText().toString().equals("admin") && password.getText().toString().equals("admin")) {
                            Toast.makeText(getApplicationContext(), "User and Password is correct !", Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
                            startActivity(intent);
                        } else {
                            Toast.makeText(getApplicationContext(), "User and Password is not correct !", Toast.LENGTH_SHORT).show();


                        }
                    }
                }
        );
    }
}
