// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import uu;
import uv;

public class FitWindowsFrameLayout extends FrameLayout
    implements uu
{

    private uv a;

    public FitWindowsFrameLayout(Context context)
    {
        super(context);
    }

    public FitWindowsFrameLayout(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public void a(uv uv1)
    {
        a = uv1;
    }

    protected boolean fitSystemWindows(Rect rect)
    {
        if (a != null)
        {
            a.a(rect);
        }
        return super.fitSystemWindows(rect);
    }
}
