package vd;

import java.security.AccessControlException;
import java.util.HashMap;
import ld.w;
import ud.o;
import ud.q;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class e implements q {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final boolean f22946i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final HashMap f22947j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f22948a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f22949b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f22950c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String[] f22951d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String[] f22952e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String[] f22953f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public a f22954g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String[] f22955h;

    static {
        try {
            f22946i = "true".equals(System.getProperty("kotlin.ignore.old.metadata"));
        } catch (AccessControlException unused) {
            f22946i = false;
        }
        HashMap map = new HashMap();
        f22947j = map;
        map.put(lc.b.X(new be.c("kotlin.jvm.internal.KotlinClass")), a.f22933e);
        map.put(lc.b.X(new be.c("kotlin.jvm.internal.KotlinFileFacade")), a.f22934f);
        map.put(lc.b.X(new be.c("kotlin.jvm.internal.KotlinMultifileClass")), a.f22936h);
        map.put(lc.b.X(new be.c("kotlin.jvm.internal.KotlinMultifileClassPart")), a.f22937i);
        map.put(lc.b.X(new be.c("kotlin.jvm.internal.KotlinSyntheticClass")), a.f22935g);
    }

    @Override // ud.q
    public final o e(be.b bVar, dd.a aVar) {
        a aVar2;
        be.c cVarA = bVar.a();
        if (cVarA.equals(w.f12257a)) {
            return new c(this, 0);
        }
        if (cVarA.equals(w.f12271o)) {
            return new c(this, 1);
        }
        if (f22946i || this.f22954g != null || (aVar2 = (a) f22947j.get(bVar)) == null) {
            return null;
        }
        this.f22954g = aVar2;
        return new c(this, 2);
    }
}
