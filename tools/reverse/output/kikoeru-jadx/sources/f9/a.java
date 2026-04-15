package f9;

import ac.i;
import hf.y;
import ic.k;
import ic.n;
import java.io.Serializable;
import ub.a0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a extends i implements n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f6926e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Serializable f6927f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f6928g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f6929h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f6930i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f6931j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f6932k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i10, yb.c cVar, int i11) {
        super(i10, cVar);
        this.f6926e = i11;
    }

    @Override // ac.a
    public final yb.c o(Object obj, yb.c cVar) {
        switch (this.f6926e) {
            case 0:
                a aVar = new a(2, cVar, 0);
                aVar.f6932k = obj;
                return aVar;
            case 1:
                a aVar2 = new a(2, cVar, 1);
                aVar2.f6932k = obj;
                return aVar2;
            default:
                a aVar3 = new a((k) this.f6928g, (String) this.f6929h, cVar);
                aVar3.f6932k = obj;
                return aVar3;
        }
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        y yVar = (y) obj;
        yb.c cVar = (yb.c) obj2;
        switch (this.f6926e) {
        }
        return ((a) o(yVar, cVar)).u(a0.f21526a);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0083  */
    @Override // ac.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object u(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 486
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f9.a.u(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(k kVar, String str, yb.c cVar) {
        super(2, cVar);
        this.f6926e = 2;
        this.f6928g = kVar;
        this.f6929h = str;
    }
}
