// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class hxo extends koj
{

    public String a;
    public Boolean b;
    public Boolean c;
    public Boolean d;
    public Boolean e;
    public Boolean f;
    public hxp g;

    public hxo()
    {
        a = null;
        b = null;
        c = null;
        d = null;
        e = null;
        f = null;
        g = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (a != null)
        {
            i = j + koh.b(1, a);
        }
        j = i;
        if (b != null)
        {
            b.booleanValue();
            j = i + (koh.f(2) + 1);
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
            d.booleanValue();
            j = i + (koh.f(4) + 1);
        }
        i = j;
        if (e != null)
        {
            e.booleanValue();
            i = j + (koh.f(5) + 1);
        }
        j = i;
        if (f != null)
        {
            f.booleanValue();
            j = i + (koh.f(6) + 1);
        }
        i = j;
        if (g != null)
        {
            i = j + koh.d(7, g);
        }
        return i;
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
                a = kog1.j();
                break;

            case 16: // '\020'
                b = Boolean.valueOf(kog1.i());
                break;

            case 24: // '\030'
                c = Boolean.valueOf(kog1.i());
                break;

            case 32: // ' '
                d = Boolean.valueOf(kog1.i());
                break;

            case 40: // '('
                e = Boolean.valueOf(kog1.i());
                break;

            case 48: // '0'
                f = Boolean.valueOf(kog1.i());
                break;

            case 58: // ':'
                if (g == null)
                {
                    g = new hxp();
                }
                kog1.a(g);
                break;
            }
        } while (true);
    }

    public void writeTo(koh koh1)
    {
        if (a != null)
        {
            koh1.a(1, a);
        }
        if (b != null)
        {
            koh1.a(2, b.booleanValue());
        }
        if (c != null)
        {
            koh1.a(3, c.booleanValue());
        }
        if (d != null)
        {
            koh1.a(4, d.booleanValue());
        }
        if (e != null)
        {
            koh1.a(5, e.booleanValue());
        }
        if (f != null)
        {
            koh1.a(6, f.booleanValue());
        }
        if (g != null)
        {
            koh1.b(7, g);
        }
        super.writeTo(koh1);
    }
}