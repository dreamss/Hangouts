// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class hrx extends koj
{

    private static volatile hrx e[];
    public hru a;
    public String b;
    public Boolean c;
    public String d;

    public hrx()
    {
        a = null;
        b = null;
        c = null;
        d = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static hrx[] a()
    {
        if (e == null)
        {
            synchronized (kon.a)
            {
                if (e == null)
                {
                    e = new hrx[0];
                }
            }
        }
        return e;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (a != null)
        {
            i = j + koh.d(1, a);
        }
        j = i;
        if (b != null)
        {
            j = i + koh.b(2, b);
        }
        i = j;
        if (c != null)
        {
            c.booleanValue();
            i = j + (koh.f(3) + 1);
        }
        j = i;
        if (d != null)
        {
            j = i + koh.b(4, d);
        }
        return j;
    }

    public kop mergeFrom(kog kog1)
    {
        do
        {
            int i = kog1.a();
            switch (i)
            {
            default:
                if (super.storeUnknownField(kog1, i))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 10: // '\n'
                if (a == null)
                {
                    a = new hru();
                }
                kog1.a(a);
                break;

            case 18: // '\022'
                b = kog1.j();
                break;

            case 24: // '\030'
                c = Boolean.valueOf(kog1.i());
                break;

            case 34: // '"'
                d = kog1.j();
                break;
            }
        } while (true);
    }

    public void writeTo(koh koh1)
    {
        if (a != null)
        {
            koh1.b(1, a);
        }
        if (b != null)
        {
            koh1.a(2, b);
        }
        if (c != null)
        {
            koh1.a(3, c.booleanValue());
        }
        if (d != null)
        {
            koh1.a(4, d);
        }
        super.writeTo(koh1);
    }
}