// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import com.google.android.apps.hangouts.statusmessage.impl.StatusMessageSettingsActivity;

public final class dwd
    implements joj
{

    private final joj a;

    public dwd(joj joj1)
    {
        a = joj1;
    }

    public Object a()
    {
        Object obj = (Activity)a.a();
        if (obj instanceof StatusMessageSettingsActivity)
        {
            obj = (StatusMessageSettingsActivity)obj;
            if (obj == null)
            {
                throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
            } else
            {
                return obj;
            }
        } else
        {
            obj = String.valueOf(obj.getClass());
            throw new IllegalStateException((new StringBuilder(String.valueOf(obj).length() + 243)).append("Attempt to inject a Activity wrapper of type com.google.android.apps.hangouts.statusmessage.impl.StatusMessageSettingsActivityPeer, but the wrapper available is of type: ").append(((String) (obj))).append(". Does your peer's @Inject constructor reference the wrong wrapper class?").toString());
        }
    }
}
