// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;

public final class vk
{

    private final Context a;
    private final TypedArray b;
    private vi c;

    private vk(Context context, TypedArray typedarray)
    {
        a = context;
        b = typedarray;
    }

    public static vk a(Context context, AttributeSet attributeset, int ai[])
    {
        return new vk(context, context.obtainStyledAttributes(attributeset, ai));
    }

    public static vk a(Context context, AttributeSet attributeset, int ai[], int i)
    {
        return new vk(context, context.obtainStyledAttributes(attributeset, ai, i, 0));
    }

    public int a()
    {
        return b.length();
    }

    public int a(int i, int j)
    {
        return b.getInt(i, j);
    }

    public Drawable a(int i)
    {
        if (b.hasValue(i))
        {
            int j = b.getResourceId(i, 0);
            if (j != 0)
            {
                return c().a(j);
            }
        }
        return b.getDrawable(i);
    }

    public boolean a(int i, boolean flag)
    {
        return b.getBoolean(i, flag);
    }

    public int b(int i, int j)
    {
        return b.getInteger(i, j);
    }

    public Drawable b(int i)
    {
        if (b.hasValue(i))
        {
            i = b.getResourceId(i, 0);
            if (i != 0)
            {
                return c().a(i, true);
            }
        }
        return null;
    }

    public void b()
    {
        b.recycle();
    }

    public int c(int i, int j)
    {
        return b.getDimensionPixelOffset(i, j);
    }

    public CharSequence c(int i)
    {
        return b.getText(i);
    }

    public vi c()
    {
        if (c == null)
        {
            c = vi.a(a);
        }
        return c;
    }

    public int d(int i, int j)
    {
        return b.getDimensionPixelSize(i, j);
    }

    public String d(int i)
    {
        return b.getString(i);
    }

    public float e(int i)
    {
        return b.getFloat(i, -1F);
    }

    public int e(int i, int j)
    {
        return b.getLayoutDimension(i, j);
    }

    public int f(int i)
    {
        return b.getColor(i, -1);
    }

    public int f(int i, int j)
    {
        return b.getResourceId(i, j);
    }

    public boolean g(int i)
    {
        return b.hasValue(i);
    }
}
