// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Binder;
import android.os.Message;
import android.os.Parcel;

public abstract class ffx extends Binder
    implements ffw
{

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
    {
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("com.google.android.gms.iid.IMessengerCompat");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.gms.iid.IMessengerCompat");
            break;
        }
        if (parcel.readInt() != 0)
        {
            parcel = (Message)Message.CREATOR.createFromParcel(parcel);
        } else
        {
            parcel = null;
        }
        a(parcel);
        return true;
    }
}
