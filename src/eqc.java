// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import java.util.concurrent.atomic.AtomicInteger;

final class eqc extends Handler
{

    final eqa a;

    public eqc(eqa eqa1, Looper looper)
    {
        a = eqa1;
        super(looper);
    }

    private static void a(Message message)
    {
        ((eqd)message.obj).c();
    }

    private static boolean b(Message message)
    {
        return message.what == 2 || message.what == 1 || message.what == 5 || message.what == 6;
    }

    public void handleMessage(Message message)
    {
        if (a.c.get() != message.arg1)
        {
            if (b(message))
            {
                a(message);
            }
            return;
        }
        if ((message.what == 1 || message.what == 5 || message.what == 6) && !a.h())
        {
            a(message);
            return;
        }
        if (message.what == 3)
        {
            message = new ConnectionResult(message.arg2, null);
            eqa.a(a).a(message);
            a.g();
            return;
        }
        if (message.what == 4)
        {
            eqa.a(a, 4);
            if (eqa.b(a) != null)
            {
                eqa.b(a).a(message.arg2);
            }
            eqa eqa1 = a;
            int i = message.arg2;
            eqa1.f();
            eqa.a(a, 4, 1, null);
            return;
        }
        if (message.what == 2 && !a.d())
        {
            a(message);
            return;
        }
        if (b(message))
        {
            ((eqd)message.obj).b();
            return;
        } else
        {
            Log.wtf("GmsClient", "Don't know how to handle this message.");
            return;
        }
    }
}
