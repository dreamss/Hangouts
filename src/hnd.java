// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Comparator;

final class hnd
    implements Comparator
{

    final hnc a;

    hnd(hnc hnc)
    {
        a = hnc;
        super();
    }

    public int compare(Object obj, Object obj1)
    {
        obj = (String)obj;
        obj1 = (String)obj1;
        if (obj == obj1)
        {
            return 0;
        }
        if (obj == null)
        {
            return -1;
        }
        if (obj1 == null)
        {
            return 1;
        } else
        {
            return ((String) (obj)).compareTo(((String) (obj1)));
        }
    }
}
