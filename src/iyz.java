// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class iyz extends kwm
{

    public Integer a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f[];
    public String g[];
    public String h;
    public String i;
    public String j;
    public Boolean k;
    public Integer l;
    public Integer m;
    public String n[];
    public kbk o[];

    public iyz()
    {
        a = null;
        b = null;
        c = null;
        d = null;
        e = null;
        f = kwx.f;
        g = kwx.f;
        h = null;
        i = null;
        j = null;
        k = null;
        l = null;
        m = null;
        n = kwx.f;
        o = kbk.a();
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        boolean flag = false;
        int j1 = super.computeSerializedSize();
        int i1 = j1;
        if (a != null)
        {
            i1 = j1 + kwk.e(1, a.intValue());
        }
        j1 = i1;
        if (b != null)
        {
            j1 = i1 + kwk.b(2, b);
        }
        int k1 = j1;
        if (c != null)
        {
            k1 = j1 + kwk.b(3, c);
        }
        i1 = k1;
        if (d != null)
        {
            i1 = k1 + kwk.b(4, d);
        }
        j1 = i1;
        if (f != null)
        {
            j1 = i1;
            if (f.length > 0)
            {
                j1 = 0;
                k1 = 0;
                int j2;
                int i3;
                for (j2 = 0; j1 < f.length; j2 = i3)
                {
                    String s = f[j1];
                    int l3 = k1;
                    i3 = j2;
                    if (s != null)
                    {
                        i3 = j2 + 1;
                        l3 = k1 + kwk.a(s);
                    }
                    j1++;
                    k1 = l3;
                }

                j1 = i1 + k1 + j2 * 1;
            }
        }
        i1 = j1;
        if (g != null)
        {
            i1 = j1;
            if (g.length > 0)
            {
                i1 = 0;
                k1 = 0;
                int k2;
                int j3;
                for (k2 = 0; i1 < g.length; k2 = j3)
                {
                    String s1 = g[i1];
                    int i4 = k1;
                    j3 = k2;
                    if (s1 != null)
                    {
                        j3 = k2 + 1;
                        i4 = k1 + kwk.a(s1);
                    }
                    i1++;
                    k1 = i4;
                }

                i1 = j1 + k1 + k2 * 1;
            }
        }
        j1 = i1;
        if (h != null)
        {
            j1 = i1 + kwk.b(7, h);
        }
        i1 = j1;
        if (i != null)
        {
            i1 = j1 + kwk.b(8, i);
        }
        j1 = i1;
        if (j != null)
        {
            j1 = i1 + kwk.b(9, j);
        }
        i1 = j1;
        if (k != null)
        {
            k.booleanValue();
            i1 = j1 + (kwk.f(10) + 1);
        }
        k1 = i1;
        if (l != null)
        {
            k1 = i1 + kwk.e(11, l.intValue());
        }
        j1 = k1;
        if (m != null)
        {
            j1 = k1 + kwk.e(12, m.intValue());
        }
        i1 = j1;
        if (n != null)
        {
            i1 = j1;
            if (n.length > 0)
            {
                i1 = 0;
                int l1 = 0;
                int l2;
                int k3;
                for (l2 = 0; i1 < n.length; l2 = k3)
                {
                    String s2 = n[i1];
                    int j4 = l1;
                    k3 = l2;
                    if (s2 != null)
                    {
                        k3 = l2 + 1;
                        j4 = l1 + kwk.a(s2);
                    }
                    i1++;
                    l1 = j4;
                }

                i1 = j1 + l1 + l2 * 1;
            }
        }
        j1 = i1;
        if (o != null)
        {
            j1 = i1;
            if (o.length > 0)
            {
                int i2 = ((flag) ? 1 : 0);
                do
                {
                    j1 = i1;
                    if (i2 >= o.length)
                    {
                        break;
                    }
                    kbk kbk1 = o[i2];
                    j1 = i1;
                    if (kbk1 != null)
                    {
                        j1 = i1 + kwk.d(14, kbk1);
                    }
                    i2++;
                    i1 = j1;
                } while (true);
            }
        }
        i1 = j1;
        if (e != null)
        {
            i1 = j1 + kwk.b(15, e);
        }
        return i1;
    }

    public kws mergeFrom(kwj kwj1)
    {
_L18:
        int i1 = kwj1.a();
        i1;
        JVM INSTR lookupswitch 16: default 144
    //                   0: 153
    //                   8: 155
    //                   18: 202
    //                   26: 213
    //                   34: 224
    //                   42: 235
    //                   50: 337
    //                   58: 439
    //                   66: 450
    //                   74: 461
    //                   80: 472
    //                   88: 486
    //                   96: 534
    //                   106: 582
    //                   114: 684
    //                   122: 808;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17
_L1:
        if (super.storeUnknownField(kwj1, i1)) goto _L18; else goto _L2
_L2:
        return this;
_L3:
        int j1 = kwj1.f();
        switch (j1)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
            a = Integer.valueOf(j1);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        b = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L5:
        c = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L6:
        d = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L7:
        int i3 = kwx.a(kwj1, 42);
        String as[];
        int k1;
        if (f == null)
        {
            k1 = 0;
        } else
        {
            k1 = f.length;
        }
        as = new String[i3 + k1];
        i3 = k1;
        if (k1 != 0)
        {
            System.arraycopy(f, 0, as, 0, k1);
            i3 = k1;
        }
        for (; i3 < as.length - 1; i3++)
        {
            as[i3] = kwj1.j();
            kwj1.a();
        }

        as[i3] = kwj1.j();
        f = as;
        continue; /* Loop/switch isn't completed */
_L8:
        int j3 = kwx.a(kwj1, 50);
        String as1[];
        int l1;
        if (g == null)
        {
            l1 = 0;
        } else
        {
            l1 = g.length;
        }
        as1 = new String[j3 + l1];
        j3 = l1;
        if (l1 != 0)
        {
            System.arraycopy(g, 0, as1, 0, l1);
            j3 = l1;
        }
        for (; j3 < as1.length - 1; j3++)
        {
            as1[j3] = kwj1.j();
            kwj1.a();
        }

        as1[j3] = kwj1.j();
        g = as1;
        continue; /* Loop/switch isn't completed */
_L9:
        h = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L10:
        i = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L11:
        j = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L12:
        k = Boolean.valueOf(kwj1.i());
        continue; /* Loop/switch isn't completed */
_L13:
        int i2 = kwj1.f();
        switch (i2)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
            l = Integer.valueOf(i2);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L14:
        int j2 = kwj1.f();
        switch (j2)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
            m = Integer.valueOf(j2);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L15:
        int k3 = kwx.a(kwj1, 106);
        String as2[];
        int k2;
        if (n == null)
        {
            k2 = 0;
        } else
        {
            k2 = n.length;
        }
        as2 = new String[k3 + k2];
        k3 = k2;
        if (k2 != 0)
        {
            System.arraycopy(n, 0, as2, 0, k2);
            k3 = k2;
        }
        for (; k3 < as2.length - 1; k3++)
        {
            as2[k3] = kwj1.j();
            kwj1.a();
        }

        as2[k3] = kwj1.j();
        n = as2;
        continue; /* Loop/switch isn't completed */
_L16:
        int l3 = kwx.a(kwj1, 114);
        kbk akbk[];
        int l2;
        if (o == null)
        {
            l2 = 0;
        } else
        {
            l2 = o.length;
        }
        akbk = new kbk[l3 + l2];
        l3 = l2;
        if (l2 != 0)
        {
            System.arraycopy(o, 0, akbk, 0, l2);
            l3 = l2;
        }
        for (; l3 < akbk.length - 1; l3++)
        {
            akbk[l3] = new kbk();
            kwj1.a(akbk[l3]);
            kwj1.a();
        }

        akbk[l3] = new kbk();
        kwj1.a(akbk[l3]);
        o = akbk;
        continue; /* Loop/switch isn't completed */
_L17:
        e = kwj1.j();
        if (true) goto _L18; else goto _L19
_L19:
    }

    public void writeTo(kwk kwk1)
    {
        boolean flag = false;
        if (a != null)
        {
            kwk1.a(1, a.intValue());
        }
        if (b != null)
        {
            kwk1.a(2, b);
        }
        if (c != null)
        {
            kwk1.a(3, c);
        }
        if (d != null)
        {
            kwk1.a(4, d);
        }
        if (f != null && f.length > 0)
        {
            for (int i1 = 0; i1 < f.length; i1++)
            {
                String s = f[i1];
                if (s != null)
                {
                    kwk1.a(5, s);
                }
            }

        }
        if (g != null && g.length > 0)
        {
            for (int j1 = 0; j1 < g.length; j1++)
            {
                String s1 = g[j1];
                if (s1 != null)
                {
                    kwk1.a(6, s1);
                }
            }

        }
        if (h != null)
        {
            kwk1.a(7, h);
        }
        if (i != null)
        {
            kwk1.a(8, i);
        }
        if (j != null)
        {
            kwk1.a(9, j);
        }
        if (k != null)
        {
            kwk1.a(10, k.booleanValue());
        }
        if (l != null)
        {
            kwk1.a(11, l.intValue());
        }
        if (m != null)
        {
            kwk1.a(12, m.intValue());
        }
        if (n != null && n.length > 0)
        {
            for (int k1 = 0; k1 < n.length; k1++)
            {
                String s2 = n[k1];
                if (s2 != null)
                {
                    kwk1.a(13, s2);
                }
            }

        }
        if (o != null && o.length > 0)
        {
            for (int l1 = ((flag) ? 1 : 0); l1 < o.length; l1++)
            {
                kbk kbk1 = o[l1];
                if (kbk1 != null)
                {
                    kwk1.b(14, kbk1);
                }
            }

        }
        if (e != null)
        {
            kwk1.a(15, e);
        }
        super.writeTo(kwk1);
    }
}
