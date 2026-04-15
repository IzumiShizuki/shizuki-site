package xc;

import bd.h0;
import java.util.Collection;
import jc.s;
import jc.z;
import n7.b0;
import pc.u;
import vb.t;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class g implements ad.c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final be.e f24925g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final be.b f24926h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h0 f24927a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ic.k f24928b = f.f24920b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final re.i f24929c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ u[] f24923e = {z.f10839a.g(new s(g.class, "cloneable", "getCloneable()Lorg/jetbrains/kotlin/descriptors/impl/ClassDescriptorImpl;", 0))};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final e f24922d = new e();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final be.c f24924f = vc.o.f22908k;

    static {
        be.d dVar = vc.n.f22869c;
        f24925g = dVar.g();
        be.c cVarI = dVar.i();
        f24926h = new be.b(cVarI.b(), cVarI.f2744a.g());
    }

    public g(re.l lVar, h0 h0Var) {
        this.f24927a = h0Var;
        this.f24929c = new re.i(lVar, new bd.i(19, this, lVar, false));
    }

    @Override // ad.c
    public final yc.e a(be.b bVar) {
        jc.l.e(bVar, "classId");
        if (!bVar.equals(f24926h)) {
            return null;
        }
        return (bd.n) b0.r(this.f24929c, f24923e[0]);
    }

    @Override // ad.c
    public final Collection b(be.c cVar) {
        jc.l.e(cVar, "packageFqName");
        if (!cVar.equals(f24924f)) {
            return t.f22821a;
        }
        return ud.e.X((bd.n) b0.r(this.f24929c, f24923e[0]));
    }

    @Override // ad.c
    public final boolean c(be.c cVar, be.e eVar) {
        jc.l.e(cVar, "packageFqName");
        jc.l.e(eVar, "name");
        return eVar.equals(f24925g) && cVar.equals(f24924f);
    }
}
