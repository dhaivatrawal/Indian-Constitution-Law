package com.example.dhaivat.law;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.widget.NestedScrollView;

import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdView;


public class index extends AppCompatActivity {
    ListView listView;
    CardView ccdone,ccdtwo,ccdthree,ccdfour,cdconsti,cdipc,cdcustom;
    ImageView buttonShowCustomDialog , share ;
    ScrollView sccc;
    Context ctx = this;
    String law[] = {" Motor Vehicle Act ", " Criminal Procedure Code ", " Indian Penal Code ",
            " Indian Srius Act ", " Motor Vehicle Act ", " Domestic Violent Act ", " Police Act ",
            " Maternity Benefit Act ", " Income Tax Act ", " Hindu Marriage Age ",
            " Code Of Criminal Procedure ", " Maximum Retail Price Act ", " Citizen Charter (Indian Oil Corp.) ",
            " FCRA ", " Automotive (Amendment) Bill ", " Limitation Act ",
            " Section 294 of the Indian Penal Code ", " Hindu Adoption and Maintenance Act ",
            " Delhi Rent Control Act "};

    public long backpresstime;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.example.dhaivat.law.R.layout.activity_index);


        allocatememory();

        setevent();



        sccc.pageScroll(View.FOCUS_UP);



        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, com.example.dhaivat.law.R.layout.design, com.example.dhaivat.law.R.id.txt, law);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                int poisitonofitem = position;
                String itemvalue = (String) listView.getItemAtPosition(position);

                Toast.makeText(getApplicationContext(), itemvalue , Toast.LENGTH_LONG).show();

                Intent i = new Intent(ctx, detail.class);
                i.putExtra("position", position);
                startActivity(i);
            }
        });


    }

    private void setevent()
    {

        cdconsti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Consti.class);
                startActivity(intent);
            }
        });
        cdcustom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),ICL.class);
                startActivity(intent);
            }
        });
        cdipc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),IPC.class);
                startActivity(intent);
            }
        });

        ccdone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),One.class);
                startActivity(intent);
            }
        });
        ccdtwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Two.class);
                startActivity(intent);
            }
        });
        ccdthree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Three.class);
                startActivity(intent);
            }
        });
        ccdfour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Four.class);
                startActivity(intent);
            }
        });


     buttonShowCustomDialog.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {

             dialogue();

         }
     });
     share.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
                 Intent a = new Intent(Intent.ACTION_SEND);
             final  String appPackageNAme = getApplicationContext().getPackageName();
             String strAppLink ="";

             try
             {
                 strAppLink = "http://play.google.com/store/apps/details?id=" + appPackageNAme;
             }
             catch (android.content.ActivityNotFoundException anfe)
             {
                 strAppLink = "https:/play.google.com/store/apps/details?id=" + appPackageNAme;
             }
             a.setType("text/link");
             String sharebody = "This app is basically on Indian Laws which every Indians should know so that they became aware about the Indian Law System."+ " " +
                     " Please Comment and Rate Us. " + "Download this Exclusive application and Share it." + "\n"+""+strAppLink;
             String sharesub = "APP NAME ";
             a.putExtra(Intent.EXTRA_SUBJECT,sharesub);
             a.putExtra(Intent.EXTRA_TEXT,sharebody);
             startActivity(Intent.createChooser(a,"Share Using"));
             }

     });
    }

    private void dialogue(){

        final Dialog dialog = new Dialog(ctx);
        dialog.setContentView(com.example.dhaivat.law.R.layout.custom);

        // set the custom dialog components - text, image and button
        TextView title_law = (TextView) dialog.findViewById(com.example.dhaivat.law.R.id.title_law);
        title_law.setText("#19 Laws You Should Know !");
        TextView text = (TextView) dialog.findViewById(com.example.dhaivat.law.R.id.text);
        text.setText("This app is basically on Indian Laws which every Indians should know so that they became aware about the Indian Law System.");
        ImageView image = (ImageView) dialog.findViewById(com.example.dhaivat.law.R.id.image);
        image.setImageResource(com.example.dhaivat.law.R.mipmap.app_logo1);

        Button dialogButton = (Button) dialog.findViewById(com.example.dhaivat.law.R.id.dialogButtonOK);
        // if button is clicked, close the custom dialog
        dialogButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });

        dialog.show();
    }





    private void allocatememory() {
        buttonShowCustomDialog = findViewById(R.id.buttonShowCustomDialog);
        share = findViewById(R.id.share);
        listView = findViewById(R.id.list);
        ccdone = findViewById(R.id.cdone);
        ccdtwo = findViewById(R.id.cdtwo);
        ccdthree = findViewById(R.id.cdthree);
        ccdfour = findViewById(R.id.cdfour);
        cdconsti = findViewById(R.id.cdconsti);
        cdcustom = findViewById(R.id.cdcustom);
        cdipc = findViewById(R.id.cdipc);
        sccc = (ScrollView) findViewById(R.id.nnstd);

    }




    @Override
    public void onBackPressed() {
        if (backpresstime + 2000 > System.currentTimeMillis()) {
            opendialogbox();
        } else {
            Toast.makeText(this, "Press again to exit", Toast.LENGTH_SHORT).show();
        }
        backpresstime = System.currentTimeMillis();
    }

    private android.app.AlertDialog opendialogbox() {
        ImageView imageView;
        //Button yes, no;

        final android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(index.this);
        ViewGroup viewGroup = findViewById(android.R.id.content);
        final View dialogView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.dialogbox_file, viewGroup, false);

        builder.setView(dialogView);
        builder.setView(dialogView)
                .setCancelable(false)
                .setTitle("EXIT")
                .create();
        builder.setNegativeButton("yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                int i = 10;
                System.exit(i);
            }
        });

        builder.setPositiveButton("no", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });

        imageView = dialogView.findViewById(R.id.ads);
        //yes = dialogView.findViewById(R.id.yes);
        // no = dialogView.findViewById(R.id.no);

        //final AlertDialog alertDialog = builder.create();

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String AppUrl = "https://play.google.com/store/apps/details?id=com.ZeDRapps.granular&hl=en";
                Intent iq = new Intent(Intent.ACTION_VIEW, Uri.parse(AppUrl));
                startActivity(iq);
            }
        });


       /* yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int i = 50;
                System.exit(i);
            }
        });
        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AlertDialog alertDialog = builder.create();
                alertDialog.dismiss();

                Toast.makeText(ctx , "hi" , Toast.LENGTH_SHORT).show();
            }
        });

        */

        return builder.show();

    }

}
