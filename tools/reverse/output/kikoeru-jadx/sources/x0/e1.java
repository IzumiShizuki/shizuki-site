package x0;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class e1 extends h1.f0 implements Parcelable, h1.p {
    public static final Parcelable.Creator<e1> CREATOR = new d1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i2 f24295b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public h2 f24296c;

    public e1(Object obj, i2 i2Var) {
        this.f24295b = i2Var;
        h1.g gVarK = h1.n.k();
        h2 h2Var = new h2(gVarK.g(), obj);
        if (!(gVarK instanceof h1.b)) {
            h2Var.f8013b = new h2(1, obj);
        }
        this.f24296c = h2Var;
    }

    @Override // h1.e0
    public final h1.g0 a() {
        return this.f24296c;
    }

    @Override // h1.p
    public final i2 b() {
        return this.f24295b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // x0.n2
    public final Object getValue() {
        return ((h2) h1.n.u(this.f24296c, this)).f24316c;
    }

    @Override // h1.e0
    public final void i(h1.g0 g0Var) {
        jc.l.c(g0Var, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl>");
        this.f24296c = (h2) g0Var;
    }

    @Override // h1.f0, h1.e0
    public final h1.g0 j(h1.g0 g0Var, h1.g0 g0Var2, h1.g0 g0Var3) {
        if (this.f24295b.a(((h2) g0Var2).f24316c, ((h2) g0Var3).f24316c)) {
            return g0Var2;
        }
        return null;
    }

    @Override // x0.w0
    public final void setValue(Object obj) {
        h1.g gVarK;
        h2 h2Var = (h2) h1.n.i(this.f24296c);
        if (this.f24295b.a(h2Var.f24316c, obj)) {
            return;
        }
        h2 h2Var2 = this.f24296c;
        synchronized (h1.n.f8051c) {
            gVarK = h1.n.k();
            ((h2) h1.n.p(h2Var2, this, gVarK, h2Var)).f24316c = obj;
        }
        h1.n.o(gVarK, this);
    }

    public final String toString() {
        return "MutableState(value=" + ((h2) h1.n.i(this.f24296c)).f24316c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11;
        parcel.writeValue(getValue());
        r0 r0Var = r0.f24436c;
        i2 i2Var = this.f24295b;
        if (jc.l.a(i2Var, r0Var)) {
            i11 = 0;
        } else if (jc.l.a(i2Var, r0.f24439f)) {
            i11 = 1;
        } else {
            if (!jc.l.a(i2Var, r0.f24437d)) {
                throw new IllegalStateException("Only known types of MutableState's SnapshotMutationPolicy are supported");
            }
            i11 = 2;
        }
        parcel.writeInt(i11);
    }
}
