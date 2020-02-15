package edu.itc.gic;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class SplashScreenActivity extends AppCompatActivity {

    private final int loginCode = 1;
    private static boolean isLogin = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(isLogin == false){

           startActivityForResult(new Intent(this,loginActivy.class),loginCode);
        }
        else
        {

            startActivity(new Intent(this,MainActivity.class));
            finish();
        }


    }// end onCreate ---

    //---- getResult from login

    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

        if (requestCode == loginCode) {
            if (resultCode == RESULT_OK) {
              String ph =  data.getData().toString();
              isLogin = true;
              startActivity(new Intent(this,MainActivity.class));
              finish();
            }
        }// end check result from login
    }

}
