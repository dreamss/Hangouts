// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jcj extends koj
{

    private static volatile jcj b[];
    public Integer a;

    public jcj()
    {
        a = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static jcj[] a()
    {
        if (b == null)
        {
            synchronized (kon.a)
            {
                if (b == null)
                {
                    b = new jcj[0];
                }
            }
        }
        return b;
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
        return i;
    }

    public kop mergeFrom(kog kog1)
    {
_L4:
        int i = kog1.a();
        i;
        JVM INSTR lookupswitch 2: default 32
    //                   0: 41
    //                   8: 43;
           goto _L1 _L2 _L3
_L1:
        if (super.storeUnknownField(kog1, i)) goto _L4; else goto _L2
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
        case 7: // '\007'
        case 8: // '\b'
        case 9: // '\t'
        case 10: // '\n'
        case 11: // '\013'
        case 12: // '\f'
        case 13: // '\r'
        case 14: // '\016'
        case 15: // '\017'
            a = Integer.valueOf(j);
            break;
        }
        if (true) goto _L4; else goto _L5
_L5:
    }

    public void writeTo(koh koh1)
    {
        if (a != null)
        {
            koh1.a(1, a.intValue());
        }
        super.writeTo(koh1);
    }
}