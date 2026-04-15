package androidx.lifecycle;

import android.app.Application;
import android.os.Bundle;
import java.lang.reflect.Constructor;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class q0 implements u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Application f802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t0 f803b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Bundle f804c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final q f805d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final v2.e f806e;

    public q0() {
        this.f803b = new t0(null);
    }

    @Override // androidx.lifecycle.u0
    public final s0 a(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return d(canonicalName, cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // androidx.lifecycle.u0
    public final s0 b(pc.c cVar, i4.e eVar) {
        jc.l.e(cVar, "modelClass");
        return c(g8.a.D(cVar), eVar);
    }

    @Override // androidx.lifecycle.u0
    public final s0 c(Class cls, i4.e eVar) {
        LinkedHashMap linkedHashMap = eVar.f9002a;
        String str = (String) linkedHashMap.get(v0.f819b);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        }
        if (linkedHashMap.get(m0.f783a) == null || linkedHashMap.get(m0.f784b) == null) {
            if (this.f805d != null) {
                return d(str, cls);
            }
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
        Application application = (Application) linkedHashMap.get(t0.f816e);
        boolean zIsAssignableFrom = a.class.isAssignableFrom(cls);
        Constructor constructorA = (!zIsAssignableFrom || application == null) ? r0.a(cls, r0.f811b) : r0.a(cls, r0.f810a);
        return constructorA == null ? this.f803b.c(cls, eVar) : (!zIsAssignableFrom || application == null) ? r0.b(cls, constructorA, m0.b(eVar)) : r0.b(cls, constructorA, application, m0.b(eVar));
    }

    public final s0 d(String str, Class cls) {
        j0 j0Var;
        q qVar = this.f805d;
        if (qVar == null) {
            throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        boolean zIsAssignableFrom = a.class.isAssignableFrom(cls);
        Application application = this.f802a;
        Constructor constructorA = (!zIsAssignableFrom || application == null) ? r0.a(cls, r0.f811b) : r0.a(cls, r0.f810a);
        int i10 = 1;
        if (constructorA == null) {
            if (application != null) {
                return this.f803b.a(cls);
            }
            if (l0.f781b == null) {
                l0.f781b = new l0(i10);
            }
            jc.l.b(l0.f781b);
            return android.support.v4.media.session.b.C(cls);
        }
        v2.e eVar = this.f806e;
        jc.l.b(eVar);
        Bundle bundleP = eVar.p(str);
        if (bundleP == null) {
            bundleP = this.f804c;
        }
        if (bundleP == null) {
            j0Var = new j0();
        } else {
            ClassLoader classLoader = j0.class.getClassLoader();
            jc.l.b(classLoader);
            bundleP.setClassLoader(classLoader);
            wb.e eVar2 = new wb.e(bundleP.size());
            for (String str2 : bundleP.keySet()) {
                jc.l.b(str2);
                eVar2.put(str2, bundleP.get(str2));
            }
            j0Var = new j0(eVar2.b());
        }
        k0 k0Var = new k0(str, j0Var);
        k0Var.u(qVar, eVar);
        p pVarA1 = qVar.a1();
        if (pVarA1 == p.f795b || pVarA1.compareTo(p.f797d) >= 0) {
            eVar.z();
        } else {
            qVar.W0(new h(qVar, eVar));
        }
        s0 s0VarB = (!zIsAssignableFrom || application == null) ? r0.b(cls, constructorA, j0Var) : r0.b(cls, constructorA, application, j0Var);
        s0VarB.a("androidx.lifecycle.savedstate.vm.tag", k0Var);
        return s0VarB;
    }

    public q0(Application application, w7.e eVar, Bundle bundle) {
        t0 t0Var;
        this.f806e = eVar.e();
        this.f805d = eVar.f();
        this.f804c = bundle;
        this.f802a = application;
        if (application != null) {
            if (t0.f815d == null) {
                t0.f815d = new t0(application);
            }
            t0Var = t0.f815d;
            jc.l.b(t0Var);
        } else {
            t0Var = new t0(null);
        }
        this.f803b = t0Var;
    }
}
