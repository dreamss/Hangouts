// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

public final class crk
{

    private static final boolean a = false;
    private String b;
    private String c;
    private long d;
    private int e;
    private String f;
    private boolean g;
    private boolean h;
    private final gdd i;

    public crk()
    {
        h = false;
        SharedPreferences sharedpreferences = g.nU.getSharedPreferences("phone_verification", 0);
        b = sharedpreferences.getString("account_name", null);
        c = sharedpreferences.getString("phone_number", null);
        d = sharedpreferences.getLong("verification_time", 0L);
        e = sharedpreferences.getInt("verification_state", 100);
        f = sharedpreferences.getString("last_successful_number", null);
        i = (gdd)hlp.a(g.nU, gdd);
    }

    private void a(int j, String s, String s1, boolean flag)
    {
        if (a)
        {
            eev.b("Babel", (new StringBuilder(38)).append("Setting verification state:").append(j).toString());
        }
        e = j;
        b = s;
        c = s1;
        g = flag;
        s = dcn.a(b, null);
        j;
        JVM INSTR tableswitch 101 105: default 96
    //                   101 213
    //                   102 96
    //                   103 223
    //                   104 233
    //                   105 243;
           goto _L1 _L2 _L1 _L3 _L4 _L5
_L1:
        s = g.nU.getSharedPreferences("phone_verification", 0).edit();
        s.putString("account_name", b);
        s.putString("phone_number", c);
        s.putInt("verification_state", e);
        if (e == 101)
        {
            d = System.currentTimeMillis();
            s.putLong("verification_time", d);
        }
        if (j == 104)
        {
            f = c;
            s.putString("last_successful_number", f);
        }
        s.apply();
        return;
_L2:
        g.a(s, 2042);
        continue; /* Loop/switch isn't completed */
_L3:
        g.a(s, 2044);
        continue; /* Loop/switch isn't completed */
_L4:
        g.a(s, 1598);
        continue; /* Loop/switch isn't completed */
_L5:
        g.a(s, 2045);
        if (true) goto _L1; else goto _L6
_L6:
    }

    private void b(int j, boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_20;
        }
        g.a(dcn.a(b, null), 2048);
        a(j, b, c, g);
        if (j != 105) goto _L2; else goto _L1
_L1:
        eev.c("Babel", "Sending verification failure notification");
        if (!flag) goto _L4; else goto _L3
_L3:
        c("phone_verification_failure_no_retry");
_L5:
        this;
        JVM INSTR monitorexit ;
        return;
_L4:
        c("phone_verification_failure_retry");
          goto _L5
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
_L2:
        if (j != 104) goto _L5; else goto _L6
_L6:
        eev.c("Babel", "Sending verifcation success notification");
        c("phone_verification_success");
          goto _L5
    }

    private static void c(String s)
    {
        eq eq1 = eq.a(g.nU);
        Intent intent = new Intent("phone_verification_outcome");
        intent.putExtra("phone_verification_result", s);
        eq1.a(intent);
    }

    private boolean e()
    {
        this;
        JVM INSTR monitorenter ;
        if (e != 104)
        {
            break MISSING_BLOCK_LABEL_15;
        }
        this;
        JVM INSTR monitorexit ;
        return false;
        boolean flag;
        a(101, b, c, g);
        if (a)
        {
            String s = String.valueOf("Retrying phone verification.  Account: ");
            String s1 = b;
            String s2 = c;
            eev.b("Babel", (new StringBuilder(String.valueOf(s).length() + 8 + String.valueOf(s1).length() + String.valueOf(s2).length())).append(s).append(s1).append(" Phone: ").append(s2).toString());
        }
        flag = f();
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private boolean f()
    {
        aoa aoa1 = dcn.a(b, null);
        if (aoa1 == null || dcn.f(aoa1))
        {
            eev.f("Babel", "Account not ready. Skip phone verification");
            b(105, false);
            g.a(aoa1, 2046);
            return false;
        }
        if (a)
        {
            String s = String.valueOf("Starting phone verification.  Account: ");
            String s1 = b;
            String s2 = c;
            eev.b("Babel", (new StringBuilder(String.valueOf(s).length() + 8 + String.valueOf(s1).length() + String.valueOf(s2).length())).append(s).append(s1).append(" Phone: ").append(s2).toString());
        }
        RealTimeChatService.c(aoa1, c);
        return true;
    }

    private boolean g()
    {
        this;
        JVM INSTR monitorenter ;
        Exception exception;
        boolean flag;
        if (e >= 101 && e <= 103)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        this;
        JVM INSTR monitorexit ;
        return flag;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public int a()
    {
        this;
        JVM INSTR monitorenter ;
        int j = e;
        this;
        JVM INSTR monitorexit ;
        return j;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public crl a(aoa aoa1)
    {
        if (TextUtils.equals(aoa1.a(), b))
        {
            String s = eey.a(c, efb.c);
            if (g())
            {
                return new crl(102, s);
            }
        }
        Object obj = aoa1.x();
        if (((ArrayList) (obj)).size() > 0)
        {
            aoa1 = new StringBuilder();
            String s1;
            for (obj = ((ArrayList) (obj)).iterator(); ((Iterator) (obj)).hasNext(); aoa1.append(eey.a(s1, efb.c)))
            {
                s1 = (String)((Iterator) (obj)).next();
                if (aoa1.length() > 0)
                {
                    aoa1.append(", ");
                }
            }

            return new crl(100, aoa1.toString());
        }
        obj = eey.g();
        aoa1 = ((aoa) (obj));
        if (TextUtils.isEmpty(((CharSequence) (obj))))
        {
            aoa1 = f;
        }
        if (!TextUtils.isEmpty(aoa1))
        {
            aoa1 = eey.a(aoa1, efb.c);
        } else
        {
            aoa1 = null;
        }
        return new crl(101, aoa1);
    }

    public void a(int j, boolean flag)
    {
        b(j, flag);
    }

    public void a(String s)
    {
        this;
        JVM INSTR monitorenter ;
        aoa aoa1;
        if (a)
        {
            String s1 = String.valueOf("Finishing phone verification.  Account: ");
            String s2 = b;
            String s3 = c;
            eev.b("Babel", (new StringBuilder(String.valueOf(s1).length() + 28 + String.valueOf(s2).length() + String.valueOf(s3).length() + String.valueOf(s).length())).append(s1).append(s2).append(" Phone: ").append(s3).append(" Verification Code: ").append(s).toString());
        }
        aoa1 = dcn.a(b, null);
        if (aoa1 == null)
        {
            break MISSING_BLOCK_LABEL_124;
        }
        if (!dcn.f(aoa1))
        {
            break MISSING_BLOCK_LABEL_160;
        }
        eev.f("Babel", "Account not ready. Abort phone verification");
        g.a(aoa1, 2046);
        a(105, b, c, g);
        this;
        JVM INSTR monitorexit ;
        return;
        a(103, b, c, g);
        RealTimeChatService.a(aoa1, c, s, g);
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        this;
        JVM INSTR monitorexit ;
        throw s;
    }

    public boolean a(String s, String s1, boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        if (!g() || !c.equals(s))
        {
            break MISSING_BLOCK_LABEL_37;
        }
        eev.a("Babel", "Phone verification is in progress, but the user chose to retry.");
        flag = e();
        this;
        JVM INSTR monitorexit ;
        return flag;
        a(101, s1, s, flag);
        flag = f();
        this;
        JVM INSTR monitorexit ;
        return flag;
        s;
        this;
        JVM INSTR monitorexit ;
        throw s;
    }

    public String b()
    {
        return c;
    }

    public void b(String s)
    {
        c = s;
    }

    public boolean b(aoa aoa1)
    {
        boolean flag = eey.f();
        gcz gcz1 = i.a(aoa1.h());
        char c1;
        if (flag)
        {
            c1 = '\u08F7';
        } else
        {
            c1 = '\u08F8';
        }
        gcz1.a(c1).a(TimeUnit.DAYS);
        return aoa1 != null && !aoa1.H() && !dcn.u() && !aoa1.o() && !aoa1.D() && !h;
    }

    public String c()
    {
        return f;
    }

    public void d()
    {
        h = true;
    }

    static 
    {
        hnc hnc = eev.n;
    }
}
