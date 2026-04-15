package com.tencent.bugly.beta.global;

import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import com.tencent.bugly.proguard.X;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class c implements View.OnTouchListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f4376a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Object[] f4377b;

    public c(int i10, Object... objArr) {
        this.f4376a = i10;
        this.f4377b = objArr;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        try {
        } catch (Exception e10) {
            if (!X.a(e10)) {
                e10.printStackTrace();
            }
        }
        if (this.f4376a != 1) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0 || action == 2) {
            view.setBackgroundDrawable((Drawable) this.f4377b[0]);
        } else {
            view.setBackgroundDrawable((Drawable) this.f4377b[1]);
        }
        return false;
    }
}
