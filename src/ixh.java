// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ixh extends koj
{

    private static volatile ixh c[];
    public Integer a;
    public Boolean b;

    public ixh()
    {
        a = null;
        b = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static ixh[] a()
    {
        if (c == null)
        {
            synchronized (kon.a)
            {
                if (c == null)
                {
                    c = new ixh[0];
                }
            }
        }
        return c;
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
            i = j + koh.e(1, a.intValue());
        }
        j = i;
        if (b != null)
        {
            b.booleanValue();
            j = i + (koh.f(2) + 1);
        }
        return j;
    }

    public kop mergeFrom(kog kog1)
    {
_L5:
        int i = kog1.a();
        i;
        JVM INSTR lookupswitch 3: default 40
    //                   0: 49
    //                   8: 51
    //                   16: 114;
           goto _L1 _L2 _L3 _L4
_L1:
        if (super.storeUnknownField(kog1, i)) goto _L5; else goto _L2
_L2:
        return this;
_L3:
        int j = kog1.f();
        switch (j)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
        case 6: // '\006'
            a = Integer.valueOf(j);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        b = Boolean.valueOf(kog1.i());
        if (true) goto _L5; else goto _L6
_L6:
    }

    public void writeTo(koh koh1)
    {
        if (a != null)
        {
            koh1.a(1, a.intValue());
        }
        if (b != null)
        {
            koh1.a(2, b.booleanValue());
        }
        super.writeTo(koh1);
    }
}