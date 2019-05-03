package com.assignment.androidtask;

import android.databinding.BindingAdapter;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.widget.ImageView;

import com.squareup.picasso.MemoryPolicy;
import com.squareup.picasso.Picasso;


public class DataBinding {
    @BindingAdapter({"imageUrl", "placeHolder"})
    public static void loadImage(ImageView view, String imageUrl, Drawable placeHolder) {
        if (!TextUtils.isEmpty(imageUrl)) {
            Picasso.with(view.getContext()).invalidate(imageUrl);
            Picasso.with(view.getContext())
                    .load(imageUrl)
                    .memoryPolicy(MemoryPolicy.NO_CACHE)
                    .centerCrop().fit()
                    .placeholder(placeHolder)
                    .into(view);
        } else view.setImageDrawable(placeHolder);

    }

}
