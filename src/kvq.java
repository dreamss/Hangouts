// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class kvq
    implements Comparable, java.util.Map.Entry
{

    final kvl a;
    private final Comparable b;
    private Object c;

    kvq(kvl kvl1, Comparable comparable, Object obj)
    {
        a = kvl1;
        super();
        b = comparable;
        c = obj;
    }

    kvq(kvl kvl1, java.util.Map.Entry entry)
    {
        this(kvl1, (Comparable)entry.getKey(), entry.getValue());
    }

    private static boolean a(Object obj, Object obj1)
    {
        if (obj == null)
        {
            return obj1 == null;
        } else
        {
            return obj.equals(obj1);
        }
    }

    public Comparable a()
    {
        return b;
    }

    public int compareTo(Object obj)
    {
        obj = (kvq)obj;
        return a().compareTo(((kvq) (obj)).a());
    }

    public boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof java.util.Map.Entry))
            {
                return false;
            }
            obj = (java.util.Map.Entry)obj;
            if (!a(b, ((java.util.Map.Entry) (obj)).getKey()) || !a(c, ((java.util.Map.Entry) (obj)).getValue()))
            {
                return false;
            }
        }
        return true;
    }

    public Object getKey()
    {
        return a();
    }

    public Object getValue()
    {
        return c;
    }

    public int hashCode()
    {
        int j = 0;
        int i;
        if (b == null)
        {
            i = 0;
        } else
        {
            i = b.hashCode();
        }
        if (c != null)
        {
            j = c.hashCode();
        }
        return i ^ j;
    }

    public Object setValue(Object obj)
    {
        a.e();
        Object obj1 = c;
        c = obj;
        return obj1;
    }

    public String toString()
    {
        String s = String.valueOf(b);
        String s1 = String.valueOf(c);
        return (new StringBuilder(String.valueOf(s).length() + 1 + String.valueOf(s1).length())).append(s).append("=").append(s1).toString();
    }
}
