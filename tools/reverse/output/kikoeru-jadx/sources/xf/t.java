package xf;

import q.t0;
import wf.f1;
import wf.g1;
import wf.x1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class t implements sf.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t f25018a = new t();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f1 f25019b;

    static {
        uf.e eVar = uf.e.f21690j;
        if (ef.n.y0("kotlinx.serialization.json.JsonLiteral")) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        Object it = ((c1.i) g1.f24121a.values()).iterator();
        while (((d4.c) it).hasNext()) {
            sf.a aVar = (sf.a) ((wb.c) it).next();
            if ("kotlinx.serialization.json.JsonLiteral".equals(aVar.a().m())) {
                throw new IllegalArgumentException(ef.o.Z("\n                The name of serial descriptor should uniquely identify associated serializer.\n                For serial name kotlinx.serialization.json.JsonLiteral there already exists " + jc.z.f10839a.b(aVar.getClass()).y() + ".\n                Please refer to SerialDescriptor documentation for additional information.\n            "));
            }
        }
        f25019b = new f1("kotlinx.serialization.json.JsonLiteral", eVar);
    }

    @Override // sf.a
    public final uf.g a() {
        return f25019b;
    }

    @Override // sf.a
    public final Object b(vf.b bVar) {
        m mVarL = ua.j.e(bVar).l();
        if (mVarL instanceof s) {
            return (s) mVarL;
        }
        StringBuilder sb = new StringBuilder("Unexpected JSON element, expected JsonLiteral, had ");
        throw yf.k.e(-1, t0.F(jc.z.f10839a, mVarL.getClass(), sb), mVarL.toString());
    }

    @Override // sf.a
    public final void d(yf.t tVar, Object obj) {
        s sVar = (s) obj;
        jc.l.e(sVar, "value");
        String str = sVar.f25017b;
        ua.j.d(tVar);
        if (sVar.f25016a) {
            tVar.u(str);
            return;
        }
        Long lM0 = ef.u.m0(str);
        if (lM0 != null) {
            tVar.n(lM0.longValue());
            return;
        }
        ub.v vVarE0 = a2.c.e0(str);
        if (vVarE0 != null) {
            tVar.j(x1.f24208b).n(vVarE0.f21560a);
            return;
        }
        Boolean bool = null;
        Double dValueOf = ef.t.b0(str) ? Double.valueOf(Double.parseDouble(str)) : null;
        if (dValueOf != null) {
            tVar.f(dValueOf.doubleValue());
            return;
        }
        if (str.equals("true")) {
            bool = Boolean.TRUE;
        } else if (str.equals("false")) {
            bool = Boolean.FALSE;
        }
        if (bool != null) {
            tVar.b(bool.booleanValue());
        } else {
            tVar.u(str);
        }
    }
}
