// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.phone;

import ac;
import ai;
import android.content.Intent;
import android.os.Bundle;
import ap;
import bkm;
import cpl;
import eev;
import g;

public final class GmsInstallActivity extends ai
{

    public GmsInstallActivity()
    {
    }

    private void g()
    {
        bkm.k = false;
        boolean flag = getIntent().getExtras().getBoolean("from_main_launcher");
        Intent intent = g.d(null);
        if (flag)
        {
            intent.setAction("android.intent.action.MAIN");
        }
        intent.addFlags(32768);
        startActivity(intent);
        finish();
    }

    public void onActivityResult(int i, int j, Intent intent)
    {
        super.onActivityResult(i, j, intent);
        switch (i)
        {
        default:
            return;

        case 1001: 
            eev.a("Babel", "Received notification from gmsCore installation. Restarting babel");
            break;
        }
        g();
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        eev.a("Babel", "GmsInstallActivity.onCreate");
        int i = g.a(false, false, false);
        if (i == 0)
        {
            g();
            return;
        } else
        {
            bundle = u_().a();
            eev.a("Babel", "Starting dialog to install GmsCore from Play Service.");
            cpl.a(i, 1001).a(bundle, "gmscore dialog");
            return;
        }
    }
}
