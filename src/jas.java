// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jas extends koj
{

    public jaq a;
    public jbw b;
    public jaq c[];
    public ixg responseHeader;

    public jas()
    {
        responseHeader = null;
        a = null;
        b = null;
        c = jaq.a();
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (responseHeader != null)
        {
            i = j + koh.d(1, responseHeader);
        }
        j = i;
        if (a != null)
        {
            j = i + koh.d(2, a);
        }
        i = j;
        if (b != null)
        {
            i = j + koh.d(3, b);
        }
        j = i;
        if (c != null)
        {
            j = i;
            if (c.length > 0)
            {
                for (j = 0; j < c.length;)
                {
                    jaq jaq1 = c[j];
                    int k = i;
                    if (jaq1 != null)
                    {
                        k = i + koh.d(4, jaq1);
                    }
                    j++;
                    i = k;
                }

                j = i;
            }
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

            case 10: // '\n'
                if (responseHeader == null)
                {
                    responseHeader = new ixg();
                }
                kog1.a(responseHeader);
                break;

            case 18: // '\022'
                if (a == null)
                {
                    a = new jaq();
                }
                kog1.a(a);
                break;

            case 26: // '\032'
                if (b == null)
                {
                    b = new jbw();
                }
                kog1.a(b);
                break;

            case 34: // '"'
                int k = kou.b(kog1, 34);
                jaq ajaq[];
                int j;
                if (c == null)
                {
                    j = 0;
                } else
                {
                    j = c.length;
                }
                ajaq = new jaq[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(c, 0, ajaq, 0, j);
                    k = j;
                }
                for (; k < ajaq.length - 1; k++)
                {
                    ajaq[k] = new jaq();
                    kog1.a(ajaq[k]);
                    kog1.a();
                }

                ajaq[k] = new jaq();
                kog1.a(ajaq[k]);
                c = ajaq;
                break;
            }
        } while (true);
    }

    public void writeTo(koh koh1)
    {
        if (responseHeader != null)
        {
            koh1.b(1, responseHeader);
        }
        if (a != null)
        {
            koh1.b(2, a);
        }
        if (b != null)
        {
            koh1.b(3, b);
        }
        if (c != null && c.length > 0)
        {
            for (int i = 0; i < c.length; i++)
            {
                jaq jaq1 = c[i];
                if (jaq1 != null)
                {
                    koh1.b(4, jaq1);
                }
            }

        }
        super.writeTo(koh1);
    }
}