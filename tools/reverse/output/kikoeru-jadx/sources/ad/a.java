package ad;

import java.util.Collection;
import jc.l;
import vb.r;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a implements b, d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f308b = new a(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f309c = new a(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f310d = new a(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f311a;

    public /* synthetic */ a(int i10) {
        this.f311a = i10;
    }

    @Override // ad.b
    public Collection a(yc.e eVar) {
        return r.f22819a;
    }

    @Override // ad.b
    public Collection b(yc.e eVar) {
        l.e(eVar, "classDescriptor");
        return r.f22819a;
    }

    @Override // ad.b
    public Collection c(yc.e eVar) {
        return r.f22819a;
    }

    @Override // ad.b
    public Collection d(be.e eVar, yc.e eVar2) {
        l.e(eVar, "name");
        l.e(eVar2, "classDescriptor");
        return r.f22819a;
    }

    @Override // ad.d
    public boolean e(yc.e eVar, qe.r rVar) {
        switch (this.f311a) {
            case 1:
                l.e(eVar, "classDescriptor");
                return true;
            default:
                l.e(eVar, "classDescriptor");
                return !rVar.getAnnotations().f(e.f312a);
        }
    }
}
