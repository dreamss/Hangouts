// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import java.util.ArrayList;

final class sq extends mf
{

    final sp a;
    private boolean b;
    private int c;

    sq(sp sp1)
    {
        a = sp1;
        super();
        b = false;
        c = 0;
    }

    public void a(View view)
    {
        if (!b)
        {
            b = true;
            if (a.b != null)
            {
                a.b.a(null);
                return;
            }
        }
    }

    public void b(View view)
    {
        int i = c + 1;
        c = i;
        if (i == a.a.size())
        {
            if (a.b != null)
            {
                a.b.b(null);
            }
            c = 0;
            b = false;
            a.c = false;
        }
    }
}
