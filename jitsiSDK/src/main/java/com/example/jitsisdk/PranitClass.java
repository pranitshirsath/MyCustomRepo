package com.example.jitsisdk;

import android.content.Context;
import android.widget.Toast;

public class PranitClass  {

    public static void print(Context c, String mesa){
        Toast.makeText(c, mesa, Toast.LENGTH_SHORT).show();
    }
}
