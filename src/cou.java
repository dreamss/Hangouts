// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.widget.Toast;

public final class cou
    implements bei
{

    public cou()
    {
    }

    public void a(Context context)
    {
        Toast.makeText(context, "Dumping database, please wait", 0).show();
        java.io.File file = g.c(context, ((gqu)hlp.a(context, gqu)).a());
        if (file == null)
        {
            Toast.makeText(context, "Could not dump database", 0).show();
            return;
        } else
        {
            Toast.makeText(context, "Database dumped", 0).show();
            g.a(context, file);
            return;
        }
    }

    public boolean a(String s)
    {
        return "dumpdb".equals(s);
    }
}
