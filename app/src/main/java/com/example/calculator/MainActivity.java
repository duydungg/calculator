package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText edtInput;
    private TextView tvResult;
    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;
    private Button btn5;
    private Button btn6;
    private Button btn7;
    private Button btn8;
    private Button btn9;
    private Button btn0;
    private Button btnPlus;
    private Button btnSub;
    private Button btnMul;
    private Button btnDiv;
    private Button btnResult;
    private Button btnDot;
    private Button btnDao;
    private Button btnC;
    private Button btnCE;
    private Button btnBS;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initWidget();
        setEventClickViews();
    }

    public void initWidget(){
        edtInput = (EditText) findViewById(R.id.edtInput);
        tvResult = (TextView) findViewById(R.id.tvResult);

        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);
        btn0 = (Button) findViewById(R.id.btn0);
        btnPlus = (Button) findViewById(R.id.btnPlus);
        btnSub = (Button) findViewById(R.id.btnSub);
        btnMul = (Button) findViewById(R.id.btnMul);
        btnDiv = (Button) findViewById(R.id.btnDiv);
        btnC = (Button) findViewById(R.id.btnC);
        btnCE = (Button) findViewById(R.id.btnCE);
        btnBS = (Button) findViewById(R.id.btnBS);
        btnDot = (Button) findViewById(R.id.btnDot);
        btnDao = (Button) findViewById(R.id.btnDao);
        btnResult = (Button) findViewById(R.id.btnResult);
    }
    public void setEventClickViews(){
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        btn0.setOnClickListener(this);

        btnPlus.setOnClickListener(this);
        btnMul.setOnClickListener(this);
        btnDiv.setOnClickListener(this);
        btnSub.setOnClickListener(this);

        btnC.setOnClickListener(this);
        btnCE.setOnClickListener(this);
        btnBS.setOnClickListener(this);
        btnResult.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn1:
                edtInput.append("1");
                break;
            case R.id.btn2:
                edtInput.append("2");
                break;
            case R.id.btn3:
                edtInput.append("3");
                break;
            case R.id.btn4:
                edtInput.append("4");
                break;
            case R.id.btn5:
                edtInput.append("5");
                break;
            case R.id.btn6:
                edtInput.append("6");
                break;
            case R.id.btn7:
                edtInput.append("7");
                break;
            case R.id.btn8:
                edtInput.append("8");
                break;
            case R.id.btn9:
                edtInput.append("9");
                break;
            case R.id.btn0:
                edtInput.append("0");
                break;
            case R.id.btnSub:
                edtInput.append("-");
                break;
            case R.id.btnPlus:
                edtInput.append("+");
                break;
            case R.id.btnMul:
                edtInput.append("*");
                break;
            case R.id.btnDiv:
                edtInput.append("/");
                break;
            case R.id.btnC:
                edtInput.setText("");
                break;
            case R.id.btnDot:
                edtInput.append(".");
                break;
            case R.id.btnCE:
                String numberAfterRemove = deleteANumber(edtInput.getText().toString());
                edtInput.setText(numberAfterRemove);
                break;
            case R.id.btnResult:

                break;
        }
    }

    public String deleteANumber(String number) {
        int length = number.length();
        String temp = number.substring(0, length -1);
        return temp;
    }
}

