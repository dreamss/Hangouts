// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.view.Window;

final class ra extends qy
{

    ra(Context context, Window window, qs qs)
    {
        super(context, window, qs);
    }

    android.view.Window.Callback a(android.view.Window.Callback callback)
    {
        return new rb(this, callback);
    }
}
