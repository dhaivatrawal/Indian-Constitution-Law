package com.example.dhaivat.law;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;

import java.util.ArrayList;
import java.util.List;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class Four extends AppCompatActivity {

    RecyclerView recyclerView;
    Context context;
    private List<Club> clubs;
    private final String TAG = detail.class.getSimpleName();
    private AdView mAdView;
    private InterstitialAd minterstitialAd;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.four);

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

        RecyclerViewAdapterFour adapter = new RecyclerViewAdapterFour(clubs);

        initializeData();
        initializeAdapter();
    }



    private void initializeAdapter() {

        RecyclerViewAdapterFour adapter = new RecyclerViewAdapterFour(clubs);
        recyclerView.setAdapter(adapter);

    }

    private void initializeData() {

        clubs = new ArrayList<>();
        clubs.add(new Four.Club("What is Statutory Law?", "Statutory law is law that’s written by a legislative body. It’s law that a government deliberately creates through elected legislators and an official legislative process. It’s up to the judiciary to interpret and enforce statutory law, but the judiciary can’t create statutory law.\n" +
                "\n" +
                "Laws created by statute are often codified. That means they’re all put together in one place and given numbers for reference. For example, the United States Code is the indexed collection of U.S. law. States have their own collections of statutes and codes."));
        clubs.add(new Four.Club("What’s not statutory law?", "Statutory law is law that’s purposefully created by a legislature and made into law. Representatives contemplate what they think the law should be. They spend time drafting, editing and passing the law. To understand statutory law, it’s helpful to understand what it’s not:\n" +
                "\n" +
                "Common law\n" +
                "Common law is law that a judiciary creates over time. It’s not passed by a legislative body. Instead, case by case, the judiciary determines what they think are sound principles of law.\n" +
                "\n" +
                "When they apply these principles, one at a time, in real cases, common law develops. This isn’t statutory law. Statutory law is created in one act by a legislative body. It isn’t piecemeal like common law. Rather, statutory law either exists, or it doesn’t.\n" +
                "\n" +
                "Administrative law\n" +
                "Administrative law is the body of law that’s created by executive agencies. Legislators authorize the agencies to exist. They allow the agencies to make their own rules in their area of governance.\n" +
                "\n" +
                "For example, if a state has a department of natural resources or a department of fish and game, they might authorize the department to create their own laws and rules about hunting and fishing. These rules have the force of law, and they can even be misdemeanor or felony offenses. However, they’re not statutory law. Statutory law comes from a legislative body rather than from executive administrators or bureaucrats."));
        clubs.add(new Four.Club("A body of law can be both statutory and common law", "In some cases, an area of law develops through common law. Then, lawmakers come along and add to the law through statutes. They may not completely override or even write out the current state of the common law. Instead, they may just clarify it and add to it.\n" +
                "\n" +
                "One place where this commonly occurs among states is in tort actions stemming from negligence. The principles of negligence develop through common law. The courts, through their opinions, make the rules for what a litigant needs to prove in order to prevail on a claim for negligence. The basic elements for a negligence claim are that the defendant owed a duty to the plaintiff, they breached that duty, the breach caused the plaintiff harm and the plaintiff had damages.\n" +
                "\n" +
                "Lawmakers in individual states often want to make minor adjustments to the doctrine of negligence. They may want to discuss how comparative or contributory negligence affects a plaintiff’s claim. They may want to define when it’s appropriate for a jury to award punitive damages. Lawmakers may want to codify product liability in order to remove the negligence requirement to make it easier for a plaintiff to seek recovery.\n" +
                "\n" +
                "When lawmakers make these changes to their state laws, they usually don’t write down the entire negligence law. Instead, they just state what they’re clarifying or changing. For example, Nevada’s law 41.141 discusses comparative negligence. It doesn’t list the elements of negligence. It only states how comparative negligence applies to a case, and it gives a jury instruction on the issue."));
        clubs.add(new Four.Club("How the courts interpret statutory law", "When the courts set out to interpret a statute, they start by looking at the plain language of the law. If the law is clear, the courts conclude that the law means what it says. The courts presume that the legislature intends to give meaning to every word in the law. They reject the idea that the legislature would have put in extra words that don’t mean anything.\n" +
                "\n" +
                "The courts try to follow the intent of the legislature. To determine legislative intent, they might look at prior drafts or even the debate surrounding passage of the law. When a word is ambiguous, they look at its context. In criminal matters, when there’s an ambiguity, the accused gets the benefit of the doubt.\n" +
                "\n" +
                "In some circumstances, a court might invalidate a statute. They might find that it’s unconstitutional. In that event, they might throw out the entire law, or they might invalidate only the parts that they decide are unconstitutional."));
        clubs.add(new Four.Club("Who can create statutory law?", "All levels of government can create statutory law. It comes from federal, state and even local governments. A government can make a statute that applies in its jurisdiction and to lower levels of government. For example, the federal government can make a law that applies everywhere in the United States. The states can make laws that apply to only their states.\n" +
                "\n" +
                "Cities, townships and other municipalities can make laws that apply within their borders. A municipality can’t invalidate a state or federal law. Likewise, a state can’t invalidate a federal law."));
        clubs.add(new Four.Club("Who practices statutory law?", "Most attorneys work with statutory law in their career. Whatever their area of practice, attorneys must know the laws that apply. If you practice in finance, torts, criminal, patent or any other type of law, you’re going to encounter some statutes that apply. Every attorney must know the statutes that apply to their area of specialization.\n" +
                "\n" +
                "Because no two cases are ever the same, there’s a good chance that you’re going to encounter a time where a law isn’t clear given the facts of your case. The law might be too vague to cover your specific situation. You may have a situation that hasn’t ever come up before. You’ll have to argue to the judge why the court should interpret the statute your way. In this respect, all lawyers should be prepared to practice statutory law, because there’s a good chance that it will come up at some point.\n" +
                "\n" +
                "For lawyers wanting to specialize in statutory law, there’s work to be done at all levels but particularly at the highest levels of the courts. Cases that involve statutory interpretation often move through appeals to the highest levels of state and federal courts. Statutory lawyers are often lawyers who focus on appellate work. The courts also need statutory lawyers to work on research and briefing the issues in order to help the judges do their work.\n" +
                "\n" +
                "Statutory lawyers also work in the legislative branch. When a legislative body creates a new law, it must be written carefully in order to have the intended meaning. Legislators may or may not be lawyers themselves, and most state and federal legislative bodies have attorneys on staff in order to help with the drafting process. Attorneys who know how statutory interpretation works can provide a valuable service for the legislature in helping them create laws that are going to be upheld and interpreted in the way that they intend. A municipal government may not have a staff attorney, but they may contract with an attorney that specializes in government law in order to complete this work."));
        clubs.add(new Four.Club("Why Become a Statutory Lawyer", "Statutory law is a great choice for lawyers who like to write. Attorneys who draft laws must pour over them in detail. They get to fret over a single word, the tense of a verb and whether to say may or shall.\n" +
                "\n" +
                "Lawyers who argue to the court for statutory interpretation also do a great deal of writing. They must write detailed briefs in order to make their case to the court. Oral arguments are usually only a small part of making the case. Writing down the arguments for judges and their staff to review and consider is the most important part of bringing a successful appeal. For lawyers who always enjoyed their high school English classes, statutory law can be an enjoyable practice area."));
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
