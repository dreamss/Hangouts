// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

public final class lmw
{

    private final ConnectivityManager a;

    lmw()
    {
        a = null;
    }

    public lmw(Context context)
    {
        a = (ConnectivityManager)context.getSystemService("connectivity");
    }

    public lmy a()
    {
        NetworkInfo networkinfo = a.getActiveNetworkInfo();
        if (networkinfo == null || !networkinfo.isConnected())
        {
            return new lmy(false, -1, -1);
        } else
        {
            return new lmy(true, networkinfo.getType(), networkinfo.getSubtype());
        }
    }
}
