// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class itk extends koj
{

    private static volatile itk d[];
    public ivz a;
    public irg b;
    public Integer c;

    public itk()
    {
        a = null;
        b = null;
        c = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static itk[] a()
    {
        if (d == null)
        {
            synchronized (kon.a)
            {
                if (d == null)
                {
                    d = new itk[0];
                }
            }
        }
        return d;
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
            i = j + koh.d(1, a);
        }
        j = i;
        if (c != null)
        {
            j = i + koh.e(2, c.intValue());
        }
        i = j;
        if (b != null)
        {
            i = j + koh.d(3, b);
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
                if (a == null)
                {
                    a = new ivz();
                }
                kog1.a(a);
                break;

            case 16: // '\020'
                c = Integer.valueOf(kog1.f());
                break;

            case 26: // '\032'
                if (b == null)
                {
                    b = new irg();
                }
                kog1.a(b);
                break;
            }
        } while (true);
    }

    public void writeTo(koh koh1)
    {
        if (a != null)
        {
            koh1.b(1, a);
        }
        if (c != null)
        {
            koh1.a(2, c.intValue());
        }
        if (b != null)
        {
            koh1.b(3, b);
        }
        super.writeTo(koh1);
    }
}