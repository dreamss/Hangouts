// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.net;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import lmc;

// Referenced classes of package org.chromium.net:
//            NetworkChangeNotifier, UrlRequestContextConfig

public class CronetLibraryLoader
{

    private static final Object a = new Object();
    private static boolean b = false;

    CronetLibraryLoader()
    {
    }

    public static void a(Context context)
    {
        NetworkChangeNotifier.init(context);
        NetworkChangeNotifier.a.a(true, true);
        nativeCronetInitOnMainThread();
    }

    public static void a(Context context, UrlRequestContextConfig urlrequestcontextconfig)
    {
label0:
        {
            synchronized (a)
            {
                if (!b)
                {
                    break label0;
                }
            }
            return;
        }
        System.loadLibrary(urlrequestcontextconfig.e());
        if (!"47.0.2526.6".equals(nativeGetCronetVersion()))
        {
            throw new RuntimeException(String.format("Expected Cronet version number %s, actual version number %s.", new Object[] {
                "47.0.2526.6", nativeGetCronetVersion()
            }));
        }
        break MISSING_BLOCK_LABEL_66;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
        nativeCronetInitApplicationContext(context.getApplicationContext());
        context = new lmc(context);
        if (Looper.getMainLooper() != Looper.myLooper())
        {
            break MISSING_BLOCK_LABEL_104;
        }
        context.run();
_L2:
        b = true;
        obj;
        JVM INSTR monitorexit ;
        return;
        (new Handler(Looper.getMainLooper())).post(context);
        if (true) goto _L2; else goto _L1
_L1:
    }

    private static native void nativeCronetInitApplicationContext(Context context);

    private static native void nativeCronetInitOnMainThread();

    private static native String nativeGetCronetVersion();

}
