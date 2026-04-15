package androidx.compose.ui.input.pointer;

import c2.a;
import c2.o;
import h0.q0;
import i2.a1;
import j1.p;
import jc.l;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerHoverIconModifierElement;", "Li2/a1;", "Lc2/o;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PointerHoverIconModifierElement extends a1 {
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
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PointerHoverIconModifierElement)) {
            return false;
        }
        a aVar = q0.f7814b;
        return aVar.equals(aVar);
    }

    @Override // i2.a1
    public final p h() {
        return new o(q0.f7814b, null);
    }

    public final int hashCode() {
        return (1008 * 31) + 1237;
    }

    @Override // i2.a1
    public final void l(p pVar) {
        o oVar = (o) pVar;
        a aVar = q0.f7814b;
        if (l.a(oVar.f3267p, aVar)) {
            return;
        }
        oVar.f3267p = aVar;
        if (oVar.f3268q) {
            oVar.D0();
        }
    }

    public final String toString() {
        return "PointerHoverIconModifierElement(icon=" + q0.f7814b + ", overrideDescendants=false)";
    }
}
