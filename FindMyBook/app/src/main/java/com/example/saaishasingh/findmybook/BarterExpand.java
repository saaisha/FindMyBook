package com.example.saaishasingh.findmybook;


import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

import it.gmariotti.cardslib.library.internal.CardExpand;

/**
 * Created by saaishasingh on 8/26/15.
 */
public class BarterExpand extends CardExpand {
    public BarterExpand(Context context) {
         this(context, R.layout.barter_expand);
    }

    public BarterExpand(Context context, int innerLayout) {
        super(context, innerLayout);
    }

    @Override
    public void setupInnerViewElements(ViewGroup parent, View view) {
        super.setupInnerViewElements(parent, view);
    }

}
