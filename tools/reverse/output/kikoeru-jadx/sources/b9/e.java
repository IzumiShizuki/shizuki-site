package b9;

import a0.c0;
import ac.i;
import ba.z0;
import hf.a0;
import hf.l0;
import hf.y;
import ic.n;
import lf.g;
import n7.m0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class e extends i implements n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2274e = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f2275f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f2276g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f2277h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Object f2278i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Object f2279j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f2280k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(z0 z0Var, String str, String str2, boolean z10, yb.c cVar) {
        super(2, cVar);
        this.f2278i = z0Var;
        this.f2279j = str;
        this.f2280k = str2;
        this.f2276g = z10;
    }

    public static final Object x(Throwable th2, e eVar) throws Throwable {
        th2.printStackTrace();
        pf.e eVar2 = l0.f8566a;
        Object objH = a0.H(nf.n.f15850a, new c0(2, null, 4), eVar);
        return objH == zb.a.f26667a ? objH : ub.a0.f21526a;
    }

    @Override // ac.a
    public final yb.c o(Object obj, yb.c cVar) {
        switch (this.f2274e) {
            case 0:
                e eVar = new e(this.f2276g, cVar);
                eVar.f2280k = obj;
                return eVar;
            case 1:
                return new e((z0) this.f2278i, (String) this.f2279j, (String) this.f2280k, this.f2276g, cVar);
            default:
                e eVar2 = new e((m0) this.f2277h, (int[]) this.f2278i, this.f2276g, (String[]) this.f2280k, cVar);
                eVar2.f2279j = obj;
                return eVar2;
        }
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) throws Throwable {
        switch (this.f2274e) {
            case 0:
                return ((e) o((y) obj, (yb.c) obj2)).u(ub.a0.f21526a);
            case 1:
                return ((e) o((y) obj, (yb.c) obj2)).u(ub.a0.f21526a);
            default:
                ((e) o((g) obj, (yb.c) obj2)).u(ub.a0.f21526a);
                return zb.a.f26667a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02e8 A[PHI: r0 r5
      0x02e8: PHI (r0v7 hf.d0) = (r0v4 hf.d0), (r0v8 hf.d0) binds: [B:117:0x02d1, B:122:0x02e7] A[DONT_GENERATE, DONT_INLINE]
      0x02e8: PHI (r5v8 hf.d0) = (r5v6 hf.d0), (r5v9 hf.d0) binds: [B:117:0x02d1, B:122:0x02e7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02fb A[PHI: r0 r2
      0x02fb: PHI (r0v11 hf.d0) = (r0v7 hf.d0), (r0v13 hf.d0) binds: [B:124:0x02f7, B:68:0x0165] A[DONT_GENERATE, DONT_INLINE]
      0x02fb: PHI (r2v21 java.lang.Object) = (r2v17 java.lang.Object), (r2v26 java.lang.Object) binds: [B:124:0x02f7, B:68:0x0165] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0377 A[PHI: r0
      0x0377: PHI (r0v14 hf.d0) = (r0v11 hf.d0), (r0v11 hf.d0), (r0v17 hf.d0) binds: [B:138:0x0362, B:140:0x0373, B:67:0x015c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x038a A[PHI: r0
      0x038a: PHI (r0v18 java.lang.Object) = (r0v15 java.lang.Object), (r0v23 java.lang.Object) binds: [B:143:0x0386, B:66:0x0155] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x03f3  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:194:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007b A[PHI: r0
      0x007b: PHI (r0v40 lf.g) = (r0v38 lf.g), (r0v39 lf.g), (r0v45 lf.g) binds: [B:18:0x005a, B:23:0x0078, B:15:0x003b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01dd A[PHI: r0 r2 r5
      0x01dd: PHI (r0v4 hf.d0) = (r0v3 hf.d0), (r0v6 hf.d0) binds: [B:80:0x01d9, B:70:0x017d] A[DONT_GENERATE, DONT_INLINE]
      0x01dd: PHI (r2v7 java.lang.Object) = (r2v6 java.lang.Object), (r2v15 java.lang.Object) binds: [B:80:0x01d9, B:70:0x017d] A[DONT_GENERATE, DONT_INLINE]
      0x01dd: PHI (r5v6 hf.d0) = (r5v5 hf.d0), (r5v7 hf.d0) binds: [B:80:0x01d9, B:70:0x017d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01e5  */
    @Override // ac.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object u(java.lang.Object r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1090
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b9.e.u(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(m0 m0Var, int[] iArr, boolean z10, String[] strArr, yb.c cVar) {
        super(2, cVar);
        this.f2277h = m0Var;
        this.f2278i = iArr;
        this.f2276g = z10;
        this.f2280k = strArr;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(boolean z10, yb.c cVar) {
        super(2, cVar);
        this.f2276g = z10;
    }
}
