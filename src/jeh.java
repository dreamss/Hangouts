// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jeh extends kwm
{

    public ixl a;
    public Integer b;
    public Integer c;
    public Boolean d;
    public jdk requestHeader;

    public jeh()
    {
        requestHeader = null;
        a = null;
        b = null;
        c = null;
        d = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (requestHeader != null)
        {
            i = j + kwk.d(1, requestHeader);
        }
        j = i;
        if (a != null)
        {
            j = i + kwk.d(2, a);
        }
        i = j;
        if (b != null)
        {
            i = j + kwk.e(3, b.intValue());
        }
        j = i;
        if (c != null)
        {
            j = i + kwk.f(4, c.intValue());
        }
        i = j;
        if (d != null)
        {
            d.booleanValue();
            i = j + (kwk.f(6) + 1);
        }
        return i;
    }

    public kws mergeFrom(kwj kwj1)
    {
_L8:
        int i = kwj1.a();
        i;
        JVM INSTR lookupswitch 6: default 64
    //                   0: 73
    //                   10: 75
    //                   18: 104
    //                   24: 133
    //                   32: 174
    //                   48: 188;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L1:
        if (super.storeUnknownField(kwj1, i)) goto _L8; else goto _L2
_L2:
        return this;
_L3:
        if (requestHeader == null)
        {
            requestHeader = new jdk();
        }
        kwj1.a(requestHeader);
          goto _L8
_L4:
        if (a == null)
        {
            a = new ixl();
        }
        kwj1.a(a);
          goto _L8
_L5:
        int j = kwj1.f();
        switch (j)
        {
        case 1: // '\001'
        case 2: // '\002'
            b = Integer.valueOf(j);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L6:
        c = Integer.valueOf(kwj1.l());
        continue; /* Loop/switch isn't completed */
_L7:
        d = Boolean.valueOf(kwj1.i());
        if (true) goto _L8; else goto _L9
_L9:
    }

    public void writeTo(kwk kwk1)
    {
        if (requestHeader != null)
        {
            kwk1.b(1, requestHeader);
        }
        if (a != null)
        {
            kwk1.b(2, a);
        }
        if (b != null)
        {
            kwk1.a(3, b.intValue());
        }
        if (c != null)
        {
            kwk1.c(4, c.intValue());
        }
        if (d != null)
        {
            kwk1.a(6, d.booleanValue());
        }
        super.writeTo(kwk1);
    }
}
