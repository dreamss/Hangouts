// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ljj extends kwm
{

    public ljh a;
    public ljh b;
    public lhd c;
    public lhd d;
    public ljg e;

    public ljj()
    {
        a = null;
        b = null;
        c = null;
        d = null;
        e = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (a != null)
        {
            i = j + kwk.d(1, a);
        }
        j = i;
        if (b != null)
        {
            j = i + kwk.d(2, b);
        }
        i = j;
        if (d != null)
        {
            i = j + kwk.d(3, d);
        }
        j = i;
        if (e != null)
        {
            j = i + kwk.d(4, e);
        }
        i = j;
        if (c != null)
        {
            i = j + kwk.d(5, c);
        }
        return i;
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
                if (a == null)
                {
                    a = new ljh();
                }
                kwj1.a(a);
                break;

            case 18: // '\022'
                if (b == null)
                {
                    b = new ljh();
                }
                kwj1.a(b);
                break;

            case 26: // '\032'
                if (d == null)
                {
                    d = new lhd();
                }
                kwj1.a(d);
                break;

            case 34: // '"'
                if (e == null)
                {
                    e = new ljg();
                }
                kwj1.a(e);
                break;

            case 42: // '*'
                if (c == null)
                {
                    c = new lhd();
                }
                kwj1.a(c);
                break;
            }
        } while (true);
    }

    public void writeTo(kwk kwk1)
    {
        if (a != null)
        {
            kwk1.b(1, a);
        }
        if (b != null)
        {
            kwk1.b(2, b);
        }
        if (d != null)
        {
            kwk1.b(3, d);
        }
        if (e != null)
        {
            kwk1.b(4, e);
        }
        if (c != null)
        {
            kwk1.b(5, c);
        }
        super.writeTo(kwk1);
    }
}
