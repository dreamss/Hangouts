// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

final class ehd
{

    final ArrayList a = new ArrayList();
    final ArrayList b = new ArrayList();
    final WeakReference c;

    public ehd(View view)
    {
        c = new WeakReference(view);
    }

    public void a(int i, ehe ehe)
    {
        a.add(Integer.valueOf(i));
        b.add(ehe);
    }
}
