// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.IBinder;
import android.os.Parcel;

final class fhz
    implements fhx
{

    private IBinder a;

    fhz(IBinder ibinder)
    {
        a = ibinder;
    }

    public void a(fkr fkr1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IOnInfoWindowClickListener");
        if (fkr1 == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        fkr1 = fkr1.asBinder();
_L1:
        parcel.writeStrongBinder(fkr1);
        a.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        fkr1 = null;
          goto _L1
        fkr1;
        parcel1.recycle();
        parcel.recycle();
        throw fkr1;
    }

    public IBinder asBinder()
    {
        return a;
    }
}
