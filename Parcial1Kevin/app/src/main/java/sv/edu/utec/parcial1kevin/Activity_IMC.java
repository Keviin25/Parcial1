package sv.edu.utec.parcial1kevin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class Activity_IMC extends AppCompatActivity {

    EditText edtPeso, edtEstatura;
    TextView tvResultadoIMC;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imc);

        edtPeso = findViewById(R.id.edtPeso);
        edtEstatura =findViewById(R.id.edtEstatura);
        tvResultadoIMC = findViewById(R.id.tvResultadoIMC);

    }
    public void IMCMetodo (View v){
        Double peso, estatura, imc;

        peso = Double.parseDouble(edtPeso.getText().toString());
        estatura = Double.parseDouble(edtEstatura.getText().toString());

        imc = (peso) / (estatura * estatura);

        if (imc < 10.5 ){
           tvResultadoIMC.setText(String.valueOf("Críticamente Bajo de Peso"));
        } else if (imc < 15.9) {
            tvResultadoIMC.setText(String.valueOf("Severamente Bajo de Peso"));
        } else if (imc < 18.5){
            tvResultadoIMC.setText(String.valueOf("Bajo de Peso"));
        } else if (imc < 25){
            tvResultadoIMC.setText(String.valueOf("Normal (peso saludable)"));
        }else if (imc < 30){
            tvResultadoIMC.setText(String.valueOf("Sobrepeso"));
        }else if (imc < 35) {
            tvResultadoIMC.setText(String.valueOf("Obesidad Clase 1 - Moderadamente Obeso\""));

        }else if (imc<40){
            tvResultadoIMC.setText(String.valueOf("Obesidad Clase 2 - Severamente Obeso\""));
        }else if (imc > 50){
            tvResultadoIMC.setText(String.valueOf("Obesidad Clase 3 - Críticamente Obeso\""));

        }

        }
        }