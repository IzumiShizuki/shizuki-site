package vc;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public enum k {
    f22847f("Boolean"),
    f22848g("Char"),
    f22849h("Byte"),
    f22850i("Short"),
    f22851j("Int"),
    f22852k("Float"),
    f22853l("Long"),
    f22854m("Double");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final be.e f22856a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final be.e f22857b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f22858c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f22859d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Set f22846e = vb.l.N0(new k[]{f22848g, f22849h, f22850i, f22851j, f22852k, f22853l, f22854m});

    k(String str) {
        this.f22856a = be.e.e(str);
        this.f22857b = be.e.e(str.concat("Array"));
        j jVar = new j(this, 0);
        ub.i iVar = ub.i.f21540a;
        this.f22858c = ub.a.c(iVar, jVar);
        this.f22859d = ub.a.c(iVar, new j(this, 1));
    }
}
