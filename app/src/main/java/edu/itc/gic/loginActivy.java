package edu.itc.gic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class loginActivy extends AppCompatActivity {

    private EditText edPhone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        edPhone = findViewById(R.id.txtphone);
    }

    public void gotoMainForResult(View view) {
        if(edPhone.getText().toString().isEmpty())return;
        Intent intent = new Intent();
        intent.putExtra("phone",edPhone.getText());
        //startActivity(intent);
        finish();

    }
}
