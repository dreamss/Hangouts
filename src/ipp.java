// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ipp extends koj
{

    private static volatile ipp e[];
    public Integer a;
    public Integer b;
    public Integer c;
    public String d;

    public ipp()
    {
        a = null;
        b = null;
        c = null;
        d = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static ipp[] a()
    {
        if (e == null)
        {
            synchronized (kon.a)
            {
                if (e == null)
                {
                    e = new ipp[0];
                }
            }
        }
        return e;
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
            j = i + koh.e(2, b.intValue());
        }
        i = j;
        if (c != null)
        {
            i = j + koh.e(3, c.intValue());
        }
        j = i;
        if (d != null)
        {
            j = i + koh.b(4, d);
        }
        return j;
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

            case 8: // '\b'
                a = Integer.valueOf(kog1.f());
                break;

            case 16: // '\020'
                b = Integer.valueOf(kog1.f());
                break;

            case 24: // '\030'
                c = Integer.valueOf(kog1.f());
                break;

            case 34: // '"'
                d = kog1.j();
                break;
            }
        } while (true);
    }

    public void writeTo(koh koh1)
    {
        if (a != null)
        {
            koh1.a(1, a.intValue());
        }
        if (b != null)
        {
            koh1.a(2, b.intValue());
        }
        if (c != null)
        {
            koh1.a(3, c.intValue());
        }
        if (d != null)
        {
            koh1.a(4, d);
        }
        super.writeTo(koh1);
    }
}