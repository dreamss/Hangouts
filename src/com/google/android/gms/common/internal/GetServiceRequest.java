// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import ejk;
import emq;
import emr;
import emt;
import emz;
import java.util.Collection;

public class GetServiceRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new emz();
    public final int a;
    public final int b;
    public int c;
    public String d;
    public IBinder e;
    public Scope f[];
    public Bundle g;
    public Account h;

    public GetServiceRequest(int i)
    {
        a = 2;
        c = ejk.a;
        b = i;
    }

    public GetServiceRequest(int i, int j, int k, String s, IBinder ibinder, Scope ascope[], Bundle bundle, 
            Account account)
    {
        a = i;
        b = j;
        c = k;
        d = s;
        if (i < 2)
        {
            s = null;
            if (ibinder != null)
            {
                s = emt.a(emr.a(ibinder));
            }
            h = s;
        } else
        {
            e = ibinder;
            h = account;
        }
        f = ascope;
        g = bundle;
    }

    public GetServiceRequest a(Account account)
    {
        h = account;
        return this;
    }

    public GetServiceRequest a(Bundle bundle)
    {
        g = bundle;
        return this;
    }

    public GetServiceRequest a(emq emq1)
    {
        if (emq1 != null)
        {
            e = emq1.asBinder();
        }
        return this;
    }

    public GetServiceRequest a(String s)
    {
        d = s;
        return this;
    }

    public GetServiceRequest a(Collection collection)
    {
        f = (Scope[])collection.toArray(new Scope[collection.size()]);
        return this;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        emz.a(this, parcel, i);
    }

}
