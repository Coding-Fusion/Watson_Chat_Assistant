package com.example.debrathdev.springas;

import android.os.Bundle;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.view.View;
import android.support.v7.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;

/**
 * Created by DEBRATH(DEV) on 3/18/2018.
 * Commented pAuthListener to disable Google sign in feature and also updated manifest to comment sign in on 10/15/2018
 */

public class home_child extends AppCompatActivity implements View.OnClickListener{

    private CardView csObj,isObj,logObj;
    //FirebaseAuth pAuth;
   // FirebaseAuth.AuthStateListener pAuthListener;

    //@Override
//    protected void onStart() {
//        super.onStart();
//        pAuth.addAuthStateListener(pAuthListener);
//    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_child1);
        //Defining card
       csObj = (CardView) findViewById(R.id.linkc);
       isObj = (CardView) findViewById(R.id.link_i);
       logObj = (CardView) findViewById(R.id.link_logout);
       csObj.setOnClickListener(this);
       isObj.setOnClickListener(this);
       logObj.setOnClickListener(this);
      // pAuth=FirebaseAuth.getInstance();

//       pAuthListener = new FirebaseAuth.AuthStateListener() {
//           @Override
//           public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {
//               if(firebaseAuth.getCurrentUser()== null){
//                   startActivity(new Intent(home_child.this,HomePageActivity.class));
//               }
//           }
//       };

    }
  //Use this code if you use google sign

    @Override
    public void onClick(View v) {
    Intent i;

    switch(v.getId()){

        case R.id.link_i : i = new Intent(this,send_message.class);startActivity(i);break;
        case R.id.linkc : i = new Intent(this,send_message_cs.class);startActivity(i);break;
        case R.id.link_logout : i = new Intent(this,HomePageActivity.class);startActivity(i);break;
       // case R.id.link_logout : pAuth.signOut(); break; // To be used to enable sign-in feature
        default:break;
    }
    }
}
