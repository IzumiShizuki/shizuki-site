package ef;

import j2.h0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final f f6557d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final f f6558e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f6559a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f6560b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f6561c;

    static {
        d dVar = d.f6553a;
        e eVar = e.f6554c;
        f6557d = new f(false, dVar, eVar);
        f6558e = new f(true, dVar, eVar);
    }

    public f(boolean z10, d dVar, e eVar) {
        jc.l.e(dVar, "bytes");
        jc.l.e(eVar, "number");
        this.f6559a = z10;
        this.f6560b = dVar;
        this.f6561c = eVar;
    }

    public final String toString() {
        StringBuilder sbP = h0.p("HexFormat(\n    upperCase = ");
        sbP.append(this.f6559a);
        sbP.append(",\n    bytes = BytesHexFormat(\n");
        this.f6560b.a("        ", sbP);
        sbP.append('\n');
        sbP.append("    ),");
        sbP.append('\n');
        sbP.append("    number = NumberHexFormat(");
        sbP.append('\n');
        this.f6561c.a("        ", sbP);
        sbP.append('\n');
        sbP.append("    )");
        sbP.append('\n');
        sbP.append(")");
        return sbP.toString();
    }
}
