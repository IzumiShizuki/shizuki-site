package cd;

import jc.l;
import wb.e;
import yc.a1;
import yc.d1;
import yc.e1;
import yc.y0;
import yc.z0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a extends e1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f3889c = new a("package", false);

    @Override // yc.e1
    public final Integer a(e1 e1Var) {
        l.e(e1Var, "visibility");
        if (this == e1Var) {
            return 0;
        }
        e eVar = d1.f26104a;
        return (e1Var == y0.f26161c || e1Var == z0.f26164c) ? 1 : -1;
    }

    @Override // yc.e1
    public final String b() {
        return "public/*package*/";
    }

    @Override // yc.e1
    public final e1 c() {
        return a1.f26093c;
    }
}
