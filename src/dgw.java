// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public final class dgw
    implements Runnable
{

    final aoa a;
    final String b;

    public dgw(aoa aoa, String s)
    {
        a = aoa;
        b = s;
        super();
    }

    public void run()
    {
        for (Iterator iterator = RealTimeChatService.o().iterator(); iterator.hasNext(); ((dhy)iterator.next()).a(a, b)) { }
    }
}
