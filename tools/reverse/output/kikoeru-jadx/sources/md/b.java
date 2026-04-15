package md;

import b0.w1;
import java.util.Map;
import jc.l;
import jc.s;
import jc.z;
import n7.b0;
import pc.u;
import re.o;
import se.a0;
import se.w;
import vb.m;
import yc.m0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class b implements nd.g {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ u[] f15100e = {z.f10839a.g(new s(b.class, "type", "getType()Lorg/jetbrains/kotlin/types/SimpleType;", 0))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final be.c f15101a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m0 f15102b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final re.i f15103c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final sd.a f15104d;

    public b(w1 w1Var, ed.e eVar, be.c cVar) {
        l.e(w1Var, "c");
        od.a aVar = (od.a) w1Var.f1395c;
        l.e(cVar, "fqName");
        this.f15101a = cVar;
        this.f15102b = eVar != null ? aVar.f16324j.c(eVar) : m0.p0;
        o oVar = aVar.f16315a;
        bd.i iVar = new bd.i(5, w1Var, this, false);
        re.l lVar = (re.l) oVar;
        lVar.getClass();
        this.f15103c = new re.i(lVar, iVar);
        this.f15104d = eVar != null ? (sd.a) m.Z(eVar.b()) : null;
    }

    @Override // zc.b
    public final be.c a() {
        return this.f15101a;
    }

    @Override // zc.b
    public final w b() {
        return (a0) b0.r(this.f15103c, f15100e[0]);
    }

    @Override // zc.b
    public Map c() {
        return vb.s.f22820a;
    }

    @Override // zc.b
    public final m0 m() {
        return this.f15102b;
    }
}
