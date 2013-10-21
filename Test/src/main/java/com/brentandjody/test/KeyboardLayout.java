package com.brentandjody.test;

import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by brent on 20/10/13.
 */
public class KeyboardLayout extends LinearLayout {

    private static final int TOUCH_RADIUS = 10;
    private List<ImageButton> keys = new ArrayList<ImageButton>();

    public KeyboardLayout(Context context) {
        super(context);
    }

    public KeyboardLayout(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    public KeyboardLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onLayout(boolean changed, int l, int t, int r, int b) {
        super.onLayout(changed, l, t, r, b);
        keys.clear();
        enumerateKeys(this);
    }

    private void enumerateKeys(View v) {
        if (v instanceof ViewGroup) {
            ViewGroup vg = (ViewGroup) v;
            int children = vg.getChildCount();
            for (int i=0; i<children; i++) {
                enumerateKeys(vg.getChildAt(i));
            }
        } else if (v instanceof ImageButton) {
            keys.add((ImageButton) v);
        }
    }


    @Override
    public boolean onTouchEvent(MotionEvent event) {
        // iterate over all keys, and toggle all those within TOUCH_RADIUS
        if (event.getAction() == MotionEvent.ACTION_DOWN) {
            float minX = event.getX() - TOUCH_RADIUS;
            float maxX = event.getX() + TOUCH_RADIUS;
            float minY = event.getY() - TOUCH_RADIUS;
            float maxY = event.getY() + TOUCH_RADIUS;
            for (ImageButton key:keys) {
                if ((key.getX() > minX)
                        && ((key.getX()+key.getWidth()) < maxX)
                        && (key.getY() > minY)
                        && ((key.getY()+key.getHeight()) < maxY)) {
                    key.setSelected(! key.isSelected());
                }
            }
        }
        return true;
    }


}
