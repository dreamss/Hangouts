// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Locale;

final class lfq
    implements lge, lgi
{

    private final char a;

    lfq(char c)
    {
        a = c;
    }

    public int a()
    {
        return 1;
    }

    public int a(lgf lgf, String s, int i)
    {
        if (i >= s.length())
        {
            return ~i;
        }
        char c1 = s.charAt(i);
        char c = a;
        if (c1 != c)
        {
            c1 = Character.toUpperCase(c1);
            c = Character.toUpperCase(c);
            if (c1 != c && Character.toLowerCase(c1) != Character.toLowerCase(c))
            {
                return ~i;
            }
        }
        return i + 1;
    }

    public void a(StringBuffer stringbuffer, long l, lcw lcw, int i, ldd ldd, Locale locale)
    {
        stringbuffer.append(a);
    }

    public int b()
    {
        return 1;
    }
}
