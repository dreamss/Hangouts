// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class jnu extends jnm
{

    jnu(String s)
    {
        super(s, 7);
    }

    com.google.common.collect.MapMakerInternalMap.ReferenceEntry a(joh joh1, com.google.common.collect.MapMakerInternalMap.ReferenceEntry referenceentry, com.google.common.collect.MapMakerInternalMap.ReferenceEntry referenceentry1)
    {
        joh1 = super.a(joh1, referenceentry, referenceentry1);
        a(referenceentry, ((com.google.common.collect.MapMakerInternalMap.ReferenceEntry) (joh1)));
        b(referenceentry, joh1);
        return joh1;
    }

    com.google.common.collect.MapMakerInternalMap.ReferenceEntry a(joh joh1, Object obj, int i, com.google.common.collect.MapMakerInternalMap.ReferenceEntry referenceentry)
    {
        return new joz(joh1.g, obj, i, referenceentry);
    }
}