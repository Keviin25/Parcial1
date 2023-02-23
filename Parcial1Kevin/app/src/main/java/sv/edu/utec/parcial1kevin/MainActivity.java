package sv.edu.utec.parcial1kevin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText username,password;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username=findViewById(R.id.username);
        password=findViewById(R.id.password);
        login=findViewById(R.id.login);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (username.getText().toString().equals("parcialETps1") && password.getText().toString().equals("p4rC14l#tp$")){
                    startActivity(new Intent(MainActivity.this, Activity_IMC.class));



                }else{
                    Toast.makeText(MainActivity.this, "contraseña y usuario no son correctos”", Toast.LENGTH_SHORT).show();

                }
            }
        });
    }
}