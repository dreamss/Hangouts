// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.signin.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import frq;

public class AuthAccountResult
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new frq();
    public final int a;

    public AuthAccountResult()
    {
        this(1);
    }

    public AuthAccountResult(int i)
    {
        a = i;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        frq.a(this, parcel);
    }

}
