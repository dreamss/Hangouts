// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.hangouts.video;

import itz;
import java.io.PrintWriter;

// Referenced classes of package com.google.android.libraries.hangouts.video:
//            Stats

public class b extends Stats
{

    public final int a;
    public final int b;
    public int c;
    public int d;
    public int e;
    public boolean f;
    public int g;

    public void a(boolean flag)
    {
        f = flag;
    }

    public void addTo(itz itz1)
    {
        itz1.d = Integer.valueOf(a);
        itz1.h = Integer.valueOf(b);
        itz1.i = Integer.valueOf(c);
        itz1.m = Integer.valueOf(d);
        itz1.n = Integer.valueOf(e);
        itz1.o = Boolean.valueOf(f);
        itz1.p = Integer.valueOf(g);
    }

    public void b(int i)
    {
        c = i;
    }

    public void c(int i)
    {
        d = i;
    }

    public void d(int i)
    {
        e = i;
    }

    public void e(int i)
    {
        g = i;
    }

    public void print(PrintWriter printwriter, ntStats ntstats)
    {
        int i = a;
        int j = b;
        int k = c;
        int l = e;
        int i1 = d;
        boolean flag = f;
        int j1 = g;
        printwriter.println((new StringBuilder(102)).append(" -- GlobalStats -- ").append(i).append(", ").append(j).append(", ").append(k).append(", ").append(l).append(", ").append(i1).append(", ").append(flag).append(", ").append(j1).toString());
    }

    public ntStats(int i, int j)
    {
        c = -1;
        d = -1;
        e = -1;
        f = true;
        g = -1;
        a = i;
        b = j;
    }
}
