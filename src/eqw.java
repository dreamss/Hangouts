// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

public abstract class eqw extends Binder
    implements eqv
{

    public eqw()
    {
        attachInterface(this, "com.google.android.gms.common.internal.IGmsCallbacks");
    }

    public static eqv a(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsCallbacks");
        if (iinterface != null && (iinterface instanceof eqv))
        {
            return (eqv)iinterface;
        } else
        {
            return new eqx(ibinder);
        }
    }

    public IBinder asBinder()
    {
        return this;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
    {
        IBinder ibinder = null;
        Object obj = null;
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("com.google.android.gms.common.internal.IGmsCallbacks");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsCallbacks");
            i = parcel.readInt();
            ibinder = parcel.readStrongBinder();
            if (parcel.readInt() != 0)
            {
                obj = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            }
            a(i, ibinder, ((Bundle) (obj)));
            parcel1.writeNoException();
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsCallbacks");
            i = parcel.readInt();
            obj = ibinder;
            break;
        }
        if (parcel.readInt() != 0)
        {
            obj = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
        }
        a(i, ((Bundle) (obj)));
        parcel1.writeNoException();
        return true;
    }
}
