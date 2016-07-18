package org.houxg.rangebar;


import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;

public class DefaultRangeBar extends RangeBar {

    public DefaultRangeBar(Context context, AttributeSet attrs) {
        super(context, attrs);
        setBar(new LineBar(context, Color.LTGRAY));
        setThumb(new CircleThumb(context, Color.BLACK));
    }
}
