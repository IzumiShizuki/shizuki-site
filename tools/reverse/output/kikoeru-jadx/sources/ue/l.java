package ue;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import se.k0;
import vb.r;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f21664a = new l();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e f21665b = e.f21615a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f21666c = new a(be.e.g(String.format("<Error class: %s>", Arrays.copyOf(new Object[]{"unknown class"}, 1))));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final i f21667d = c(k.CYCLIC_SUPERTYPES, new String[0]);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final i f21668e = c(k.ERROR_PROPERTY_TYPE, new String[0]);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Set f21669f = ud.e.X(new f());

    public static final g a(h hVar, boolean z10, String... strArr) {
        jc.l.e(strArr, "formatParams");
        if (!z10) {
            return new g(hVar, (String[]) Arrays.copyOf(strArr, strArr.length));
        }
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        jc.l.e(strArr2, "formatParams");
        return new m(hVar, (String[]) Arrays.copyOf(strArr2, strArr2.length));
    }

    public static final g b(h hVar, String... strArr) {
        return a(hVar, false, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static final i c(k kVar, String... strArr) {
        jc.l.e(kVar, "kind");
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        jc.l.e(strArr2, "formatParams");
        return e(kVar, r.f22819a, d(kVar, (String[]) Arrays.copyOf(strArr2, strArr2.length)), (String[]) Arrays.copyOf(strArr2, strArr2.length));
    }

    public static j d(k kVar, String... strArr) {
        jc.l.e(kVar, "kind");
        jc.l.e(strArr, "formatParams");
        return new j(kVar, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static i e(k kVar, List list, k0 k0Var, String... strArr) {
        jc.l.e(kVar, "kind");
        jc.l.e(strArr, "formatParams");
        return new i(k0Var, b(h.f21624e, k0Var.toString()), kVar, list, false, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static final boolean f(yc.k kVar) {
        if (kVar != null) {
            return (kVar instanceof a) || (kVar.y() instanceof a) || kVar == f21665b;
        }
        return false;
    }
}
