// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.NoSuchElementException;

public abstract class jrh extends jyh
{

    private Object a;

    protected jrh(Object obj)
    {
        a = obj;
    }

    protected abstract Object a(Object obj);

    public final boolean hasNext()
    {
        return a != null;
    }

    public final Object next()
    {
        if (!hasNext())
        {
            throw new NoSuchElementException();
        }
        Object obj = a;
        a = a(a);
        return obj;
        Exception exception;
        exception;
        a = a(a);
        throw exception;
    }
}
