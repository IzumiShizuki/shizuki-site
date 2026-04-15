package q;

import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class q0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final q0 f17410b = new q0(new y1((s0) null, (w1) null, (z) null, (nd.h) null, (LinkedHashMap) null, 63));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y1 f17411a;

    public q0(y1 y1Var) {
        this.f17411a = y1Var;
    }

    public final q0 a(q0 q0Var) {
        y1 y1Var = q0Var.f17411a;
        s0 s0Var = y1Var.f17479a;
        y1 y1Var2 = this.f17411a;
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
        return new q0(new y1(s0Var, w1Var, zVar, (nd.h) null, vb.w.x(y1Var2.f17483e, y1Var.f17483e), 16));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof q0) && jc.l.a(((q0) obj).f17411a, this.f17411a);
    }

    public final int hashCode() {
        return this.f17411a.hashCode();
    }

    public final String toString() {
        if (equals(f17410b)) {
            return "EnterTransition.None";
        }
        StringBuilder sb = new StringBuilder("EnterTransition: \nFade - ");
        y1 y1Var = this.f17411a;
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
        return sb.toString();
    }
}
