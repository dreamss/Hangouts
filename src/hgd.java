// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

public final class hgd
    implements WritableByteChannel
{

    private final hfy a;
    private final WritableByteChannel b;

    public hgd(WritableByteChannel writablebytechannel, hfx hfx)
    {
        b = writablebytechannel;
        a = new hfy(hfx);
    }

    public WritableByteChannel a()
    {
        return b;
    }

    public void a(long l)
    {
        a.a(l);
    }

    public void close()
    {
        b.close();
    }

    public boolean isOpen()
    {
        return b.isOpen();
    }

    public int write(ByteBuffer bytebuffer)
    {
        int i = b.write(bytebuffer);
        a.b(i);
        return i;
    }
}
