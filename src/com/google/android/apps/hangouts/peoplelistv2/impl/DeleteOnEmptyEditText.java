// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.peoplelistv2.impl;

import android.content.Context;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import cgw;
import cgx;

public class DeleteOnEmptyEditText extends EditText
{

    public cgx a;

    public DeleteOnEmptyEditText(Context context)
    {
        super(context);
    }

    public DeleteOnEmptyEditText(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public DeleteOnEmptyEditText(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    public void a(cgx cgx)
    {
        a = cgx;
    }

    public boolean onCheckIsTextEditor()
    {
        return true;
    }

    public InputConnection onCreateInputConnection(EditorInfo editorinfo)
    {
        return new cgw(this, super.onCreateInputConnection(editorinfo));
    }
}
