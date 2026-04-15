package androidx.compose.ui.input.pointer;

import c2.a;
import c2.c0;
import h0.q0;
import i2.a1;
import i2.o;
import j1.p;
import jc.l;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/StylusHoverIconModifierElement;", "Li2/a1;", "Lc2/c0;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class StylusHoverIconModifierElement extends a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f706a;

    public StylusHoverIconModifierElement(o oVar) {
        this.f706a = oVar;
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
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StylusHoverIconModifierElement)) {
            return false;
        }
        StylusHoverIconModifierElement stylusHoverIconModifierElement = (StylusHoverIconModifierElement) obj;
        a aVar = q0.f7815c;
        return aVar.equals(aVar) && l.a(this.f706a, stylusHoverIconModifierElement.f706a);
    }

    @Override // i2.a1
    public final p h() {
        return new c0(q0.f7815c, this.f706a);
    }

    public final int hashCode() {
        int i10 = ((1022 * 31) + 1237) * 31;
        o oVar = this.f706a;
        return i10 + (oVar == null ? 0 : oVar.hashCode());
    }

    @Override // i2.a1
    public final void l(p pVar) {
        c0 c0Var = (c0) pVar;
        a aVar = q0.f7815c;
        if (!l.a(c0Var.f3267p, aVar)) {
            c0Var.f3267p = aVar;
            if (c0Var.f3268q) {
                c0Var.D0();
            }
        }
        c0Var.f3266o = this.f706a;
    }

    public final String toString() {
        return "StylusHoverIconModifierElement(icon=" + q0.f7815c + ", overrideDescendants=false, touchBoundsExpansion=" + this.f706a + ')';
    }
}
