// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class jgc extends jgb
{

    jgc()
    {
    }

    public volatile boolean a(Object obj)
    {
        return super.a((Character)obj);
    }

    public boolean b(char c)
    {
        switch (c)
        {
        default:
            if (c < '\u2000' || c > '\u200A')
            {
                break;
            }
            // fall through

        case 9: // '\t'
        case 10: // '\n'
        case 11: // '\013'
        case 12: // '\f'
        case 13: // '\r'
        case 32: // ' '
        case 133: 
        case 5760: 
        case 8232: 
        case 8233: 
        case 8287: 
        case 12288: 
            return true;

        case 8199: 
            return false;
        }
        return false;
    }

    public String toString()
    {
        return "CharMatcher.BREAKING_WHITESPACE";
    }
}
