package cg;

import android.app.Activity;
import android.view.View;
import j2.j3;
import x0.t1;
import x0.w0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class g extends ac.i implements ic.n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f4031e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f4032f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f4033g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f4034h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Object f4035i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f4036j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f4037k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f4038l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(ic.k kVar, ub.e eVar, hg.b bVar, yb.c cVar, int i10) {
        super(2, cVar);
        this.f4031e = i10;
        this.f4036j = kVar;
        this.f4037k = eVar;
        this.f4038l = bVar;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [ac.i, ic.k] */
    @Override // ac.a
    public final yb.c o(Object obj, yb.c cVar) {
        switch (this.f4031e) {
            case 0:
                g gVar = new g((Activity) this.f4034h, (b) this.f4035i, (w0) this.f4036j, (c) this.f4037k, (d) this.f4038l, cVar, 0);
                gVar.f4033g = obj;
                return gVar;
            case 1:
                g gVar2 = new g((jc.y) this.f4034h, (t1) this.f4035i, (androidx.lifecycle.x) this.f4036j, (j3) this.f4037k, (View) this.f4038l, cVar, 1);
                gVar2.f4033g = obj;
                return gVar2;
            case 2:
                g gVar3 = new g((ic.k) this.f4036j, (ic.k) this.f4037k, (hg.b) this.f4038l, cVar, 2);
                gVar3.f4033g = obj;
                return gVar3;
            case 3:
                g gVar4 = new g((kf.j) this.f4035i, (r.c) this.f4037k, (w0) this.f4036j, (w0) this.f4038l, cVar);
                gVar4.f4033g = obj;
                return gVar4;
            case 4:
                g gVar5 = new g((r.m0) this.f4037k, (ac.i) this.f4038l, cVar);
                gVar5.f4036j = obj;
                return gVar5;
            case 5:
                g gVar6 = new g((c2.x) this.f4034h, (ic.o) this.f4035i, (ic.k) this.f4036j, (ic.k) this.f4037k, (ic.k) this.f4038l, cVar, 5);
                gVar6.f4033g = obj;
                return gVar6;
            default:
                g gVar7 = new g((ic.k) this.f4036j, (ic.a) this.f4037k, (hg.b) this.f4038l, cVar, 6);
                gVar7.f4033g = obj;
                return gVar7;
        }
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        switch (this.f4031e) {
        }
        return ((g) o((hf.y) obj, (yb.c) obj2)).u(ub.a0.f21526a);
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:100:0x01e3 -> B:102:0x01e7). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: ConstInlineVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected instance arg in invoke
        	at jadx.core.dex.visitors.ConstInlineVisitor.addExplicitCast(ConstInlineVisitor.java:285)
        	at jadx.core.dex.visitors.ConstInlineVisitor.replaceArg(ConstInlineVisitor.java:267)
        	at jadx.core.dex.visitors.ConstInlineVisitor.replaceConst(ConstInlineVisitor.java:177)
        	at jadx.core.dex.visitors.ConstInlineVisitor.checkInsn(ConstInlineVisitor.java:110)
        	at jadx.core.dex.visitors.ConstInlineVisitor.process(ConstInlineVisitor.java:55)
        	at jadx.core.dex.visitors.ConstInlineVisitor.visit(ConstInlineVisitor.java:47)
        */
    @Override // ac.a
    public final java.lang.Object u(java.lang.Object r27) {
        /*
            Method dump skipped, instruction units count: 944
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cg.g.u(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, yb.c cVar, int i10) {
        super(2, cVar);
        this.f4031e = i10;
        this.f4034h = obj;
        this.f4035i = obj2;
        this.f4036j = obj3;
        this.f4037k = obj4;
        this.f4038l = obj5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(kf.j jVar, r.c cVar, w0 w0Var, w0 w0Var2, yb.c cVar2) {
        super(2, cVar2);
        this.f4031e = 3;
        this.f4035i = jVar;
        this.f4037k = cVar;
        this.f4036j = w0Var;
        this.f4038l = w0Var2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public g(r.m0 m0Var, ic.k kVar, yb.c cVar) {
        super(2, cVar);
        this.f4031e = 4;
        this.f4037k = m0Var;
        this.f4038l = (ac.i) kVar;
    }
}
