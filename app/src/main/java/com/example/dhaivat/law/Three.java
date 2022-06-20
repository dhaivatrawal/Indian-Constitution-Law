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

public class Three extends AppCompatActivity {

    RecyclerView recyclerView;
    Context context;
    private List<Club> clubs;
    private final String TAG = detail.class.getSimpleName();

    private AdView mAdView;
    private InterstitialAd minterstitialAd;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.three);

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

        RecyclerViewAdapterThree adapter = new RecyclerViewAdapterThree(clubs);

        initializeData();
        initializeAdapter();
    }



    private void initializeAdapter() {

        RecyclerViewAdapterThree adapter = new RecyclerViewAdapterThree(clubs);
        recyclerView.setAdapter(adapter);

    }

    private void initializeData() {

        clubs= new ArrayList<>();
        clubs.add(new Three.Club("Introduction","First question which arise by listening legal system in mind is, what is law? In general, a rule of being or of conduct, established by an authority able to enforce its will; a controlling regulation; the mode or order according to which an agent or a power acts. It maintains order & discipline in the society and regulates anti-social behaviors & activities. As such two kinds of legal systems, which I am going to research, operate worldwide to elaborate rights and responsibilities of citizens in a variety of ways. They are: ‘legislation and common law.’ My research basically aims at distinguishing the authority and relevance of both, Legislation and Common Law. It’s a vast topic to research upon but I am researching on the history and development of common law and legislation in India. The Indian legal system is based upon both legislation and common law. Legislation is also known as statutory law while common law is termed sometimes as case law. Legislation and common law are two very different legal systems. But in the present scenario convergence of both can easily be seen and felt as India is having both of them in its system.\n" +
                "\n" +
                "Common law, also known as case law, is law developed by judges through decisions of courts and similar tribunals. A \"common law system\" is a legal system that gives great precedential weight to common law, on the principle that it is unfair to treat similar facts differently on different occasions. The body of precedent is called \"common law\" and it binds future decisions. If a similar dispute has been resolved in the past, the court is bound to follow the reasoning used in the prior decision. The principle by virtue of which this is followed is called stare decisis.\n" +
                "\n" +
                "On the other hand, legislation is relatively new concept in judiciary and these laws are made by legislature. A legislature is a type of deliberative assembly with the power to pass, amend, and repeal laws. It originated while setting up of democratic government. The reason for its development in a certain kind of government is because its application is possible in the presence of a governing body and as we are very much familiar with the fact that governing body is a primary feature of democratic state. Legislations are also known as statutory laws and they can be set down by the national, state legislature or local municipalities."));
        clubs.add(new Three.Club("Legislation: India Legal System","Legislation, also known as statutory law, is the basic structure of present legal system of India. Statutory laws are based on the statutes enacted and imposed by the legislature. A statute is a formal act of the Legislature in written form. It declares the will of the Legislature. It may be declaratory of the law, or a command which must be obeyed, or a prohibition forbidding a course of conduct or a particular act. Legislation, at its best, is not a combat between ideological opponents but instead a sincere search for the best governing rules for our society. A conscious legislature might easily understand that it cannot foresee all future developments affected by its statute and might therefore wish to grant a trusted judicial agent the discretion to adapt its commands to the circumstances of adjudication. If so, pragmatism fits neatly within the delegation context.\n" +
                "A statute is the crystallization of an objective which may be political, social, economic or even personal but there will be a motive that lurks behind it. A group of persons may be interested in a particular measure which may call for the exercise of the legislative power of the state. Legislation then becomes the means to attain an end. These groups could be:\n" +
                "• Political parties\n" +
                "• Pressure groups\n" +
                "• Departmental officials\n" +
                "• Commissions of Inquiry\n" +
                "• Parliamentary committees\n" +
                "• Public and private organizations\n" +
                "Although some groups have a greater or more direct influence on the legislature than others, they are all united in the same conviction that a situation exists which calls for legislation."));
        clubs.add(new Three.Club("Legislation in India","Legislation in India seeks its history from British rule period. Since the time when India Became a colony of Britain, legislation, as a source of law, started growing at a slow rate at beginning but now in the present scenario, we see that legislature is the most important source of law.\n" +
                "Few pre-independent legislation which are still valid and followed in India are:\n" +
                "· Indian Penal Code, 1860\n" +
                "· Indian Evidence Act, 1872\n" +
                "· Indian Contract Act, 1872\n" +
                "· Civil Procedure Code, 1908\n" +
                "· Government of India Act, 1919\n" +
                "· Government of India Act, 1935"));
        clubs.add(new Three.Club("Research Analysis: Legislation v Common Law","After doing the research on the both prominent source of law, which are followed in India, I have analyzed few things. The most important observation I made from this project is that common law don’t have a binding value but have a persuasive value in Indian Legal System. This is observed because we have a similar common law background as United Kingdom.\n" +
                "\n" +
                "Common law, also known as case law, conveys from the name only that law made in this source of law are made by the decisions of the cases. This was mostly followed in UK, where if a case was brought up in the court of law and if the decision was given by the judge then that decision was taken as a law for the future cases. While in statutory law, laws are made by keeping future cases, which may arise, in mind.\n" +
                "\n" +
                "The power to judiciary for law making is not good. Judges are not law makers. They are just to interpret law. Primary job of a judge is to adjudicate. A Judge cannot do anything unless a matter is sent to the court before them. They are not capable of making laws for future problems. Under the provision of common law, the decisions given by the judges are considered as laws and are well known as precedent.\n" +
                "\n" +
                "In precedent, if the judge will say, ‘I follow the X rule.’ So after the decision is given, that X rule becomes a law. These laws were binding on all lower courts and at par and these precedents were only been allowed to be overruled by a court of higher jurisdiction. This was the greatest fault in this law system. The reason was because House of Lords, being the top most court of law in UK, if deliver any wrong judgment then even it itself was not having the power to overrule it. Amendments took place and the House of Lords were given power to overrule its previous judgments.\n" +
                "\n" +
                "Further, I have also analyzed that legislation can make law on its own initiatives. It does not need any case to be held up in court of law to make a law. It has power to make law and do make law for the future problems. For example, we have Information Technology Act, 2000. This Act was enforced to control different types of cyber crimes in India. Another most important Act which came into being for benefits is Right to Information Act under which we can ask information from any authority. In one of the cases of RTI, Shri Surinder Singh Rajpurohit, President, RIICO Industries Association, F- 8,Phase-III, Bewer- 305901.Letter dt 13-02-2009 received in DFCC on 20-02-2009 Deposited Rs.500/- Under RTI for information and document.\n" +
                "Another power which lies with the statute making body is that if they feel that any previous law, maybe a precedent or even a codified law is unjust then they can abrogate that law. Legislation can also abrogate its own law. In a famous case of M C Mehta v Union of India, it was witnessed how a common law principle was changed. Strict liability was abolished and principle of absolute liability was set as new law in similar circumstances.\n" +
                "Now as per the present scenario in Indian Legal System, one can easily figure it out that statutory laws are now made for almost all areas of crimes and wrongs. There are few areas even now where the law has not been codified completely and its example is tort law. Many of the cases in India follows or have followed precedents of common law. One of the precedents set up in Ryland v Flethcher which dealt with principle of strict liability was considered in India but few parts of the judgments were overruled.\n" +
                "\n" +
                "So, as of the present state of Indian Legal System we can easily analyze from the research that Statutory Law is prevailing over the case law as far as India is concerned"));

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
