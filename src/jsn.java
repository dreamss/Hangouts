// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

class jsn extends jrt
{

    private final ExecutorService a;

    jsn(ExecutorService executorservice)
    {
        a = (ExecutorService)n.b(executorservice);
    }

    public boolean awaitTermination(long l, TimeUnit timeunit)
    {
        return a.awaitTermination(l, timeunit);
    }

    public void execute(Runnable runnable)
    {
        a.execute(runnable);
    }

    public boolean isShutdown()
    {
        return a.isShutdown();
    }

    public boolean isTerminated()
    {
        return a.isTerminated();
    }

    public void shutdown()
    {
        a.shutdown();
    }

    public List shutdownNow()
    {
        return a.shutdownNow();
    }
}
