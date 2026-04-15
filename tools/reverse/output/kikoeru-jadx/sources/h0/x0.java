package h0;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class x0 extends ac.h implements ic.n {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f7930c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f7931d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f7932e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f7933f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f7934g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x0(int i10, Object obj, yb.c cVar) {
        super(2, cVar);
        this.f7930c = i10;
        this.f7934g = obj;
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [ac.h, ic.n] */
    @Override // ac.a
    public final yb.c o(Object obj, yb.c cVar) {
        switch (this.f7930c) {
            case 0:
                x0 x0Var = new x0(0, (c1) this.f7934g, cVar);
                x0Var.f7932e = obj;
                return x0Var;
            case 1:
                x0 x0Var2 = new x0((l0.s0) this.f7933f, (l0.x) this.f7934g, cVar, 1);
                x0Var2.f7932e = obj;
                return x0Var2;
            case 2:
                x0 x0Var3 = new x0((yb.h) this.f7933f, (ic.n) this.f7934g, cVar);
                x0Var3.f7932e = obj;
                return x0Var3;
            case 3:
                x0 x0Var4 = new x0(3, (r2.a) this.f7934g, cVar);
                x0Var4.f7933f = obj;
                return x0Var4;
            default:
                x0 x0Var5 = new x0((c2.m) this.f7933f, (jc.y) this.f7934g, cVar, 4);
                x0Var5.f7932e = obj;
                return x0Var5;
        }
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        switch (this.f7930c) {
            case 0:
                return ((x0) o((c2.i0) obj, (yb.c) obj2)).u(ub.a0.f21526a);
            case 1:
                return ((x0) o((c2.i0) obj, (yb.c) obj2)).u(ub.a0.f21526a);
            case 2:
                return ((x0) o((c2.i0) obj, (yb.c) obj2)).u(ub.a0.f21526a);
            case 3:
                return ((x0) o((df.l) obj, (yb.c) obj2)).u(ub.a0.f21526a);
            default:
                return ((x0) o((c2.i0) obj, (yb.c) obj2)).u(ub.a0.f21526a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:79:0x015b A[Catch: CancellationException -> 0x0142, TRY_ENTER, TryCatch #0 {CancellationException -> 0x0142, blocks: (B:79:0x015b, B:82:0x0169, B:68:0x013e, B:73:0x0149), top: B:140:0x0122 }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0188 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Type inference failed for: r0v35, types: [ac.h, ic.n] */
    /* JADX WARN: Type inference failed for: r11v4, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v16, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:128:0x023d -> B:130:0x0241). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00aa -> B:35:0x00ae). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x0116 -> B:56:0x0117). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:83:0x0172 -> B:77:0x0155). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:88:0x0183 -> B:77:0x0155). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // ac.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object u(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 632
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.x0.u(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x0(Object obj, Serializable serializable, yb.c cVar, int i10) {
        super(2, cVar);
        this.f7930c = i10;
        this.f7933f = obj;
        this.f7934g = serializable;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public x0(yb.h hVar, ic.n nVar, yb.c cVar) {
        super(2, cVar);
        this.f7930c = 2;
        this.f7933f = hVar;
        this.f7934g = (ac.h) nVar;
    }
}
