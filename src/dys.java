// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.SystemClock;
import android.telecom.DisconnectCause;
import android.text.TextUtils;
import com.google.android.apps.hangouts.telephony.TeleConnectionService;
import java.util.Iterator;

public final class dys
{

    final Context a;
    final dxh b;
    final long c = SystemClock.elapsedRealtime();
    boolean d;
    private final dzh e;
    private final dxj f = new dxj(this);
    private final dzo g = new dzo(this);

    public dys(Context context, dxh dxh1)
    {
        a = context;
        b = dxh1;
        dxh1.a(f);
        e = new dzh(context, dxh1, g);
    }

    private boolean d()
    {
        String s4;
        Object obj;
        s4 = b.f().c();
        if (TextUtils.isEmpty(s4))
        {
            eev.e("Babel_telephony", "TeleOutgoingCallRequest.isBlockedNumber, no phone number.");
            return false;
        }
        if (eey.j(s4))
        {
            String s = String.valueOf(g.u(s4));
            if (s.length() != 0)
            {
                s = "TeleOutgoingCallRequest.isBlockedNumber, potential emergency number, ".concat(s);
            } else
            {
                s = new String("TeleOutgoingCallRequest.isBlockedNumber, potential emergency number, ");
            }
            eev.e("Babel_telephony", s);
            return false;
        }
        obj = g.a(a, "babel_tycho_only_blocked_short_codes", "+1411,+1511,+1811");
        if (TextUtils.isEmpty(((CharSequence) (obj))))
        {
            break MISSING_BLOCK_LABEL_250;
        }
        String s1;
        s1 = (new eex(s4, eey.j())).a(gpl.a);
        android.text.TextUtils.SimpleStringSplitter simplestringsplitter = new android.text.TextUtils.SimpleStringSplitter(',');
        simplestringsplitter.setString(((String) (obj)));
        obj = simplestringsplitter.iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break MISSING_BLOCK_LABEL_250;
            }
        } while (!s1.equals((String)((Iterator) (obj)).next()));
        s1 = String.valueOf(g.u(s4));
        if (s1.length() == 0)
        {
            break MISSING_BLOCK_LABEL_192;
        }
        s1 = "TeleOutgoingCallRequest.isBlockedNumber, black listed: ".concat(s1);
_L1:
        eev.e("Babel_telephony", s1);
        return true;
        try
        {
            s1 = new String("TeleOutgoingCallRequest.isBlockedNumber, black listed: ");
        }
        catch (gov gov1)
        {
            String s2 = String.valueOf(g.u(s4));
            if (s2.length() != 0)
            {
                s2 = "TeleOutgoingCallRequest.isBlockedNumber, invalid number: ".concat(s2);
            } else
            {
                s2 = new String("TeleOutgoingCallRequest.isBlockedNumber, invalid number: ");
            }
            eev.d("Babel_telephony", s2, gov1);
            return false;
        }
          goto _L1
        if (g.a(a, "babel_tycho_only_block_special_codes", true))
        {
            char c1 = s4.charAt(0);
            if ((c1 == '*' || c1 == '#') && s4.length() >= 3 && s4.length() <= 6)
            {
                String s3 = String.valueOf(g.u(s4));
                if (s3.length() != 0)
                {
                    s3 = "TeleOutgoingCallRequest.isBlockedNumber, blocking: ".concat(s3);
                } else
                {
                    s3 = new String("TeleOutgoingCallRequest.isBlockedNumber, blocking: ");
                }
                eev.e("Babel_telephony", s3);
                return true;
            }
        }
        return false;
    }

    public void a()
    {
        b.c();
        if (d())
        {
            if (!d)
            {
                eev.e("Babel_telephony", "TeleOutgoingCallRequest.blockCall");
                b.setDisconnected(new DisconnectCause(1, "invalid or blocked number"));
                c();
            }
            return;
        } else
        {
            e.b();
            return;
        }
    }

    void b()
    {
        if (!d)
        {
            eev.e("Babel_telephony", "TeleOutgoingCallRequest.cancelCall");
            b.setDisconnected(new DisconnectCause(4));
            c();
        }
    }

    void c()
    {
        if (!d)
        {
            d = true;
            e.c();
            g.c();
            f.b();
            b.a(null);
            b.d().a().b(this);
            if (b.getState() == 6)
            {
                b.destroy();
            }
        }
    }
}
