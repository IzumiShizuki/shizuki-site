package e7;

import java.util.LinkedHashMap;
import q.t0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class n0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final LinkedHashMap f6365b = new LinkedHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f6366a = new LinkedHashMap();

    public final void a(m0 m0Var) {
        jc.l.e(m0Var, "navigator");
        String strD = g.d(m0Var.getClass());
        if (strD.length() <= 0) {
            throw new IllegalArgumentException("navigator name cannot be an empty string");
        }
        LinkedHashMap linkedHashMap = this.f6366a;
        m0 m0Var2 = (m0) linkedHashMap.get(strD);
        if (jc.l.a(m0Var2, m0Var)) {
            return;
        }
        if (m0Var2 != null && m0Var2.f6363b) {
            throw new IllegalStateException(("Navigator " + m0Var + " is replacing an already attached " + m0Var2).toString());
        }
        if (!m0Var.f6363b) {
            return;
        }
        throw new IllegalStateException(("Navigator " + m0Var + " is already attached to another NavController").toString());
    }

    public final m0 b(String str) {
        jc.l.e(str, "name");
        if (str.length() <= 0) {
            throw new IllegalArgumentException("navigator name cannot be an empty string");
        }
        m0 m0Var = (m0) this.f6366a.get(str);
        if (m0Var != null) {
            return m0Var;
        }
        throw new IllegalStateException(t0.D("Could not find Navigator with name \"", str, "\". You must call NavController.addNavigator() for each navigation type."));
    }
}
