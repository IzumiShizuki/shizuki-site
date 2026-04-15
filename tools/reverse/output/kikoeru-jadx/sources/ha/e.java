package ha;

import ac.i;
import b7.b1;
import com.cnl.kikoeru.MainApplication;
import com.cnl.kikoeru.R;
import ef.u;
import hf.y;
import ic.n;
import java.net.URLDecoder;
import java.nio.charset.Charset;
import jc.l;
import na.q;
import na.w;
import ub.a0;
import ug.x;
import xf.r;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class e extends i implements n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f8266e = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g f8267f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f8268g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(g gVar, String str, yb.c cVar) {
        super(2, cVar);
        this.f8267f = gVar;
        this.f8268g = str;
    }

    @Override // ac.a
    public final yb.c o(Object obj, yb.c cVar) {
        switch (this.f8266e) {
            case 0:
                return new e(this.f8268g, this.f8267f, cVar);
            default:
                return new e(this.f8267f, this.f8268g, cVar);
        }
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        y yVar = (y) obj;
        yb.c cVar = (yb.c) obj2;
        switch (this.f8266e) {
            case 0:
                return ((e) o(yVar, cVar)).u(a0.f21526a);
            default:
                e eVar = (e) o(yVar, cVar);
                a0 a0Var = a0.f21526a;
                eVar.u(a0Var);
                return a0Var;
        }
    }

    @Override // ac.a
    public final Object u(Object obj) {
        Object objB;
        String strH0;
        x xVar;
        int i10 = this.f8266e;
        String str = this.f8268g;
        g gVar = this.f8267f;
        switch (i10) {
            case 0:
                ub.a.f(obj);
                try {
                    r rVar = w.f15765a;
                    l.e(str, "<this>");
                    String strDecode = URLDecoder.decode(str, ef.a.f6541a.displayName());
                    l.d(strDecode, "decode(...)");
                    strH0 = u.h0(strDecode, "#", "%23", false);
                    xVar = MainApplication.f4296b;
                } catch (Throwable th2) {
                    objB = ub.a.b(th2);
                }
                if (xVar == null) {
                    l.k("DEFAULT_OKHTTP_CLIENT");
                    throw null;
                }
                ch.l lVar = new ch.l(10);
                lVar.B(strH0);
                lVar.w("authorization", "Bearer " + a9.i.f());
                lh.i iVarB = xVar.a(new b1(lVar)).f().f21762g.b();
                int iD = iVarB.d() + (-1);
                if (iD > 1024) {
                    iD = 1024;
                }
                String strD = w.d(iVarB.o(0, iD).r());
                objB = iVarB;
                if (strD != null) {
                    gVar.f8272c.setValue(strD);
                    objB = iVarB;
                }
                if (ub.n.a(objB) == null) {
                    return objB;
                }
                lh.i iVar = lh.i.f12572d;
                String strG = q.g(R.string.network_error);
                Charset charset = ef.a.f6541a;
                l.e(charset, "charset");
                byte[] bytes = strG.getBytes(charset);
                l.d(bytes, "getBytes(...)");
                return new lh.i(bytes);
            default:
                ub.a.f(obj);
                gVar.f8273d.setValue(str);
                return a0.f21526a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(String str, g gVar, yb.c cVar) {
        super(2, cVar);
        this.f8268g = str;
        this.f8267f = gVar;
    }
}
