// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import com.google.android.gms.wearable.internal.DataItemParcelable;
import com.google.android.gms.wearable.internal.GetDataItemResponse;

public final class fut
    implements android.os.Parcelable.Creator
{

    public fut()
    {
    }

    public static void a(GetDataItemResponse getdataitemresponse, Parcel parcel, int i)
    {
        int j = g.p(parcel, 20293);
        g.b(parcel, 1, getdataitemresponse.a);
        g.b(parcel, 2, getdataitemresponse.b);
        g.a(parcel, 3, getdataitemresponse.c, i);
        g.q(parcel, j);
    }

    public Object createFromParcel(Parcel parcel)
    {
        int j = 0;
        int k = g.a(parcel);
        DataItemParcelable dataitemparcelable = null;
        int i = 0;
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
                    i = g.e(parcel, l);
                    break;

                case 2: // '\002'
                    j = g.e(parcel, l);
                    break;

                case 3: // '\003'
                    dataitemparcelable = (DataItemParcelable)g.a(parcel, l, DataItemParcelable.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new af((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
            } else
            {
                return new GetDataItemResponse(i, j, dataitemparcelable);
            }
        } while (true);
    }

    public Object[] newArray(int i)
    {
        return new GetDataItemResponse[i];
    }
}