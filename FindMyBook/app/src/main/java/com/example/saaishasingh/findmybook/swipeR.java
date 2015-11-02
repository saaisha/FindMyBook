package com.example.saaishasingh.findmybook;

import android.view.View;
import android.widget.ListView;

import it.gmariotti.cardslib.library.internal.Card;
import it.gmariotti.cardslib.library.view.listener.SwipeDismissListViewTouchListener;

/**
 * Created by saaishasingh on 8/27/15.
 */
public class swipeR extends SwipeDismissListViewTouchListener {
    private DismissCallbacks mCallbacks;
    private ListView mListView;



    public swipeR(ListView listView, DismissCallbacks callbacks) {
        super(listView, callbacks);
        mCallbacks=callbacks;
        mListView=listView;
    }

    public interface DismissCallbacks extends SwipeDismissListViewTouchListener.DismissCallbacks {
        /**
         * Called to determine whether the given position can be dismissed.
         */
        boolean canDismiss(int position, Card card);

        /**
         * Called when the user has indicated they she would like to dismiss one or more list item
         * positions.
         *
         * @param listView               The originating {@link ListView}.
         * @param reverseSortedPositions An array of positions to dismiss, sorted in descending
         *                               order for convenience.
         */
        void onDismiss(ListView listView, int[] reverseSortedPositions, boolean dismissRight);
    }

    private void dismiss(final View view, final int position, boolean dismissRight) {
        if (view == null) {
            // No view, shortcut to calling onDismiss to let it deal with adapter
            // updates and all that.
            mCallbacks.onDismiss(mListView, new int[]{position}, dismissRight);
            return;
        }

    }
}
