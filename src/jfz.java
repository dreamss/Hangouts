// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jfz extends kwm
{

    public jfw a[];
    public jdl responseHeader;

    public jfz()
    {
        responseHeader = null;
        a = jfw.a();
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (responseHeader != null)
        {
            i = j + kwk.d(1, responseHeader);
        }
        j = i;
        if (a != null)
        {
            j = i;
            if (a.length > 0)
            {
                for (j = 0; j < a.length;)
                {
                    jfw jfw1 = a[j];
                    int k = i;
                    if (jfw1 != null)
                    {
                        k = i + kwk.d(2, jfw1);
                    }
                    j++;
                    i = k;
                }

                j = i;
            }
        }
        return j;
    }

    public kws mergeFrom(kwj kwj1)
    {
        do
        {
            int i = kwj1.a();
            switch (i)
            {
            default:
                if (super.storeUnknownField(kwj1, i))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 10: // '\n'
                if (responseHeader == null)
                {
                    responseHeader = new jdl();
                }
                kwj1.a(responseHeader);
                break;

            case 18: // '\022'
                int k = kwx.a(kwj1, 18);
                jfw ajfw[];
                int j;
                if (a == null)
                {
                    j = 0;
                } else
                {
                    j = a.length;
                }
                ajfw = new jfw[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(a, 0, ajfw, 0, j);
                    k = j;
                }
                for (; k < ajfw.length - 1; k++)
                {
                    ajfw[k] = new jfw();
                    kwj1.a(ajfw[k]);
                    kwj1.a();
                }

                ajfw[k] = new jfw();
                kwj1.a(ajfw[k]);
                a = ajfw;
                break;
            }
        } while (true);
    }

    public void writeTo(kwk kwk1)
    {
        if (responseHeader != null)
        {
            kwk1.b(1, responseHeader);
        }
        if (a != null && a.length > 0)
        {
            for (int i = 0; i < a.length; i++)
            {
                jfw jfw1 = a[i];
                if (jfw1 != null)
                {
                    kwk1.b(2, jfw1);
                }
            }

        }
        super.writeTo(kwk1);
    }
}
