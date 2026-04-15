package w7;

import android.os.Bundle;
import androidx.lifecycle.m0;
import androidx.lifecycle.o;
import androidx.lifecycle.s0;
import androidx.lifecycle.v;
import androidx.lifecycle.w0;
import androidx.lifecycle.x;
import androidx.lifecycle.x0;
import d.k;
import d.n;
import j2.h0;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import jc.l;
import q.t0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f23433b;

    public /* synthetic */ b(e eVar, int i10) {
        this.f23432a = i10;
        this.f23433b = eVar;
    }

    @Override // androidx.lifecycle.v
    public final void i(x xVar, o oVar) {
        switch (this.f23432a) {
            case 0:
                if (oVar != o.ON_CREATE) {
                    throw new AssertionError("Next event must be ON_CREATE");
                }
                xVar.f().q1(this);
                e eVar = this.f23433b;
                Bundle bundleP = eVar.e().p("androidx.savedstate.Restarter");
                if (bundleP == null) {
                    return;
                }
                ArrayList<String> stringArrayList = bundleP.getStringArrayList("classes_to_restore");
                if (stringArrayList == null) {
                    throw new IllegalStateException("SavedState with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
                }
                for (String str : stringArrayList) {
                    try {
                        Class<? extends U> clsAsSubclass = Class.forName(str, false, b.class.getClassLoader()).asSubclass(c.class);
                        l.b(clsAsSubclass);
                        try {
                            Constructor declaredConstructor = clsAsSubclass.getDeclaredConstructor(null);
                            declaredConstructor.setAccessible(true);
                            try {
                                Object objNewInstance = declaredConstructor.newInstance(null);
                                l.b(objNewInstance);
                                if (!(eVar instanceof x0)) {
                                    throw new IllegalStateException(("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner. Received owner: " + eVar).toString());
                                }
                                w0 w0VarD = ((x0) eVar).d();
                                v2.e eVarE = eVar.e();
                                w0VarD.getClass();
                                LinkedHashMap linkedHashMap = w0VarD.f821a;
                                for (String str2 : new HashSet(linkedHashMap.keySet())) {
                                    l.e(str2, "key");
                                    s0 s0Var = (s0) linkedHashMap.get(str2);
                                    if (s0Var != null) {
                                        m0.a(s0Var, eVarE, eVar.f());
                                    }
                                }
                                if (!new HashSet(linkedHashMap.keySet()).isEmpty()) {
                                    eVarE.z();
                                }
                            } catch (Exception e10) {
                                throw new RuntimeException(h0.x("Failed to instantiate ", str), e10);
                            }
                        } catch (NoSuchMethodException e11) {
                            throw new IllegalStateException("Class " + clsAsSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e11);
                        }
                    } catch (ClassNotFoundException e12) {
                        throw new RuntimeException(t0.D("Class ", str, " wasn't found"), e12);
                    }
                }
                return;
            default:
                n nVar = (n) this.f23433b;
                if (nVar.f5241e == null) {
                    k kVar = (k) nVar.getLastNonConfigurationInstance();
                    if (kVar != null) {
                        nVar.f5241e = kVar.f5221a;
                    }
                    if (nVar.f5241e == null) {
                        nVar.f5241e = new w0();
                    }
                }
                nVar.f14026a.q1(this);
                return;
        }
    }
}
