package b0;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class e0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public f3.a f1219b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f1220c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f1221d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f1223f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f1224g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.foundation.lazy.layout.b f1225h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a0[] f1218a = g0.f1251a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f1222e = 1;

    public e0(androidx.compose.foundation.lazy.layout.b bVar) {
        this.f1225h = bVar;
    }

    public static void b(e0 e0Var, r0 r0Var, hf.y yVar, q1.v vVar, int i10, int i11) {
        e0Var.f1225h.getClass();
        long jI = r0Var.i(0);
        e0Var.a(r0Var, yVar, vVar, i10, i11, (int) (!r0Var.g() ? jI & 4294967295L : jI >> 32));
    }

    public final void a(r0 r0Var, hf.y yVar, q1.v vVar, int i10, int i11, int i12) {
        a0[] a0VarArr = this.f1218a;
        int length = a0VarArr.length;
        int i13 = 0;
        while (true) {
            if (i13 >= length) {
                this.f1223f = i10;
                this.f1224g = i11;
                break;
            } else {
                a0 a0Var = a0VarArr[i13];
                if (a0Var != null && a0Var.f1178g) {
                    break;
                } else {
                    i13++;
                }
            }
        }
        int length2 = this.f1218a.length;
        for (int iB = r0Var.b(); iB < length2; iB++) {
            a0 a0Var2 = this.f1218a[iB];
            if (a0Var2 != null) {
                a0Var2.c();
            }
        }
        if (this.f1218a.length != r0Var.b()) {
            Object[] objArrCopyOf = Arrays.copyOf(this.f1218a, r0Var.b());
            jc.l.d(objArrCopyOf, "copyOf(...)");
            this.f1218a = (a0[]) objArrCopyOf;
        }
        this.f1219b = new f3.a(r0Var.f());
        this.f1220c = i12;
        this.f1221d = r0Var.j();
        this.f1222e = r0Var.d();
        int iB2 = r0Var.b();
        for (int i14 = 0; i14 < iB2; i14++) {
            Object objE = r0Var.e(i14);
            k kVar = objE instanceof k ? (k) objE : null;
            if (kVar == null) {
                a0 a0Var3 = this.f1218a[i14];
                if (a0Var3 != null) {
                    a0Var3.c();
                }
                this.f1218a[i14] = null;
            } else {
                a0 a0Var4 = this.f1218a[i14];
                if (a0Var4 == null) {
                    a0Var4 = new a0(yVar, vVar, new d0(0, this.f1225h));
                    this.f1218a[i14] = a0Var4;
                }
                a0Var4.f1175d = kVar.f1278o;
                a0Var4.f1176e = kVar.f1279p;
                a0Var4.f1177f = kVar.f1280q;
            }
        }
    }
}
