package com.example.dhaivat.law;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class detail extends AppCompatActivity {
    ActionBar ab;
    TextView txt;
    final Context ctx = this;
    int position = 10;
    private final String TAG = detail.class.getSimpleName();
    private InterstitialAd minterstitialAd;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.example.dhaivat.law.R.layout.activity_detail);
        Toolbar toolbar = (Toolbar) findViewById(com.example.dhaivat.law.R.id.toolbar);
        setSupportActionBar(toolbar);

        minterstitialAd= new InterstitialAd(this);
        minterstitialAd.setAdUnitId(getString(R.string.interstitial_full_screen));
        AdRequest adRequesttwo = new AdRequest.Builder().build();
        minterstitialAd.loadAd(adRequesttwo);

        txt = findViewById(com.example.dhaivat.law.R.id.txt);

        Intent intent = getIntent();
        position = this.getIntent().getExtras().getInt("position");

        String filecontain = new String();

        if(position == 0 )
            filecontain = Readfilefromapp(R.raw.a1);
        else if(position == 1)
            filecontain = Readfilefromapp(R.raw.a2);
        else if(position == 2)
            filecontain = Readfilefromapp(R.raw.a3);
        else if(position == 3)
            filecontain = Readfilefromapp(R.raw.a4);
        else if(position == 4)
            filecontain = Readfilefromapp(com.example.dhaivat.law.R.raw.a5);
        else if(position == 5)
            filecontain = Readfilefromapp(com.example.dhaivat.law.R.raw.a6);
        else if(position == 6)
            filecontain = Readfilefromapp(com.example.dhaivat.law.R.raw.a7);
        else if(position == 7)
            filecontain = Readfilefromapp(com.example.dhaivat.law.R.raw.a8);
        else if(position == 8)
            filecontain = Readfilefromapp(com.example.dhaivat.law.R.raw.a9);
        else if(position == 9)
            filecontain = Readfilefromapp(com.example.dhaivat.law.R.raw.a10);
        else if(position == 10)
            filecontain = Readfilefromapp(com.example.dhaivat.law.R.raw.a11);
        else if(position == 11)
            filecontain = Readfilefromapp(R.raw.a15);
        else if(position == 12)
            filecontain = Readfilefromapp(R.raw.a12);
        else if(position == 13)
            filecontain = Readfilefromapp(R.raw.a13);
        else if(position == 14)
            filecontain = Readfilefromapp(R.raw.a14);
        else if(position == 15)
            filecontain = Readfilefromapp(R.raw.a16);
        else if(position == 16)
            filecontain = Readfilefromapp(R.raw.a17);
        else if(position == 17)
            filecontain = Readfilefromapp(com.example.dhaivat.law.R.raw.a18);
        else if(position == 18)
            filecontain = Readfilefromapp(com.example.dhaivat.law.R.raw.a19);

        else
            filecontain = "Data Not Avaliable, Please again try Later !";
        txt.setText(filecontain);







    }



    private String Readfilefromapp(int FieldId)
    {
        Resources r1 = ctx.getResources();
        InputStream is = r1.openRawResource(FieldId);
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);
        StringBuffer content = new StringBuffer(8192);
        String Line = new String();
        try{

            while ((Line = br.readLine()) != null)
            content.append(Line + "\n");

        }catch (IOException e ){
            content.append("File cannot be read");
            Toast.makeText(ctx, "File Read Error" +
                    e.getMessage(),Toast.LENGTH_LONG).show();

        }
        return content.toString();
    }
    @Override
    public void onBackPressed() {

        if (minterstitialAd.isLoaded()){
            minterstitialAd.show();
            minterstitialAd.setAdListener(new AdListener() {
                @Override
                public void onAdClosed(){
                    super.onAdClosed();
                    finish();
                }
            });
        }else{
            super.onBackPressed();
        }

        super.onBackPressed();
    }

}
