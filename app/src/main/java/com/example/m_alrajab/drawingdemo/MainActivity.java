package com.example.m_alrajab.drawingdemo;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void computePercentage(View view) {

        float totalStds= Float.parseFloat(((EditText)findViewById(R.id.totalNumer)).getText().toString());
        float perA= Float.parseFloat(((EditText)findViewById(R.id.aStds)).getText().toString())/totalStds;
        float perB= Float.parseFloat(((EditText)findViewById(R.id.bStds)).getText().toString())/totalStds;
        float perC= Float.parseFloat(((EditText)findViewById(R.id.cStds)).getText().toString())/totalStds;
        float perD= Float.parseFloat(((EditText)findViewById(R.id.dStds)).getText().toString())/totalStds;
        float perF= Float.parseFloat(((EditText)findViewById(R.id.fStds)).getText().toString())/totalStds;
        SharedVals.perA=perA;
        SharedVals.perB=perB;
        SharedVals.perC=perC;
        SharedVals.perD=perD;
        SharedVals.perF=perF;

        AlertDialog.Builder msgDlg=new AlertDialog.Builder(this);
        msgDlg.setMessage("The percetages of grade distribution are: \n" +
                "As: "+perA*100 +"% \n" +
                "Bs: "+perB*100 +"% \n" +
                "Cs: "+perC*100 +"% \n" +
                "Ds: "+perD*100 +"% \n" +
                "Fs: "+perF*100 +"%"
        );
        msgDlg.setOnDismissListener(new DialogInterface.OnDismissListener() {
            @Override
            public void onDismiss(DialogInterface dialog) {
                startActivity(new Intent(MainActivity.this, Main2Activity.class));
            }
        });

        msgDlg.show();

    }
}
