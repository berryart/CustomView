package com.example.artemyagodin.cvv;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import android.widget.TextView;


public class Card extends RelativeLayout {
    TextView tv;

    public Card(Context context) {
        super(context);
        tv = new TextView(context);
    }

    public Card(Context context, AttributeSet attrs) {
        super(context, attrs);
        tv = new TextView(context);
    }

    public Card(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        tv = new TextView(context);
    }

    public Card(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        tv = new TextView(context);
    }

    private void init() {
        inflate(getContext(), R.layout.cvl, this);
        tv.setText("BBBBBB");
        this.addView(tv);
    }
}
