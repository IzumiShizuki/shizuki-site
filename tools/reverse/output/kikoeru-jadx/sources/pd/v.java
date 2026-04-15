package pd;

import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class v implements ic.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17080a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z f17081b;

    public /* synthetic */ v(z zVar, int i10) {
        this.f17080a = i10;
        this.f17081b = zVar;
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
    @Override // ic.a
    public final Object b() {
        switch (this.f17080a) {
            case 0:
                le.f fVar = le.f.f12310m;
                le.o.f12336a.getClass();
                le.l lVar = le.l.f12329b;
                jc.l.e(fVar, "kindFilter");
                List list = fVar.f12317a;
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                boolean zA = fVar.a(le.f.f12309l);
                z zVar = this.f17081b;
                gd.b bVar = gd.b.f7517d;
                if (zA) {
                    for (be.e eVar : zVar.h(fVar, lVar)) {
                        lVar.a(eVar);
                        bf.m.a(linkedHashSet, zVar.a(eVar, bVar));
                    }
                }
                if (fVar.a(le.f.f12306i) && !list.contains(le.b.f12295a)) {
                    for (be.e eVar2 : zVar.i(fVar, lVar)) {
                        lVar.a(eVar2);
                        linkedHashSet.addAll(zVar.f(eVar2, bVar));
                    }
                }
                if (fVar.a(le.f.f12307j) && !list.contains(le.b.f12295a)) {
                    for (be.e eVar3 : zVar.o(fVar)) {
                        lVar.a(eVar3);
                        linkedHashSet.addAll(zVar.b(eVar3, bVar));
                    }
                }
                return vb.m.G0(linkedHashSet);
            case 1:
                return this.f17081b.k();
            case 2:
                return this.f17081b.i(le.f.f12313p, null);
            case 3:
                return this.f17081b.o(le.f.f12314q);
            default:
                return this.f17081b.h(le.f.f12312o, null);
        }
    }
}
