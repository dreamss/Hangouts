// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import fvn;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            ChannelImpl

public class OpenChannelResponse
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new fvn();
    public final int a;
    public final int b;
    public final ChannelImpl c;

    public OpenChannelResponse(int i, int j, ChannelImpl channelimpl)
    {
        a = i;
        b = j;
        c = channelimpl;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        fvn.a(this, parcel, i);
    }

}
