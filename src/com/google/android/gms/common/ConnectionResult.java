// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common;

import android.app.Activity;
import android.app.PendingIntent;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import eof;
import eov;
import g;
import java.util.Arrays;

public final class ConnectionResult
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new eov();
    public static final ConnectionResult a = new ConnectionResult(0, null);
    public final int b;
    private final int c;
    private final PendingIntent d;

    public ConnectionResult(int i, int j, PendingIntent pendingintent)
    {
        b = i;
        c = j;
        d = pendingintent;
    }

    public ConnectionResult(int i, PendingIntent pendingintent)
    {
        this(1, i, pendingintent);
    }

    public void a(Activity activity, int i)
    {
        if (!a())
        {
            return;
        } else
        {
            activity.startIntentSenderForResult(d.getIntentSender(), i, null, 0, 0, 0);
            return;
        }
    }

    public boolean a()
    {
        return c != 0 && d != null;
    }

    public boolean b()
    {
        return c == 0;
    }

    public int c()
    {
        return c;
    }

    public PendingIntent d()
    {
        return d;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof ConnectionResult))
            {
                return false;
            }
            obj = (ConnectionResult)obj;
            if (c != ((ConnectionResult) (obj)).c || !g.a(d, ((ConnectionResult) (obj)).d))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            Integer.valueOf(c), d
        });
    }

    public String toString()
    {
        eof eof1;
        int i;
        eof1 = g.c(this);
        i = c;
        i;
        JVM INSTR tableswitch 0 18: default 100
    //                   0 142
    //                   1 148
    //                   2 154
    //                   3 160
    //                   4 166
    //                   5 172
    //                   6 178
    //                   7 184
    //                   8 190
    //                   9 196
    //                   10 202
    //                   11 208
    //                   12 100
    //                   13 214
    //                   14 220
    //                   15 226
    //                   16 232
    //                   17 238
    //                   18 244;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L1 _L14 _L15 _L16 _L17 _L18 _L19
_L1:
        String s = (new StringBuilder("UNKNOWN_ERROR_CODE(")).append(i).append(")").toString();
_L21:
        return eof1.a("statusCode", s).a("resolution", d).toString();
_L2:
        s = "SUCCESS";
        continue; /* Loop/switch isn't completed */
_L3:
        s = "SERVICE_MISSING";
        continue; /* Loop/switch isn't completed */
_L4:
        s = "SERVICE_VERSION_UPDATE_REQUIRED";
        continue; /* Loop/switch isn't completed */
_L5:
        s = "SERVICE_DISABLED";
        continue; /* Loop/switch isn't completed */
_L6:
        s = "SIGN_IN_REQUIRED";
        continue; /* Loop/switch isn't completed */
_L7:
        s = "INVALID_ACCOUNT";
        continue; /* Loop/switch isn't completed */
_L8:
        s = "RESOLUTION_REQUIRED";
        continue; /* Loop/switch isn't completed */
_L9:
        s = "NETWORK_ERROR";
        continue; /* Loop/switch isn't completed */
_L10:
        s = "INTERNAL_ERROR";
        continue; /* Loop/switch isn't completed */
_L11:
        s = "SERVICE_INVALID";
        continue; /* Loop/switch isn't completed */
_L12:
        s = "DEVELOPER_ERROR";
        continue; /* Loop/switch isn't completed */
_L13:
        s = "LICENSE_CHECK_FAILED";
        continue; /* Loop/switch isn't completed */
_L14:
        s = "CANCELED";
        continue; /* Loop/switch isn't completed */
_L15:
        s = "TIMEOUT";
        continue; /* Loop/switch isn't completed */
_L16:
        s = "INTERRUPTED";
        continue; /* Loop/switch isn't completed */
_L17:
        s = "API_UNAVAILABLE";
        continue; /* Loop/switch isn't completed */
_L18:
        s = "SIGN_IN_FAILED";
        continue; /* Loop/switch isn't completed */
_L19:
        s = "SERVICE_UPDATING";
        if (true) goto _L21; else goto _L20
_L20:
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        eov.a(this, parcel, i);
    }

}
