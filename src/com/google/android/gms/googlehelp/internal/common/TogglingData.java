// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.googlehelp.internal.common;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import feg;
import g;

public class TogglingData
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new feg();
    final int a;
    String b;
    String c;
    String d;

    private TogglingData()
    {
        a = 1;
    }

    public TogglingData(int i, String s, String s1, String s2)
    {
        a = i;
        b = s;
        c = s1;
        d = s2;
    }

    public TogglingData a(String s)
    {
        d = s;
        return this;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        i = g.p(parcel, 20293);
        g.b(parcel, 1, a);
        g.a(parcel, 2, b);
        g.a(parcel, 3, c);
        g.a(parcel, 4, d);
        g.q(parcel, i);
    }

}
