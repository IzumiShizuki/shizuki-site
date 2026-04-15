package ud;

import q.t0;
import vb.w;
import wd.f0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class i implements qe.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final je.b f21586a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final je.b f21587b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dd.c f21588c;

    public i(dd.c cVar, f0 f0Var, ae.f fVar, boolean z10, qe.i iVar) {
        jc.l.e(cVar, "kotlinClass");
        jc.l.e(f0Var, "packageProto");
        jc.l.e(fVar, "nameResolver");
        je.b bVar = new je.b(je.b.e(ed.d.a(cVar.f5866a)));
        i5.f fVar2 = cVar.f5867b;
        je.b bVarC = null;
        String str = ((vd.a) fVar2.f9019c) != vd.a.f22937i ? null : (String) fVar2.f9024h;
        if (str != null && str.length() > 0) {
            bVarC = je.b.c(str);
        }
        this.f21586a = bVar;
        this.f21587b = bVarC;
        this.f21588c = cVar;
        ce.o oVar = zd.j.f26815m;
        jc.l.d(oVar, "packageModuleName");
        Integer num = (Integer) w.m(f0Var, oVar);
        if (num != null) {
            fVar.getString(num.intValue());
        }
    }

    @Override // qe.j
    public final String C() {
        return t0.E(new StringBuilder("Class '"), a().a().f2744a.f2747a, '\'');
    }

    public final be.b a() {
        be.c cVar;
        je.b bVar = this.f21586a;
        String str = bVar.f10845a;
        int iLastIndexOf = str.lastIndexOf("/");
        if (iLastIndexOf == -1) {
            cVar = be.c.f2743c;
            if (cVar == null) {
                je.b.a(9);
                throw null;
            }
        } else {
            cVar = new be.c(str.substring(0, iLastIndexOf).replace('/', '.'));
        }
        String strD = bVar.d();
        jc.l.d(strD, "getInternalName(...)");
        return new be.b(cVar, be.e.e(ef.n.Q0('/', strD, strD)));
    }

    public final String toString() {
        return i.class.getSimpleName() + ": " + this.f21586a;
    }
}
