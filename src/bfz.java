// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.widget.AdapterView;

final class bfz
    implements android.widget.AdapterView.OnItemClickListener
{

    final bga a;
    final bfw b;

    bfz(bfw bfw, bga bga1)
    {
        b = bfw;
        a = bga1;
        super();
    }

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        if (a != null)
        {
            a.a((egm)view);
        }
    }
}
