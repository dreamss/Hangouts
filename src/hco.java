// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.net.Uri;
import android.util.Log;

public final class hco
{

    private final gaa a;
    private final Uri b;
    private long c;

    public hco(Context context, Uri uri)
    {
        c = 3000L;
        a = (gaa)hgx.a(context, gaa);
        b = uri;
    }

    public boolean a()
    {
        hcp hcp1 = new hcp();
        long l = System.currentTimeMillis();
        long l1 = c;
        do
        {
            long l2;
label0:
            {
                if (!hcp1.a())
                {
                    l2 = (l + l1) - System.currentTimeMillis();
                    if (l2 > 0L)
                    {
                        break label0;
                    }
                    if (Log.isLoggable("BlockingPanoDetector", 5))
                    {
                        String s = String.valueOf(b);
                        (new StringBuilder(String.valueOf(s).length() + 56)).append("pano wait time expired, assume image is not a pano; uri=").append(s);
                    }
                }
                return hcp1.b();
            }
            try
            {
                Thread.sleep(Math.min(5L, l2));
            }
            catch (InterruptedException interruptedexception) { }
        } while (true);
    }
}
