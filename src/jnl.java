// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.Serializable;

public final class jnl extends jnk
    implements Serializable
{

    public static final jnl a = new jnl();
    private static final long serialVersionUID = 1L;

    jnl()
    {
    }

    private Object readResolve()
    {
        return a;
    }

    protected int b(Object obj)
    {
        return obj.hashCode();
    }

    protected boolean b(Object obj, Object obj1)
    {
        return obj.equals(obj1);
    }

}
