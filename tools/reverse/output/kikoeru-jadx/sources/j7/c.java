package j7;

import ac.i;
import ba.u0;
import hf.y;
import ic.n;
import lf.p0;
import ub.a0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c extends i implements n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f10596e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f10597f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ b f10598g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(b bVar, yb.c cVar, int i10) {
        super(2, cVar);
        this.f10596e = i10;
        this.f10598g = bVar;
    }

    @Override // ac.a
    public final yb.c o(Object obj, yb.c cVar) {
        switch (this.f10596e) {
            case 0:
                return new c(this.f10598g, cVar, 0);
            case 1:
                return new c(this.f10598g, cVar, 1);
            case 2:
                return new c(this.f10598g, cVar, 2);
            default:
                return new c(this.f10598g, cVar, 3);
        }
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        y yVar = (y) obj;
        yb.c cVar = (yb.c) obj2;
        switch (this.f10596e) {
        }
        return ((c) o(yVar, cVar)).u(a0.f21526a);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // ac.a
    public final Object u(Object obj) {
        switch (this.f10596e) {
            case 0:
                int i10 = this.f10597f;
                a0 a0Var = a0.f21526a;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ub.a.f(obj);
                    return a0Var;
                }
                ub.a.f(obj);
                this.f10597f = 1;
                b bVar = this.f10598g;
                Object objH = p0.h(bVar.f10592a, new u0(25, bVar, (yb.c) null), this);
                zb.a aVar = zb.a.f26667a;
                if (objH != aVar) {
                    objH = a0Var;
                }
                return objH == aVar ? aVar : a0Var;
            case 1:
                int i11 = this.f10597f;
                a0 a0Var2 = a0.f21526a;
                if (i11 != 0) {
                    if (i11 != 1 && i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ub.a.f(obj);
                    return a0Var2;
                }
                ub.a.f(obj);
                yb.i iVar = yb.i.f26088a;
                boolean zEquals = iVar.equals(iVar);
                yb.c cVar = null;
                b bVar2 = this.f10598g;
                zb.a aVar2 = zb.a.f26667a;
                if (zEquals) {
                    this.f10597f = 1;
                    Object objH2 = p0.h(bVar2.f10592a, new u0(25, bVar2, cVar), this);
                    if (objH2 != aVar2) {
                        objH2 = a0Var2;
                    }
                    if (objH2 != aVar2) {
                        return a0Var2;
                    }
                } else {
                    c cVar2 = new c(bVar2, cVar, 0);
                    this.f10597f = 2;
                    if (hf.a0.H(iVar, cVar2, this) != aVar2) {
                        return a0Var2;
                    }
                }
                return aVar2;
            case 2:
                int i12 = this.f10597f;
                if (i12 != 0) {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ub.a.f(obj);
                    return a0.f21526a;
                }
                ub.a.f(obj);
                this.f10597f = 1;
                this.f10598g.a(this);
                return zb.a.f26667a;
            default:
                int i13 = this.f10597f;
                if (i13 == 0) {
                    ub.a.f(obj);
                    yb.i iVar2 = yb.i.f26088a;
                    boolean zEquals2 = iVar2.equals(iVar2);
                    b bVar3 = this.f10598g;
                    zb.a aVar3 = zb.a.f26667a;
                    if (zEquals2) {
                        this.f10597f = 1;
                        bVar3.a(this);
                        return aVar3;
                    }
                    c cVar3 = new c(bVar3, null, 2);
                    this.f10597f = 2;
                    if (hf.a0.H(iVar2, cVar3, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i13 != 1 && i13 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ub.a.f(obj);
                }
                return a0.f21526a;
        }
    }
}
