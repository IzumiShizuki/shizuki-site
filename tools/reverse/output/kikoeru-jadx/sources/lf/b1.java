package lf;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b1 extends mf.b implements i0, f, mf.m {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f12369f = AtomicReferenceFieldUpdater.newUpdater(b1.class, Object.class, "_state$volatile");
    private volatile /* synthetic */ Object _state$volatile;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f12370e;

    public b1(Object obj) {
        this._state$volatile = obj;
    }

    @Override // lf.l0
    public final List a() {
        return ud.b.w(getValue());
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x007e, code lost:
    
        if (((lf.e1) r0).a(r3) == r5) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0097, code lost:
    
        if (r2 != r5) goto L36;
     */
    /* JADX WARN: Path cross not found for [B:44:0x00ad, B:46:0x00b3], limit reached: 74 */
    /* JADX WARN: Path cross not found for [B:46:0x00b3, B:44:0x00ad], limit reached: 74 */
    /* JADX WARN: Path cross not found for [B:46:0x00b3, B:54:0x00ce], limit reached: 74 */
    /* JADX WARN: Path cross not found for [B:66:0x0110, B:67:0x0111], limit reached: 74 */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009f A[Catch: all -> 0x003d, TryCatch #1 {all -> 0x003d, blocks: (B:14:0x0039, B:36:0x0097, B:38:0x009f, B:41:0x00a6, B:42:0x00aa, B:44:0x00ad, B:54:0x00ce, B:57:0x00de, B:58:0x00fa, B:64:0x010a, B:61:0x0101, B:63:0x0107, B:46:0x00b3, B:50:0x00ba, B:21:0x0052, B:24:0x005d, B:35:0x0087), top: B:73:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ad A[Catch: all -> 0x003d, TryCatch #1 {all -> 0x003d, blocks: (B:14:0x0039, B:36:0x0097, B:38:0x009f, B:41:0x00a6, B:42:0x00aa, B:44:0x00ad, B:54:0x00ce, B:57:0x00de, B:58:0x00fa, B:64:0x010a, B:61:0x0101, B:63:0x0107, B:46:0x00b3, B:50:0x00ba, B:21:0x0052, B:24:0x005d, B:35:0x0087), top: B:73:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00de A[Catch: all -> 0x003d, TryCatch #1 {all -> 0x003d, blocks: (B:14:0x0039, B:36:0x0097, B:38:0x009f, B:41:0x00a6, B:42:0x00aa, B:44:0x00ad, B:54:0x00ce, B:57:0x00de, B:58:0x00fa, B:64:0x010a, B:61:0x0101, B:63:0x0107, B:46:0x00b3, B:50:0x00ba, B:21:0x0052, B:24:0x005d, B:35:0x0087), top: B:73:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x00dd -> B:36:0x0097). Please report as a decompilation issue!!! */
    @Override // lf.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(lf.g r18, yb.c r19) {
        /*
            Method dump skipped, instruction units count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lf.b1.b(lf.g, yb.c):java.lang.Object");
    }

    @Override // mf.m
    public final f c(yb.h hVar, int i10, kf.a aVar) {
        return (((i10 < 0 || i10 >= 2) && i10 != -2) || aVar != kf.a.f11337b) ? p0.o(this, hVar, i10, aVar) : this;
    }

    @Override // mf.b
    public final mf.d e() {
        return new c1();
    }

    @Override // mf.b
    public final mf.d[] f() {
        return new c1[2];
    }

    @Override // lf.z0
    public final Object getValue() {
        app.nekogram.translator.r rVar = mf.c.f15133b;
        Object obj = f12369f.get(this);
        if (obj == rVar) {
            return null;
        }
        return obj;
    }

    @Override // lf.h0
    public final void i() {
        throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
    }

    @Override // lf.h0
    public final boolean j(Object obj) {
        m(null, obj);
        return true;
    }

    public final boolean k(Object obj, Object obj2) {
        app.nekogram.translator.r rVar = mf.c.f15133b;
        if (obj == null) {
            obj = rVar;
        }
        if (obj2 == null) {
            obj2 = rVar;
        }
        return m(obj, obj2);
    }

    public final void l(Object obj) {
        if (obj == null) {
            obj = mf.c.f15133b;
        }
        m(null, obj);
    }

    public final boolean m(Object obj, Object obj2) {
        int i10;
        mf.d[] dVarArr;
        app.nekogram.translator.r rVar;
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f12369f;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj != null && !jc.l.a(obj3, obj)) {
                return false;
            }
            if (jc.l.a(obj3, obj2)) {
                return true;
            }
            atomicReferenceFieldUpdater.set(this, obj2);
            int i11 = this.f12370e;
            if ((i11 & 1) != 0) {
                this.f12370e = i11 + 2;
                return true;
            }
            int i12 = i11 + 1;
            this.f12370e = i12;
            mf.d[] dVarArr2 = this.f15128a;
            while (true) {
                c1[] c1VarArr = (c1[]) dVarArr2;
                if (c1VarArr != null) {
                    for (c1 c1Var : c1VarArr) {
                        if (c1Var != null) {
                            AtomicReference atomicReference = c1Var.f12378a;
                            while (true) {
                                Object obj4 = atomicReference.get();
                                if (obj4 != null && obj4 != (rVar = p0.f12475c)) {
                                    app.nekogram.translator.r rVar2 = p0.f12474b;
                                    if (obj4 != rVar2) {
                                        while (!atomicReference.compareAndSet(obj4, rVar2)) {
                                            if (atomicReference.get() != obj4) {
                                                break;
                                            }
                                        }
                                        ((hf.k) obj4).h(ub.a0.f21526a);
                                        break;
                                    }
                                    while (!atomicReference.compareAndSet(obj4, rVar)) {
                                        if (atomicReference.get() != obj4) {
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                synchronized (this) {
                    i10 = this.f12370e;
                    if (i10 == i12) {
                        this.f12370e = i12 + 1;
                        return true;
                    }
                    dVarArr = this.f15128a;
                }
                dVarArr2 = dVarArr;
                i12 = i10;
            }
        }
    }

    @Override // lf.g
    public final Object n(Object obj, yb.c cVar) {
        l(obj);
        return ub.a0.f21526a;
    }
}
