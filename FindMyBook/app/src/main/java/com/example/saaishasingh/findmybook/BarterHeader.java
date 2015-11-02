package com.example.saaishasingh.findmybook;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import it.gmariotti.cardslib.library.internal.CardHeader;

/**
 * Created by saaishasingh on 8/20/15.
 */
public class BarterHeader extends CardHeader {
    ImageView barterHeaderImage;
    TextView barterHeaderText;
    RelativeLayout barterHeaderLayout;
    FrameLayout barterHeaderFrame;
    int colorFin;

    public BarterHeader(Context context,int color) {
        this(context,color, R.layout.barter_header);
    }
    public BarterHeader(Context context,int color, int innerLayout) {
        super(context, innerLayout);
        colorFin=color;
    }

    @Override
    public void setupInnerViewElements(ViewGroup parent, View view) {
        barterHeaderImage=(ImageView) parent.findViewById(R.id.barter_header_image);
        barterHeaderText=(TextView) parent.findViewById(R.id.card_header_inner_simple_title);
        barterHeaderLayout=(RelativeLayout) parent.findViewById(R.id.barter_header_layout);
        barterHeaderFrame= (FrameLayout) parent.findViewById(R.id.card_header_inner_frame);

        barterHeaderImage.setBackgroundResource(R.drawable.scaleswhite32);
        barterHeaderText.setText("Let's Barter");
        barterHeaderText.setTextColor(Color.parseColor("#ffffff"));
        barterHeaderText.setTextSize(32);
//        barterHeaderText.setTextAppearance(getContext(),R.style.HeaderFont);
        barterHeaderLayout.setBackgroundColor(colorFin);

    }


}
