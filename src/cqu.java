// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.DialogInterface;
import com.google.android.apps.hangouts.phone.ShortlinkUrlHandlerActivity;

public final class cqu
    implements android.content.DialogInterface.OnClickListener
{

    final ShortlinkUrlHandlerActivity a;

    public cqu(ShortlinkUrlHandlerActivity shortlinkurlhandleractivity)
    {
        a = shortlinkurlhandleractivity;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        a.finish();
    }
}
