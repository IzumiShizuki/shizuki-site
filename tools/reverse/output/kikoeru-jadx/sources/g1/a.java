package g1;

import bg.p;
import c7.e1;
import ub.a0;
import x0.w0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements ic.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7123a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7124b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f7125c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f7126d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f7127e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f7128f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f7129g;

    public /* synthetic */ a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        this.f7123a = i10;
        this.f7124b = obj;
        this.f7125c = obj2;
        this.f7126d = obj3;
        this.f7127e = obj4;
        this.f7128f = obj5;
        this.f7129g = obj6;
    }

    @Override // ic.a
    public final Object b() throws Exception {
        boolean z10;
        switch (this.f7123a) {
            case 0:
                b bVar = (b) this.f7124b;
                k kVar = (k) this.f7125c;
                g gVar = (g) this.f7126d;
                String str = (String) this.f7127e;
                Object[] objArr = (Object[]) this.f7129g;
                boolean z11 = true;
                if (bVar.f7131b != gVar) {
                    bVar.f7131b = gVar;
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (jc.l.a(bVar.f7132c, str)) {
                    z11 = z10;
                } else {
                    bVar.f7132c = str;
                }
                bVar.f7130a = kVar;
                bVar.f7133d = this.f7128f;
                bVar.f7134e = objArr;
                f fVar = bVar.f7135f;
                if (fVar != null && z11) {
                    ((e1) fVar).i0();
                    bVar.f7135f = null;
                    bVar.b();
                }
                break;
            default:
                w0 w0Var = (w0) this.f7124b;
                ic.k kVar2 = (ic.k) this.f7125c;
                p pVar = (p) this.f7126d;
                w0 w0Var2 = (w0) this.f7127e;
                w0 w0Var3 = (w0) this.f7128f;
                w0 w0Var4 = (w0) this.f7129g;
                w0Var.setValue(Boolean.FALSE);
                String str2 = (String) w0Var2.getValue();
                String str3 = (String) w0Var3.getValue();
                int iIntValue = ((Number) w0Var4.getValue()).intValue();
                String str4 = pVar.f2937a;
                String str5 = pVar.f2938b;
                String str6 = pVar.f2940d;
                int i10 = pVar.f2941e;
                String str7 = pVar.f2944h;
                String str8 = pVar.f2945i;
                int i11 = pVar.f2946j;
                boolean z12 = pVar.f2947k;
                long j10 = pVar.f2948l;
                String str9 = pVar.f2949m;
                jc.l.e(str4, "id");
                jc.l.e(str5, "user_name");
                jc.l.e(str6, "locale");
                jc.l.e(str2, "name");
                jc.l.e(str3, "description");
                jc.l.e(str7, "created_at");
                jc.l.e(str8, "updated_at");
                kVar2.a(new p(str4, str5, iIntValue, str6, i10, str2, str3, str7, str8, i11, z12, j10, str9));
                break;
        }
        return a0.f21526a;
    }
}
