package x0;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a1 extends h1.f0 implements Parcelable, h1.p, w0, n2 {
    public static final Parcelable.Creator<a1> CREATOR = new z0(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public e2 f24235b;

    public a1(float f10) {
        h1.g gVarK = h1.n.k();
        e2 e2Var = new e2(f10, gVarK.g());
        if (!(gVarK instanceof h1.b)) {
            e2Var.f8013b = new e2(f10, 1);
        }
        this.f24235b = e2Var;
    }

    @Override // h1.e0
    public final h1.g0 a() {
        return this.f24235b;
    }

    @Override // h1.p
    public final i2 b() {
        return r0.f24439f;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final float e() {
        return ((e2) h1.n.u(this.f24235b, this)).f24297c;
    }

    public final void f(float f10) {
        h1.g gVarK;
        e2 e2Var = (e2) h1.n.i(this.f24235b);
        float f11 = e2Var.f24297c;
        if (Build.VERSION.SDK_INT >= 23) {
            if (f11 == f10) {
                return;
            }
        } else if (!f1.g.e(f11) && !f1.g.e(f10) && f11 == f10) {
            return;
        }
        e2 e2Var2 = this.f24235b;
        synchronized (h1.n.f8051c) {
            gVarK = h1.n.k();
            ((e2) h1.n.p(e2Var2, this, gVarK, e2Var)).f24297c = f10;
        }
        h1.n.o(gVarK, this);
    }

    @Override // x0.n2
    public final Object getValue() {
        return Float.valueOf(e());
    }

    @Override // h1.e0
    public final void i(h1.g0 g0Var) {
        jc.l.c(g0Var, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord");
        this.f24235b = (e2) g0Var;
    }

    @Override // h1.f0, h1.e0
    public final h1.g0 j(h1.g0 g0Var, h1.g0 g0Var2, h1.g0 g0Var3) {
        float f10 = ((e2) g0Var2).f24297c;
        float f11 = ((e2) g0Var3).f24297c;
        if (Build.VERSION.SDK_INT >= 23) {
            if (f10 != f11) {
                return null;
            }
        } else if (f1.g.e(f10) || f1.g.e(f11) || f10 != f11) {
            return null;
        }
        return g0Var2;
    }

    @Override // x0.w0
    public final void setValue(Object obj) {
        f(((Number) obj).floatValue());
    }

    public final String toString() {
        return "MutableFloatState(value=" + ((e2) h1.n.i(this.f24235b)).f24297c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeFloat(e());
    }
}
