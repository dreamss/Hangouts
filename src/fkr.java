// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Binder;
import android.os.Parcel;

public abstract class fkr extends Binder
    implements fkq
{

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
    {
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("com.google.android.gms.maps.internal.IOnIndoorStateChangeListener");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IOnIndoorStateChangeListener");
            a();
            parcel1.writeNoException();
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IOnIndoorStateChangeListener");
            a(fnl.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;
        }
    }
}
