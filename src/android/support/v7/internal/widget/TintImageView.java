// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import vi;
import vk;

public class TintImageView extends ImageView
{

    private static final int a[] = {
        0x10100d4, 0x1010119
    };
    private final vi b;

    public TintImageView(Context context)
    {
        this(context, null);
    }

    public TintImageView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public TintImageView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        context = vk.a(getContext(), attributeset, a, i);
        if (context.a() > 0)
        {
            if (context.g(0))
            {
                setBackgroundDrawable(context.a(0));
            }
            if (context.g(1))
            {
                setImageDrawable(context.a(1));
            }
        }
        context.b();
        b = context.c();
    }

    public void setImageResource(int i)
    {
        setImageDrawable(b.a(i));
    }

}
