// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.widget.AdapterView;

final class bvb
    implements android.widget.AdapterView.OnItemClickListener
{

    final bva a;

    bvb(bva bva1)
    {
        a = bva1;
        super();
    }

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        adapterview = (gqk)((gql)bva.a(a)).getItem(i);
        if (!(adapterview instanceof gqn))
        {
            return;
        }
        adapterview = (gqn)adapterview;
        adapterview.c();
        JVM INSTR tableswitch 0 2: default 60
    //                   0 68
    //                   1 132
    //                   2 196;
           goto _L1 _L2 _L3 _L4
_L1:
        a.a();
        return;
_L2:
        eev.e("Babel", "Disabling knocking per user request.");
        g.b(2241);
        bva.b(a).a(false);
        bva.a(a, adapterview, (gqn)bva.c(a).getItem(1), bui.c);
        bva.c(a).notifyDataSetChanged();
        continue; /* Loop/switch isn't completed */
_L3:
        eev.e("Babel", "Enabling knocking per user request.");
        g.b(1501);
        bva.b(a).a(true);
        bva.a(a, (gqn)bva.c(a).getItem(0), adapterview, bui.d);
        bva.c(a).notifyDataSetChanged();
        continue; /* Loop/switch isn't completed */
_L4:
        g.b(2242);
        bva.d(a);
        if (true) goto _L1; else goto _L5
_L5:
    }
}
