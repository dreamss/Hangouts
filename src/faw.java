// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.gms.googlehelp.internal.common.TogglingData;

final class faw extends fat
{

    final fav a;

    faw(fav fav1)
    {
        a = fav1;
        super();
    }

    public void a(GoogleHelp googlehelp)
    {
        if (googlehelp.c() == null) goto _L2; else goto _L1
_L1:
        String s;
        TogglingData togglingdata;
        Object obj;
        int i;
        togglingdata = googlehelp.c();
        obj = a.i;
        s = ((Activity) (obj)).getTitle().toString();
        i = ((Activity) (obj)).getResources().getIdentifier("action_bar", "id", ((Activity) (obj)).getPackageName());
        if (i == 0) goto _L4; else goto _L3
_L3:
        obj = (ViewGroup)((Activity) (obj)).findViewById(i);
        if (obj == null) goto _L4; else goto _L5
_L5:
        i = 0;
_L10:
        if (i >= ((ViewGroup) (obj)).getChildCount()) goto _L4; else goto _L6
_L6:
        android.view.View view = ((ViewGroup) (obj)).getChildAt(i);
        if (!(view instanceof TextView)) goto _L8; else goto _L7
_L7:
        s = ((TextView)view).getText().toString();
_L4:
        togglingdata.a(s);
_L2:
        a.a.putExtra("EXTRA_GOOGLE_HELP", googlehelp).putExtra("EXTRA_START_TICK", System.nanoTime());
        a.i.startActivityForResult(a.a, 123);
        a.a(Status.a);
        return;
_L8:
        i++;
        if (true) goto _L10; else goto _L9
_L9:
    }
}
