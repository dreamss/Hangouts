// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jcv extends kwm
{

    public jce a[];
    public int b[];
    public jdk requestHeader;

    public jcv()
    {
        requestHeader = null;
        a = jce.a();
        b = kwx.a;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        boolean flag = false;
        int j = super.computeSerializedSize();
        int i = j;
        if (requestHeader != null)
        {
            i = j + kwk.d(1, requestHeader);
        }
        j = i;
        if (a != null)
        {
            j = i;
            if (a.length > 0)
            {
                for (j = 0; j < a.length;)
                {
                    jce jce1 = a[j];
                    int k = i;
                    if (jce1 != null)
                    {
                        k = i + kwk.d(2, jce1);
                    }
                    j++;
                    i = k;
                }

                j = i;
            }
        }
        i = j;
        if (b != null)
        {
            i = j;
            if (b.length > 0)
            {
                int l = 0;
                for (i = ((flag) ? 1 : 0); i < b.length; i++)
                {
                    l += kwk.e(b[i]);
                }

                i = j + l + b.length * 1;
            }
        }
        return i;
    }

    public kws mergeFrom(kwj kwj1)
    {
_L21:
        int i = kwj1.a();
        i;
        JVM INSTR lookupswitch 5: default 60
    //                   0: 70
    //                   10: 72
    //                   18: 101
    //                   24: 232
    //                   26: 448;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        if (super.storeUnknownField(kwj1, i))
        {
            continue; /* Loop/switch isn't completed */
        }
_L2:
        return this;
_L3:
        if (requestHeader == null)
        {
            requestHeader = new jdk();
        }
        kwj1.a(requestHeader);
        continue; /* Loop/switch isn't completed */
_L4:
        int j = kwx.a(kwj1, 18);
        jce ajce[];
        if (a == null)
        {
            i = 0;
        } else
        {
            i = a.length;
        }
        ajce = new jce[j + i];
        j = i;
        if (i != 0)
        {
            System.arraycopy(a, 0, ajce, 0, i);
            j = i;
        }
        for (; j < ajce.length - 1; j++)
        {
            ajce[j] = new jce();
            kwj1.a(ajce[j]);
            kwj1.a();
        }

        ajce[j] = new jce();
        kwj1.a(ajce[j]);
        a = ajce;
        continue; /* Loop/switch isn't completed */
_L5:
        int ai[];
        int k;
        int j1;
        j1 = kwx.a(kwj1, 24);
        ai = new int[j1];
        k = 0;
        i = 0;
_L13:
        if (k >= j1) goto _L8; else goto _L7
_L7:
        int k1;
        if (k != 0)
        {
            kwj1.a();
        }
        k1 = kwj1.f();
        k1;
        JVM INSTR tableswitch 1 10: default 332
    //                   1 341
    //                   2 341
    //                   3 341
    //                   4 341
    //                   5 341
    //                   6 341
    //                   7 341
    //                   8 341
    //                   9 341
    //                   10 341;
           goto _L9 _L10 _L10 _L10 _L10 _L10 _L10 _L10 _L10 _L10 _L10
_L9:
        k++;
          goto _L11
_L10:
        int l = i + 1;
        ai[i] = k1;
        i = l;
        if (true) goto _L9; else goto _L11
_L11:
        if (true) goto _L13; else goto _L12
_L12:
_L8:
        if (i != 0)
        {
            if (b == null)
            {
                k = 0;
            } else
            {
                k = b.length;
            }
            if (k == 0 && i == ai.length)
            {
                b = ai;
            } else
            {
                int ai1[] = new int[k + i];
                if (k != 0)
                {
                    System.arraycopy(b, 0, ai1, 0, k);
                }
                System.arraycopy(ai, 0, ai1, k, i);
                b = ai1;
            }
        }
        continue; /* Loop/switch isn't completed */
_L6:
        int i1;
        i1 = kwj1.c(kwj1.p());
        i = kwj1.r();
        k = 0;
_L19:
        if (kwj1.q() > 0)
        {
            switch (kwj1.f())
            {
            case 1: // '\001'
            case 2: // '\002'
            case 3: // '\003'
            case 4: // '\004'
            case 5: // '\005'
            case 6: // '\006'
            case 7: // '\007'
            case 8: // '\b'
            case 9: // '\t'
            case 10: // '\n'
                k++;
                break;
            }
            continue; /* Loop/switch isn't completed */
        }
        if (k == 0) goto _L15; else goto _L14
_L14:
        kwj1.e(i);
        if (b == null)
        {
            i = 0;
        } else
        {
            i = b.length;
        }
        ai = new int[k + i];
        k = i;
        if (i != 0)
        {
            System.arraycopy(b, 0, ai, 0, i);
            k = i;
        }
_L17:
        if (kwj1.q() > 0)
        {
            i = kwj1.f();
            switch (i)
            {
            case 1: // '\001'
            case 2: // '\002'
            case 3: // '\003'
            case 4: // '\004'
            case 5: // '\005'
            case 6: // '\006'
            case 7: // '\007'
            case 8: // '\b'
            case 9: // '\t'
            case 10: // '\n'
                ai[k] = i;
                k++;
                break;
            }
            continue; /* Loop/switch isn't completed */
        }
        b = ai;
          goto _L15
        if (true) goto _L17; else goto _L16
_L16:
        if (true) goto _L19; else goto _L18
_L18:
_L15:
        kwj1.d(i1);
        if (true) goto _L21; else goto _L20
_L20:
    }

    public void writeTo(kwk kwk1)
    {
        boolean flag = false;
        if (requestHeader != null)
        {
            kwk1.b(1, requestHeader);
        }
        if (a != null && a.length > 0)
        {
            for (int i = 0; i < a.length; i++)
            {
                jce jce1 = a[i];
                if (jce1 != null)
                {
                    kwk1.b(2, jce1);
                }
            }

        }
        if (b != null && b.length > 0)
        {
            for (int j = ((flag) ? 1 : 0); j < b.length; j++)
            {
                kwk1.a(3, b[j]);
            }

        }
        super.writeTo(kwk1);
    }
}
