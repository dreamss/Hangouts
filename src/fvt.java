// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import com.google.android.gms.wearable.internal.PackageStorageInfo;
import com.google.android.gms.wearable.internal.StorageInfoResponse;

public final class fvt
    implements android.os.Parcelable.Creator
{

    public fvt()
    {
    }

    public static void a(StorageInfoResponse storageinforesponse, Parcel parcel)
    {
        int i = g.p(parcel, 20293);
        g.b(parcel, 1, storageinforesponse.a);
        g.b(parcel, 2, storageinforesponse.b);
        g.a(parcel, 3, storageinforesponse.c);
        g.c(parcel, 4, storageinforesponse.d);
        g.q(parcel, i);
    }

    public Object createFromParcel(Parcel parcel)
    {
        int i = 0;
        int k = g.a(parcel);
        long l1 = 0L;
        java.util.ArrayList arraylist = null;
        int j = 0;
        do
        {
            if (parcel.dataPosition() < k)
            {
                int l = parcel.readInt();
                switch (0xffff & l)
                {
                default:
                    g.b(parcel, l);
                    break;

                case 1: // '\001'
                    j = g.e(parcel, l);
                    break;

                case 2: // '\002'
                    i = g.e(parcel, l);
                    break;

                case 3: // '\003'
                    l1 = g.f(parcel, l);
                    break;

                case 4: // '\004'
                    arraylist = g.c(parcel, l, PackageStorageInfo.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new af((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
            } else
            {
                return new StorageInfoResponse(j, i, l1, arraylist);
            }
        } while (true);
    }

    public Object[] newArray(int i)
    {
        return new StorageInfoResponse[i];
    }
}