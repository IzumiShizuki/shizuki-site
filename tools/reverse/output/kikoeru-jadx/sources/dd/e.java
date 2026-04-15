package dd;

import ed.s;
import java.util.ArrayList;
import jc.l;
import oe.m;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class e implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f5869a = new e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e f5870b = new e();

    @Override // oe.m
    public void a(yc.c cVar) {
        l.e(cVar, "descriptor");
        throw new IllegalStateException("Cannot infer visibility for " + cVar);
    }

    @Override // oe.m
    public void b(yc.e eVar, ArrayList arrayList) {
        throw new IllegalStateException("Incomplete hierarchy for class " + eVar.getName() + ", unresolved classes " + arrayList);
    }

    public g c(sd.c cVar) {
        l.e(cVar, "javaElement");
        return new g((s) cVar);
    }
}
