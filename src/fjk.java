// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Binder;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.maps.GoogleMapOptions;

public abstract class fjk extends Binder
    implements fjj
{

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
    {
        Object obj = null;
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("com.google.android.gms.maps.internal.IMapFragmentDelegate");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IMapFragmentDelegate");
            parcel = a();
            parcel1.writeNoException();
            if (parcel != null)
            {
                parcel = parcel.asBinder();
            } else
            {
                parcel = null;
            }
            parcel1.writeStrongBinder(parcel);
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IMapFragmentDelegate");
            fcw fcw1 = fcx.a(parcel.readStrongBinder());
            if (parcel.readInt() != 0)
            {
                obj = GoogleMapOptions.CREATOR;
                obj = fop.a(parcel);
            } else
            {
                obj = null;
            }
            if (parcel.readInt() != 0)
            {
                parcel = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            a(fcw1, ((GoogleMapOptions) (obj)), parcel);
            parcel1.writeNoException();
            return true;

        case 3: // '\003'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IMapFragmentDelegate");
            if (parcel.readInt() != 0)
            {
                parcel = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            a(parcel);
            parcel1.writeNoException();
            return true;

        case 4: // '\004'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IMapFragmentDelegate");
            fcw fcw2 = fcx.a(parcel.readStrongBinder());
            fcw fcw3 = fcx.a(parcel.readStrongBinder());
            if (parcel.readInt() != 0)
            {
                parcel = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            fcw2 = a(fcw2, fcw3, parcel);
            parcel1.writeNoException();
            parcel = ((Parcel) (obj));
            if (fcw2 != null)
            {
                parcel = fcw2.asBinder();
            }
            parcel1.writeStrongBinder(parcel);
            return true;

        case 5: // '\005'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IMapFragmentDelegate");
            b();
            parcel1.writeNoException();
            return true;

        case 6: // '\006'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IMapFragmentDelegate");
            c();
            parcel1.writeNoException();
            return true;

        case 7: // '\007'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IMapFragmentDelegate");
            d();
            parcel1.writeNoException();
            return true;

        case 8: // '\b'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IMapFragmentDelegate");
            e();
            parcel1.writeNoException();
            return true;

        case 9: // '\t'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IMapFragmentDelegate");
            f();
            parcel1.writeNoException();
            return true;

        case 10: // '\n'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IMapFragmentDelegate");
            if (parcel.readInt() != 0)
            {
                parcel = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            b(parcel);
            parcel1.writeNoException();
            if (parcel != null)
            {
                parcel1.writeInt(1);
                parcel.writeToParcel(parcel1, 1);
                return true;
            } else
            {
                parcel1.writeInt(0);
                return true;
            }

        case 11: // '\013'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IMapFragmentDelegate");
            boolean flag = g();
            parcel1.writeNoException();
            if (flag)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            parcel1.writeInt(i);
            return true;

        case 12: // '\f'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IMapFragmentDelegate");
            a(flj.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;
        }
    }
}
