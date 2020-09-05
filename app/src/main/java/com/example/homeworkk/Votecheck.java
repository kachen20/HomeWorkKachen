package com.example.homeworkk;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Votecheck extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_votecheck);

        Intent i = getIntent();
        Button checkButton = findViewById(R.id.check_button);
        checkButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                EditText zipEdiText = findViewById(R.id.edit_TextNumber);
                String numText = zipEdiText.getText().toString();
                String zipNum = zipEdiText.getText().toString();
                String Num1 = "1111111111111";
                String Num2 = "2222222222222";
                if(zipNum.length() == 13){
                    AlertDialog.Builder dialog = new AlertDialog.Builder(Votecheck.this);
                    dialog.setTitle("ผลการตรวจสอบสิทธิเลือกตั้ง");
                    dialog.setPositiveButton("OK",null);
                    if(zipNum.equals(Num1) || zipNum.equals(Num2)){
                        dialog.setMessage("คุณเป็นผู้มีสิทธิเลือกตั้ง");
                    }
                    else{
                        dialog.setMessage("คุณไม่มีมีสิทธิเลือกตั้ง");
                    }
                    dialog.show();
                }
                else{
                    Toast toast = Toast.makeText(
                          Votecheck.this,
                          "กรุณากรอกหมายเลขบัตรประชาชน 13 หลัก",
                            Toast.LENGTH_LONG
                    );
                    toast.show();
                }
            }
        });
    }
}