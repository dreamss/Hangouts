// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class hyu extends kwm
{

    public Integer a;
    public Integer b;
    public hyv c[];
    public Boolean d;
    public Integer e;
    public Integer f;
    public Integer g;

    public hyu()
    {
        a = null;
        b = null;
        c = hyv.a();
        d = null;
        e = null;
        f = null;
        g = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int i = super.computeSerializedSize();
        int j = i;
        if (a != null)
        {
            j = i + kwk.e(1, a.intValue());
        }
        i = j;
        if (b != null)
        {
            i = j + kwk.e(2, b.intValue());
        }
        j = i;
        if (c != null)
        {
            j = i;
            if (c.length > 0)
            {
                for (j = 0; j < c.length;)
                {
                    hyv hyv1 = c[j];
                    int k = i;
                    if (hyv1 != null)
                    {
                        k = i + kwk.d(3, hyv1);
                    }
                    j++;
                    i = k;
                }

                j = i;
            }
        }
        i = j;
        if (d != null)
        {
            d.booleanValue();
            i = j + (kwk.f(4) + 1);
        }
        j = i;
        if (e != null)
        {
            j = i + kwk.e(5, e.intValue());
        }
        i = j;
        if (f != null)
        {
            i = j + kwk.e(6, f.intValue());
        }
        j = i;
        if (g != null)
        {
            j = i + kwk.e(7, g.intValue());
        }
        return j;
    }

    public kws mergeFrom(kwj kwj1)
    {
_L10:
        int i = kwj1.a();
        i;
        JVM INSTR lookupswitch 8: default 80
    //                   0: 89
    //                   8: 91
    //                   16: 170
    //                   26: 250
    //                   32: 374
    //                   40: 388
    //                   48: 466
    //                   56: 546;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9
_L1:
        if (super.storeUnknownField(kwj1, i)) goto _L10; else goto _L2
_L2:
        return this;
_L3:
        int j = kwj1.f();
        switch (j)
        {
        case 0: // '\0'
        case 10: // '\n'
        case 20: // '\024'
        case 30: // '\036'
        case 40: // '('
        case 50: // '2'
            a = Integer.valueOf(j);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        int k = kwj1.f();
        switch (k)
        {
        case 0: // '\0'
        case 10: // '\n'
        case 20: // '\024'
        case 30: // '\036'
        case 40: // '('
        case 50: // '2'
            b = Integer.valueOf(k);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        int l1 = kwx.a(kwj1, 26);
        hyv ahyv[];
        int l;
        if (c == null)
        {
            l = 0;
        } else
        {
            l = c.length;
        }
        ahyv = new hyv[l1 + l];
        l1 = l;
        if (l != 0)
        {
            System.arraycopy(c, 0, ahyv, 0, l);
            l1 = l;
        }
        for (; l1 < ahyv.length - 1; l1++)
        {
            ahyv[l1] = new hyv();
            kwj1.a(ahyv[l1]);
            kwj1.a();
        }

        ahyv[l1] = new hyv();
        kwj1.a(ahyv[l1]);
        c = ahyv;
        continue; /* Loop/switch isn't completed */
_L6:
        d = Boolean.valueOf(kwj1.i());
        continue; /* Loop/switch isn't completed */
_L7:
        int i1 = kwj1.f();
        switch (i1)
        {
        case 0: // '\0'
        case 10: // '\n'
        case 20: // '\024'
        case 30: // '\036'
        case 40: // '('
        case 50: // '2'
            e = Integer.valueOf(i1);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L8:
        int j1 = kwj1.f();
        switch (j1)
        {
        case 0: // '\0'
        case 10: // '\n'
        case 20: // '\024'
        case 30: // '\036'
        case 40: // '('
        case 50: // '2'
            f = Integer.valueOf(j1);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L9:
        int k1 = kwj1.f();
        switch (k1)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            g = Integer.valueOf(k1);
            break;
        }
        if (true) goto _L10; else goto _L11
_L11:
    }

    public void writeTo(kwk kwk1)
    {
        if (a != null)
        {
            kwk1.a(1, a.intValue());
        }
        if (b != null)
        {
            kwk1.a(2, b.intValue());
        }
        if (c != null && c.length > 0)
        {
            for (int i = 0; i < c.length; i++)
            {
                hyv hyv1 = c[i];
                if (hyv1 != null)
                {
                    kwk1.b(3, hyv1);
                }
            }

        }
        if (d != null)
        {
            kwk1.a(4, d.booleanValue());
        }
        if (e != null)
        {
            kwk1.a(5, e.intValue());
        }
        if (f != null)
        {
            kwk1.a(6, f.intValue());
        }
        if (g != null)
        {
            kwk1.a(7, g.intValue());
        }
        super.writeTo(kwk1);
    }
}
