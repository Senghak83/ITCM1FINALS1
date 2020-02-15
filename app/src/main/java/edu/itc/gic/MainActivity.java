package edu.itc.gic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyDistribute;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        recyDistribute = findViewById(R.id.PhoneRecycler);

        recyDistribute.setLayoutManager(new LinearLayoutManager(getApplicationContext()));

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                DB_Pone db = DB_Pone.getInstance(getApplicationContext());
                PH_DAO pdao = db.getConstributor();
                ArrayList<Contributor>  ls =(ArrayList<Contributor>) pdao.listAll();
                if(ls== null || ls.isEmpty()){
                    // Do somthing add data to db

                }
                recyDistribute.setAdapter(new ContributorListAdapter(ls));            }
        };// end Runnable


      //---Excu
        Executors.newSingleThreadExecutor().execute(runnable);
    }
}
