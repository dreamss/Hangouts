// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.SystemClock;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public final class cdh
{

    private static final boolean a = false;
    private boolean b;
    private final String c;
    private final Thread d = new cdi(this);
    private final LinkedList e = new LinkedList();
    private boolean f;
    private final Object g = new Object();
    private cdk h;
    private String i;
    private long j;
    private long k;
    private cdp l;
    private cdj m;

    public cdh(String s, cdj cdj1)
    {
        j = 500L;
        c = s;
        f = false;
        m = cdj1;
        l = cdj1.c();
        if (a)
        {
            eev.b("Babel_NetworkQueue", (new StringBuilder(String.valueOf(s).length() + 40)).append("### starting network thread for queue '").append(s).append("'").toString());
        }
        d.setName(c);
    }

    private void a(cdk cdk1)
    {
        synchronized (g)
        {
            if (a)
            {
                String s = String.valueOf(cdk1);
                int i1 = e.size();
                eev.b("Babel_NetworkQueue", (new StringBuilder(String.valueOf(s).length() + 40)).append("Removing request:").append(s).append(" queue_size:").append(i1).toString());
            }
            e.remove(cdk1);
            l.a(cdk1.a.a);
            if (cdk1 == h)
            {
                h = null;
                i = null;
            }
        }
        return;
        cdk1;
        obj;
        JVM INSTR monitorexit ;
        throw cdk1;
    }

    private void b(long l1)
    {
        long l2 = 0x7fffffffffffffffL;
        Object obj1 = g;
        obj1;
        JVM INSTR monitorenter ;
        if (!a)
        {
            break MISSING_BLOCK_LABEL_109;
        }
        String s;
        String s1;
        int i1;
        boolean flag;
        if (l1 == 0x7fffffffffffffffL)
        {
            s = "FOREVER";
        } else
        {
            s = String.valueOf(l1);
        }
        s1 = c;
        i1 = e.size();
        eev.b("Babel_NetworkQueue", (new StringBuilder(String.valueOf(s1).length() + 38 + String.valueOf(s).length())).append("pausing queue ").append(s1).append("[").append(i1).append("]; duration ").append(s).toString());
        flag = f;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_132;
        }
        obj1;
        JVM INSTR monitorexit ;
        return;
        if (l1 != 0x7fffffffffffffffL) goto _L2; else goto _L1
_L1:
        k = l2;
        g.wait(l1);
        if (m.b())
        {
            b = false;
        }
        if (a)
        {
            s = c;
            int j1 = e.size();
            eev.b("Babel_NetworkQueue", (new StringBuilder(String.valueOf(s).length() + 20)).append("/pause ").append(s).append("[").append(j1).append("]").toString());
        }
_L3:
        obj1;
        JVM INSTR monitorexit ;
        return;
        Object obj;
        obj;
        obj1;
        JVM INSTR monitorexit ;
        throw obj;
_L2:
        l2 = SystemClock.elapsedRealtime();
        l2 += l1;
          goto _L1
        obj;
        obj = String.valueOf(((InterruptedException) (obj)).toString());
        if (((String) (obj)).length() == 0)
        {
            break MISSING_BLOCK_LABEL_296;
        }
        obj = "InterruptedException in pauseQueue: ".concat(((String) (obj)));
_L4:
        eev.f("Babel_NetworkQueue", ((String) (obj)));
          goto _L3
        obj = new String("InterruptedException in pauseQueue: ");
          goto _L4
    }

    private boolean b(cdk cdk1)
    {
        Object obj = g;
        obj;
        JVM INSTR monitorenter ;
        Object obj1 = new ArrayList();
        int i1;
        int j1;
        i1 = 0;
        j1 = 0;
_L2:
        cdk cdk2;
        if (i1 >= e.size())
        {
            break MISSING_BLOCK_LABEL_198;
        }
        cdk2 = (cdk)e.get(i1);
        if (cdk1 == cdk2)
        {
            break MISSING_BLOCK_LABEL_302;
        }
        if (cdk1.a.c != cdk2.a.c)
        {
            break MISSING_BLOCK_LABEL_302;
        }
        if (cdk2.a.a != cdk1.a.a)
        {
            break MISSING_BLOCK_LABEL_135;
        }
        long l1 = cdk1.a.a;
        eev.c("Babel_NetworkQueue", (new StringBuilder(74)).append("Insertion of ").append(l1).append(" ignored since it isalready in the queue.").toString());
        obj;
        JVM INSTR monitorexit ;
        return false;
        cdl cdl1 = cdk1.a();
        cdl cdl2 = cdk2.a();
        if (cdl1.getClass() != cdl2.getClass() || h == cdk2 || !cdl1.a(cdl2))
        {
            break MISSING_BLOCK_LABEL_302;
        }
        ((List) (obj1)).add(cdk2);
        j1 = i1;
        break MISSING_BLOCK_LABEL_302;
        e.add(j1, cdk1);
        for (cdk1 = ((List) (obj1)).iterator(); cdk1.hasNext(); a(((cdk) (obj1))))
        {
            obj1 = (cdk)cdk1.next();
            if (a)
            {
                String s = String.valueOf(obj1);
                eev.b("Babel_NetworkQueue", (new StringBuilder(String.valueOf(s).length() + 29)).append("not sending replaced request ").append(s).toString());
            }
        }

        break MISSING_BLOCK_LABEL_295;
        cdk1;
        obj;
        JVM INSTR monitorexit ;
        throw cdk1;
        obj;
        JVM INSTR monitorexit ;
        return true;
        i1++;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private void g()
    {
label0:
        {
            synchronized (g)
            {
                if (!f)
                {
                    break label0;
                }
            }
            return;
        }
        int i1;
        long l1;
        long l3;
        l1 = j;
        l3 = System.currentTimeMillis();
        i1 = e.size() - 1;
_L2:
        if (i1 < 0)
        {
            break MISSING_BLOCK_LABEL_148;
        }
        cdk cdk1;
        long l2;
        cdk1 = (cdk)e.get(i1);
        l2 = cdk1.c();
        if (l2 > 0L)
        {
            break; /* Loop/switch isn't completed */
        }
        if (h == cdk1)
        {
            i = "";
            break MISSING_BLOCK_LABEL_223;
        }
        cdk1.a(dcx.a);
        if (a)
        {
            String s = String.valueOf(cdk1);
            eev.b("Babel_NetworkQueue", (new StringBuilder(String.valueOf(s).length() + 38)).append("pausing queue: remove expired request:").append(s).toString());
        }
        a(cdk1);
        break MISSING_BLOCK_LABEL_223;
        l2 = l1;
        long l4;
        if (e.size() <= 0)
        {
            break MISSING_BLOCK_LABEL_201;
        }
        l4 = ((cdk)e.get(0)).d();
        l2 = l1;
        if (l4 <= 0L)
        {
            break MISSING_BLOCK_LABEL_201;
        }
        l2 = Math.max(l4 - l3, l1);
        b = true;
        b(l2);
        obj;
        JVM INSTR monitorexit ;
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
_L4:
        i1--;
        if (true) goto _L2; else goto _L1
_L1:
        if (l2 >= l1) goto _L4; else goto _L3
_L3:
        l1 = l2;
          goto _L4
    }

    private cdk h()
    {
        Object obj = g;
        obj;
        JVM INSTR monitorenter ;
        cdk cdk1;
        if (f)
        {
            break MISSING_BLOCK_LABEL_69;
        }
        if (e.size() == 0)
        {
            b(0x7fffffffffffffffL);
        }
        if (e.size() <= 0)
        {
            break MISSING_BLOCK_LABEL_69;
        }
        h = (cdk)e.getLast();
        i = null;
        cdk1 = h;
        return cdk1;
        obj;
        JVM INSTR monitorexit ;
        return null;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void a()
    {
        if (d != null)
        {
            d.start();
            return;
        } else
        {
            eev.f("Babel_NetworkQueue", "Try to start the queue while the thread is null! ");
            return;
        }
    }

    public void a(long l1)
    {
        j = l1;
    }

    public void a(cdk cdk1, boolean flag)
    {
label0:
        {
            synchronized (g)
            {
                if (a)
                {
                    String s = String.valueOf(cdk1);
                    int i1 = e.size();
                    eev.b("Babel_NetworkQueue", (new StringBuilder(String.valueOf(s).length() + 37)).append("queueRequest: ").append(s).append("; length is ").append(i1).toString());
                }
                if (!f)
                {
                    break label0;
                }
                eev.g("Babel_NetworkQueue", "can't call queueRequest after queue is finished");
            }
            return;
        }
        Object obj = cdk1.a();
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_113;
        }
        obj1;
        JVM INSTR monitorexit ;
        return;
        cdk1;
        obj1;
        JVM INSTR monitorexit ;
        throw cdk1;
        if (!cdk1.b())
        {
            break MISSING_BLOCK_LABEL_182;
        }
        cdk1.a(dcx.a);
        if (a)
        {
            obj = String.valueOf(cdk1);
            eev.b("Babel_NetworkQueue", (new StringBuilder(String.valueOf(obj).length() + 45)).append("Removing expired requestItem while queueing: ").append(((String) (obj))).toString());
        }
        a(cdk1);
        obj1;
        JVM INSTR monitorexit ;
        return;
        if (!b(cdk1)) goto _L2; else goto _L1
_L1:
        if (!a) goto _L4; else goto _L3
_L3:
        String s1 = ((cdl) (obj)).e();
        if (s1 == null) goto _L4; else goto _L5
_L5:
        obj = String.valueOf("Queueing stress message requestItem in RequestWriter");
        s1 = String.valueOf(s1);
        if (s1.length() == 0)
        {
            break MISSING_BLOCK_LABEL_322;
        }
        obj = ((String) (obj)).concat(s1);
_L9:
        eev.b("Babel_Stress", ((String) (obj)));
_L4:
        if (e.size() == 1 && !b)
        {
            a(false);
        }
        if (!b) goto _L2; else goto _L6
_L6:
        if (flag) goto _L8; else goto _L7
_L7:
        long l1;
        long l2;
        l1 = cdk1.c();
        l2 = SystemClock.elapsedRealtime();
        if (l1 + l2 > k && k > l2) goto _L2; else goto _L8
_L8:
        a(false);
_L2:
        obj1;
        JVM INSTR monitorexit ;
        return;
        obj = new String(((String) (obj)));
          goto _L9
    }

    public void a(Class class1, String s)
    {
        Object obj = g;
        obj;
        JVM INSTR monitorenter ;
        ArrayList arraylist;
        if (f)
        {
            eev.g("Babel_NetworkQueue", "Should not cancel a request why request writer is finished");
        }
        arraylist = new ArrayList();
        int i1 = 0;
_L2:
        cdk cdk2;
        if (i1 >= e.size())
        {
            break MISSING_BLOCK_LABEL_108;
        }
        cdk2 = (cdk)e.get(i1);
        if (!cdk2.a(class1, s))
        {
            break MISSING_BLOCK_LABEL_210;
        }
        if (i1 != 0)
        {
            break MISSING_BLOCK_LABEL_90;
        }
        if (h != null)
        {
            i = s;
            break MISSING_BLOCK_LABEL_210;
        }
        arraylist.add(cdk2);
        break MISSING_BLOCK_LABEL_210;
        class1;
        obj;
        JVM INSTR monitorexit ;
        throw class1;
        for (class1 = arraylist.iterator(); class1.hasNext(); RealTimeChatService.c(s))
        {
            cdk cdk1 = (cdk)class1.next();
            if (a)
            {
                String s1 = String.valueOf(cdk1);
                eev.b("Babel_NetworkQueue", (new StringBuilder(String.valueOf(s1).length() + 16)).append("Cancel request: ").append(s1).toString());
            }
            cdk1.a(dcx.b);
            a(cdk1);
        }

        obj;
        JVM INSTR monitorexit ;
        return;
        i1++;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public void a(boolean flag)
    {
        Object obj = g;
        obj;
        JVM INSTR monitorenter ;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_21;
        }
        if (b)
        {
            break MISSING_BLOCK_LABEL_21;
        }
        obj;
        JVM INSTR monitorexit ;
        return;
        if (a)
        {
            String s = c;
            int i1 = e.size();
            eev.b("Babel_NetworkQueue", (new StringBuilder(String.valueOf(s).length() + 29)).append("resuming queue ").append(s).append(" [").append(i1).append("]").toString());
        }
        b = false;
        g.notifyAll();
        obj;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public boolean a(Thread thread)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (d != null)
        {
            flag = flag1;
            if (d == thread)
            {
                flag = true;
            }
        }
        return flag;
    }

    public long b()
    {
        long l1;
label0:
        {
            l1 = 0x7fffffffffffffffL;
            synchronized (g)
            {
                if (e.size() != 0)
                {
                    break label0;
                }
            }
            return 0x7fffffffffffffffL;
        }
        if (m.b())
        {
            l1 = j;
        }
          goto _L1
_L3:
        int i1;
        long l2;
        if (i1 >= e.size())
        {
            break MISSING_BLOCK_LABEL_98;
        }
        l2 = ((cdk)e.get(i1)).c();
        if (l2 >= 0L && l2 < l1)
        {
            l1 = l2;
        }
        i1++;
        continue; /* Loop/switch isn't completed */
        obj;
        JVM INSTR monitorexit ;
        return l1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
_L1:
        i1 = 0;
        continue; /* Loop/switch isn't completed */
        if (true) goto _L3; else goto _L2
_L2:
    }

    public int c()
    {
        return e.size();
    }

    void d()
    {
_L8:
        Object obj;
        Object obj2;
        cdk cdk1;
        cdo cdo1;
        int i1;
        long l1;
        cdk1 = h();
        if (cdk1 != null && !((gqz)hlp.a(g.nU, gqz)).c(cdk1.a.c))
        {
            a(cdk1);
            continue; /* Loop/switch isn't completed */
        }
        if (cdk1 == null)
        {
            break MISSING_BLOCK_LABEL_876;
        }
        obj2 = cdk1.a();
        obj = null;
        if (a)
        {
            obj = ((cdl) (obj2)).e();
        }
        cdo1 = new cdo();
        i1 = cdk1.a(m, cdo1);
        int j1 = c();
        if (a)
        {
            obj2 = c;
            eev.b("Babel_NetworkQueue", (new StringBuilder(String.valueOf(obj2).length() + 32)).append("Network Queue ").append(((String) (obj2))).append(" size: ").append(j1).toString());
        }
        h.a(cdk1.a.c, System.currentTimeMillis(), 14, (new cab()).e(c).c(j1).a().b());
        l1 = System.currentTimeMillis();
        if (!m.v_())
        {
            break MISSING_BLOCK_LABEL_892;
        }
        if (obj != null)
        {
            obj2 = String.valueOf("Sending stress message in RequestWriter:");
            String s1 = String.valueOf(obj);
            if (s1.length() != 0)
            {
                obj2 = ((String) (obj2)).concat(s1);
            } else
            {
                obj2 = new String(((String) (obj2)));
            }
            eev.b("Babel_Stress", ((String) (obj2)));
        }
        if (i1 == cdm.a)
        {
            i1 = cdk1.b(m, cdo1);
        }
        if (i1 != cdm.b) goto _L2; else goto _L1
_L1:
        if (obj != null)
        {
            obj2 = String.valueOf("Sent stress message succeeded in RequestWriter:");
            obj = String.valueOf(obj);
            if (((String) (obj)).length() != 0)
            {
                obj = ((String) (obj2)).concat(((String) (obj)));
            } else
            {
                obj = new String(((String) (obj2)));
            }
            eev.b("Babel_Stress", ((String) (obj)));
        }
        m.a(500L);
        j = 500L;
        if (a)
        {
            obj = String.valueOf(cdk1);
            eev.b("Babel_NetworkQueue", (new StringBuilder(String.valueOf(obj).length() + 41)).append("request successful. removing from queue: ").append(((String) (obj))).toString());
        }
        a(cdk1);
        m.a(true);
        i1 = 0;
_L5:
        obj = g;
        obj;
        JVM INSTR monitorenter ;
        m.e();
        if (i1 == 0)
        {
            break MISSING_BLOCK_LABEL_420;
        }
        g();
        obj;
        JVM INSTR monitorexit ;
        continue; /* Loop/switch isn't completed */
        obj2;
        obj;
        JVM INSTR monitorexit ;
        throw obj2;
_L2:
        long l2 = System.currentTimeMillis();
        if (eev.a("Babel_NetworkQueue", 3))
        {
            eev.c("Babel_NetworkQueue", String.format(Locale.US, "error sending %s; took %d ms (error code == %d)", new Object[] {
                cdk1, Long.valueOf(l2 - l1), Integer.valueOf(cdo1.a())
            }));
        }
        obj2 = g;
        obj2;
        JVM INSTR monitorenter ;
        m.a(false);
        if (i != null)
        {
            RealTimeChatService.c(i);
        }
        if (i == null && cdk1.a(cdo1))
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (i1 != 0) goto _L4; else goto _L3
_L3:
        obj = cdo1.c();
        if (a)
        {
            String s2 = String.valueOf(cdk1);
            i1 = cdo1.a();
            eev.b("Babel_NetworkQueue", (new StringBuilder(String.valueOf(s2).length() + 40)).append("not retrying ").append(s2).append("; error code == ").append(i1).toString());
        }
        cdk1.a(((dcx) (obj)));
        a(cdk1);
        i1 = 0;
_L6:
        h = null;
        obj2;
        JVM INSTR monitorexit ;
          goto _L5
        obj;
        obj2;
        JVM INSTR monitorexit ;
        throw obj;
_L4:
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_748;
        }
        String s3 = String.valueOf("Sending stress message failed with error=");
        i1 = cdo1.a();
        eev.b("Babel_Stress", (new StringBuilder(String.valueOf(s3).length() + 24 + String.valueOf(obj).length())).append(s3).append(i1).append(", will retry:").append(((String) (obj))).toString());
        if (cdo1.b() > 0L)
        {
            cdk1.a.f = System.currentTimeMillis() + cdo1.b();
        }
        l.a(cdk1);
        j = Math.min(TimeUnit.SECONDS.toMillis(3600L), j << 1);
        if (a)
        {
            String s = String.valueOf(cdk1);
            i1 = cdo1.a();
            eev.b("Babel_NetworkQueue", (new StringBuilder(String.valueOf(s).length() + 59)).append("pausing queue after failed request:").append(s).append("; error code:").append(i1).toString());
        }
        i1 = 1;
          goto _L6
        synchronized (g)
        {
            if (!f)
            {
                break MISSING_BLOCK_LABEL_945;
            }
        }
        if (a)
        {
            obj1 = c;
            eev.b("Babel_NetworkQueue", (new StringBuilder(String.valueOf(obj1).length() + 24)).append("### queue '").append(((String) (obj1))).append("' is finished").toString());
        }
        return;
        obj1;
        JVM INSTR monitorexit ;
        if (true) goto _L8; else goto _L7
_L7:
        exception;
        obj1;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void e()
    {
        Object obj = g;
        obj;
        JVM INSTR monitorenter ;
        if (!a) goto _L2; else goto _L1
_L1:
        String s;
        s = String.valueOf(toString());
        if (s.length() == 0)
        {
            break MISSING_BLOCK_LABEL_138;
        }
        s = "### finish ".concat(s);
_L3:
        eev.b("Babel_NetworkQueue", s);
_L2:
        f = true;
        a(false);
        Exception exception;
        try
        {
            long l1 = System.currentTimeMillis();
            d.join(10000L);
            long l2 = System.currentTimeMillis();
            if (a || d.isAlive())
            {
                eev.b("Babel_NetworkQueue", String.format(Locale.US, "NetworkQueue.finish [%s] took %d ms; isAlive returning %b", new Object[] {
                    c, Long.valueOf(l2 - l1), Boolean.valueOf(d.isAlive())
                }));
            }
            return;
        }
        catch (InterruptedException interruptedexception)
        {
            interruptedexception = String.valueOf(interruptedexception.toString());
        }
        break MISSING_BLOCK_LABEL_166;
        s = new String("### finish ");
          goto _L3
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        if (interruptedexception.length() != 0)
        {
            interruptedexception = "InterruptedException in finish: ".concat(interruptedexception);
        } else
        {
            interruptedexception = new String("InterruptedException in finish: ");
        }
        eev.f("Babel_NetworkQueue", interruptedexception);
        return;
    }

    public long f()
    {
        return j;
    }

    public String toString()
    {
        Object obj = g;
        obj;
        JVM INSTR monitorenter ;
        Object obj1;
        obj1 = new StringBuilder();
        ((StringBuilder) (obj1)).append("NetworkQueue(").append(c).append(") pending count == ").append(e.size()).append("\n");
        for (Iterator iterator = e.iterator(); iterator.hasNext(); ((StringBuilder) (obj1)).append("\n"))
        {
            ((StringBuilder) (obj1)).append(((cdk)iterator.next()).toString());
        }

        break MISSING_BLOCK_LABEL_102;
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
        obj1 = ((StringBuilder) (obj1)).toString();
        obj;
        JVM INSTR monitorexit ;
        return ((String) (obj1));
    }

    static 
    {
        hnc hnc = eev.i;
    }
}
