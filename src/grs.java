// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Comparator;

final class grs
    implements Comparator
{

    final Comparator a;
    final grq b;

    grs(grq grq1, Comparator comparator)
    {
        b = grq1;
        a = comparator;
        super();
    }

    public int compare(Object obj, Object obj1)
    {
        obj = (Integer)obj;
        obj1 = (Integer)obj1;
        return a.compare(b.a(((Integer) (obj)).intValue()), b.a(((Integer) (obj1)).intValue()));
    }
}
