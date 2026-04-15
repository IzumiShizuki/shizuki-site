package x0;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c1 extends h1.f0 implements Parcelable, w0, n2, h1.p {
    public static final Parcelable.Creator<c1> CREATOR = new z0(2);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public g2 f24260b;

    public c1(long j10) {
        h1.g gVarK = h1.n.k();
        g2 g2Var = new g2(gVarK.g(), j10);
        if (!(gVarK instanceof h1.b)) {
            g2Var.f8013b = new g2(1, j10);
        }
        this.f24260b = g2Var;
    }

    @Override // h1.e0
    public final h1.g0 a() {
        return this.f24260b;
    }

    @Override // h1.p
    public final i2 b() {
        return r0.f24439f;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final void e(long j10) {
        h1.g gVarK;
        g2 g2Var = (g2) h1.n.i(this.f24260b);
        if (g2Var.f24312c != j10) {
            g2 g2Var2 = this.f24260b;
            synchronized (h1.n.f8051c) {
                gVarK = h1.n.k();
                ((g2) h1.n.p(g2Var2, this, gVarK, g2Var)).f24312c = j10;
            }
            h1.n.o(gVarK, this);
        }
    }

    @Override // x0.n2
    public final Object getValue() {
        return Long.valueOf(((g2) h1.n.u(this.f24260b, this)).f24312c);
    }

    @Override // h1.e0
    public final void i(h1.g0 g0Var) {
        jc.l.c(g0Var, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord");
        this.f24260b = (g2) g0Var;
    }

    @Override // h1.f0, h1.e0
    public final h1.g0 j(h1.g0 g0Var, h1.g0 g0Var2, h1.g0 g0Var3) {
        if (((g2) g0Var2).f24312c == ((g2) g0Var3).f24312c) {
            return g0Var2;
        }
        return null;
    }

    @Override // x0.w0
    public final void setValue(Object obj) {
        e(((Number) obj).longValue());
    }

    public final String toString() {
        return "MutableLongState(value=" + ((g2) h1.n.i(this.f24260b)).f24312c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(((g2) h1.n.u(this.f24260b, this)).f24312c);
    }
}
