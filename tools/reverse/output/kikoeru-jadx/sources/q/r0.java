package q;

import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class r0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final r0 f17434b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final r0 f17435c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y1 f17436a;

    static {
        LinkedHashMap linkedHashMap = null;
        s0 s0Var = null;
        w1 w1Var = null;
        z zVar = null;
        nd.h hVar = null;
        f17434b = new r0(new y1(s0Var, w1Var, zVar, hVar, linkedHashMap, 63));
        f17435c = new r0(new y1(s0Var, w1Var, zVar, hVar, linkedHashMap, 47));
    }

    public r0(y1 y1Var) {
        this.f17436a = y1Var;
    }

    public final r0 a(r0 r0Var) {
        y1 y1Var = r0Var.f17436a;
        s0 s0Var = y1Var.f17479a;
        y1 y1Var2 = this.f17436a;
        if (s0Var == null) {
            s0Var = y1Var2.f17479a;
        }
        w1 w1Var = y1Var.f17480b;
        if (w1Var == null) {
            w1Var = y1Var2.f17480b;
        }
        z zVar = y1Var.f17481c;
        if (zVar == null) {
            zVar = y1Var2.f17481c;
        }
        return new r0(new y1(s0Var, w1Var, zVar, (nd.h) null, y1Var.f17482d || y1Var2.f17482d, vb.w.x(y1Var2.f17483e, y1Var.f17483e)));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof r0) && jc.l.a(((r0) obj).f17436a, this.f17436a);
    }

    public final int hashCode() {
        return this.f17436a.hashCode();
    }

    public final String toString() {
        if (equals(f17434b)) {
            return "ExitTransition.None";
        }
        if (equals(f17435c)) {
            return "ExitTransition.KeepUntilTransitionsFinished";
        }
        StringBuilder sb = new StringBuilder("ExitTransition: \nFade - ");
        y1 y1Var = this.f17436a;
        s0 s0Var = y1Var.f17479a;
        sb.append(s0Var != null ? s0Var.toString() : null);
        sb.append(",\nSlide - ");
        w1 w1Var = y1Var.f17480b;
        sb.append(w1Var != null ? w1Var.toString() : null);
        sb.append(",\nShrink - ");
        z zVar = y1Var.f17481c;
        sb.append(zVar != null ? zVar.toString() : null);
        sb.append(",\nScale - ");
        sb.append((String) null);
        sb.append(",\nKeepUntilTransitionsFinished - ");
        sb.append(y1Var.f17482d);
        return sb.toString();
    }
}
