// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class axd
    implements Runnable
{

    final String a;
    final axc b;

    axd(axc axc1, String s)
    {
        b = axc1;
        a = s;
        super();
    }

    public void run()
    {
        avv.c(b.a, a);
    }
}
