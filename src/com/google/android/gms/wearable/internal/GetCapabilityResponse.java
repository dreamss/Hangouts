// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import fuk;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            CapabilityInfoParcelable

public class GetCapabilityResponse
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new fuk();
    public final int a;
    public final int b;
    public final CapabilityInfoParcelable c;

    public GetCapabilityResponse(int i, int j, CapabilityInfoParcelable capabilityinfoparcelable)
    {
        a = i;
        b = j;
        c = capabilityinfoparcelable;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        fuk.a(this, parcel, i);
    }

}
