// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class jnq extends jnm
{

    jnq(String s)
    {
        super(s, 3);
    }

    com.google.common.collect.MapMakerInternalMap.ReferenceEntry a(joh joh, com.google.common.collect.MapMakerInternalMap.ReferenceEntry referenceentry, com.google.common.collect.MapMakerInternalMap.ReferenceEntry referenceentry1)
    {
        joh = super.a(joh, referenceentry, referenceentry1);
        a(referenceentry, ((com.google.common.collect.MapMakerInternalMap.ReferenceEntry) (joh)));
        b(referenceentry, joh);
        return joh;
    }

    com.google.common.collect.MapMakerInternalMap.ReferenceEntry a(joh joh, Object obj, int i, com.google.common.collect.MapMakerInternalMap.ReferenceEntry referenceentry)
    {
        return new jor(obj, i, referenceentry);
    }
}