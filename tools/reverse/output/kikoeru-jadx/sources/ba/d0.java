package ba;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d0 implements ic.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2323a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2324b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2325c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f2326d;

    public /* synthetic */ d0(int i10, d0.d dVar, hf.y yVar) {
        this.f2323a = 0;
        this.f2325c = yVar;
        this.f2326d = dVar;
        this.f2324b = i10;
    }

    @Override // ic.a
    public final Object b() {
        switch (this.f2323a) {
            case 0:
                hf.a0.y((hf.y) this.f2325c, null, null, new i0((d0.d) this.f2326d, this.f2324b, null, 0), 3);
                return ub.a0.f21526a;
            case 1:
                ch.p pVar = (ch.p) this.f2325c;
                try {
                    pVar.f4233w.q(this.f2324b, (ch.b) this.f2326d);
                    break;
                } catch (IOException e10) {
                    ch.b bVar = ch.b.f4148d;
                    pVar.b(bVar, bVar, e10);
                }
                return ub.a0.f21526a;
            case 2:
                fg.f fVar = (fg.f) this.f2325c;
                ic.k kVar = (ic.k) this.f2326d;
                int iIntValue = ((Number) fVar.getValue()).intValue();
                int i10 = this.f2324b;
                if (iIntValue != i10) {
                    fVar.setValue(Integer.valueOf(i10));
                } else {
                    kVar.a(Integer.valueOf(i10));
                }
                return ub.a0.f21526a;
            default:
                String str = (String) this.f2325c;
                wf.x xVar = (wf.x) this.f2326d;
                int i11 = this.f2324b;
                uf.g[] gVarArr = new uf.g[i11];
                for (int i12 = 0; i12 < i11; i12++) {
                    gVarArr[i12] = ud.e.h(str + '.' + xVar.f24089e[i12], uf.k.f21708e, new uf.g[0]);
                }
                return gVarArr;
        }
    }

    public /* synthetic */ d0(int i10, String str, wf.x xVar) {
        this.f2323a = 3;
        this.f2324b = i10;
        this.f2325c = str;
        this.f2326d = xVar;
    }

    public /* synthetic */ d0(Object obj, int i10, Object obj2, int i11) {
        this.f2323a = i11;
        this.f2325c = obj;
        this.f2324b = i10;
        this.f2326d = obj2;
    }
}
