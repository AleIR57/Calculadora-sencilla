package com.example.cammovi1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    float numero1 = 0.0f;
    float numero2 = 0.0f;
    String operacion = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void bt7(View v){

        EditText campo = findViewById(R.id.EditTextResultado);
        TextView campoOperacion = findViewById(R.id.TextViewOperacion);

        if(campo.getText().toString().equals("0")){
            campo.setText("7");
        }
        else{
            campo.setText(campo.getText().toString()+"7");
        }
        campoOperacion.setText(campoOperacion.getText().toString()+"7");

    }

    public void bt8(View v){
        EditText campo = findViewById(R.id.EditTextResultado);
        TextView campoOperacion = findViewById(R.id.TextViewOperacion);

        if(campo.getText().toString().equals("0")){
            campo.setText("8");
        }
        else{
            campo.setText(campo.getText().toString()+"8");
        }
        campoOperacion.setText(campoOperacion.getText().toString()+"8");

    }

    public void bt9(View v){
        EditText campo = findViewById(R.id.EditTextResultado);
        TextView campoOperacion = findViewById(R.id.TextViewOperacion);

        if(campo.getText().toString().equals("0")){
            campo.setText("9");
        }
        else{
            campo.setText(campo.getText().toString()+"9");
        }
        campoOperacion.setText(campoOperacion.getText().toString()+"9");

    }

    public void bt4(View v){
        EditText campo = findViewById(R.id.EditTextResultado);
        TextView campoOperacion = findViewById(R.id.TextViewOperacion);

        if(campo.getText().toString().equals("0")){
            campo.setText("4");
        }
        else{
            campo.setText(campo.getText().toString()+"4");
        }
        campoOperacion.setText(campoOperacion.getText().toString()+"4");

    }

    public void bt5(View v){
        EditText campo = findViewById(R.id.EditTextResultado);
        TextView campoOperacion = findViewById(R.id.TextViewOperacion);

        if(campo.getText().toString().equals("0")){
            campo.setText("5");
        }
        else{
            campo.setText(campo.getText().toString()+"5");
        }
        campoOperacion.setText(campoOperacion.getText().toString()+"5");

    }

    public void bt6(View v){
        EditText campo = findViewById(R.id.EditTextResultado);
        TextView campoOperacion = findViewById(R.id.TextViewOperacion);

        if(campo.getText().toString().equals("0")){
            campo.setText("6");
        }
        else{
            campo.setText(campo.getText().toString()+"6");
        }
        campoOperacion.setText(campoOperacion.getText().toString()+"6");

    }

    public void bt1(View v){
        EditText campo = findViewById(R.id.EditTextResultado);
        TextView campoOperacion = findViewById(R.id.TextViewOperacion);

        if(campo.getText().toString().equals("0")){
            campo.setText("1");
        }
        else{
            campo.setText(campo.getText().toString()+"1");
        }
        campoOperacion.setText(campoOperacion.getText().toString()+"1");

    }

    public void bt2(View v){
        EditText campo = findViewById(R.id.EditTextResultado);
        TextView campoOperacion = findViewById(R.id.TextViewOperacion);

        if(campo.getText().toString().equals("0")){
            campo.setText("2");
        }
        else{
            campo.setText(campo.getText().toString()+"2");
        }
        campoOperacion.setText(campoOperacion.getText().toString()+"2");

    }

    public void bt0(View v){
        EditText campo = findViewById(R.id.EditTextResultado);
        TextView campoOperacion = findViewById(R.id.TextViewOperacion);

        if(campo.getText().toString().equals("0")){
            campo.setText("0");
        }
        else{
            campo.setText(campo.getText().toString()+"0");
        }

        campoOperacion.setText(campoOperacion.getText().toString()+"0");

    }

    public void bt3(View v){
        EditText campo = findViewById(R.id.EditTextResultado);
        TextView campoOperacion = findViewById(R.id.TextViewOperacion);

        if(campo.getText().toString().equals("0")){
            campo.setText("3");
        }
        else{
            campo.setText(campo.getText().toString()+"3");
        }
        campoOperacion.setText(campoOperacion.getText().toString()+"3");

    }

    public void btDiv(View v){
        EditText campo = findViewById(R.id.EditTextResultado);
        campo.setText(campo.getText().toString()+"÷");

        TextView campoOperacion = findViewById(R.id.TextViewOperacion);
        campoOperacion.setText(campoOperacion.getText().toString()+"÷");
    }



    public void btPunto(View v){
        EditText campo = findViewById(R.id.EditTextResultado);
        TextView campoOperacion = findViewById(R.id.TextViewOperacion);

        if(campo.getText().toString().equals("0")){
            campo.setText(".");
        }
        else{
            campo.setText(campo.getText().toString()+".");
        }
        campoOperacion.setText(campoOperacion.getText().toString()+".");
    }


    public void opDividir(View v){
        EditText campo = findViewById(R.id.EditTextResultado);
        numero1 = Float.parseFloat(campo.getText().toString());
        operacion = "÷";
        campo.setText("0");

        TextView campoOperacion = findViewById(R.id.TextViewOperacion);
        campoOperacion.setText(campoOperacion.getText().toString()+"÷");
    }

    public void opMul(View v){
        EditText campo = findViewById(R.id.EditTextResultado);
        numero1 = Float.parseFloat(campo.getText().toString());
        operacion = "x";
        campo.setText("0");


        TextView campoOperacion = findViewById(R.id.TextViewOperacion);
        campoOperacion.setText(campoOperacion.getText().toString()+"x");
    }

    public void opRes(View v){
        EditText campo = findViewById(R.id.EditTextResultado);
        numero1 = Float.parseFloat(campo.getText().toString());
        operacion = "-";
        campo.setText("0");


        TextView campoOperacion = findViewById(R.id.TextViewOperacion);
        campoOperacion.setText(campoOperacion.getText().toString()+"-");
    }

    public void opSum(View v){
        EditText campo = findViewById(R.id.EditTextResultado);
        numero1 = Float.parseFloat(campo.getText().toString());
        operacion = "+";
        campo.setText("0");

        TextView campoOperacion = findViewById(R.id.TextViewOperacion);
        campoOperacion.setText(campoOperacion.getText().toString()+"+");
    }

    public void opElevacion(View v){
        EditText campo = findViewById(R.id.EditTextResultado);
        numero1 = Float.parseFloat(campo.getText().toString());
        operacion = "^";
        campo.setText("0");


        TextView campoOperacion = findViewById(R.id.TextViewOperacion);
        campoOperacion.setText(campoOperacion.getText().toString()+"^");
    }

    public void opPorcentaje(View v){
        EditText campo = findViewById(R.id.EditTextResultado);
        numero1 = Float.parseFloat(campo.getText().toString());
        operacion = "%";

        TextView campoOperacion = findViewById(R.id.TextViewOperacion);
        campoOperacion.setText(campoOperacion.getText().toString()+"%");
    }

    public void opRaiz(View v){
        EditText campo = findViewById(R.id.EditTextResultado);
        numero1 = Float.parseFloat(campo.getText().toString());
        operacion = "√";

        TextView campoOperacion = findViewById(R.id.TextViewOperacion);
        campoOperacion.setText(campoOperacion.getText().toString()+"√");
    }

    public void opMostrar(View v){

        EditText campo = findViewById(R.id.EditTextResultado);
        numero2 = Float.parseFloat(campo.getText().toString());

        if(campo.getText().toString().equals("0")){
            campo.setText(numero2 + "");
        }
        else{
            campo.setText(campo.getText().toString()+numero2);
        }

        if(operacion.equals("÷")){
            if(numero2 == 0.0f){
                campo.setText("0");
                Toast.makeText(this, "OPERACIÓN NO VÁLIDA", Toast.LENGTH_SHORT).show();
            }
            else{
              float result = numero1/numero2;
              campo.setText(result + "");
            }
        }
        else if(operacion.equals("x")){
            float result = numero1*numero2;
            campo.setText(result + "");
        }
        else if(operacion.equals("-")){
            float result = numero1-numero2;
            campo.setText(result + "");
        }
        else if(operacion.equals("+")){
            float result = numero1+numero2;
            campo.setText(result + "");
        }
        else if(operacion.equals("^")){
            float result = (float) Math.pow(numero1, numero2);
            campo.setText(result + "");
        }


        /*Los porcentajes solo se pueden sacar para el primer número, por ejemplo
        9% = 0.09 o √9 = 3, ese valor se puede utilizar para operarlo con otro número después*/
        else if(operacion.equals("%")){
            float result = (numero1/100);
            numero2 = 0;
            campo.setText(result + "");
        }
        else if(operacion.equals("√")){
                if(numero1 != 0.0f && numero2 == 0.0f){
                    float result = (float) Math.sqrt(numero1);
                    campo.setText(result + "");
                }
                else{
                    float result = (float) Math.sqrt(numero2);
                    campo.setText(result + "");
                }
        }

        float numero1 = 0.0f;
        float numero2 = 0.0f;
        String operacion = "";

    }



    public void borrarTodo(View v){
        EditText campo = findViewById(R.id.EditTextResultado);
        campo.setText("0");
        TextView campoOperacion = findViewById(R.id.TextViewOperacion);
        campoOperacion.setText("");
        float numero1 = 0.0f;
        float numero2 = 0.0f;
        String operacion = "";
    }



}