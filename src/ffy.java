// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.IBinder;
import android.os.Message;
import android.os.Parcel;

public final class ffy
    implements ffw
{

    private IBinder a;

    public ffy(IBinder ibinder)
    {
        a = ibinder;
    }

    public void a(Message message)
    {
        Parcel parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.iid.IMessengerCompat");
        if (message == null)
        {
            break MISSING_BLOCK_LABEL_44;
        }
        parcel.writeInt(1);
        message.writeToParcel(parcel, 0);
_L1:
        a.transact(1, parcel, null, 1);
        parcel.recycle();
        return;
        parcel.writeInt(0);
          goto _L1
        message;
        parcel.recycle();
        throw message;
    }

    public IBinder asBinder()
    {
        return a;
    }
}
