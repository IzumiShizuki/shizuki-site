package fa;

import hf.y;
import ub.a0;
import x0.w0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class o extends ac.i implements ic.n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f7020e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f7021f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ w0 f7022g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(w0 w0Var, yb.c cVar, int i10) {
        super(2, cVar);
        this.f7020e = i10;
        switch (i10) {
            case 1:
                this.f7022g = w0Var;
                super(2, cVar);
                break;
            default:
                v vVar = v.f7039a;
                this.f7022g = w0Var;
                break;
        }
    }

    @Override // ac.a
    public final yb.c o(Object obj, yb.c cVar) {
        int i10 = this.f7020e;
        w0 w0Var = this.f7022g;
        switch (i10) {
            case 0:
                v vVar = v.f7039a;
                return new o(w0Var, cVar, 0);
            default:
                return new o(w0Var, cVar, 1);
        }
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        y yVar = (y) obj;
        yb.c cVar = (yb.c) obj2;
        switch (this.f7020e) {
            case 0:
                ((o) o(yVar, cVar)).u(a0.f21526a);
                break;
            default:
                ((o) o(yVar, cVar)).u(a0.f21526a);
                break;
        }
        return zb.a.f26667a;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0087 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0027 -> B:14:0x002a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0085 -> B:31:0x0088). Please report as a decompilation issue!!! */
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
    public final java.lang.Object u(java.lang.Object r10) {
        /*
            r9 = this;
            int r0 = r9.f7020e
            x0.w0 r1 = r9.f7022g
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            zb.a r3 = zb.a.f26667a
            r4 = 1
            switch(r0) {
                case 0: goto L6a;
                default: goto Lc;
            }
        Lc:
            int r0 = r9.f7021f
            if (r0 == 0) goto L1c
            if (r0 != r4) goto L16
            ub.a.f(r10)
            goto L2a
        L16:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            r10.<init>(r2)
            throw r10
        L1c:
            ub.a.f(r10)
        L1f:
            r9.f7021f = r4
            r5 = 500(0x1f4, double:2.47E-321)
            java.lang.Object r10 = hf.a0.l(r5, r9)
            if (r10 != r3) goto L2a
            return r3
        L2a:
            androidx.media3.exoplayer.ExoPlayer r10 = h9.d.c()
            v4.v r10 = (v4.v) r10
            long r5 = r10.M()
            j9.h r10 = j9.h.f10699a
            j9.u r10 = j9.u.f10753a
            x0.e1 r10 = j9.u.f10757e
            java.lang.Object r10 = r10.getValue()
            java.util.List r10 = (java.util.List) r10
            java.lang.String r0 = "<this>"
            jc.l.e(r10, r0)
            int r0 = j9.h.a(r5, r10)
            r2 = -1
            if (r0 != r2) goto L56
            j9.f0 r10 = new j9.f0
            r5 = 0
            java.lang.String r0 = ""
            r10.<init>(r5, r0)
            goto L5c
        L56:
            java.lang.Object r10 = r10.get(r0)
            j9.f0 r10 = (j9.f0) r10
        L5c:
            java.lang.String r10 = r10.f10695b
            boolean r0 = ef.n.y0(r10)
            if (r0 != 0) goto L1f
            j9.d r0 = j9.d.f10668a
            r1.setValue(r10)
            goto L1f
        L6a:
            int r0 = r9.f7021f
            if (r0 == 0) goto L7a
            if (r0 != r4) goto L74
            ub.a.f(r10)
            goto L88
        L74:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            r10.<init>(r2)
            throw r10
        L7a:
            ub.a.f(r10)
        L7d:
            r9.f7021f = r4
            r5 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r10 = hf.a0.l(r5, r9)
            if (r10 != r3) goto L88
            return r3
        L88:
            int r10 = ff.a.f7057d
            fa.v r10 = fa.v.f7039a
            long r5 = fa.v.f7044f
            long r7 = java.lang.System.currentTimeMillis()
            long r5 = r5 - r7
            ff.c r10 = ff.c.MILLISECONDS
            long r5 = ff.f.n(r5, r10)
            pc.u[] r10 = fa.t.f7038a
            ff.a r10 = new ff.a
            r10.<init>(r5)
            r1.setValue(r10)
            goto L7d
        */
        throw new UnsupportedOperationException("Method not decompiled: fa.o.u(java.lang.Object):java.lang.Object");
    }
}
