// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import com.google.android.apps.hangouts.wearable.WearableService;

public final class eke
    implements eka
{

    final WearableService a;

    public eke(WearableService wearableservice)
    {
        a = wearableservice;
        super();
    }

    public void a(Uri uri, Bitmap bitmap)
    {
        a.n.post(new ekf(this, uri, bitmap));
    }
}
