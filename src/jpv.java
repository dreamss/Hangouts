// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.common.cache.LocalCache;

public final class jpv extends jpd
{

    final LocalCache a;

    jpv(LocalCache localcache)
    {
        a = localcache;
        super(localcache);
    }

    public Object next()
    {
        return c().getValue();
    }
}
