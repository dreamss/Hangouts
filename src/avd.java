// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

final class avd extends ContentObserver
{

    final avb a;

    avd(avb avb1, Handler handler)
    {
        a = avb1;
        super(handler);
    }

    public void onChange(boolean flag)
    {
        onChange(flag, null);
    }

    public void onChange(boolean flag, Uri uri)
    {
        avb.b(a);
    }
}
