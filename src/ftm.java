// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.common.data.DataHolder;

public final class ftm extends epd
{

    public ftm(DataHolder dataholder)
    {
        super(dataholder);
    }

    public Object a(int i)
    {
        return new fsg(a, i);
    }

    public String toString()
    {
        return (new StringBuilder("Owner:size=")).append(a()).toString();
    }
}
