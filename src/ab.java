// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

abstract class ab extends aa
{

    ab()
    {
    }

    public View onCreateView(View view, String s, Context context, AttributeSet attributeset)
    {
        View view2 = a(view, s, context, attributeset);
        View view1 = view2;
        if (view2 == null)
        {
            view1 = view2;
            if (android.os.Build.VERSION.SDK_INT >= 11)
            {
                view1 = super.onCreateView(view, s, context, attributeset);
            }
        }
        return view1;
    }
}
