// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.RemoteInput;
import android.content.Intent;
import android.os.Bundle;

final class do
    implements dn
{

    do()
    {
    }

    public Bundle a(Intent intent)
    {
        return RemoteInput.getResultsFromIntent(intent);
    }
}
