// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.concurrent.ConcurrentMap;

public final class jvj extends jul
{

    private static final long serialVersionUID = 3L;

    public jvj(jvl jvl, jvl jvl1, jnk jnk, jnk jnk1, long l, long l1, int i, int j, fuu fuu, ConcurrentMap concurrentmap)
    {
        super(jvl, jvl1, jnk, jnk1, l, l1, i, j, fuu, concurrentmap);
    }

    private void readObject(ObjectInputStream objectinputstream)
    {
        objectinputstream.defaultReadObject();
        j = a(objectinputstream).j();
        b(objectinputstream);
    }

    private Object readResolve()
    {
        return j;
    }

    private void writeObject(ObjectOutputStream objectoutputstream)
    {
        objectoutputstream.defaultWriteObject();
        a(objectoutputstream);
    }
}
