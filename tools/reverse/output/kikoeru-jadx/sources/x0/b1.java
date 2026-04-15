package x0;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b1 extends h1.f0 implements Parcelable, h1.p, w0, n2 {
    public static final Parcelable.Creator<b1> CREATOR = new z0(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public f2 f24253b;

    public b1(int i10) {
        h1.g gVarK = h1.n.k();
        f2 f2Var = new f2(gVarK.g(), i10);
        if (!(gVarK instanceof h1.b)) {
            f2Var.f8013b = new f2(1, i10);
        }
        this.f24253b = f2Var;
    }

    @Override // h1.e0
    public final h1.g0 a() {
        return this.f24253b;
    }

    @Override // h1.p
    public final i2 b() {
        return r0.f24439f;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int e() {
        return ((f2) h1.n.u(this.f24253b, this)).f24303c;
    }

    public final void f(int i10) {
        h1.g gVarK;
        f2 f2Var = (f2) h1.n.i(this.f24253b);
        if (f2Var.f24303c != i10) {
            f2 f2Var2 = this.f24253b;
            synchronized (h1.n.f8051c) {
                gVarK = h1.n.k();
                ((f2) h1.n.p(f2Var2, this, gVarK, f2Var)).f24303c = i10;
            }
            h1.n.o(gVarK, this);
        }
    }

    @Override // x0.n2
    public final Object getValue() {
        return Integer.valueOf(e());
    }

    @Override // h1.e0
    public final void i(h1.g0 g0Var) {
        jc.l.c(g0Var, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableIntStateImpl.IntStateStateRecord");
        this.f24253b = (f2) g0Var;
    }

    @Override // h1.f0, h1.e0
    public final h1.g0 j(h1.g0 g0Var, h1.g0 g0Var2, h1.g0 g0Var3) {
        if (((f2) g0Var2).f24303c == ((f2) g0Var3).f24303c) {
            return g0Var2;
        }
        return null;
    }

    @Override // x0.w0
    public final void setValue(Object obj) {
        f(((Number) obj).intValue());
    }

    public final String toString() {
        return "MutableIntState(value=" + ((f2) h1.n.i(this.f24253b)).f24303c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(e());
    }
}
