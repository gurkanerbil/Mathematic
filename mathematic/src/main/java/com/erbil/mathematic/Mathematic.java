package com.erbil.mathematic;

import android.content.Context;
import android.widget.Toast;

public class Mathematic {

    private Context context;

    public Mathematic() {
    }

    public Mathematic(Context context) {
        this.context = context;
    }

    public void onAttach(Context context) {
        this.context = context;
    }

    public void onDetach() {
        this.context = null;
    }

    public int topla(int topla1, int topla2) {
        return topla1 + topla2;
    }

    public int cikar(int cikarilan, int cikan) {
        return cikarilan - cikan;
    }

    public int carp(int carp1, int carp2) {
        return carp1 * carp2;
    }

    public int bol(int bolunen, int bolen) {
        if (bolen == 0) {
            return -1;
        } else {
            return bolunen / bolen;
        }
    }

    public int topla(String topla1, String topla2) {
        int t1 = Integer.parseInt(topla1);
        int t2 = Integer.parseInt(topla2);
        return t1 + t2;
    }

    public int cikar(String cikarilan, String cikan) {
        int c1 = Integer.parseInt(cikarilan);
        int c2 = Integer.parseInt(cikan);
        return c1 - c2;
    }

    public int carp(String carp1, String carp2) {
        int c1 = Integer.parseInt(carp1);
        int c2 = Integer.parseInt(carp2);
        return c1 * c2;
    }

    public int bol(String bolunen, String bolen) {
        int b1 = Integer.parseInt(bolunen);
        int b2 = Integer.parseInt(bolen);
        if (b2 == 0) {
            toast("Bölen 0 olamaz!");
            return -1;
        } else {
            return b1 / b2;
        }
    }

    public void toast(String msg) {
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();
    }

    public void toast(int msg) {
        Toast.makeText(context, String.valueOf(msg), Toast.LENGTH_SHORT).show();
    }
}
