// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.support.v7.widget.Toolbar;

public final class zw
    implements Runnable
{

    final Toolbar a;

    public zw(Toolbar toolbar)
    {
        a = toolbar;
        super();
    }

    public void run()
    {
        a.d();
    }
}