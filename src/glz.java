// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.security.Provider;

class glz extends Provider
{

    public glz()
    {
        super("LinuxPRNG", 1.0D, "A Linux-specific random number provider that uses /dev/urandom");
        put("SecureRandom.SHA1PRNG", gly.getName());
        put("SecureRandom.SHA1PRNG ImplementedIn", "Software");
    }
}