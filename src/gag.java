// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Log;
import com.google.android.gms.common.ConnectionResult;

final class gag
    implements end
{

    final gae a;

    gag(gae gae)
    {
        a = gae;
        super();
    }

    public void a(ConnectionResult connectionresult)
    {
        connectionresult = String.valueOf(connectionresult);
        Log.e("GcoreClearcutLogger", (new StringBuilder(String.valueOf(connectionresult).length() + 34)).append("ClearcutLogger connection failed: ").append(connectionresult).toString());
    }
}
