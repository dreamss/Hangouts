// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public final class hrw extends FilterInputStream
{

    private long a;
    private long b;

    public hrw(InputStream inputstream, long l1)
    {
        super(inputstream);
        b = -1L;
        h.a(inputstream);
        boolean flag;
        if (l1 >= 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        l.a(flag, "limit must be non-negative");
        a = l1;
    }

    public int available()
    {
        return (int)Math.min(in.available(), a);
    }

    public void mark(int i)
    {
        this;
        JVM INSTR monitorenter ;
        in.mark(i);
        b = a;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public int read()
    {
        if (a == 0L)
        {
            return -1;
        }
        int i = in.read();
        if (i != -1)
        {
            a = a - 1L;
        }
        return i;
    }

    public int read(byte abyte0[], int i, int j)
    {
        if (a == 0L)
        {
            return -1;
        }
        j = (int)Math.min(j, a);
        i = in.read(abyte0, i, j);
        if (i != -1)
        {
            a = a - (long)i;
        }
        return i;
    }

    public void reset()
    {
        this;
        JVM INSTR monitorenter ;
        if (!in.markSupported())
        {
            throw new IOException("Mark not supported");
        }
        break MISSING_BLOCK_LABEL_27;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        if (b == -1L)
        {
            throw new IOException("Mark not set");
        }
        in.reset();
        a = b;
        this;
        JVM INSTR monitorexit ;
    }

    public long skip(long l1)
    {
        l1 = Math.min(l1, a);
        l1 = in.skip(l1);
        a = a - l1;
        return l1;
    }
}
