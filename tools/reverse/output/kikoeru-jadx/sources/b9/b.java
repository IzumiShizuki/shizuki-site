package b9;

import ac.i;
import ag.z;
import android.net.Uri;
import bg.a2;
import bg.o0;
import da.b1;
import da.m0;
import e7.a0;
import hf.y;
import ic.n;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import jc.l;
import na.w;
import q.t0;
import ub.m;
import xf.r;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b extends i implements n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2267e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f2268f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f2269g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(long j10, File file, yb.c cVar) {
        super(2, cVar);
        this.f2267e = 0;
        this.f2268f = j10;
        this.f2269g = file;
    }

    @Override // ac.a
    public final yb.c o(Object obj, yb.c cVar) {
        switch (this.f2267e) {
            case 0:
                return new b(this.f2268f, (File) this.f2269g, cVar);
            case 1:
                return new b((m0) this.f2269g, this.f2268f, cVar, 1);
            case 2:
                return new b((b1) this.f2269g, this.f2268f, cVar, 2);
            default:
                return new b((a0) this.f2269g, this.f2268f, cVar, 3);
        }
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) throws IOException {
        y yVar = (y) obj;
        yb.c cVar = (yb.c) obj2;
        switch (this.f2267e) {
            case 0:
                b bVar = (b) o(yVar, cVar);
                ub.a0 a0Var = ub.a0.f21526a;
                bVar.u(a0Var);
                return a0Var;
            case 1:
                b bVar2 = (b) o(yVar, cVar);
                ub.a0 a0Var2 = ub.a0.f21526a;
                bVar2.u(a0Var2);
                return a0Var2;
            case 2:
                b bVar3 = (b) o(yVar, cVar);
                ub.a0 a0Var3 = ub.a0.f21526a;
                bVar3.u(a0Var3);
                return a0Var3;
            default:
                b bVar4 = (b) o(yVar, cVar);
                ub.a0 a0Var4 = ub.a0.f21526a;
                bVar4.u(a0Var4);
                return a0Var4;
        }
    }

    @Override // ac.a
    public final Object u(Object obj) throws IOException {
        int i10 = this.f2267e;
        ub.a0 a0Var = ub.a0.f21526a;
        long j10 = this.f2268f;
        Object obj2 = this.f2269g;
        switch (i10) {
            case 0:
                ub.a.f(obj);
                String str = z.f369a;
                Object objH = z.h(j10, a9.i.f(), false);
                File file = (File) obj2;
                if (!(objH instanceof m)) {
                    List list = (List) objH;
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    try {
                        r rVar = w.f15765a;
                        rVar.getClass();
                        byte[] bytes = rVar.b(new wf.d(o0.Companion.serializer(), 0), list).getBytes(ef.a.f6541a);
                        l.d(bytes, "getBytes(...)");
                        fileOutputStream.write(bytes);
                        fileOutputStream.close();
                    } finally {
                    }
                }
                return a0Var;
            case 1:
                ub.a.f(obj);
                ef.l lVar = g9.a.f7454a;
                a2 a2VarA = ((m0) obj2).A();
                String strD = a2VarA != null ? a2VarA.G : null;
                if (strD == null) {
                    strD = t0.D("https://www.dlsite.com/maniax/work/=/product_id/", w.a(j10), ".html");
                }
                na.c.i(Uri.parse(strD));
                return a0Var;
            case 2:
                ub.a.f(obj);
                ((b1) obj2).w(j10, false);
                return a0Var;
            default:
                ub.a.f(obj);
                a0.b((a0) obj2, "MusicScreen/" + j10);
                return a0Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(Object obj, long j10, yb.c cVar, int i10) {
        super(2, cVar);
        this.f2267e = i10;
        this.f2269g = obj;
        this.f2268f = j10;
    }
}
