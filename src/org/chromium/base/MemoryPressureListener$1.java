// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.base;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;

// Referenced classes of package org.chromium.base:
//            MemoryPressureListener

final class 
    implements ComponentCallbacks2
{

    public void onConfigurationChanged(Configuration configuration)
    {
    }

    public void onLowMemory()
    {
        MemoryPressureListener.a();
    }

    public void onTrimMemory(int i)
    {
        MemoryPressureListener.a(i);
    }

    ()
    {
    }
}
