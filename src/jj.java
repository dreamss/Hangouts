// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.MotionEvent;

final class jj extends ji
{

    jj()
    {
    }

    public float e(MotionEvent motionevent, int i)
    {
        return motionevent.getAxisValue(i);
    }
}
