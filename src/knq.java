// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class knq extends kwm
{

    public Integer a;
    public knn b[];
    public String c;

    public knq()
    {
        a = null;
        b = knn.a();
        c = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (a != null)
        {
            i = j + kwk.e(1, a.intValue());
        }
        j = i;
        if (b != null)
        {
            j = i;
            if (b.length > 0)
            {
                for (j = 0; j < b.length;)
                {
                    knn knn1 = b[j];
                    int k = i;
                    if (knn1 != null)
                    {
                        k = i + kwk.d(2, knn1);
                    }
                    j++;
                    i = k;
                }

                j = i;
            }
        }
        i = j;
        if (c != null)
        {
            i = j + kwk.b(3, c);
        }
        return i;
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

            case 8: // '\b'
                a = Integer.valueOf(kwj1.f());
                break;

            case 18: // '\022'
                int k = kwx.a(kwj1, 18);
                knn aknn[];
                int j;
                if (b == null)
                {
                    j = 0;
                } else
                {
                    j = b.length;
                }
                aknn = new knn[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(b, 0, aknn, 0, j);
                    k = j;
                }
                for (; k < aknn.length - 1; k++)
                {
                    aknn[k] = new knn();
                    kwj1.a(aknn[k]);
                    kwj1.a();
                }

                aknn[k] = new knn();
                kwj1.a(aknn[k]);
                b = aknn;
                break;

            case 26: // '\032'
                c = kwj1.j();
                break;
            }
        } while (true);
    }

    public void writeTo(kwk kwk1)
    {
        if (a != null)
        {
            kwk1.a(1, a.intValue());
        }
        if (b != null && b.length > 0)
        {
            for (int i = 0; i < b.length; i++)
            {
                knn knn1 = b[i];
                if (knn1 != null)
                {
                    kwk1.b(2, knn1);
                }
            }

        }
        if (c != null)
        {
            kwk1.a(3, c);
        }
        super.writeTo(kwk1);
    }
}
