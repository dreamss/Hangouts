// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.FrameLayout;

final class rk extends FrameLayout
{

    final ra a;

    public rk(ra ra1, Context context)
    {
        a = ra1;
        super(context);
    }

    public boolean dispatchKeyEvent(KeyEvent keyevent)
    {
        return a.a(keyevent) || super.dispatchKeyEvent(keyevent);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        if (motionevent.getAction() == 0)
        {
            int i = (int)motionevent.getX();
            int j = (int)motionevent.getY();
            boolean flag;
            if (i < -5 || j < -5 || i > getWidth() + 5 || j > getHeight() + 5)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                motionevent = a;
                motionevent.a(motionevent.e(0), true);
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionevent);
    }

    public void setBackgroundResource(int i)
    {
        setBackgroundDrawable(vi.a(getContext(), i));
    }
}
