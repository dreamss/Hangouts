// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public final class brj extends RelativeLayout
    implements brm
{

    private brk a;

    public brj(Context context, int i, android.widget.RelativeLayout.LayoutParams layoutparams, boolean flag)
    {
        super(context);
        context = (ImageView)LayoutInflater.from(context).inflate(g.gc, this, true).findViewById(h.ea);
        context.setImageResource(i);
        context.setLayoutParams(layoutparams);
        if (flag)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        setVisibility(i);
    }

    public View a()
    {
        return this;
    }

    public void a(brk brk1)
    {
        a = brk1;
    }

    public void a(gmt gmt)
    {
        if (a != null)
        {
            a.a(gmt);
        }
    }
}
