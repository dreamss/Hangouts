// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.concurrent.locks.Lock;

final class eok extends Handler
{

    final eof a;

    eok(eof eof1, Looper looper)
    {
        a = eof1;
        super(looper);
    }

    public void handleMessage(Message message)
    {
        message.what;
        JVM INSTR tableswitch 1 4: default 36
    //                   1 54
    //                   2 101
    //                   3 109
    //                   4 124;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        (new StringBuilder("Unknown message id: ")).append(message.what);
        return;
_L2:
        message = a;
        ((eof) (message)).a.lock();
        if (message.m())
        {
            message.b();
        }
        ((eof) (message)).a.unlock();
        return;
        Exception exception;
        exception;
        ((eof) (message)).a.unlock();
        throw exception;
_L3:
        eof.a(a);
        return;
_L4:
        ((eol)message.obj).a(a);
        return;
_L5:
        throw (RuntimeException)message.obj;
    }
}
