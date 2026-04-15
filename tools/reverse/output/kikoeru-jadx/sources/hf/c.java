package hf;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c extends g1 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f8524h = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_disposer$volatile");
    private volatile /* synthetic */ Object _disposer$volatile;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final k f8525e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public n0 f8526f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ e f8527g;

    public c(e eVar, k kVar) {
        this.f8527g = eVar;
        this.f8525e = kVar;
    }

    @Override // hf.g1
    public final boolean k() {
        return false;
    }

    @Override // hf.g1
    public final void l(Throwable th2) throws h0 {
        k kVar = this.f8525e;
        if (th2 != null) {
            kVar.getClass();
            app.nekogram.translator.r rVarG = kVar.G(new s(th2, false), null);
            if (rVarG != null) {
                kVar.z(rVarG);
                d dVar = (d) f8524h.get(this);
                if (dVar != null) {
                    dVar.a();
                    return;
                }
                return;
            }
            return;
        }
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = e.f8533b;
        e eVar = this.f8527g;
        if (atomicIntegerFieldUpdater.decrementAndGet(eVar) == 0) {
            d0[] d0VarArr = eVar.f8534a;
            ArrayList arrayList = new ArrayList(d0VarArr.length);
            for (d0 d0Var : d0VarArr) {
                arrayList.add(d0Var.i());
            }
            kVar.h(arrayList);
        }
    }
}
