package y;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class z0 implements r1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r1 f25292a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f25293b;

    public z0(c cVar, int i10) {
        this.f25292a = cVar;
        this.f25293b = i10;
    }

    @Override // y.r1
    public final int a(f3.c cVar, f3.m mVar) {
        if (((mVar == f3.m.f6667a ? 8 : 2) & this.f25293b) != 0) {
            return this.f25292a.a(cVar, mVar);
        }
        return 0;
    }

    @Override // y.r1
    public final int b(f3.c cVar) {
        if ((this.f25293b & 16) != 0) {
            return this.f25292a.b(cVar);
        }
        return 0;
    }

    @Override // y.r1
    public final int c(f3.c cVar) {
        if ((this.f25293b & 32) != 0) {
            return this.f25292a.c(cVar);
        }
        return 0;
    }

    @Override // y.r1
    public final int d(f3.c cVar, f3.m mVar) {
        if (((mVar == f3.m.f6667a ? 4 : 1) & this.f25293b) != 0) {
            return this.f25292a.d(cVar, mVar);
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z0)) {
            return false;
        }
        z0 z0Var = (z0) obj;
        return jc.l.a(this.f25292a, z0Var.f25292a) && this.f25293b == z0Var.f25293b;
    }

    public final int hashCode() {
        return (this.f25292a.hashCode() * 31) + this.f25293b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(this.f25292a);
        sb.append(" only ");
        StringBuilder sb2 = new StringBuilder("WindowInsetsSides(");
        StringBuilder sb3 = new StringBuilder();
        int i10 = this.f25293b;
        int i11 = d.f25107c;
        if ((i10 & i11) == i11) {
            d.r("Start", sb3);
        }
        int i12 = d.f25109e;
        if ((i10 & i12) == i12) {
            d.r("Left", sb3);
        }
        if ((i10 & 16) == 16) {
            d.r("Top", sb3);
        }
        int i13 = d.f25108d;
        if ((i10 & i13) == i13) {
            d.r("End", sb3);
        }
        int i14 = d.f25110f;
        if ((i10 & i14) == i14) {
            d.r("Right", sb3);
        }
        if ((i10 & 32) == 32) {
            d.r("Bottom", sb3);
        }
        String string = sb3.toString();
        jc.l.d(string, "toString(...)");
        sb2.append(string);
        sb2.append(')');
        sb.append((Object) sb2.toString());
        sb.append(')');
        return sb.toString();
    }
}
