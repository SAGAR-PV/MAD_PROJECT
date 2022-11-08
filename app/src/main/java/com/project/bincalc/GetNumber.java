package com.project.bincalc;
import android.view.View;


public class GetNumber {
    String d;
    GetNumber(View view)
    {
        d=view.getTag().toString();
    }

    public String getD() {
        return d;
    }
}
