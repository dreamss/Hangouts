// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.AbstractMap;
import java.util.Set;

public class hrm extends AbstractMap
    implements Cloneable
{

    int a;
    Object b[];

    public hrm()
    {
    }

    private int a(Object obj)
    {
        int j = a;
        Object aobj[] = b;
        for (int i = 0; i < j << 1; i += 2)
        {
            Object obj1 = aobj[i];
            if (obj != null ? obj.equals(obj1) : obj1 == null)
            {
                return i;
            }
        }

        return -2;
    }

    private void a(int i, Object obj, Object obj1)
    {
        Object aobj[] = b;
        aobj[i] = obj;
        aobj[i + 1] = obj1;
    }

    private Object c(int i)
    {
        if (i < 0)
        {
            return null;
        } else
        {
            return b[i];
        }
    }

    public hrm a()
    {
        hrm hrm1;
        Object aobj[];
        Object aobj1[];
        int i;
        try
        {
            hrm1 = (hrm)super.clone();
            aobj = b;
        }
        catch (CloneNotSupportedException clonenotsupportedexception)
        {
            return null;
        }
        if (aobj == null)
        {
            break MISSING_BLOCK_LABEL_41;
        }
        i = aobj.length;
        aobj1 = new Object[i];
        hrm1.b = aobj1;
        System.arraycopy(((Object) (aobj)), 0, ((Object) (aobj1)), 0, i);
        return hrm1;
    }

    public final Object a(int i)
    {
        if (i < 0 || i >= a)
        {
            return null;
        } else
        {
            return c((i << 1) + 1);
        }
    }

    public final Object a(int i, Object obj)
    {
        int j = a;
        if (i < 0 || i >= j)
        {
            throw new IndexOutOfBoundsException();
        } else
        {
            i = (i << 1) + 1;
            Object obj1 = c(i);
            b[i] = obj;
            return obj1;
        }
    }

    Object b(int i)
    {
        int j = a << 1;
        if (i < 0 || i >= j)
        {
            return null;
        }
        Object obj = c(i + 1);
        Object aobj[] = b;
        int k = j - i - 2;
        if (k != 0)
        {
            System.arraycopy(((Object) (aobj)), i + 2, ((Object) (aobj)), i, k);
        }
        a = a - 1;
        a(j - 2, null, null);
        return obj;
    }

    public void clear()
    {
        a = 0;
        b = null;
    }

    public Object clone()
    {
        return a();
    }

    public final boolean containsKey(Object obj)
    {
        return -2 != a(obj);
    }

    public final boolean containsValue(Object obj)
    {
        int j = a;
        Object aobj[] = b;
        for (int i = 1; i < j << 1; i += 2)
        {
            Object obj1 = aobj[i];
            if (obj != null ? obj.equals(obj1) : obj1 == null)
            {
                return true;
            }
        }

        return false;
    }

    public final Set entrySet()
    {
        return new hrp(this);
    }

    public final Object get(Object obj)
    {
        return c(a(obj) + 1);
    }

    public final Object put(Object obj, Object obj1)
    {
        int i;
        int j = a(obj) >> 1;
        if (j == -1)
        {
            j = a;
        }
        if (j < 0)
        {
            throw new IndexOutOfBoundsException();
        }
        int j1 = j + 1;
        if (j1 < 0)
        {
            throw new IndexOutOfBoundsException();
        }
        Object aobj[] = b;
        int k = j1 << 1;
        int i1;
        if (aobj == null)
        {
            i = 0;
        } else
        {
            i = aobj.length;
        }
        if (k <= i) goto _L2; else goto _L1
_L1:
        i1 = (i / 2) * 3 + 1;
        i = i1;
        if (i1 % 2 != 0)
        {
            i = i1 + 1;
        }
        if (i < k)
        {
            i = k;
        }
        if (i != 0) goto _L4; else goto _L3
_L3:
        b = null;
_L2:
        i = j << 1;
        aobj = ((Object []) (c(i + 1)));
        a(i, obj, obj1);
        if (j1 > a)
        {
            a = j1;
        }
        return ((Object) (aobj));
_L4:
        int l = a;
        Object aobj1[] = b;
        if (l == 0 || i != aobj1.length)
        {
            Object aobj2[] = new Object[i];
            b = aobj2;
            if (l != 0)
            {
                System.arraycopy(((Object) (aobj1)), 0, ((Object) (aobj2)), 0, l << 1);
            }
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

    public final Object remove(Object obj)
    {
        return b(a(obj));
    }

    public final int size()
    {
        return a;
    }
}
