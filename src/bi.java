// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.transition.Transition;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class bi
    implements android.view.ViewTreeObserver.OnPreDrawListener
{

    final View a;
    final Transition b;
    final View c;
    final bm d;
    final Map e;
    final Map f;
    final ArrayList g;

    public bi(View view, Transition transition, View view1, bm bm1, Map map, Map map1, ArrayList arraylist)
    {
        a = view;
        b = transition;
        c = view1;
        d = bm1;
        e = map;
        f = map1;
        g = arraylist;
        super();
    }

    public boolean onPreDraw()
    {
        a.getViewTreeObserver().removeOnPreDrawListener(this);
        if (b != null)
        {
            b.removeTarget(c);
        }
        View view = d.a();
        if (view != null)
        {
            if (!e.isEmpty())
            {
                g.a(f, view);
                f.keySet().retainAll(e.values());
                Iterator iterator = e.entrySet().iterator();
                do
                {
                    if (!iterator.hasNext())
                    {
                        break;
                    }
                    java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
                    Object obj = (String)entry.getValue();
                    obj = (View)f.get(obj);
                    if (obj != null)
                    {
                        ((View) (obj)).setTransitionName((String)entry.getKey());
                    }
                } while (true);
            }
            if (b != null)
            {
                g.a(g, view);
                g.removeAll(f.values());
                g.add(c);
                g.b(b, g);
            }
        }
        return true;
    }
}
