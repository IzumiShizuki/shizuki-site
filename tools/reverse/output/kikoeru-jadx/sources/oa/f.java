package oa;

import app.nekogram.translator.g0;
import app.nekogram.translator.i0;
import app.nekogram.translator.k0;
import app.nekogram.translator.l0;
import app.nekogram.translator.m0;
import app.nekogram.translator.n0;
import app.nekogram.translator.q;
import app.nekogram.translator.w;
import java.util.List;
import jc.l;
import jc.z;
import pc.f0;
import ub.k;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List f16294a = ud.b.x("auto", "ja", "en", "zh-CN");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g f16295b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f16296c;

    static {
        int i10 = app.nekogram.translator.g.f1103d;
        app.nekogram.translator.g gVar = k0.f1120a;
        l.d(gVar, "getInstance(...)");
        g gVar2 = new g(gVar);
        f16295b = gVar2;
        k kVar = new k("google", gVar2);
        String str = app.nekogram.translator.d.f1088d;
        app.nekogram.translator.d dVar = i0.f1113a;
        l.d(dVar, "getInstance(...)");
        k kVar2 = new k("deepl", new g(dVar));
        k kVar3 = new k("deeplApi", d.f16293a);
        int i11 = q.f1131c;
        q qVar = m0.f1124a;
        l.d(qVar, "getInstance(...)");
        k kVar4 = new k("microsoft", new g(qVar));
        int i12 = app.nekogram.translator.k.f1119b;
        app.nekogram.translator.k kVar5 = l0.f1122a;
        l.d(kVar5, "getInstance(...)");
        k kVar6 = new k("lingo", new g(kVar5));
        int i13 = app.nekogram.translator.b.f1077h;
        app.nekogram.translator.b bVar = g0.f1106a;
        l.d(bVar, "getInstance(...)");
        k kVar7 = new k("baidu", new g(bVar));
        int i14 = w.f1143l;
        w wVar = n0.f1127a;
        l.d(wVar, "getInstance(...)");
        f16296c = vb.w.v(kVar, kVar2, kVar3, kVar4, kVar6, kVar7, new k("tencent", new g(wVar)));
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.Map] */
    public static e a() {
        e eVar = (e) f16296c.get((String) f0.P(gg.c.a(), "translateEngine", "google", z.a(String.class)).a());
        return eVar == null ? f16295b : eVar;
    }
}
