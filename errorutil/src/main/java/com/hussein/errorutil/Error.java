package com.hussein.errorutil;

import android.content.Context;
import android.widget.Toast;

public class Error {
    public static void showError(Context context)
    {
        Toast.makeText(context,"Error",Toast.LENGTH_LONG).show();
    }
}
