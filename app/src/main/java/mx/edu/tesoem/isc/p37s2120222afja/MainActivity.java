package mx.edu.tesoem.isc.p37s2120222afja;

import androidx.appcompat.app.AppCompatActivity;



import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {
    EditText txtnum1,txtnum2;
    Button btnsuma,btnresta,btnmulti,btndivision;
    TextView lblresultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtnum1 = findViewById(R.id.txtnum1);
        txtnum2 = findViewById(R.id.txtnum2);

        resultado = findViewById(R.id.resultado);

        btnsuma = findViewById(R.id.btnsuma);
        btnresta = findViewById(R.id.btnresta);
        btnmulti = findViewById(R.id.btnmulti);
        btndivision = findViewById(R.id.btndivision);

        btnsuma.set0nClickListener(new View.OnClickListener(){
           @Override
           public void onClick(View v){
               int num1 = Interger.parseInt(txtnum1.getText().toString());
               int num2 = Interger.parseInt(txtnum2.getText().toString());
               resultado.setText(resultado.getText().toString()+""+(num1 + num2));

           });
        }
      resta = findViewById(R.id.btnresta);
        resta.setOnClickListener(New View.OnClickListener){
            @Override
                    public void onClick(View v){
                int num1 = Integer.parseInt(txtnum1.getText().toString());
                int num2 = Integer.parseInt(txtnum2.getText().toString());
                txtnum1.setText("");
                txtnum2.setText("");
                lblresultado.setText("Resultado");
                lblresultado.setText(resultado.getText().toString() + "" + (num1 - num2));
            });
        }
        multiplicacion = findViewById(R.id.btnmulti);
        multiplicacion.setOnClickListener(New View.OnClickListener) {
            @Override
            public void onClick (View v){
                int num1 = Integer.parseInt(txtnum1.getText().toString());
                int num2 = Integer.parseInt(txtnum2.getText().toString());
                txtnum1.setText("");
                txtnum2.setText("");
                lblresultado.setText("Resultado");
                lblresultado.setText(resultado.getText().toString() + "" + (num1 * num2));
            });
        }

        division = findViewById(R.id.btnresta);
        division.setOnClickListener(New View.OnClickListener){
            @Override
            public void onClick(View v){
                int num1 = Integer.parseInt(txtnum1.getText().toString());
                int num2 = Integer.parseInt(txtnum2.getText().toString());
                txtnum1.setText("");
                txtnum2.setText("");
                lblresultado.setText("Resultado");
                lblresultado.setText(resultado.getText().toString() + "" + (num1 / num2));
            });
        }

    }
}