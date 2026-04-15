package x0;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class t0 implements ic.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f24464b;

    public /* synthetic */ t0(int i10, Object obj) {
        this.f24463a = i10;
        this.f24464b = obj;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [ic.k, jc.m] */
    @Override // ic.k
    public final Object a(Object obj) {
        int i10 = this.f24463a;
        Object obj2 = this.f24464b;
        switch (i10) {
            case 0:
                return ((jc.m) obj2).a(Long.valueOf(((Number) obj).longValue() / 1000000));
            case 1:
                ub.k kVar = (ub.k) obj;
                jc.l.e(kVar, "<destruct>");
                String str = (String) kVar.f21543a;
                String str2 = (String) kVar.f21544b;
                List listW = ud.b.w(zc.e.a(((xc.l) obj2).f24943a.f2576d, "'" + str + "()' member of List is redundant in Kotlin and might be removed soon. Please use '" + str2 + "()' stdlib extension instead", str2 + "()", "HIDDEN"));
                return listW.isEmpty() ? zc.g.f26696a : new zc.i(0, listW);
            default:
                float fFloatValue = ((Number) obj).floatValue();
                pc.u[] uVarArr = z8.i.f26554a;
                ((w0) obj2).setValue(Float.valueOf(fFloatValue));
                return ub.a0.f21526a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public t0(ic.k kVar) {
        this.f24463a = 0;
        this.f24464b = (jc.m) kVar;
    }
}
