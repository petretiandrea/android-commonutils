package com.andreapetreti.androidcommonutils.view;

import android.view.View;

import com.annimon.stream.function.Supplier;

public final class ViewVisibility {

    /**
     * Set the View visibility to @{View.VISIBLE} if the supplier return true, otherwise set the
     * visibility to @{View.GONE}.
     * @param view The view to change the visibility.
     * @param supplier Supplier used to verify the visibility.
     * @return The same view.
     */
    public static <T extends View> T apply(T view, Supplier<Boolean> supplier) {
        view.setVisibility(supplier.get() ? View.VISIBLE : View.GONE);
        return view;
    }
}
