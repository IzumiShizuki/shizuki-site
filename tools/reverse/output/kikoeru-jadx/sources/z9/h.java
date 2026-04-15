package z9;

import java.nio.charset.Charset;
import m0.i5;
import m0.z8;
import na.w;
import ub.a0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements ic.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26627a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f26628b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r f26629c;

    public /* synthetic */ h(String str, r rVar) {
        this.f26628b = str;
        this.f26629c = rVar;
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        int i10 = this.f26627a;
        a0 a0Var = a0.f21526a;
        r rVar = this.f26629c;
        String str = this.f26628b;
        switch (i10) {
            case 0:
                x0.o oVar = (x0.o) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!oVar.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    oVar.Q();
                } else {
                    byte[] bArr = (byte[]) rVar.f26661i.getValue();
                    Charset charsetForName = Charset.forName(str);
                    jc.l.d(charsetForName, "forName(...)");
                    xf.r rVar2 = w.f15765a;
                    jc.l.e(bArr, "<this>");
                    z8.b(new String(bArr, charsetForName), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, oVar, 0, 0, 131070);
                }
                break;
            default:
                x0.o oVar2 = (x0.o) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!oVar2.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    oVar2.Q();
                } else {
                    i5.a(jc.l.a(str, (String) rVar.f26660h.getValue()), null, false, null, oVar2, 48, 60);
                }
                break;
        }
        return a0Var;
    }

    public /* synthetic */ h(r rVar, String str) {
        this.f26629c = rVar;
        this.f26628b = str;
    }
}
