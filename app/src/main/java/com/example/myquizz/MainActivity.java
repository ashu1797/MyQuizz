package com.example.myquizz;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    public static ArrayList<Modelclass> list;
    DatabaseReference databaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list=new ArrayList<>();

//        databaseReference= FirebaseDatabase.getInstance().getReference("Quetion");
//
//        databaseReference.addValueEventListener(new ValueEventListener() {
           // @Override
//            public void onDataChange(@NonNull DataSnapshot snapshot) {
//                for(DataSnapshot dataSnapshot:snapshot.getChildren()){
//                    Modelclass modelclass=dataSnapshot.getValue(Modelclass.class);
//                    list.add(modelclass);
//                }
//                Intent intent = new Intent(MainActivity.this,DashboardActivity.class);
//                startActivity(intent);
//
//            }

           // @Override
//            public void onCancelled(@NonNull DatabaseError error) {
//
//            }
//        });
        list.add(new Modelclass("The first metal used by the men was","Iron","Copper","Aluminium","Gold","Copper"));
        list.add(new Modelclass("Gobar gas contains mainly","Carbon Dioxide","Methane","Ethylene","Carbon Monoxide","Methane"));
        list.add(new Modelclass("Which of the following is a balanced fertiliser for plants?","Urea","Ammonia Sulphate","Nitrates","Compost","Compost"));
        list.add(new Modelclass("Which of the following is fast growing tree?","Teak","Eucalyptus","Banyan","Coconut","Eucalyptus"));
        list.add(new Modelclass("The study of phenomena at very low temperature is called","Heat Transfer","Morphology","Crystallography","cryogenics","cryogenics"));
        list.add(new Modelclass("If a metal can be drawn into wires relatively easily it is called","malleable","ductile","extractive","tactile","ductile"));
        list.add(new Modelclass("Crytitis is the infection of which of the following?","liver","urinary bladder","pancrease","lung","urinary bladder"));
        list.add(new Modelclass("Which of the following is a balanced fertiliser for plants","Urea","Ammonia Sulphate","Nitrates","Compost","Compost"));
        list.add(new Modelclass("Who receives Dronacharya Award?","Scientists","Movie Actors","Sports Coaches","Sportsmen","Sports Coaches"));


        new Handler().postDelayed(() -> {
         Intent intent = new Intent(MainActivity.this,DashboardActivity.class);
            startActivity(intent);
        },1500);

    }
}