// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Iterator;

final class jqd extends jmi
{

    final transient Object a[];
    private final Object b[];
    private final transient int c;
    private final transient int d;

    jqd(Object aobj[], int i, Object aobj1[], int j)
    {
        b = aobj;
        a = aobj1;
        c = j;
        d = i;
    }

    boolean H_()
    {
        return true;
    }

    int a(Object aobj[], int i)
    {
        System.arraycopy(((Object) (b)), 0, ((Object) (aobj)), i, b.length);
        return b.length + i;
    }

    public jqy a()
    {
        return jmr.a(b);
    }

    public boolean contains(Object obj)
    {
        if (obj == null)
        {
            return false;
        }
        int i = jky.a(obj.hashCode());
        do
        {
            Object obj1 = a[c & i];
            if (obj1 == null)
            {
                return false;
            }
            if (obj1.equals(obj))
            {
                return true;
            }
            i++;
        } while (true);
    }

    boolean e()
    {
        return false;
    }

    jlk f()
    {
        return new jpr(this, b);
    }

    public int hashCode()
    {
        return d;
    }

    public Iterator iterator()
    {
        return a();
    }

    public int size()
    {
        return b.length;
    }
}
