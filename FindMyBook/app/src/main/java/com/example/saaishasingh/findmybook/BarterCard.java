package com.example.saaishasingh.findmybook;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import it.gmariotti.cardslib.library.internal.Card;
import it.gmariotti.cardslib.library.internal.ViewToClickToExpand;

/**
 * Created by saaishasingh on 8/20/15.
 */
public class BarterCard extends Card{

    TextView mTitle;
    ImageView barterFav;
    ImageView barterLatest;
    boolean favorited=false;
    boolean latestClicked=false;

    public BarterCard(Context context) {
       this(context, R.layout.barter_inner);
    }
    public BarterCard(Context context, int innerLayout) {
        super(context, innerLayout);
        init();
    }

    @Override
    public void setupInnerViewElements(ViewGroup parent, View view) {
        mTitle = (TextView) parent.findViewById(R.id.card_main_inner_simple_title);
        barterFav=(ImageView) parent.findViewById(R.id.barter_favorite);
        barterLatest=(ImageView) parent.findViewById(R.id.barter_latest);

        barterFav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(favorited==false) {
                    Toast.makeText(getContext(), "Bartering is now your favorite ! This will influence the order the search results are displayed in !", Toast.LENGTH_SHORT).show();
                    barterFav.setImageResource(R.drawable.favoriteyellow24);
                    favorited=true;
                }
                else
                {
                    Toast.makeText(getContext(), "Bartering has been removed from your favorites", Toast.LENGTH_SHORT).show();
                    barterFav.setImageResource(R.drawable.favoritegrey24);
                    favorited=false;
                }
            }
        });
        barterLatest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(latestClicked==false)
                {
                   doExpand();
                    latestClicked=true;
                }
                else {

                    doCollapse();
                    latestClicked=false;
                }
            }
        });
//        barterText = (TextView) parent.findViewById(R.id.barter_card_text_view);
//        mTitle.setTextAppearance(getContext(),R.style.BodyFont);
        mTitle.setPadding(80, 0, 0, 0);
        mTitle.setTextSize(16);
        mTitle.setTextColor(Color.parseColor("#90908F"));
        mTitle.setText("Looking for the new Game of Thrones book? No time to go to a library and get a card made? You're at the right place! Click here to explore !");

    }

    private void init(){
        ViewToClickToExpand viewToClickToExpand =
                ViewToClickToExpand.builder()
                        .setupView(barterLatest);
        setViewToClickToExpand(viewToClickToExpand);
        //Set a OnClickListener listener
        setOnClickListener(new OnCardClickListener() {
            @Override
            public void onClick(Card card, View view) {
                Toast.makeText(getContext(), "Click Listener card=", Toast.LENGTH_LONG).show();
            }
        });
    }



}
