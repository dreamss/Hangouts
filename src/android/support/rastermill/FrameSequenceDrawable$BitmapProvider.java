// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.rastermill;

import android.graphics.Bitmap;

public interface 
{

    public abstract Bitmap acquireBitmap(int i, int j);

    public abstract void releaseBitmap(Bitmap bitmap);
}
