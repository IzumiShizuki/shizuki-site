package androidx.lifecycle;

import android.os.Bundle;
import android.view.View;
import b0.w1;
import com.cnl.kikoeru.MainActivity;
import com.cnl.kikoeru.R;
import hf.t1;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final pe.d f783a = new pe.d(3);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final pe.d f784b = new pe.d(4);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final pe.d f785c = new pe.d(5);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final k4.c f786d = new k4.c();

    public static final void a(s0 s0Var, v2.e eVar, q qVar) {
        jc.l.e(eVar, "registry");
        jc.l.e(qVar, "lifecycle");
        k0 k0Var = (k0) s0Var.q("androidx.lifecycle.savedstate.vm.tag");
        if (k0Var == null || k0Var.f780c) {
            return;
        }
        k0Var.u(qVar, eVar);
        p pVarA1 = qVar.a1();
        if (pVarA1 == p.f795b || pVarA1.compareTo(p.f797d) >= 0) {
            eVar.z();
        } else {
            qVar.W0(new h(qVar, eVar));
        }
    }

    public static final j0 b(i4.b bVar) {
        j0 j0Var;
        jc.l.e(bVar, "<this>");
        w7.e eVar = (w7.e) bVar.a(f783a);
        if (eVar == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
        }
        x0 x0Var = (x0) bVar.a(f784b);
        if (x0Var == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        Bundle bundle = (Bundle) bVar.a(f785c);
        String str = (String) bVar.a(v0.f819b);
        if (str == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
        }
        w7.d dVarS = eVar.e().s();
        Bundle bundle2 = null;
        o0 o0Var = dVarS instanceof o0 ? (o0) dVarS : null;
        if (o0Var == null) {
            throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
        }
        LinkedHashMap linkedHashMap = g(x0Var).f800b;
        j0 j0Var2 = (j0) linkedHashMap.get(str);
        if (j0Var2 != null) {
            return j0Var2;
        }
        o0Var.b();
        Bundle bundle3 = o0Var.f792c;
        if (bundle3 != null && bundle3.containsKey(str)) {
            Bundle bundle4 = bundle3.getBundle(str);
            if (bundle4 == null) {
                bundle4 = n7.d.c((ub.k[]) Arrays.copyOf(new ub.k[0], 0));
            }
            bundle3.remove(str);
            if (bundle3.isEmpty()) {
                o0Var.f792c = null;
            }
            bundle2 = bundle4;
        }
        if (bundle2 != null) {
            bundle = bundle2;
        }
        if (bundle == null) {
            j0Var = new j0();
        } else {
            ClassLoader classLoader = j0.class.getClassLoader();
            jc.l.b(classLoader);
            bundle.setClassLoader(classLoader);
            wb.e eVar2 = new wb.e(bundle.size());
            for (String str2 : bundle.keySet()) {
                jc.l.b(str2);
                eVar2.put(str2, bundle.get(str2));
            }
            j0Var = new j0(eVar2.b());
        }
        linkedHashMap.put(str, j0Var);
        return j0Var;
    }

    public static final void c(w7.e eVar) {
        p pVarA1 = eVar.f().a1();
        if (pVarA1 != p.f795b && pVarA1 != p.f796c) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (eVar.e().s() == null) {
            o0 o0Var = new o0(eVar.e(), (x0) eVar);
            eVar.e().y("androidx.lifecycle.internal.SavedStateHandlesProvider", o0Var);
            eVar.f().W0(new e(1, o0Var));
        }
    }

    public static final x d(View view) {
        jc.l.e(view, "<this>");
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_lifecycle_owner);
            x xVar = tag instanceof x ? (x) tag : null;
            if (xVar != null) {
                return xVar;
            }
            Object objX = ud.e.x(view);
            view = objX instanceof View ? (View) objX : null;
        }
        return null;
    }

    public static final x0 e(View view) {
        jc.l.e(view, "<this>");
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_view_model_store_owner);
            x0 x0Var = tag instanceof x0 ? (x0) tag : null;
            if (x0Var != null) {
                return x0Var;
            }
            Object objX = ud.e.x(view);
            view = objX instanceof View ? (View) objX : null;
        }
        return null;
    }

    public static final s f(MainActivity mainActivity) {
        z zVar = mainActivity.f14026a;
        jc.l.e(zVar, "<this>");
        v0 v0Var = (v0) zVar.f801a;
        while (true) {
            s sVar = (s) ((AtomicReference) v0Var.f820a).get();
            if (sVar != null) {
                return sVar;
            }
            t1 t1VarE = hf.a0.e();
            pf.e eVar = hf.l0.f8566a;
            s sVar2 = new s(zVar, ud.b.C(t1VarE, nf.n.f15850a.f10872f));
            AtomicReference atomicReference = (AtomicReference) v0Var.f820a;
            do {
                yb.c cVar = null;
                if (atomicReference.compareAndSet(null, sVar2)) {
                    pf.e eVar2 = hf.l0.f8566a;
                    hf.a0.y(sVar2, nf.n.f15850a.f10872f, null, new r(0, sVar2, cVar), 2);
                    return sVar2;
                }
            } while (atomicReference.get() == null);
        }
    }

    public static final p0 g(x0 x0Var) {
        v0 v0VarB = pe.d.B(x0Var, new l0(0), 4);
        return (p0) ((w1) v0VarB.f820a).R("androidx.lifecycle.internal.SavedStateHandlesVM", jc.z.f10839a.b(p0.class));
    }

    public static final k4.a h(s0 s0Var) {
        k4.a aVar;
        jc.l.e(s0Var, "<this>");
        synchronized (f786d) {
            aVar = (k4.a) s0Var.q("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY");
            if (aVar == null) {
                yb.h hVar = yb.i.f26088a;
                try {
                    pf.e eVar = hf.l0.f8566a;
                    hVar = nf.n.f15850a.f10872f;
                } catch (IllegalStateException | ub.j unused) {
                }
                k4.a aVar2 = new k4.a(hVar.G(hf.a0.e()));
                s0Var.a("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY", aVar2);
                aVar = aVar2;
            }
        }
        return aVar;
    }

    public static final void i(View view, x xVar) {
        jc.l.e(view, "<this>");
        view.setTag(R.id.view_tree_lifecycle_owner, xVar);
    }
}
