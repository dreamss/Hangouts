// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import eof;
import fls;
import g;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.maps.model:
//            LatLng, LatLngBounds

public final class VisibleRegion
    implements SafeParcelable
{

    public static final fls CREATOR = new fls();
    public final LatLng a;
    public final LatLng b;
    public final LatLng c;
    public final LatLng d;
    public final LatLngBounds e;
    private final int f;

    public VisibleRegion(int i, LatLng latlng, LatLng latlng1, LatLng latlng2, LatLng latlng3, LatLngBounds latlngbounds)
    {
        f = i;
        a = latlng;
        b = latlng1;
        c = latlng2;
        d = latlng3;
        e = latlngbounds;
    }

    public int a()
    {
        return f;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof VisibleRegion))
            {
                return false;
            }
            obj = (VisibleRegion)obj;
            if (!a.equals(((VisibleRegion) (obj)).a) || !b.equals(((VisibleRegion) (obj)).b) || !c.equals(((VisibleRegion) (obj)).c) || !d.equals(((VisibleRegion) (obj)).d) || !e.equals(((VisibleRegion) (obj)).e))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            a, b, c, d, e
        });
    }

    public String toString()
    {
        return g.c(this).a("nearLeft", a).a("nearRight", b).a("farLeft", c).a("farRight", d).a("latLngBounds", e).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        fls.a(this, parcel, i);
    }

}
