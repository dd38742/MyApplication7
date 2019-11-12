package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.math.BigDecimal;
import java.util.List;


public class MainActivity extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    Button bt1 = findViewById(R.id.button);
    final TextView tx1 = findViewById(R.id.tx);
    bt1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            tx1.append("+");
        }
    });

    Button bt2 = findViewById(R.id.button1);
    bt2.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            tx1.append("*");
        }
    });

    Button bt3 = findViewById(R.id.button2);
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tx1.append("-");
            }
        });

        Button bt4 = findViewById(R.id.button3);
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tx1.append("/");
            }
        });

        Button bt5 = findViewById(R.id.button4);
        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try{
                    String middle=tx1.getText().toString();
                    char[] mid = middle.toCharArray();
                    mid = Jin.cutString(mid);
                    List list = Jin.transferToBehind(mid);
                    BigDecimal comeOut = Jin.calculator(list);
                    tx1.setText(comeOut.toString());
                } catch (Exception e) {
                    e.printStackTrace();
                    tx1.setText("ERROR");
                }
            }
        });

        Button bt6 = findViewById(R.id.button5);
        bt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tx1.append("%");
            }
        });

        Button bt7 = findViewById(R.id.button6);
        bt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tx1.append("(");
            }
        });

        Button bt8 = findViewById(R.id.button7);
        bt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tx1.append(")");
            }
        });

        /*Button bt9 = findViewById(R.id.button8);
        bt9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tx1.setText("清零");
            }
        });*/

        /*Button bt10 = findViewById(R.id.button9);
        bt10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tx1.setText("体积");
            }
        });*/

        /*Button bt11 = findViewById(R.id.button10);
        bt11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tx1.setText("长度");
            }
        });*/

    Button bt12 = findViewById(R.id.button11);
        bt12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tx1.setText("");
            }
        });

    Button bt13 = findViewById(R.id.button12);
        bt13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tx1.append("sin");
            }
        });

    /*Button bt14 = findViewById(R.id.button13);
        bt14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tx1.setText("cos");
            }
        });*/
    /*Button bt15 = findViewById(R.id.button14);
        bt15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tx1.setText("tan");
            }
        });*/
    /*Button bt16 = findViewById(R.id.button15);
        bt16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tx1.setText("平方");
            }
        });*/

    Button bt17 = findViewById(R.id.button16);
        bt17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tx1.append("1");
            }
        });

        Button bt18 = findViewById(R.id.button17);
        bt18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tx1.append("2");
            }
        });
        Button bt19 = findViewById(R.id.button18);
        bt19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tx1.append("3");
            }
        });

        Button bt20 = findViewById(R.id.button19);
        bt20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tx1.append("4");
            }
        });

        Button bt21 = findViewById(R.id.button20);
        bt21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tx1.append("5");
            }
        });

        Button bt22 = findViewById(R.id.button21);
        bt22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tx1.append("6");
            }
        });

        Button bt23 = findViewById(R.id.button22);
        bt23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tx1.append("7");
            }
        });

        Button bt24 = findViewById(R.id.button23);
        bt24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tx1.append("8");
            }
        });

        Button bt25 = findViewById(R.id.button24);
        bt25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tx1.append("9");
            }
        });

        Button bt26 = findViewById(R.id.button25);
        bt26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tx1.append("0");
            }
        });

        Button bt27 = findViewById(R.id.button26);
        bt27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tx1.append(".");
            }
        });

    }
}
