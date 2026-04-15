package e7;

import c7.e1;
import java.util.ArrayList;
import java.util.Iterator;
import o.v0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class w extends u implements Iterable, kc.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f6408g = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final h7.k f6409f;

    public w(z zVar) {
        super(zVar);
        this.f6409f = new h7.k(this);
    }

    @Override // e7.u
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof w) || !super.equals(obj)) {
            return false;
        }
        h7.k kVar = this.f6409f;
        int iG = ((v0) kVar.f8199d).g();
        h7.k kVar2 = ((w) obj).f6409f;
        if (iG != ((v0) kVar2.f8199d).g() || kVar.f8197b != kVar2.f8197b) {
            return false;
        }
        v0 v0Var = (v0) kVar.f8199d;
        jc.l.e(v0Var, "<this>");
        for (u uVar : (df.a) df.m.W(new jc.b(1, v0Var))) {
            if (!uVar.equals(((v0) kVar2.f8199d).d(uVar.f6400b.f8187a))) {
                return false;
            }
        }
        return true;
    }

    @Override // e7.u
    public final int hashCode() {
        h7.k kVar = this.f6409f;
        int iE = kVar.f8197b;
        v0 v0Var = (v0) kVar.f8199d;
        int iG = v0Var.g();
        for (int i10 = 0; i10 < iG; i10++) {
            iE = (((iE * 31) + v0Var.e(i10)) * 31) + ((u) v0Var.h(i10)).hashCode();
        }
        return iE;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        h7.k kVar = this.f6409f;
        kVar.getClass();
        return new h7.j(kVar);
    }

    @Override // e7.u
    public final t k(e1 e1Var) {
        t tVarK = super.k(e1Var);
        h7.k kVar = this.f6409f;
        kVar.getClass();
        return kVar.v(tVarK, e1Var, false, (w) kVar.f8198c);
    }

    public final t l(e1 e1Var, u uVar) {
        return this.f6409f.v(super.k(e1Var), e1Var, true, uVar);
    }

    public final t m(String str, boolean z10, u uVar) {
        t tVarM;
        jc.l.e(str, "route");
        h7.k kVar = this.f6409f;
        kVar.getClass();
        w wVar = (w) kVar.f8198c;
        t tVarC = wVar.f6400b.c(str);
        ArrayList arrayList = new ArrayList();
        Iterator it = wVar.iterator();
        while (true) {
            h7.j jVar = (h7.j) it;
            tVarM = null;
            if (!jVar.hasNext()) {
                break;
            }
            u uVar2 = (u) jVar.next();
            if (!jc.l.a(uVar2, uVar)) {
                if (uVar2 instanceof w) {
                    tVarM = ((w) uVar2).m(str, false, wVar);
                } else {
                    uVar2.getClass();
                    tVarM = uVar2.f6400b.c(str);
                }
            }
            if (tVarM != null) {
                arrayList.add(tVarM);
            }
        }
        t tVar = (t) vb.m.j0(arrayList);
        w wVar2 = wVar.f6401c;
        if (wVar2 != null && z10 && !wVar2.equals(uVar)) {
            tVarM = wVar2.m(str, true, wVar);
        }
        return (t) vb.m.j0(vb.l.t0(new t[]{tVarC, tVar, tVarM}));
    }

    @Override // e7.u
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        h7.k kVar = this.f6409f;
        String str = (String) kVar.f8201f;
        kVar.getClass();
        u uVarS = (str == null || ef.n.y0(str)) ? null : kVar.s(str, true);
        if (uVarS == null) {
            uVarS = kVar.r(kVar.f8197b);
        }
        sb.append(" startDestination=");
        if (uVarS == null) {
            String str2 = (String) kVar.f8201f;
            if (str2 != null) {
                sb.append(str2);
            } else {
                String str3 = (String) kVar.f8200e;
                if (str3 != null) {
                    sb.append(str3);
                } else {
                    sb.append("0x" + Integer.toHexString(kVar.f8197b));
                }
            }
        } else {
            sb.append("{");
            sb.append(uVarS.toString());
            sb.append("}");
        }
        String string = sb.toString();
        jc.l.d(string, "toString(...)");
        return string;
    }
}
