package com.example.saaishasingh.findmybook;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;

import java.util.ArrayList;

import it.gmariotti.cardslib.library.internal.Card;
import it.gmariotti.cardslib.library.internal.CardArrayAdapter;
import it.gmariotti.cardslib.library.internal.CardHeader;
import it.gmariotti.cardslib.library.view.CardListView;
import it.gmariotti.cardslib.library.view.CardViewNative;

/**
 * Created by saaishasingh on 8/19/15.
 */
public class Home extends Activity {
 int barterHeaderColor,rentHeaderColor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);
        barterHeaderColor=Color.parseColor("#E6E8D6");
        rentHeaderColor=Color.parseColor("#0F0F4C");
        ArrayList<Card> cards = new ArrayList<Card>();

        Card card = new BarterCard(getApplicationContext(),R.layout.barter_inner);
        Card cardRent = new BarterCard(getApplicationContext(),R.layout.barter_inner);

        CardHeader header = new BarterHeader(getApplicationContext(),barterHeaderColor);
        CardHeader headerRent = new BarterHeader(getApplicationContext(),rentHeaderColor);

        card.addCardHeader(header);
        cardRent.addCardHeader(headerRent);

        BarterExpand barterExpand= new BarterExpand(getApplicationContext());
        card.addCardExpand(barterExpand);
        BarterExpand rentExpand= new BarterExpand(getApplicationContext());
        cardRent.addCardExpand(rentExpand);
//
//        card.setOnSwipeListener(new Card.OnSwipeListener() {
//            @Override
//            public void onSwipe(Card card) {
//                Intent barterIntent = new Intent(Home.this, BarcodeScanner.class);
//                startActivity(barterIntent);
//            }
//        });
//        card.getOnSwipeListener().onSwipe(card);


        CardViewNative cardView = (CardViewNative) findViewById(R.id.carddemo);
        cardView.setCard(card);
        //cardView.setCard(cardRent);

//        cards.add(card);
//        cards.add(cardRent);
//
//        CardArrayAdapter mCardArrayAdapter = new CardArrayAdapter(this,cards);
//
//        CardListView listView = (CardListView) findViewById(R.id.myList);
//        if (listView!=null){
//            listView.setAdapter(mCardArrayAdapter);
//        }
    }
}
