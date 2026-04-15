package re;

import m0.w;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class d extends h implements m {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile w f18993d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bd.a f18994e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(l lVar, bd.e eVar, bd.a aVar) {
        super(lVar, eVar);
        this.f18994e = aVar;
        if (lVar == null) {
            j(0);
            throw null;
        }
        this.f18993d = null;
    }

    public static /* synthetic */ void f(int i10) {
        String str = i10 != 2 ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[i10 != 2 ? 2 : 3];
        if (i10 != 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$5";
        } else {
            objArr[0] = "value";
        }
        if (i10 != 2) {
            objArr[1] = "recursionDetected";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$5";
        }
        if (i10 == 2) {
            objArr[2] = "doPostCompute";
        }
        String str2 = String.format(str, objArr);
        if (i10 == 2) {
            throw new IllegalArgumentException(str2);
        }
    }

    public static /* synthetic */ void j(int i10) {
        String str = i10 != 2 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i10 != 2 ? 3 : 2];
        if (i10 == 1) {
            objArr[0] = "computable";
        } else if (i10 != 2) {
            objArr[0] = "storageManager";
        } else {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValueWithPostCompute";
        }
        if (i10 != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValueWithPostCompute";
        } else {
            objArr[1] = "invoke";
        }
        if (i10 != 2) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i10 == 2) {
            throw new IllegalStateException(str2);
        }
    }

    @Override // re.h, ic.a
    public final Object b() throws Throwable {
        Object objB;
        w wVar = this.f18993d;
        if (wVar == null || ((Thread) wVar.f13783c) != Thread.currentThread()) {
            objB = super.b();
        } else {
            if (((Thread) wVar.f13783c) != Thread.currentThread()) {
                throw new IllegalStateException("No value in this thread (hasValue should be checked before)");
            }
            objB = wVar.f13782b;
        }
        if (objB != null) {
            return objB;
        }
        j(2);
        throw null;
    }

    @Override // re.h
    public final void h(Object obj) {
        this.f18993d = new w(obj);
        try {
            if (obj != null) {
                this.f18994e.a(obj);
            } else {
                f(2);
                throw null;
            }
        } finally {
            this.f18993d = null;
        }
    }

    @Override // re.h
    public final k5.d i(boolean z10) {
        return new k5.d(new se.e(ud.b.w(ue.l.f21667d)), false, 5);
    }
}
