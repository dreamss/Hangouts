// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;

final class cim extends ResultReceiver
{

    final amx a;
    final cil b;

    cim(cil cil1, Handler handler, amx amx)
    {
        b = cil1;
        a = amx;
        super(handler);
    }

    protected void onReceiveResult(int i, Bundle bundle)
    {
        super.onReceiveResult(i, bundle);
        cic.a(b.a, a);
    }
}
