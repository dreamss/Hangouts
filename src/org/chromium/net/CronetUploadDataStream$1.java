// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.net;


// Referenced classes of package org.chromium.net:
//            CronetUploadDataStream, UploadDataProvider

class a
    implements Runnable
{

    final CronetUploadDataStream a;

    public void run()
    {
label0:
        {
            synchronized (CronetUploadDataStream.a(a))
            {
                if (CronetUploadDataStream.b(a) != 0L)
                {
                    break label0;
                }
            }
            return;
        }
        if (CronetUploadDataStream.c(a))
        {
            throw new IllegalStateException("Unexpected readData call. Already reading.");
        }
        break MISSING_BLOCK_LABEL_50;
        exception1;
        obj;
        JVM INSTR monitorexit ;
        throw exception1;
        if (CronetUploadDataStream.d(a))
        {
            throw new IllegalStateException("Unexpected readData call. Already rewinding.");
        }
        if (CronetUploadDataStream.e(a) == null)
        {
            throw new IllegalStateException("Unexpected readData call. Buffer is null");
        }
        CronetUploadDataStream.f(a);
        obj;
        JVM INSTR monitorexit ;
        try
        {
            CronetUploadDataStream.g(a).a(a, CronetUploadDataStream.e(a));
            return;
        }
        catch (Exception exception)
        {
            CronetUploadDataStream.a(a, exception);
        }
        return;
    }

    (CronetUploadDataStream cronetuploaddatastream)
    {
        a = cronetuploaddatastream;
        super();
    }
}
