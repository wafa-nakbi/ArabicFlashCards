package com.example.arabic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TableLayout;


public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TableLayout table= (TableLayout) findViewById(R.id.table);
        final Button btn_a= (Button) findViewById(R.id.a);
        final Button btn_ain= (Button) findViewById(R.id.ain);
        final Button btn_b= (Button) findViewById(R.id.b);
        final Button btn_c= (Button) findViewById(R.id.c);
        final Button btn_d= (Button) findViewById(R.id.d);
        final Button btn_f= (Button) findViewById(R.id.f);
        final Button btn_gh= (Button) findViewById(R.id.gh);
        final Button btn_h= (Button) findViewById(R.id.h);
        final Button btn_hh= (Button) findViewById(R.id.hh);
        final Button btn_j= (Button) findViewById(R.id.j);
        final Button btn_k= (Button) findViewById(R.id.k);
        final Button btn_kh= (Button) findViewById(R.id.kh);
        final Button btn_kk= (Button) findViewById(R.id.kk);
        final Button btn_l= (Button) findViewById(R.id.l);
        final Button btn_m= (Button) findViewById(R.id.m);
        final Button btn_n= (Button) findViewById(R.id.n);
        final Button btn_r= (Button) findViewById(R.id.r);
        final Button btn_s= (Button) findViewById(R.id.s);
        final Button btn_sh= (Button) findViewById(R.id.sh);
        final Button btn_ss= (Button) findViewById(R.id.sad);
        final Button btn_ta= (Button) findViewById(R.id.ta);
        final Button btn_th= (Button) findViewById(R.id.th);
        final Button btn_tha= (Button) findViewById(R.id.tha);
        final Button btn_thd= (Button) findViewById(R.id.thad);
        final Button btn_thh= (Button) findViewById(R.id.thal);
        final Button btn_w= (Button) findViewById(R.id.w);
        final Button btn_y= (Button) findViewById(R.id.y);
        final Button btn_z= (Button) findViewById(R.id.z);
        table.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(getApplicationContext(),MainActivity.class);



            }
        });
        btn_a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               openActivityA();

            }
        });
        btn_ain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openActivityAIN();

            }
        });
        btn_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openActivityB();

            }
        });

        btn_c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openActivityC();

            }
        });
        btn_d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openActivityD();

            }
        });
        btn_f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openActivityF();

            }
        });
        btn_gh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openActivityGH();

            }
        });
        btn_h.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openActivityH();

            }
        });
        btn_hh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openActivityHH();

            }
        });
        btn_j.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openActivityJ();

            }
        });
        btn_k.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openActivityK();

            }
        });
        btn_kh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openActivityKH();

            }
        });
        btn_kk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openActivityKK();

            }
        });
        btn_l.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openActivityL();

            }
        });
        btn_m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openActivityM();

            }
        });
        btn_n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openActivityN();

            }
        });
        btn_r.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openActivityR();

            }
        });
        btn_s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openActivityS();

            }
        });
        btn_sh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openActivitySH();

            }
        });
        btn_ss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openActivitySS();

            }
        });
        btn_ta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openActivityTA();

            }
        });
        btn_th.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openActivityTH();

            }
        });
        btn_tha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openActivityTHA();

            }
        });
        btn_thd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openActivityTHD();

            }
        });
        btn_thh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openActivityTHH();

            }
        });
        btn_w.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openActivityW();

            }
        });
        btn_y.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openActivityY();

            }
        });
        btn_z.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openActivityZ();

            }
        });




    }

    public void openActivityA(){
        Intent intent= new Intent(this,AcivityA.class);
        startActivity(intent);


    }
    public void openActivityAIN(){
        Intent intent= new Intent(this, ActivityAIN.class);
        startActivity(intent);


    }

    public void openActivityB(){
        Intent intent= new Intent(this, ActivityB.class);
        startActivity(intent);


    }

    public void openActivityC(){
        Intent intent= new Intent(this, ActivityC.class);
        startActivity(intent);


    }

    public void openActivityD(){
        Intent intent= new Intent(this, ActivityD.class);
        startActivity(intent);


    }

    public void openActivityF(){
        Intent intent= new Intent(this, ActivityF.class);
        startActivity(intent);


    }
    public void openActivityGH(){
        Intent intent= new Intent(this, ActivityGH.class);
        startActivity(intent);


    }
    public void openActivityH(){
        Intent intent= new Intent(this, ActivityH.class);
        startActivity(intent);


    }
    public void openActivityHH(){
        Intent intent= new Intent(this, ActivityHH.class);
        startActivity(intent);


    }
    public void openActivityJ(){
        Intent intent= new Intent(this, ActivityJ.class);
        startActivity(intent);


    }
    public void openActivityK(){
        Intent intent= new Intent(this, ActivityK.class);
        startActivity(intent);


    }
    public void openActivityKH(){
        Intent intent= new Intent(this, ActivityKH.class);
        startActivity(intent);


    }
    public void openActivityKK(){
        Intent intent= new Intent(this, ActivityKK.class);
        startActivity(intent);


    }
    public void openActivityL(){
        Intent intent= new Intent(this, ActivityL.class);
        startActivity(intent);


    }
    public void openActivityM(){
        Intent intent= new Intent(this, ActivityM.class);
        startActivity(intent);


    }
    public void openActivityN(){
        Intent intent= new Intent(this, ActivityN.class);
        startActivity(intent);


    }
    public void openActivityR(){
        Intent intent= new Intent(this, ActivityR.class);
        startActivity(intent);


    }
    public void openActivityS(){
        Intent intent= new Intent(this, ActivityS.class);
        startActivity(intent);


    }
    public void openActivitySH(){
        Intent intent= new Intent(this, ActivitySH.class);
        startActivity(intent);


    }
    public void openActivitySS(){
        Intent intent= new Intent(this, ActivitySS.class);
        startActivity(intent);


    }
    public void openActivityTA(){
        Intent intent= new Intent(this, ActivityTA.class);
        startActivity(intent);


    }
    public void openActivityTH(){
        Intent intent= new Intent(this, ActivityTH.class);
        startActivity(intent);


    }
    public void openActivityTHA(){
        Intent intent= new Intent(this, ActivityTHA.class);
        startActivity(intent);


    }
    public void openActivityTHD(){
        Intent intent= new Intent(this, ActivityTHD.class);
        startActivity(intent);


    }
    public void openActivityTHH(){
        Intent intent= new Intent(this, ActivityTHH.class);
        startActivity(intent);


    }
    public void openActivityW(){
        Intent intent= new Intent(this, ActivityW.class);
        startActivity(intent);


    }
    public void openActivityY(){
        Intent intent= new Intent(this, ActivityY.class);
        startActivity(intent);


    }
    public void openActivityZ(){
        Intent intent= new Intent(this, ActivityZ.class);
        startActivity(intent);


    }
}
