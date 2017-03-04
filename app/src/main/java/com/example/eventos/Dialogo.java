package com.example.eventos;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.util.Log;

/**
 * Created by usuwi on 04/03/2017.
 */

public class Dialogo extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle extras = getIntent().getExtras();
        Log.d("Dialogo","Vamos a lanzar un mensaje");
        if (getIntent().hasExtra("mensaje")) {
            Log.d("Dialogo","Se abre el AlertDialog");
            AlertDialog alertDialog = new AlertDialog.Builder(this).create();
            alertDialog.setTitle("Mensaje:");
            alertDialog.setMessage(extras.getString("mensaje"));
            alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "CERRAR", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                    finish();
                }
            });
            alertDialog.show();
            extras.remove("mensaje");
        }
    }
}
