// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

final class egd extends BroadcastReceiver
{

    final egb a;

    egd(egb egb1)
    {
        a = egb1;
        super();
    }

    public void onReceive(Context context, Intent intent)
    {
        a.a(intent);
    }
}
