// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class lhx extends kwm
{

    private static volatile lhx e[];
    public String a;
    public String b;
    public Long c;
    public String d;

    public lhx()
    {
        a = null;
        b = null;
        c = null;
        d = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static lhx[] a()
    {
        if (e == null)
        {
            synchronized (kwq.a)
            {
                if (e == null)
                {
                    e = new lhx[0];
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
            i = j + kwk.b(1, a);
        }
        j = i;
        if (b != null)
        {
            j = i + kwk.b(2, b);
        }
        i = j;
        if (d != null)
        {
            i = j + kwk.b(3, d);
        }
        j = i;
        if (c != null)
        {
            j = i + kwk.d(4, c.longValue());
        }
        return j;
    }

    public kws mergeFrom(kwj kwj1)
    {
        do
        {
            int i = kwj1.a();
            switch (i)
            {
            default:
                if (super.storeUnknownField(kwj1, i))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 10: // '\n'
                a = kwj1.j();
                break;

            case 18: // '\022'
                b = kwj1.j();
                break;

            case 26: // '\032'
                d = kwj1.j();
                break;

            case 32: // ' '
                c = Long.valueOf(kwj1.d());
                break;
            }
        } while (true);
    }

    public void writeTo(kwk kwk1)
    {
        if (a != null)
        {
            kwk1.a(1, a);
        }
        if (b != null)
        {
            kwk1.a(2, b);
        }
        if (d != null)
        {
            kwk1.a(3, d);
        }
        if (c != null)
        {
            kwk1.a(4, c.longValue());
        }
        super.writeTo(kwk1);
    }
}
