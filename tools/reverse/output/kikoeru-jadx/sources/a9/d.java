package a9;

import java.util.ArrayList;
import lf.b1;
import ub.a0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements ic.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f221a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f222b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f223c;

    public /* synthetic */ d(int i10, Object obj, Object obj2) {
        this.f221a = i10;
        this.f222b = obj;
        this.f223c = obj2;
    }

    private final Object f() {
        e7.l lVar = (e7.l) this.f222b;
        e7.j jVar = (e7.j) this.f223c;
        synchronized (lVar.f6353a) {
            try {
                b1 b1Var = lVar.f6354b;
                Iterable iterable = (Iterable) b1Var.getValue();
                ArrayList arrayList = new ArrayList();
                for (Object obj : iterable) {
                    if (jc.l.a((e7.j) obj, jVar)) {
                        break;
                    }
                    arrayList.add(obj);
                }
                b1Var.getClass();
                b1Var.m(null, arrayList);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return a0.f21526a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x031d A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x011d  */
    /* JADX WARN: Type inference failed for: r5v0, types: [yb.c] */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v28 */
    @Override // ic.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b() {
        /*
            Method dump skipped, instruction units count: 1296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a9.d.b():java.lang.Object");
    }

    public /* synthetic */ d(int i10, Object obj, Object obj2, boolean z10) {
        this.f221a = i10;
        this.f223c = obj;
        this.f222b = obj2;
    }

    public /* synthetic */ d(e7.l lVar, e7.j jVar, boolean z10) {
        this.f221a = 9;
        this.f222b = lVar;
        this.f223c = jVar;
    }
}
