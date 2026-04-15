package g1;

import androidx.lifecycle.n0;
import c7.e1;
import h1.p;
import x0.r0;
import x0.u1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b implements u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public k f7130a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public g f7131b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f7132c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f7133d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object[] f7134e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public f f7135f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final n0 f7136g = new n0(10, this);

    public b(k kVar, g gVar, String str, Object obj, Object[] objArr) {
        this.f7130a = kVar;
        this.f7131b = gVar;
        this.f7132c = str;
        this.f7133d = obj;
        this.f7134e = objArr;
    }

    @Override // x0.u1
    public final void a() {
        f fVar = this.f7135f;
        if (fVar != null) {
            ((e1) fVar).i0();
        }
    }

    public final void b() throws Exception {
        String strA;
        g gVar = this.f7131b;
        if (this.f7135f != null) {
            throw new IllegalArgumentException(("entry(" + this.f7135f + ") is not null").toString());
        }
        if (gVar != null) {
            n0 n0Var = this.f7136g;
            Object objB = n0Var.b();
            if (objB == null || gVar.b(objB)) {
                this.f7135f = gVar.g(this.f7132c, n0Var);
                return;
            }
            if (objB instanceof p) {
                p pVar = (p) objB;
                if (pVar.b() == r0.f24436c || pVar.b() == r0.f24439f || pVar.b() == r0.f24437d) {
                    strA = "MutableState containing " + pVar.getValue() + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().";
                } else {
                    strA = "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver";
                }
            } else {
                strA = l.a(objB);
            }
            throw new IllegalArgumentException(strA);
        }
    }

    @Override // x0.u1
    public final void c() {
        f fVar = this.f7135f;
        if (fVar != null) {
            ((e1) fVar).i0();
        }
    }

    @Override // x0.u1
    public final void d() throws Exception {
        b();
    }
}
