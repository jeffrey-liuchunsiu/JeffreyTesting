package com.example.jeffreyliu.jeffreytesting;


import android.content.Context;
import android.util.AttributeSet;
import android.widget.Button;

/**
 * Created by Jeffrey Liu on 23/06/2016.
 */
public class SpecialButton extends Button {

    public SpecialButton(Context context) {
        super(context);
    }

    public SpecialButton(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public SpecialButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }



    public void jeffreyMethod (){
    setText("Guess who I am?");
};

public static void hello(){};
}
