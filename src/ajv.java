// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.TimeUnit;

public final class ajv
{

    public static final long a;
    public static final long b;

    static 
    {
        a = TimeUnit.SECONDS.toMillis(10L);
        b = TimeUnit.DAYS.toMillis(1L);
    }
}