// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class kbz extends kwm
{

    private static final kbz G[] = new kbz[0];
    public static final kwn a = kwn.a(kbz, 0x1ad079aL);
    public String A;
    public String B;
    public String C;
    public String D[];
    public String E;
    public String F;
    public String b;
    public String c;
    public Boolean d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;
    public String k;
    public String l;
    public String m;
    public String n;
    public String o;
    public String p;
    public String q;
    public String r;
    public String s;
    public String t;
    public String u;
    public String v;
    public String w;
    public String x;
    public String y;
    public String z;

    public kbz()
    {
        b = null;
        c = null;
        d = null;
        e = null;
        f = null;
        g = null;
        h = null;
        i = null;
        j = null;
        k = null;
        l = null;
        m = null;
        n = null;
        o = null;
        p = null;
        q = null;
        r = null;
        s = null;
        t = null;
        u = null;
        v = null;
        w = null;
        x = null;
        y = null;
        z = null;
        A = null;
        B = null;
        C = null;
        D = kwx.f;
        E = null;
        F = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        boolean flag = false;
        int j1 = super.computeSerializedSize();
        int i1 = j1;
        if (b != null)
        {
            i1 = j1 + kwk.b(1, b);
        }
        j1 = i1;
        if (c != null)
        {
            j1 = i1 + kwk.b(2, c);
        }
        i1 = j1;
        if (f != null)
        {
            i1 = j1 + kwk.b(3, f);
        }
        j1 = i1;
        if (g != null)
        {
            j1 = i1 + kwk.b(4, g);
        }
        i1 = j1;
        if (h != null)
        {
            i1 = j1 + kwk.b(5, h);
        }
        j1 = i1;
        if (j != null)
        {
            j1 = i1 + kwk.b(6, j);
        }
        i1 = j1;
        if (k != null)
        {
            i1 = j1 + kwk.b(7, k);
        }
        j1 = i1;
        if (l != null)
        {
            j1 = i1 + kwk.b(8, l);
        }
        i1 = j1;
        if (m != null)
        {
            i1 = j1 + kwk.b(9, m);
        }
        j1 = i1;
        if (n != null)
        {
            j1 = i1 + kwk.b(10, n);
        }
        i1 = j1;
        if (o != null)
        {
            i1 = j1 + kwk.b(11, o);
        }
        j1 = i1;
        if (x != null)
        {
            j1 = i1 + kwk.b(12, x);
        }
        i1 = j1;
        if (y != null)
        {
            i1 = j1 + kwk.b(13, y);
        }
        j1 = i1;
        if (D != null)
        {
            j1 = i1;
            if (D.length > 0)
            {
                int k1 = 0;
                int l1 = 0;
                for (j1 = ((flag) ? 1 : 0); j1 < D.length;)
                {
                    String s1 = D[j1];
                    int j2 = k1;
                    int i2 = l1;
                    if (s1 != null)
                    {
                        i2 = l1 + 1;
                        j2 = k1 + kwk.a(s1);
                    }
                    j1++;
                    k1 = j2;
                    l1 = i2;
                }

                j1 = i1 + k1 + l1 * 1;
            }
        }
        i1 = j1;
        if (B != null)
        {
            i1 = j1 + kwk.b(15, B);
        }
        j1 = i1;
        if (C != null)
        {
            j1 = i1 + kwk.b(16, C);
        }
        i1 = j1;
        if (i != null)
        {
            i1 = j1 + kwk.b(17, i);
        }
        j1 = i1;
        if (q != null)
        {
            j1 = i1 + kwk.b(18, q);
        }
        i1 = j1;
        if (r != null)
        {
            i1 = j1 + kwk.b(19, r);
        }
        j1 = i1;
        if (s != null)
        {
            j1 = i1 + kwk.b(20, s);
        }
        i1 = j1;
        if (p != null)
        {
            i1 = j1 + kwk.b(21, p);
        }
        j1 = i1;
        if (t != null)
        {
            j1 = i1 + kwk.b(22, t);
        }
        i1 = j1;
        if (u != null)
        {
            i1 = j1 + kwk.b(23, u);
        }
        j1 = i1;
        if (v != null)
        {
            j1 = i1 + kwk.b(24, v);
        }
        i1 = j1;
        if (w != null)
        {
            i1 = j1 + kwk.b(25, w);
        }
        j1 = i1;
        if (e != null)
        {
            j1 = i1 + kwk.b(26, e);
        }
        i1 = j1;
        if (E != null)
        {
            i1 = j1 + kwk.b(27, E);
        }
        j1 = i1;
        if (F != null)
        {
            j1 = i1 + kwk.b(28, F);
        }
        i1 = j1;
        if (z != null)
        {
            i1 = j1 + kwk.b(29, z);
        }
        j1 = i1;
        if (A != null)
        {
            j1 = i1 + kwk.b(30, A);
        }
        i1 = j1;
        if (d != null)
        {
            d.booleanValue();
            i1 = j1 + (kwk.f(31) + 1);
        }
        return i1;
    }

    public kws mergeFrom(kwj kwj1)
    {
        do
        {
            int i1 = kwj1.a();
            switch (i1)
            {
            default:
                if (super.storeUnknownField(kwj1, i1))
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
                c = kwj1.j();
                break;

            case 26: // '\032'
                f = kwj1.j();
                break;

            case 34: // '"'
                g = kwj1.j();
                break;

            case 42: // '*'
                h = kwj1.j();
                break;

            case 50: // '2'
                j = kwj1.j();
                break;

            case 58: // ':'
                k = kwj1.j();
                break;

            case 66: // 'B'
                l = kwj1.j();
                break;

            case 74: // 'J'
                m = kwj1.j();
                break;

            case 82: // 'R'
                n = kwj1.j();
                break;

            case 90: // 'Z'
                o = kwj1.j();
                break;

            case 98: // 'b'
                x = kwj1.j();
                break;

            case 106: // 'j'
                y = kwj1.j();
                break;

            case 114: // 'r'
                int k1 = kwx.a(kwj1, 114);
                String as[];
                int j1;
                if (D == null)
                {
                    j1 = 0;
                } else
                {
                    j1 = D.length;
                }
                as = new String[k1 + j1];
                k1 = j1;
                if (j1 != 0)
                {
                    System.arraycopy(D, 0, as, 0, j1);
                    k1 = j1;
                }
                for (; k1 < as.length - 1; k1++)
                {
                    as[k1] = kwj1.j();
                    kwj1.a();
                }

                as[k1] = kwj1.j();
                D = as;
                break;

            case 122: // 'z'
                B = kwj1.j();
                break;

            case 130: 
                C = kwj1.j();
                break;

            case 138: 
                i = kwj1.j();
                break;

            case 146: 
                q = kwj1.j();
                break;

            case 154: 
                r = kwj1.j();
                break;

            case 162: 
                s = kwj1.j();
                break;

            case 170: 
                p = kwj1.j();
                break;

            case 178: 
                t = kwj1.j();
                break;

            case 186: 
                u = kwj1.j();
                break;

            case 194: 
                v = kwj1.j();
                break;

            case 202: 
                w = kwj1.j();
                break;

            case 210: 
                e = kwj1.j();
                break;

            case 218: 
                E = kwj1.j();
                break;

            case 226: 
                F = kwj1.j();
                break;

            case 234: 
                z = kwj1.j();
                break;

            case 242: 
                A = kwj1.j();
                break;

            case 248: 
                d = Boolean.valueOf(kwj1.i());
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
        if (c != null)
        {
            kwk1.a(2, c);
        }
        if (f != null)
        {
            kwk1.a(3, f);
        }
        if (g != null)
        {
            kwk1.a(4, g);
        }
        if (h != null)
        {
            kwk1.a(5, h);
        }
        if (j != null)
        {
            kwk1.a(6, j);
        }
        if (k != null)
        {
            kwk1.a(7, k);
        }
        if (l != null)
        {
            kwk1.a(8, l);
        }
        if (m != null)
        {
            kwk1.a(9, m);
        }
        if (n != null)
        {
            kwk1.a(10, n);
        }
        if (o != null)
        {
            kwk1.a(11, o);
        }
        if (x != null)
        {
            kwk1.a(12, x);
        }
        if (y != null)
        {
            kwk1.a(13, y);
        }
        if (D != null && D.length > 0)
        {
            for (int i1 = 0; i1 < D.length; i1++)
            {
                String s1 = D[i1];
                if (s1 != null)
                {
                    kwk1.a(14, s1);
                }
            }

        }
        if (B != null)
        {
            kwk1.a(15, B);
        }
        if (C != null)
        {
            kwk1.a(16, C);
        }
        if (i != null)
        {
            kwk1.a(17, i);
        }
        if (q != null)
        {
            kwk1.a(18, q);
        }
        if (r != null)
        {
            kwk1.a(19, r);
        }
        if (s != null)
        {
            kwk1.a(20, s);
        }
        if (p != null)
        {
            kwk1.a(21, p);
        }
        if (t != null)
        {
            kwk1.a(22, t);
        }
        if (u != null)
        {
            kwk1.a(23, u);
        }
        if (v != null)
        {
            kwk1.a(24, v);
        }
        if (w != null)
        {
            kwk1.a(25, w);
        }
        if (e != null)
        {
            kwk1.a(26, e);
        }
        if (E != null)
        {
            kwk1.a(27, E);
        }
        if (F != null)
        {
            kwk1.a(28, F);
        }
        if (z != null)
        {
            kwk1.a(29, z);
        }
        if (A != null)
        {
            kwk1.a(30, A);
        }
        if (d != null)
        {
            kwk1.a(31, d.booleanValue());
        }
        super.writeTo(kwk1);
    }

}
