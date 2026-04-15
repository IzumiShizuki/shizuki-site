package va;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import ce.j0;
import com.tencent.bugly.beta.tinker.TinkerReport;
import f3.m;
import i2.l0;
import jc.l;
import p1.e;
import q1.k;
import q1.o;
import ub.p;
import x0.e1;
import x0.u1;
import x0.v;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a extends v1.b implements u1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Drawable f22801f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e1 f22802g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e1 f22803h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p f22804i;

    public a(Drawable drawable) {
        l.e(drawable, "drawable");
        this.f22801f = drawable;
        this.f22802g = v.v(0);
        Object obj = c.f22806a;
        this.f22803h = v.v(new e((drawable.getIntrinsicWidth() < 0 || drawable.getIntrinsicHeight() < 0) ? 9205357640488583168L : nh.a.d(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight())));
        this.f22804i = ub.a.d(new r2.a(11, this));
        if (drawable.getIntrinsicWidth() < 0 || drawable.getIntrinsicHeight() < 0) {
            return;
        }
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
    }

    @Override // x0.u1
    public final void a() {
        c();
    }

    @Override // v1.b
    public final boolean b(float f10) {
        this.f22801f.setAlpha(nh.b.k(lc.b.R(f10 * TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK), 0, TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK));
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // x0.u1
    public final void c() {
        Drawable drawable = this.f22801f;
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).stop();
        }
        drawable.setVisible(false, false);
        drawable.setCallback(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // x0.u1
    public final void d() {
        Drawable.Callback callback = (Drawable.Callback) this.f22804i.getValue();
        Drawable drawable = this.f22801f;
        drawable.setCallback(callback);
        drawable.setVisible(true, true);
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).start();
        }
    }

    @Override // v1.b
    public final boolean e(k kVar) {
        this.f22801f.setColorFilter(kVar != null ? kVar.f17541a : null);
        return true;
    }

    @Override // v1.b
    public final void f(m mVar) {
        int i10;
        l.e(mVar, "layoutDirection");
        if (Build.VERSION.SDK_INT >= 23) {
            int iOrdinal = mVar.ordinal();
            if (iOrdinal != 0) {
                i10 = 1;
                if (iOrdinal != 1) {
                    throw new j0();
                }
            } else {
                i10 = 0;
            }
            this.f22801f.setLayoutDirection(i10);
        }
    }

    @Override // v1.b
    public final long h() {
        return ((e) this.f22803h.getValue()).f16495a;
    }

    @Override // v1.b
    public final void i(l0 l0Var) {
        o oVarZ = l0Var.f8782a.f19346b.z();
        ((Number) this.f22802g.getValue()).intValue();
        int iR = lc.b.R(e.d(l0Var.e()));
        int iR2 = lc.b.R(e.b(l0Var.e()));
        Drawable drawable = this.f22801f;
        drawable.setBounds(0, 0, iR, iR2);
        try {
            oVarZ.f();
            drawable.draw(q1.c.a(oVarZ));
        } finally {
            oVarZ.r();
        }
    }
}
