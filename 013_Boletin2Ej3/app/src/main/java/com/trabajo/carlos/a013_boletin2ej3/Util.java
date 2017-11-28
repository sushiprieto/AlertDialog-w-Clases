package com.trabajo.carlos.a013_boletin2ej3;

import android.app.Activity;
import android.support.v7.app.AlertDialog;

/**
 * Created by Carlos Prieto on 26/11/2017.
 */

public class Util {

    public static void dialogo(Activity a, String titulo, String mensaje){

        AlertDialog.Builder dialog = new AlertDialog.Builder(a);
        dialog.setTitle(titulo);
        dialog.setMessage(mensaje);
        dialog.setNeutralButton("OK", null);
        dialog.create().show();



    }

}


