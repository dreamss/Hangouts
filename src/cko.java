// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.DialogInterface;
import com.google.android.apps.hangouts.phone.BabelHomeActivity;

public final class cko
    implements android.content.DialogInterface.OnClickListener
{

    final BabelHomeActivity a;

    public cko(BabelHomeActivity babelhomeactivity)
    {
        a = babelhomeactivity;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface.dismiss();
    }
}
