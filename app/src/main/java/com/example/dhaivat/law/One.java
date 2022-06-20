package com.example.dhaivat.law;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.widget.LinearLayout;

import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;

import java.util.ArrayList;
import java.util.List;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class One extends AppCompatActivity {

    RecyclerView recyclerView;
    Context context;
    private List<Club> clubs;
    private final String TAG = detail.class.getSimpleName();

    private AdView mAdView;
    private InterstitialAd minterstitialAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.one);


        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        minterstitialAd= new InterstitialAd(this);
        minterstitialAd.setAdUnitId(getString(R.string.interstitial_full_screen));
        AdRequest adRequesttwo = new AdRequest.Builder().build();
        minterstitialAd.loadAd(adRequesttwo);



        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);

        LinearLayoutManager layoutManager = new LinearLayoutManager(context);
        recyclerView.setLayoutManager(layoutManager);

        RecyclerViewAdapterOne adapter = new RecyclerViewAdapterOne(clubs);

        initializeData();
        initializeAdapter();
    }


    private void initializeAdapter() {

        RecyclerViewAdapterOne adapter = new RecyclerViewAdapterOne(clubs);
        recyclerView.setAdapter(adapter);

    }

    private void initializeData() {

        clubs= new ArrayList<>();
        clubs.add(new One.Club("Functions of Civil Law","The core function of Civil Law is to resolve disagreements and disputes between individuals, families or organizations by providing due and equitable compensations to the victims. Unlike Criminal Law, The Civil law focuses more on the providing compensation to the victims rather than giving punishment to the accused. There are Civil Law Courts which take and resolve civil matters with the help of refined lawyers and judges.Few Examples of Civil Suits are:  A car crash victim files a Civil Suit against the driver to claim for the loss or injury sustained in the accident. One company files a Civil suit against another for wrong products sent or wrong claims made at the time of the deal. A wife files a Civil Suit against his husband and in-laws for unjustified behaviour against her."));
        clubs.add(new One.Club("Real Estate Law","All the matters related to property, rent, buying/selling of a house, landlord problems/harassment etc are covered under this body of law."));
        clubs.add(new One.Club("Business or Commercial Law","Business ethics related to B2B organizations, Fraud, employee-employer complaints etc are covered under this body of law."));
        clubs.add(new One.Club("Education Law","All matters related to Education and Educational Firms are covered under this body of law. For example, Student-teacher complaints, false registration of Educational organizations, any act of deception by educational firms etc. Also, it exerts the right of education to every child."));
        clubs.add(new One.Club("Consumer Law","All the matters related to the consumer law like unjust pricing, non-fulfilment of consented products etc falls under this law."));
        clubs.add(new One.Club("Tax Law","Every matter based on taxation like the application of GST and other taxes, fair taxation as per the government etc are covered under this body of law."));
        clubs.add(new One.Club("Entertainment Law","Deals with all the matters that come under the media industry."));
        clubs.add(new One.Club("Contract Law","Issues based on finalizing a contract between two parties, breaching of the contract etc are covered under this body of law."));
        clubs.add(new One.Club("Administrative Law","includes issues on rulemaking, adjudication, or the enforcement of a specific regulatory agenda etc."));
        clubs.add(new One.Club("Sports Law","Deals with issues related to the athletes and the sports played by them. Variety of issues like a contract, constitutional, trademark, criminal, tort, agency, antitrust, labour, and tax issues are covered under this body of law."));

    }

    class Club {

        String nameone,nametwo;
        public Club(String nameone, String nametwo) {


            this.nameone=nameone;
            this.nametwo=nametwo;

        }
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
