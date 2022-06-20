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

public class Two extends AppCompatActivity {

    RecyclerView recyclerView;
    Context context;
    private List<Club> clubs;
    private final String TAG = detail.class.getSimpleName();

    private AdView mAdView;
    private InterstitialAd minterstitialAd;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.two);

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

        RecyclerViewAdapterTwo adapter = new RecyclerViewAdapterTwo(clubs);

        initializeData();
        initializeAdapter();
    }



    private void initializeAdapter() {

        RecyclerViewAdapterTwo adapter = new RecyclerViewAdapterTwo(clubs);
        recyclerView.setAdapter(adapter);

    }

    private void initializeData() {

        clubs= new ArrayList<>();
        clubs.add(new Two.Club("First Information Report (FIR)","The first information report means an information recorded by a police officer on duty given either by the aggrieved person or any other person to the commission of an alleged offence. On the basis of first information report, the police commences its investigation. Section 154 of the Code of Criminal Procedure, 1973 defines as to what amounts to first information.Every information relating to the commission of a cognizable offence, if given orally to an officer-in-charge of a police station, shall be reduced to writing by him or under his direction, and be read over to the informant; and every such information, whether given in writing or reduced to writing as aforesaid shall be signed by the person giving it, and the substance thereof shall be entered in a book to be kept by such officer in such form as the State Government may prescribe in this behalf.A copy of the information as recorded under sub-section.Shall be given forthwith, free of cost, to the informant.Any person aggrieved by a refusal on the part of an officer-in-charge of police station to record the information referred to in sub-section. May send the substance of such information, in writing and by post to the Superintendent of Police concerned, who if satisfied that such information discloses the commission of a cognizable offence shall either investigate the case himself or direct an investigation to be made by any police officer subordinate to him, in the manner provided by this Code, and such officer shall have all the powers of an officer-in-charge of the police station in relation to that offence."));
        clubs.add(new Two.Club("Who can File an FIR?","First Information Report (FIR) can be filed by any person. He need not necessarily be the victim or the injured or an eye-witness. First Information Report may be merely hearsay and need not necessarily be given by the person who has first hand knowledge of the facts."));
        clubs.add(new Two.Club("Where to File an FIR?","An FIR can be filed in the police station of the concerned area in whose jurisdiction the offence has occurred. A first are to obtain information about the alleged criminal activity so as to be able to take suitable steps for tracing and bringing to book the guilty person. Its secondary though equally important object is to obtain early information of an alleged criminal activity and to record the circumstances before the trial, lest such circumstances are forgotten or embellished."));
        clubs.add(new Two.Club("Why FIR should be filed promptly?","This is the golden principle of law prescribed in the Code of Criminal Procedure, 1973 that the First Information Report should always be filed promptly and without wasting any time. Such type of report gains the maximum credibility and is always welcome and appreciated by the courts.According to Supreme Court the FIR recorded promptly before the time afforded to embellish or do away with the evidence is useful. It eliminates the possible chance of giving rise to suspicion."));
        clubs.add(new Two.Club("Following are the reports or statements which do not amount to be an FIR:","A report or a statement recorded after the commencement of the investigation (sections 162 and 163 of the Code of Criminal Procedure, 1973). Reports not recorded immediately but after questioning of witnesses. Reports recorded after several days of developments. Information not about occurrence of cognizable offence but only cryptic message in the form of an appeal for immediate help. Complaint to the Magistrate. Information to beat house. Information to the Magistrate or police officer on phone. Information received at police station prior to the lodging of an F.LR."));
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
