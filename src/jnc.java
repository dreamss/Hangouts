// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class jnc extends jmr
{

    static final jnc o = new jnc();

    private jnc()
    {
    }

    public volatile boolean a(Object obj)
    {
        return super.a((Character)obj);
    }

    public boolean b(char c)
    {
        return Character.isLetterOrDigit(c);
    }

    public String toString()
    {
        return "CharMatcher.javaLetterOrDigit()";
    }

}
