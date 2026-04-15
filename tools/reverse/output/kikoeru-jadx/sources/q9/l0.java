package q9;

import b7.b1;
import com.cnl.kikoeru.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class l0 extends ac.i implements ic.n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f18038e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f18039f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ List f18040g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l0(String str, List list, yb.c cVar, int i10) {
        super(2, cVar);
        this.f18038e = i10;
        this.f18039f = str;
        this.f18040g = list;
    }

    @Override // ac.a
    public final yb.c o(Object obj, yb.c cVar) {
        switch (this.f18038e) {
            case 0:
                return new l0(this.f18039f, this.f18040g, cVar, 0);
            default:
                return new l0(this.f18039f, this.f18040g, cVar, 1);
        }
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        hf.y yVar = (hf.y) obj;
        yb.c cVar = (yb.c) obj2;
        switch (this.f18038e) {
        }
        return ((l0) o(yVar, cVar)).u(ub.a0.f21526a);
    }

    @Override // ac.a
    public final Object u(Object obj) {
        Object objB;
        ug.d0 d0VarF;
        String strN;
        Object objB2;
        String strN2;
        int i10 = this.f18038e;
        String strB = "";
        ub.a0 a0Var = ub.a0.f21526a;
        List list = this.f18040g;
        String str = this.f18039f;
        switch (i10) {
            case 0:
                ub.a.f(obj);
                String str2 = ag.z.f369a;
                String strF = a9.i.f();
                jc.l.e(strF, "token");
                jc.l.e(str, "playlistId");
                jc.l.e(list, "works");
                String strConcat = ag.z.f369a.concat("/api/playlist/add-works-to-playlist");
                i4.d dVar = new i4.d(5);
                ud.s.w(dVar, "id", str);
                List list2 = list;
                ArrayList arrayList = new ArrayList(vb.n.K(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(xf.n.a((String) it.next()));
                }
                dVar.d("works", new xf.e(arrayList));
                xf.y yVarC = dVar.c();
                if (!jc.l.a(yVarC.f25022a, a0Var)) {
                    xf.b bVar = xf.c.f24987d;
                    strB = bVar.b(n7.e.A(bVar.f24989b, jc.z.a(xf.y.class)), yVarC);
                }
                ch.l lVarD = a0.c.D(strConcat);
                lVarD.w("authorization", "Bearer ".concat(strF));
                ug.z zVar = ug.b0.f21724a;
                ef.l lVar = ug.v.f21877c;
                lVarD.z(ud.e.q(strB, vb.w.h("application/json")));
                try {
                    d0VarF = ag.z.f370b.a(new b1(lVarD)).f();
                    try {
                        ug.f0 f0Var = d0VarF.f21762g;
                        jc.l.b(f0Var);
                        strN = f0Var.n();
                    } finally {
                        try {
                            throw th;
                        } finally {
                        }
                    }
                } catch (Throwable th2) {
                    objB = ub.a.b(th2);
                }
                if (d0VarF.f21759d != 200) {
                    throw new IllegalStateException(strN.toString());
                }
                xf.r rVar = ag.z.f371c;
                objB = rVar.a(strN, n7.e.A(rVar.f24989b, jc.z.a(ag.l.class)));
                d0VarF.close();
                if (!(objB instanceof ub.m)) {
                    ka.n.c(na.q.g(R.string.playlist_edit_success), 0L, null, null, 511);
                }
                Throwable thA = ub.n.a(objB);
                if (thA != null && !na.q.k(thA)) {
                    ka.n.c(thA, 3000L, null, null, 510);
                }
                return new ub.n(objB);
            default:
                ub.a.f(obj);
                String str3 = ag.z.f369a;
                String strF2 = a9.i.f();
                jc.l.e(strF2, "token");
                jc.l.e(str, "playlistId");
                jc.l.e(list, "works");
                String strConcat2 = ag.z.f369a.concat("/api/playlist/remove-works-from-playlist");
                i4.d dVar2 = new i4.d(5);
                ud.s.w(dVar2, "id", str);
                List list3 = list;
                ArrayList arrayList2 = new ArrayList(vb.n.K(list3, 10));
                Iterator it2 = list3.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(xf.n.a((String) it2.next()));
                }
                dVar2.d("works", new xf.e(arrayList2));
                xf.y yVarC2 = dVar2.c();
                if (!jc.l.a(yVarC2.f25022a, a0Var)) {
                    xf.b bVar2 = xf.c.f24987d;
                    strB = bVar2.b(n7.e.A(bVar2.f24989b, jc.z.a(xf.y.class)), yVarC2);
                }
                ch.l lVarD2 = a0.c.D(strConcat2);
                lVarD2.w("authorization", "Bearer ".concat(strF2));
                ug.z zVar2 = ug.b0.f21724a;
                ef.l lVar2 = ug.v.f21877c;
                lVarD2.z(ud.e.q(strB, vb.w.h("application/json")));
                try {
                    d0VarF = ag.z.f370b.a(new b1(lVarD2)).f();
                    try {
                        ug.f0 f0Var2 = d0VarF.f21762g;
                        jc.l.b(f0Var2);
                        strN2 = f0Var2.n();
                    } finally {
                    }
                } catch (Throwable th3) {
                    objB2 = ub.a.b(th3);
                }
                if (d0VarF.f21759d != 200) {
                    throw new IllegalStateException(strN2.toString());
                }
                xf.r rVar2 = ag.z.f371c;
                objB2 = rVar2.a(strN2, n7.e.A(rVar2.f24989b, jc.z.a(ag.l.class)));
                d0VarF.close();
                if (!(objB2 instanceof ub.m)) {
                    ka.n.c(na.q.g(R.string.playlist_edit_success), 0L, null, null, 511);
                }
                Throwable thA2 = ub.n.a(objB2);
                if (thA2 != null && !na.q.k(thA2)) {
                    ka.n.c(thA2, 3000L, null, null, 510);
                }
                return new ub.n(objB2);
        }
    }
}
