package zc;

import vb.r;
import vb.w;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final be.e f26691a = be.e.e("message");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final be.e f26692b = be.e.e("replaceWith");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final be.e f26693c = be.e.e("level");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final be.e f26694d = be.e.e("expression");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final be.e f26695e = be.e.e("imports");

    public static final j a(vc.i iVar, String str, String str2, String str3) {
        jc.l.e(iVar, "<this>");
        jc.l.e(str, "message");
        jc.l.e(str2, "replaceWith");
        j jVar = new j(iVar, vc.n.f22886o, w.v(new ub.k(f26694d, new ge.w(str2)), new ub.k(f26695e, new ge.b(r.f22819a, new vc.g(iVar, 1)))));
        be.c cVar = vc.n.f22884m;
        ub.k kVar = new ub.k(f26691a, new ge.w(str));
        ub.k kVar2 = new ub.k(f26692b, new ge.a((Object) jVar));
        be.c cVar2 = vc.n.f22885n;
        jc.l.e(cVar2, "topLevelFqName");
        return new j(iVar, cVar, w.v(kVar, kVar2, new ub.k(f26693c, new ge.i(new be.b(cVar2.b(), cVar2.f2744a.g()), be.e.e(str3)))));
    }
}
