// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.net;

import android.util.Log;

// Referenced classes of package org.chromium.net:
//            CronetUrlRequest, UrlRequestListener, UrlRequestException

class a
    implements Runnable
{

    final UrlRequestException a;
    final CronetUrlRequest b;

    public void run()
    {
label0:
        {
            synchronized (CronetUrlRequest.a(b))
            {
                if (!b.d())
                {
                    break label0;
                }
            }
            return;
        }
        CronetUrlRequest.f(b);
        obj;
        JVM INSTR monitorexit ;
        try
        {
            CronetUrlRequest.e(b).a(CronetUrlRequest.d(b), a);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Log.e("ChromiumNetwork", "Exception in onError method", ((Throwable) (obj)));
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    (CronetUrlRequest croneturlrequest, UrlRequestException urlrequestexception)
    {
        b = croneturlrequest;
        a = urlrequestexception;
        super();
    }
}
