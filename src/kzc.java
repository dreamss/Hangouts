// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class kzc extends kwm
{

    private static final kzc L[] = new kzc[0];
    public static final kwn a = kwn.a(kzc, 0x1325b252L);
    public static final kwn b = kwn.a(kzc, 0x1325b252L);
    public kxc A;
    public String B;
    public String C;
    public kxc D;
    public String E;
    public String F;
    public String G;
    public String H;
    public String I;
    public String J;
    public String K;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public kxo h;
    public String i;
    public kxc j[];
    public kxc k;
    public String l;
    public kxc m[];
    public String n;
    public String o;
    public String p[];
    public String q[];
    public String r[];
    public String s[];
    public kxc t;
    public kxc u[];
    public Boolean v;
    public String w;
    public kxc x;
    public kxc y[];
    public Integer z;

    public kzc()
    {
        c = null;
        d = null;
        e = null;
        f = null;
        g = null;
        h = null;
        i = null;
        j = kxc.a();
        k = null;
        l = null;
        m = kxc.a();
        n = null;
        o = null;
        p = kwx.f;
        q = kwx.f;
        r = kwx.f;
        s = kwx.f;
        t = null;
        u = kxc.a();
        v = null;
        w = null;
        x = null;
        y = kxc.a();
        z = null;
        A = null;
        B = null;
        C = null;
        D = null;
        E = null;
        F = null;
        G = null;
        H = null;
        I = null;
        J = null;
        K = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        boolean flag = false;
        int j1 = super.computeSerializedSize();
        int i1 = j1;
        if (c != null)
        {
            i1 = j1 + kwk.b(1, c);
        }
        j1 = i1;
        if (d != null)
        {
            j1 = i1 + kwk.b(2, d);
        }
        i1 = j1;
        if (e != null)
        {
            i1 = j1 + kwk.b(3, e);
        }
        j1 = i1;
        if (f != null)
        {
            j1 = i1 + kwk.b(4, f);
        }
        i1 = j1;
        if (g != null)
        {
            i1 = j1 + kwk.b(5, g);
        }
        j1 = i1;
        if (h != null)
        {
            j1 = i1 + kwk.d(6, h);
        }
        i1 = j1;
        if (i != null)
        {
            i1 = j1 + kwk.b(7, i);
        }
        j1 = i1;
        if (j != null)
        {
            j1 = i1;
            if (j.length > 0)
            {
                for (j1 = 0; j1 < j.length;)
                {
                    kxc kxc1 = j[j1];
                    int k1 = i1;
                    if (kxc1 != null)
                    {
                        k1 = i1 + kwk.d(8, kxc1);
                    }
                    j1++;
                    i1 = k1;
                }

                j1 = i1;
            }
        }
        int l1 = j1;
        if (k != null)
        {
            l1 = j1 + kwk.d(9, k);
        }
        i1 = l1;
        if (l != null)
        {
            i1 = l1 + kwk.b(10, l);
        }
        j1 = i1;
        if (m != null)
        {
            j1 = i1;
            if (m.length > 0)
            {
                for (j1 = 0; j1 < m.length;)
                {
                    kxc kxc2 = m[j1];
                    l1 = i1;
                    if (kxc2 != null)
                    {
                        l1 = i1 + kwk.d(11, kxc2);
                    }
                    j1++;
                    i1 = l1;
                }

                j1 = i1;
            }
        }
        l1 = j1;
        if (n != null)
        {
            l1 = j1 + kwk.b(12, n);
        }
        i1 = l1;
        if (o != null)
        {
            i1 = l1 + kwk.b(13, o);
        }
        j1 = i1;
        if (p != null)
        {
            j1 = i1;
            if (p.length > 0)
            {
                j1 = 0;
                l1 = 0;
                int k2;
                int k3;
                for (k2 = 0; j1 < p.length; k2 = k3)
                {
                    String s1 = p[j1];
                    int k4 = l1;
                    k3 = k2;
                    if (s1 != null)
                    {
                        k3 = k2 + 1;
                        k4 = l1 + kwk.a(s1);
                    }
                    j1++;
                    l1 = k4;
                }

                j1 = i1 + l1 + k2 * 1;
            }
        }
        i1 = j1;
        if (q != null)
        {
            i1 = j1;
            if (q.length > 0)
            {
                i1 = 0;
                l1 = 0;
                int l2;
                int l3;
                for (l2 = 0; i1 < q.length; l2 = l3)
                {
                    String s2 = q[i1];
                    int l4 = l1;
                    l3 = l2;
                    if (s2 != null)
                    {
                        l3 = l2 + 1;
                        l4 = l1 + kwk.a(s2);
                    }
                    i1++;
                    l1 = l4;
                }

                i1 = j1 + l1 + l2 * 1;
            }
        }
        j1 = i1;
        if (r != null)
        {
            j1 = i1;
            if (r.length > 0)
            {
                j1 = 0;
                l1 = 0;
                int i3;
                int i4;
                for (i3 = 0; j1 < r.length; i3 = i4)
                {
                    String s3 = r[j1];
                    int i5 = l1;
                    i4 = i3;
                    if (s3 != null)
                    {
                        i4 = i3 + 1;
                        i5 = l1 + kwk.a(s3);
                    }
                    j1++;
                    l1 = i5;
                }

                j1 = i1 + l1 + i3 * 2;
            }
        }
        l1 = j1;
        if (s != null)
        {
            l1 = j1;
            if (s.length > 0)
            {
                i1 = 0;
                l1 = 0;
                int j3;
                int j4;
                for (j3 = 0; i1 < s.length; j3 = j4)
                {
                    String s4 = s[i1];
                    int j5 = l1;
                    j4 = j3;
                    if (s4 != null)
                    {
                        j4 = j3 + 1;
                        j5 = l1 + kwk.a(s4);
                    }
                    i1++;
                    l1 = j5;
                }

                l1 = j1 + l1 + j3 * 2;
            }
        }
        i1 = l1;
        if (t != null)
        {
            i1 = l1 + kwk.d(18, t);
        }
        j1 = i1;
        if (u != null)
        {
            j1 = i1;
            if (u.length > 0)
            {
                for (j1 = 0; j1 < u.length;)
                {
                    kxc kxc3 = u[j1];
                    int i2 = i1;
                    if (kxc3 != null)
                    {
                        i2 = i1 + kwk.d(42, kxc3);
                    }
                    j1++;
                    i1 = i2;
                }

                j1 = i1;
            }
        }
        i1 = j1;
        if (v != null)
        {
            v.booleanValue();
            i1 = j1 + (kwk.f(65) + 1);
        }
        j1 = i1;
        if (w != null)
        {
            j1 = i1 + kwk.b(75, w);
        }
        i1 = j1;
        if (x != null)
        {
            i1 = j1 + kwk.d(82, x);
        }
        j1 = i1;
        if (y != null)
        {
            j1 = i1;
            if (y.length > 0)
            {
                int j2 = ((flag) ? 1 : 0);
                do
                {
                    j1 = i1;
                    if (j2 >= y.length)
                    {
                        break;
                    }
                    kxc kxc4 = y[j2];
                    j1 = i1;
                    if (kxc4 != null)
                    {
                        j1 = i1 + kwk.d(83, kxc4);
                    }
                    j2++;
                    i1 = j1;
                } while (true);
            }
        }
        i1 = j1;
        if (z != null)
        {
            i1 = j1 + kwk.e(90, z.intValue());
        }
        j1 = i1;
        if (A != null)
        {
            j1 = i1 + kwk.d(96, A);
        }
        i1 = j1;
        if (B != null)
        {
            i1 = j1 + kwk.b(111, B);
        }
        j1 = i1;
        if (C != null)
        {
            j1 = i1 + kwk.b(112, C);
        }
        i1 = j1;
        if (D != null)
        {
            i1 = j1 + kwk.d(185, D);
        }
        j1 = i1;
        if (E != null)
        {
            j1 = i1 + kwk.b(188, E);
        }
        i1 = j1;
        if (F != null)
        {
            i1 = j1 + kwk.b(189, F);
        }
        j1 = i1;
        if (G != null)
        {
            j1 = i1 + kwk.b(190, G);
        }
        i1 = j1;
        if (H != null)
        {
            i1 = j1 + kwk.b(191, H);
        }
        j1 = i1;
        if (I != null)
        {
            j1 = i1 + kwk.b(249, I);
        }
        i1 = j1;
        if (J != null)
        {
            i1 = j1 + kwk.b(252, J);
        }
        j1 = i1;
        if (K != null)
        {
            j1 = i1 + kwk.b(254, K);
        }
        return j1;
    }

    public kws mergeFrom(kwj kwj1)
    {
_L38:
        int i1 = kwj1.a();
        i1;
        JVM INSTR lookupswitch 36: default 304
    //                   0: 313
    //                   10: 315
    //                   18: 326
    //                   26: 337
    //                   34: 348
    //                   42: 359
    //                   50: 370
    //                   58: 399
    //                   66: 410
    //                   74: 534
    //                   82: 563
    //                   90: 574
    //                   98: 698
    //                   106: 709
    //                   114: 720
    //                   122: 822
    //                   130: 924
    //                   138: 1027
    //                   146: 1130
    //                   338: 1159
    //                   520: 1284
    //                   602: 1298
    //                   658: 1309
    //                   666: 1338
    //                   720: 1463
    //                   770: 1506
    //                   890: 1535
    //                   898: 1546
    //                   1482: 1557
    //                   1506: 1586
    //                   1514: 1597
    //                   1522: 1608
    //                   1530: 1619
    //                   1994: 1630
    //                   2018: 1641
    //                   2034: 1652;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19 _L20 _L21 _L22 _L23 _L24 _L25 _L26 _L27 _L28 _L29 _L30 _L31 _L32 _L33 _L34 _L35 _L36 _L37
_L1:
        if (super.storeUnknownField(kwj1, i1)) goto _L38; else goto _L2
_L2:
        return this;
_L3:
        c = kwj1.j();
          goto _L38
_L4:
        d = kwj1.j();
          goto _L38
_L5:
        e = kwj1.j();
          goto _L38
_L6:
        f = kwj1.j();
          goto _L38
_L7:
        g = kwj1.j();
          goto _L38
_L8:
        if (h == null)
        {
            h = new kxo();
        }
        kwj1.a(h);
          goto _L38
_L9:
        i = kwj1.j();
          goto _L38
_L10:
        int k3 = kwx.a(kwj1, 66);
        kxc akxc[];
        int j1;
        if (j == null)
        {
            j1 = 0;
        } else
        {
            j1 = j.length;
        }
        akxc = new kxc[k3 + j1];
        k3 = j1;
        if (j1 != 0)
        {
            System.arraycopy(j, 0, akxc, 0, j1);
            k3 = j1;
        }
        for (; k3 < akxc.length - 1; k3++)
        {
            akxc[k3] = new kxc();
            kwj1.a(akxc[k3]);
            kwj1.a();
        }

        akxc[k3] = new kxc();
        kwj1.a(akxc[k3]);
        j = akxc;
          goto _L38
_L11:
        if (k == null)
        {
            k = new kxc();
        }
        kwj1.a(k);
          goto _L38
_L12:
        l = kwj1.j();
          goto _L38
_L13:
        int l3 = kwx.a(kwj1, 90);
        kxc akxc1[];
        int k1;
        if (m == null)
        {
            k1 = 0;
        } else
        {
            k1 = m.length;
        }
        akxc1 = new kxc[l3 + k1];
        l3 = k1;
        if (k1 != 0)
        {
            System.arraycopy(m, 0, akxc1, 0, k1);
            l3 = k1;
        }
        for (; l3 < akxc1.length - 1; l3++)
        {
            akxc1[l3] = new kxc();
            kwj1.a(akxc1[l3]);
            kwj1.a();
        }

        akxc1[l3] = new kxc();
        kwj1.a(akxc1[l3]);
        m = akxc1;
          goto _L38
_L14:
        n = kwj1.j();
          goto _L38
_L15:
        o = kwj1.j();
          goto _L38
_L16:
        int i4 = kwx.a(kwj1, 114);
        String as[];
        int l1;
        if (p == null)
        {
            l1 = 0;
        } else
        {
            l1 = p.length;
        }
        as = new String[i4 + l1];
        i4 = l1;
        if (l1 != 0)
        {
            System.arraycopy(p, 0, as, 0, l1);
            i4 = l1;
        }
        for (; i4 < as.length - 1; i4++)
        {
            as[i4] = kwj1.j();
            kwj1.a();
        }

        as[i4] = kwj1.j();
        p = as;
          goto _L38
_L17:
        int j4 = kwx.a(kwj1, 122);
        String as1[];
        int i2;
        if (q == null)
        {
            i2 = 0;
        } else
        {
            i2 = q.length;
        }
        as1 = new String[j4 + i2];
        j4 = i2;
        if (i2 != 0)
        {
            System.arraycopy(q, 0, as1, 0, i2);
            j4 = i2;
        }
        for (; j4 < as1.length - 1; j4++)
        {
            as1[j4] = kwj1.j();
            kwj1.a();
        }

        as1[j4] = kwj1.j();
        q = as1;
          goto _L38
_L18:
        int k4 = kwx.a(kwj1, 130);
        String as2[];
        int j2;
        if (r == null)
        {
            j2 = 0;
        } else
        {
            j2 = r.length;
        }
        as2 = new String[k4 + j2];
        k4 = j2;
        if (j2 != 0)
        {
            System.arraycopy(r, 0, as2, 0, j2);
            k4 = j2;
        }
        for (; k4 < as2.length - 1; k4++)
        {
            as2[k4] = kwj1.j();
            kwj1.a();
        }

        as2[k4] = kwj1.j();
        r = as2;
          goto _L38
_L19:
        int l4 = kwx.a(kwj1, 138);
        String as3[];
        int k2;
        if (s == null)
        {
            k2 = 0;
        } else
        {
            k2 = s.length;
        }
        as3 = new String[l4 + k2];
        l4 = k2;
        if (k2 != 0)
        {
            System.arraycopy(s, 0, as3, 0, k2);
            l4 = k2;
        }
        for (; l4 < as3.length - 1; l4++)
        {
            as3[l4] = kwj1.j();
            kwj1.a();
        }

        as3[l4] = kwj1.j();
        s = as3;
          goto _L38
_L20:
        if (t == null)
        {
            t = new kxc();
        }
        kwj1.a(t);
          goto _L38
_L21:
        int i5 = kwx.a(kwj1, 338);
        kxc akxc2[];
        int l2;
        if (u == null)
        {
            l2 = 0;
        } else
        {
            l2 = u.length;
        }
        akxc2 = new kxc[i5 + l2];
        i5 = l2;
        if (l2 != 0)
        {
            System.arraycopy(u, 0, akxc2, 0, l2);
            i5 = l2;
        }
        for (; i5 < akxc2.length - 1; i5++)
        {
            akxc2[i5] = new kxc();
            kwj1.a(akxc2[i5]);
            kwj1.a();
        }

        akxc2[i5] = new kxc();
        kwj1.a(akxc2[i5]);
        u = akxc2;
          goto _L38
_L22:
        v = Boolean.valueOf(kwj1.i());
          goto _L38
_L23:
        w = kwj1.j();
          goto _L38
_L24:
        if (x == null)
        {
            x = new kxc();
        }
        kwj1.a(x);
          goto _L38
_L25:
        int j5 = kwx.a(kwj1, 666);
        kxc akxc3[];
        int i3;
        if (y == null)
        {
            i3 = 0;
        } else
        {
            i3 = y.length;
        }
        akxc3 = new kxc[j5 + i3];
        j5 = i3;
        if (i3 != 0)
        {
            System.arraycopy(y, 0, akxc3, 0, i3);
            j5 = i3;
        }
        for (; j5 < akxc3.length - 1; j5++)
        {
            akxc3[j5] = new kxc();
            kwj1.a(akxc3[j5]);
            kwj1.a();
        }

        akxc3[j5] = new kxc();
        kwj1.a(akxc3[j5]);
        y = akxc3;
          goto _L38
_L26:
        int j3 = kwj1.f();
        switch (j3)
        {
        case 0: // '\0'
        case 1: // '\001'
            z = Integer.valueOf(j3);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L27:
        if (A == null)
        {
            A = new kxc();
        }
        kwj1.a(A);
        continue; /* Loop/switch isn't completed */
_L28:
        B = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L29:
        C = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L30:
        if (D == null)
        {
            D = new kxc();
        }
        kwj1.a(D);
        continue; /* Loop/switch isn't completed */
_L31:
        E = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L32:
        F = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L33:
        G = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L34:
        H = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L35:
        I = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L36:
        J = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L37:
        K = kwj1.j();
        if (true) goto _L38; else goto _L39
_L39:
    }

    public void writeTo(kwk kwk1)
    {
        boolean flag = false;
        if (c != null)
        {
            kwk1.a(1, c);
        }
        if (d != null)
        {
            kwk1.a(2, d);
        }
        if (e != null)
        {
            kwk1.a(3, e);
        }
        if (f != null)
        {
            kwk1.a(4, f);
        }
        if (g != null)
        {
            kwk1.a(5, g);
        }
        if (h != null)
        {
            kwk1.b(6, h);
        }
        if (i != null)
        {
            kwk1.a(7, i);
        }
        if (j != null && j.length > 0)
        {
            for (int i1 = 0; i1 < j.length; i1++)
            {
                kxc kxc1 = j[i1];
                if (kxc1 != null)
                {
                    kwk1.b(8, kxc1);
                }
            }

        }
        if (k != null)
        {
            kwk1.b(9, k);
        }
        if (l != null)
        {
            kwk1.a(10, l);
        }
        if (m != null && m.length > 0)
        {
            for (int j1 = 0; j1 < m.length; j1++)
            {
                kxc kxc2 = m[j1];
                if (kxc2 != null)
                {
                    kwk1.b(11, kxc2);
                }
            }

        }
        if (n != null)
        {
            kwk1.a(12, n);
        }
        if (o != null)
        {
            kwk1.a(13, o);
        }
        if (p != null && p.length > 0)
        {
            for (int k1 = 0; k1 < p.length; k1++)
            {
                String s1 = p[k1];
                if (s1 != null)
                {
                    kwk1.a(14, s1);
                }
            }

        }
        if (q != null && q.length > 0)
        {
            for (int l1 = 0; l1 < q.length; l1++)
            {
                String s2 = q[l1];
                if (s2 != null)
                {
                    kwk1.a(15, s2);
                }
            }

        }
        if (r != null && r.length > 0)
        {
            for (int i2 = 0; i2 < r.length; i2++)
            {
                String s3 = r[i2];
                if (s3 != null)
                {
                    kwk1.a(16, s3);
                }
            }

        }
        if (s != null && s.length > 0)
        {
            for (int j2 = 0; j2 < s.length; j2++)
            {
                String s4 = s[j2];
                if (s4 != null)
                {
                    kwk1.a(17, s4);
                }
            }

        }
        if (t != null)
        {
            kwk1.b(18, t);
        }
        if (u != null && u.length > 0)
        {
            for (int k2 = 0; k2 < u.length; k2++)
            {
                kxc kxc3 = u[k2];
                if (kxc3 != null)
                {
                    kwk1.b(42, kxc3);
                }
            }

        }
        if (v != null)
        {
            kwk1.a(65, v.booleanValue());
        }
        if (w != null)
        {
            kwk1.a(75, w);
        }
        if (x != null)
        {
            kwk1.b(82, x);
        }
        if (y != null && y.length > 0)
        {
            for (int l2 = ((flag) ? 1 : 0); l2 < y.length; l2++)
            {
                kxc kxc4 = y[l2];
                if (kxc4 != null)
                {
                    kwk1.b(83, kxc4);
                }
            }

        }
        if (z != null)
        {
            kwk1.a(90, z.intValue());
        }
        if (A != null)
        {
            kwk1.b(96, A);
        }
        if (B != null)
        {
            kwk1.a(111, B);
        }
        if (C != null)
        {
            kwk1.a(112, C);
        }
        if (D != null)
        {
            kwk1.b(185, D);
        }
        if (E != null)
        {
            kwk1.a(188, E);
        }
        if (F != null)
        {
            kwk1.a(189, F);
        }
        if (G != null)
        {
            kwk1.a(190, G);
        }
        if (H != null)
        {
            kwk1.a(191, H);
        }
        if (I != null)
        {
            kwk1.a(249, I);
        }
        if (J != null)
        {
            kwk1.a(252, J);
        }
        if (K != null)
        {
            kwk1.a(254, K);
        }
        super.writeTo(kwk1);
    }

}
