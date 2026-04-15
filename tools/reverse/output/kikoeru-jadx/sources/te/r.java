package te;

import se.i0;
import se.w0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p f20747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final n f20748b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final q f20749c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final o f20750d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ r[] f20751e;

    static {
        p pVar = new p();
        f20747a = pVar;
        n nVar = new n();
        f20748b = nVar;
        q qVar = new q();
        f20749c = qVar;
        o oVar = new o();
        f20750d = oVar;
        f20751e = new r[]{pVar, nVar, qVar, oVar};
    }

    public static r b(w0 w0Var) {
        jc.l.e(w0Var, "<this>");
        if (w0Var.u()) {
            return f20748b;
        }
        if (w0Var instanceof se.l) {
        }
        return se.c.i(e.f20726b.a(), se.c.n(w0Var), i0.f19955b) ? f20750d : f20749c;
    }

    public static r valueOf(String str) {
        return (r) Enum.valueOf(r.class, str);
    }

    public static r[] values() {
        return (r[]) f20751e.clone();
    }

    public abstract r a(w0 w0Var);
}
