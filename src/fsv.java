// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class fsv extends ThreadLocal
{

    fsv()
    {
    }

    protected Object initialValue()
    {
        return new StringBuilder();
    }
}
