// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import java.util.Arrays;

public final class aei
    implements adz
{

    private final String a;
    private final boolean b;
    private final byte c[];
    private Integer d;

    public aei(String s, byte abyte0[], boolean flag)
    {
        d = null;
        a = s;
        c = abyte0;
        b = flag;
    }

    public final aeb a()
    {
        return aeb.g;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof aei))
            {
                return false;
            }
            obj = (aei)obj;
            if (!TextUtils.equals(a, ((aei) (obj)).a) || !Arrays.equals(c, ((aei) (obj)).c) || b != ((aei) (obj)).b)
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        int k = 0;
        if (d != null)
        {
            return d.intValue();
        }
        int i;
        int j;
        if (a != null)
        {
            i = a.hashCode();
        } else
        {
            i = 0;
        }
        i *= 31;
        j = i;
        if (c != null)
        {
            byte abyte0[] = c;
            int l = abyte0.length;
            do
            {
                j = i;
                if (k >= l)
                {
                    break;
                }
                i += abyte0[k];
                k++;
            } while (true);
        }
        if (b)
        {
            i = 1231;
        } else
        {
            i = 1237;
        }
        i += j * 31;
        d = Integer.valueOf(i);
        return i;
    }

    public String toString()
    {
        return String.format("format: %s: size: %d, isPrimary: %s", new Object[] {
            a, Integer.valueOf(c.length), Boolean.valueOf(b)
        });
    }
}
