// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Binder;
import android.os.Parcel;

public abstract class flm extends Binder
    implements fll
{

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
    {
        boolean flag;
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("com.google.android.gms.maps.internal.IOnMarkerClickListener");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IOnMarkerClickListener");
            flag = a(fno.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            break;
        }
        if (flag)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel1.writeInt(i);
        return true;
    }
}
