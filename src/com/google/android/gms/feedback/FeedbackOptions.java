// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.feedback;

import android.app.ApplicationErrorReport;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import fdi;
import g;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.feedback:
//            ThemeSettings, LogOptions

public class FeedbackOptions
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new fdi();
    public final int a;
    public String b;
    public Bundle c;
    public String d;
    public ApplicationErrorReport e;
    public String f;
    public BitmapTeleporter g;
    public String h;
    public ArrayList i;
    public boolean j;
    public ThemeSettings k;
    public LogOptions l;

    public FeedbackOptions()
    {
        this(3, null, null, null, new ApplicationErrorReport(), null, null, null, null, true, null, null);
    }

    public FeedbackOptions(int i1, String s, Bundle bundle, String s1, ApplicationErrorReport applicationerrorreport, String s2, BitmapTeleporter bitmapteleporter, 
            String s3, ArrayList arraylist, boolean flag, ThemeSettings themesettings, LogOptions logoptions)
    {
        a = i1;
        b = s;
        c = bundle;
        d = s1;
        e = applicationerrorreport;
        f = s2;
        g = bitmapteleporter;
        h = s3;
        i = arraylist;
        j = flag;
        k = themesettings;
        l = logoptions;
    }

    public static FeedbackOptions a(FeedbackOptions feedbackoptions, android.app.ApplicationErrorReport.CrashInfo crashinfo)
    {
        feedbackoptions.e.crashInfo = crashinfo;
        return feedbackoptions;
    }

    public static FeedbackOptions a(FeedbackOptions feedbackoptions, Bitmap bitmap)
    {
        if (bitmap != null)
        {
            feedbackoptions.g = new BitmapTeleporter(bitmap);
        }
        return feedbackoptions;
    }

    public static FeedbackOptions a(FeedbackOptions feedbackoptions, Bundle bundle)
    {
        feedbackoptions.c = bundle;
        return feedbackoptions;
    }

    public static FeedbackOptions a(FeedbackOptions feedbackoptions, LogOptions logoptions)
    {
        feedbackoptions.l = logoptions;
        return feedbackoptions;
    }

    public static FeedbackOptions a(FeedbackOptions feedbackoptions, ThemeSettings themesettings)
    {
        feedbackoptions.k = themesettings;
        return feedbackoptions;
    }

    public static FeedbackOptions a(FeedbackOptions feedbackoptions, String s)
    {
        feedbackoptions.b = s;
        return feedbackoptions;
    }

    public static FeedbackOptions a(FeedbackOptions feedbackoptions, ArrayList arraylist)
    {
        feedbackoptions.i = arraylist;
        return feedbackoptions;
    }

    public static FeedbackOptions a(FeedbackOptions feedbackoptions, boolean flag)
    {
        feedbackoptions.j = flag;
        return feedbackoptions;
    }

    public static FeedbackOptions b(FeedbackOptions feedbackoptions, String s)
    {
        feedbackoptions.d = s;
        return feedbackoptions;
    }

    public static FeedbackOptions c(FeedbackOptions feedbackoptions, String s)
    {
        feedbackoptions.f = s;
        return feedbackoptions;
    }

    public static FeedbackOptions d(FeedbackOptions feedbackoptions, String s)
    {
        feedbackoptions.h = s;
        return feedbackoptions;
    }

    public String a()
    {
        return b;
    }

    public Bundle b()
    {
        return c;
    }

    public ThemeSettings c()
    {
        return k;
    }

    public String d()
    {
        return d;
    }

    public int describeContents()
    {
        return 0;
    }

    public android.app.ApplicationErrorReport.CrashInfo e()
    {
        if (e == null)
        {
            return null;
        } else
        {
            return e.crashInfo;
        }
    }

    public String f()
    {
        return f;
    }

    public BitmapTeleporter g()
    {
        return g;
    }

    public String h()
    {
        return h;
    }

    public ArrayList i()
    {
        return i;
    }

    public boolean j()
    {
        return j;
    }

    public LogOptions k()
    {
        return l;
    }

    public void writeToParcel(Parcel parcel, int i1)
    {
        int j1 = g.p(parcel, 20293);
        g.b(parcel, 1, a);
        g.a(parcel, 2, b);
        g.a(parcel, 3, c);
        g.a(parcel, 5, d);
        g.a(parcel, 6, e, i1);
        g.a(parcel, 7, f);
        g.a(parcel, 8, g, i1);
        g.a(parcel, 9, h);
        g.c(parcel, 10, i);
        g.a(parcel, 11, j);
        g.a(parcel, 12, k, i1);
        g.a(parcel, 13, l, i1);
        g.q(parcel, j1);
    }

}
