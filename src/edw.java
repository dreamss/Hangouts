// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.drawable.AnimationDrawable;

final class edw
    implements Runnable
{

    final AnimationDrawable a;

    edw(AnimationDrawable animationdrawable)
    {
        a = animationdrawable;
        super();
    }

    public void run()
    {
        a.stop();
    }
}
