// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;

public final class fe
{

    static final ff a;

    public static void a(Drawable drawable)
    {
        a.a(drawable);
    }

    public static void a(Drawable drawable, float f, float f1)
    {
        a.a(drawable, f, f1);
    }

    public static void a(Drawable drawable, int i)
    {
        a.a(drawable, i);
    }

    public static void a(Drawable drawable, int i, int j, int k, int l)
    {
        a.a(drawable, i, j, k, l);
    }

    public static void a(Drawable drawable, ColorStateList colorstatelist)
    {
        a.a(drawable, colorstatelist);
    }

    public static void a(Drawable drawable, android.graphics.PorterDuff.Mode mode)
    {
        a.a(drawable, mode);
    }

    public static void a(Drawable drawable, boolean flag)
    {
        a.a(drawable, flag);
    }

    public static void b(Drawable drawable, int i)
    {
        a.b(drawable, i);
    }

    public static boolean b(Drawable drawable)
    {
        return a.b(drawable);
    }

    public static Drawable c(Drawable drawable)
    {
        return a.c(drawable);
    }

    public static int d(Drawable drawable)
    {
        return a.d(drawable);
    }

    static 
    {
        int i = android.os.Build.VERSION.SDK_INT;
        if (i >= 23)
        {
            a = new fl();
        } else
        if (i >= 22)
        {
            a = new fk();
        } else
        if (i >= 21)
        {
            a = new fj();
        } else
        if (i >= 19)
        {
            a = new fi();
        } else
        if (i >= 17)
        {
            a = new fh();
        } else
        if (i >= 11)
        {
            a = new fg();
        } else
        {
            a = new ff();
        }
    }
}
