// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.DisplayMetrics;
import android.view.ViewConfiguration;

public final class sf
{

    private Context a;

    private sf(Context context)
    {
        a = context;
    }

    public static sf a(Context context)
    {
        return new sf(context);
    }

    public int a()
    {
        return a.getResources().getInteger(g.bn);
    }

    public boolean b()
    {
        while (android.os.Build.VERSION.SDK_INT >= 19 || !ko.b(ViewConfiguration.get(a))) 
        {
            return true;
        }
        return false;
    }

    public int c()
    {
        return a.getResources().getDisplayMetrics().widthPixels / 2;
    }

    public boolean d()
    {
        if (a.getApplicationInfo().targetSdkVersion >= 16)
        {
            return a.getResources().getBoolean(g.R);
        } else
        {
            return a.getResources().getBoolean(g.S);
        }
    }

    public int e()
    {
        TypedArray typedarray = a.obtainStyledAttributes(null, ro.a, g.g, 0);
        int j = typedarray.getLayoutDimension(ro.j, 0);
        Resources resources = a.getResources();
        int i = j;
        if (!d())
        {
            i = Math.min(j, resources.getDimensionPixelSize(g.W));
        }
        typedarray.recycle();
        return i;
    }

    public boolean f()
    {
        return a.getApplicationInfo().targetSdkVersion < 14;
    }

    public int g()
    {
        return a.getResources().getDimensionPixelSize(g.X);
    }
}