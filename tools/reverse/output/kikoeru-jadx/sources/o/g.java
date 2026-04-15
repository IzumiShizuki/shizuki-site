package o;

import g2.s1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class g extends ac.h implements ic.n {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f15959c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long[] f15960d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f15961e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f15962f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f15963g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f15964h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f15965i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f15966j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f15967k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Object f15968l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f15969m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(int i10, Object obj, yb.c cVar) {
        super(2, cVar);
        this.f15959c = i10;
        this.f15969m = obj;
    }

    @Override // ac.a
    public final yb.c o(Object obj, yb.c cVar) {
        switch (this.f15959c) {
            case 0:
                g gVar = new g(0, (h) this.f15969m, cVar);
                gVar.f15967k = obj;
                return gVar;
            case 1:
                g gVar2 = new g(1, (h) this.f15969m, cVar);
                gVar2.f15967k = obj;
                return gVar2;
            case 2:
                g gVar3 = new g(2, (s1) this.f15969m, cVar);
                gVar3.f15967k = obj;
                return gVar3;
            default:
                g gVar4 = new g(3, (z0.g) this.f15969m, cVar);
                gVar4.f15967k = obj;
                return gVar4;
        }
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        df.l lVar = (df.l) obj;
        yb.c cVar = (yb.c) obj2;
        switch (this.f15959c) {
        }
        return ((g) o(lVar, cVar)).u(ub.a0.f21526a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x027d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0056 -> B:23:0x009a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0058 -> B:16:0x0069). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0072 -> B:20:0x0091). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00f3 -> B:46:0x0137). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00f5 -> B:39:0x0106). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x010f -> B:43:0x012e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x018e -> B:69:0x01d2). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x0190 -> B:62:0x01a1). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:64:0x01aa -> B:66:0x01c9). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:83:0x0228 -> B:92:0x027b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:84:0x022a -> B:85:0x023c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:87:0x0245 -> B:89:0x0272). Please report as a decompilation issue!!! */
    @Override // ac.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object u(java.lang.Object r21) {
        /*
            Method dump skipped, instruction units count: 654
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.g.u(java.lang.Object):java.lang.Object");
    }
}
