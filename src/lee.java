// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class lee extends kwm
{

    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;

    public lee()
    {
        a = null;
        b = null;
        c = null;
        d = null;
        e = null;
        f = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (b != null)
        {
            i = j + kwk.b(1, b);
        }
        j = i;
        if (f != null)
        {
            j = i + kwk.b(2, f);
        }
        i = j;
        if (e != null)
        {
            i = j + kwk.b(3, e);
        }
        j = i;
        if (c != null)
        {
            j = i + kwk.b(4, c);
        }
        i = j;
        if (d != null)
        {
            i = j + kwk.b(5, d);
        }
        j = i;
        if (a != null)
        {
            j = i + kwk.b(6, a);
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
                b = kwj1.j();
                break;

            case 18: // '\022'
                f = kwj1.j();
                break;

            case 26: // '\032'
                e = kwj1.j();
                break;

            case 34: // '"'
                c = kwj1.j();
                break;

            case 42: // '*'
                d = kwj1.j();
                break;

            case 50: // '2'
                a = kwj1.j();
                break;
            }
        } while (true);
    }

    public void writeTo(kwk kwk1)
    {
        if (b != null)
        {
            kwk1.a(1, b);
        }
        if (f != null)
        {
            kwk1.a(2, f);
        }
        if (e != null)
        {
            kwk1.a(3, e);
        }
        if (c != null)
        {
            kwk1.a(4, c);
        }
        if (d != null)
        {
            kwk1.a(5, d);
        }
        if (a != null)
        {
            kwk1.a(6, a);
        }
        super.writeTo(kwk1);
    }
}
