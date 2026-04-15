package n7;

import com.cnl.kikoeru.data.db.AppDatabase_Impl;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AppDatabase_Impl f15518a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m0 f15519b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f15520c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ReentrantLock f15521d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i9.f f15522e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final i f15523f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f15524g;

    /* JADX WARN: Type inference failed for: r1v5, types: [n7.i] */
    public k(AppDatabase_Impl appDatabase_Impl, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, String... strArr) {
        this.f15518a = appDatabase_Impl;
        m0 m0Var = new m0(appDatabase_Impl, linkedHashMap, linkedHashMap2, strArr, appDatabase_Impl.f15585k, new de.h(1, this, k.class, "notifyInvalidatedObservers", "notifyInvalidatedObservers(Ljava/util/Set;)V", 0, 0, 3));
        this.f15519b = m0Var;
        this.f15520c = new LinkedHashMap();
        this.f15521d = new ReentrantLock();
        this.f15522e = new i9.f(this);
        final int i10 = 0;
        this.f15523f = new ic.a(this) { // from class: n7.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k f15496b;

            {
                this.f15496b = this;
            }

            @Override // ic.a
            public final Object b() {
                switch (i10) {
                    case 0:
                        this.f15496b.getClass();
                        return ub.a0.f21526a;
                    default:
                        AppDatabase_Impl appDatabase_Impl2 = this.f15496b.f15518a;
                        return Boolean.valueOf(!appDatabase_Impl2.j() || appDatabase_Impl2.m());
                }
            }
        };
        jc.l.d(Collections.newSetFromMap(new IdentityHashMap()), "newSetFromMap(...)");
        this.f15524g = new Object();
        final int i11 = 1;
        m0Var.f15552k = new ic.a(this) { // from class: n7.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k f15496b;

            {
                this.f15496b = this;
            }

            @Override // ic.a
            public final Object b() {
                switch (i11) {
                    case 0:
                        this.f15496b.getClass();
                        return ub.a0.f21526a;
                    default:
                        AppDatabase_Impl appDatabase_Impl2 = this.f15496b.f15518a;
                        return Boolean.valueOf(!appDatabase_Impl2.j() || appDatabase_Impl2.m());
                }
            }
        };
    }

    public final lf.f a(String[] strArr, boolean z10) {
        jc.l.e(strArr, "tables");
        m0 m0Var = this.f15519b;
        ub.k kVarH = m0Var.h(strArr);
        String[] strArr2 = (String[]) kVarH.f21543a;
        int[] iArr = (int[]) kVarH.f21544b;
        jc.l.e(strArr2, "resolvedTableNames");
        jc.l.e(iArr, "tableIds");
        return new i7.n(new b9.e(m0Var, iArr, z10, strArr2, (yb.c) null));
    }

    public final Object b(ac.i iVar) {
        Object objG;
        AppDatabase_Impl appDatabase_Impl = this.f15518a;
        return ((!appDatabase_Impl.j() || appDatabase_Impl.m()) && (objG = this.f15519b.g(iVar)) == zb.a.f26667a) ? objG : ub.a0.f21526a;
    }
}
