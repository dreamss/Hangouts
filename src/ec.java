// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;

public final class ec
{

    private static final ed a;

    public static Cursor a(ContentResolver contentresolver, Uri uri, String as[], String s, String as1[], String s1, ga ga)
    {
        return a.a(contentresolver, uri, as, s, as1, s1, ga);
    }

    static 
    {
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            a = new ee();
        } else
        {
            a = new ed();
        }
    }
}
