package j5;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class o1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final o1 f10377d = new o1(new m4.j1[0]);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f10378e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10379a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ya.a1 f10380b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f10381c;

    static {
        int i10 = p4.c0.f16548a;
        f10378e = Integer.toString(0, 36);
    }

    public o1(m4.j1... j1VarArr) {
        ya.a1 a1VarR = ya.i0.r(j1VarArr);
        this.f10380b = a1VarR;
        this.f10379a = j1VarArr.length;
        int i10 = 0;
        while (i10 < a1VarR.f25948d) {
            int i11 = i10 + 1;
            for (int i12 = i11; i12 < a1VarR.f25948d; i12++) {
                if (((m4.j1) a1VarR.get(i10)).equals(a1VarR.get(i12))) {
                    p4.c.o("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i10 = i11;
        }
    }

    public final m4.j1 a(int i10) {
        return (m4.j1) this.f10380b.get(i10);
    }

    public final int b(m4.j1 j1Var) {
        int iIndexOf = this.f10380b.indexOf(j1Var);
        if (iIndexOf >= 0) {
            return iIndexOf;
        }
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o1.class != obj.getClass()) {
            return false;
        }
        o1 o1Var = (o1) obj;
        return this.f10379a == o1Var.f10379a && this.f10380b.equals(o1Var.f10380b);
    }

    public final int hashCode() {
        if (this.f10381c == 0) {
            this.f10381c = this.f10380b.hashCode();
        }
        return this.f10381c;
    }
}
