package ye;

import java.util.Arrays;
import java.util.Collection;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final be.e f26227a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ef.l f26228b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Collection f26229c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ic.k f26230d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e[] f26231e;

    public h(be.e eVar, ef.l lVar, Collection collection, ic.k kVar, e... eVarArr) {
        this.f26227a = eVar;
        this.f26228b = lVar;
        this.f26229c = collection;
        this.f26230d = kVar;
        this.f26231e = eVarArr;
    }

    public /* synthetic */ h(be.e eVar, e[] eVarArr) {
        this(eVar, eVarArr, g.f26217b);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h(be.e eVar, e[] eVarArr, ic.k kVar) {
        this(eVar, null, null, kVar, (e[]) Arrays.copyOf(eVarArr, eVarArr.length));
        jc.l.e(eVar, "name");
    }

    public /* synthetic */ h(Collection collection, e[] eVarArr) {
        this(collection, eVarArr, g.f26219d);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h(Collection collection, e[] eVarArr, ic.k kVar) {
        this(null, null, collection, kVar, (e[]) Arrays.copyOf(eVarArr, eVarArr.length));
        jc.l.e(collection, "nameList");
    }
}
