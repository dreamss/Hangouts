// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class yu
    implements Runnable
{

    final yt a;

    yu(yt yt1)
    {
        a = yt1;
        super();
    }

    public void run()
    {
        if (yt.a(a))
        {
            if (yt.b(a))
            {
                g.a("RV FullInvalidate");
                a.p();
                g.a();
                return;
            }
            if (a.b.d())
            {
                g.a("RV PartialInvalidate");
                a.e();
                a.b.b();
                if (!yt.c(a))
                {
                    a.t();
                }
                a.a(true);
                g.a();
                return;
            }
        }
    }
}
