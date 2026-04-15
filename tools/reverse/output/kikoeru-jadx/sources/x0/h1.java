package x0;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class h1 implements ic.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24314a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f24315b;

    public /* synthetic */ h1(int i10, Object obj) {
        this.f24314a = i10;
        this.f24315b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v3, types: [o.g0] */
    /* JADX WARN: Type inference failed for: r11v2, types: [o.g0] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, x0.o0] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object[]] */
    @Override // ic.a
    public final Object b() {
        int i10 = this.f24314a;
        Object obj = this.f24315b;
        switch (i10) {
            case 0:
                ArrayList arrayList = ((i1) obj).f24320a;
                o.k0 k0Var = new o.k0(arrayList.size());
                int size = arrayList.size();
                for (int i11 = 0; i11 < size; i11++) {
                    ?? r62 = (o0) arrayList.get(i11);
                    Object obj2 = r62.f24402b;
                    int i12 = r62.f24401a;
                    Object n0Var = obj2 != null ? new n0(Integer.valueOf(i12), r62.f24402b) : Integer.valueOf(i12);
                    int iF = k0Var.f(n0Var);
                    boolean z10 = iF < 0;
                    Object obj3 = z10 ? null : k0Var.f15997c[iF];
                    if (obj3 != null) {
                        if (obj3 instanceof o.g0) {
                            ?? r10 = (o.g0) obj3;
                            r10.a(r62);
                            r62 = r10;
                        } else {
                            Object[] objArr = o.q0.f16032a;
                            ?? g0Var = new o.g0(2);
                            g0Var.a(obj3);
                            g0Var.a(r62);
                            r62 = g0Var;
                        }
                    }
                    if (z10) {
                        int i13 = ~iF;
                        k0Var.f15996b[i13] = n0Var;
                        k0Var.f15997c[i13] = r62;
                    } else {
                        k0Var.f15997c[iF] = r62;
                    }
                }
                return new z0.a(k0Var);
            case 1:
                xc.i iVar = (xc.i) obj;
                bd.g0 g0Var2 = iVar.f24932f;
                if (g0Var2 == null) {
                    throw new AssertionError("JvmBuiltins instance has not been initialized properly");
                }
                xc.h hVar = (xc.h) g0Var2.b();
                iVar.f24932f = null;
                return hVar;
            case 2:
                return (le.o) ((yc.l0) obj).f26120b.a(te.f.f20727a);
            default:
                zc.j jVar = (zc.j) obj;
                return jVar.f26699a.j(jVar.f26700b).E();
        }
    }
}
