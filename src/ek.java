// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ComponentName;
import android.content.Intent;

class ek extends ej
{

    ek()
    {
    }

    public Intent a(ComponentName componentname)
    {
        return Intent.makeMainActivity(componentname);
    }
}
