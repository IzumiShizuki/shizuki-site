package da;

import android.database.Cursor;
import com.cnl.kikoeru.R;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class y extends ac.i implements ic.n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f5849e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f5850f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(long j10, yb.c cVar, int i10) {
        super(2, cVar);
        this.f5849e = i10;
        this.f5850f = j10;
    }

    @Override // ac.a
    public final yb.c o(Object obj, yb.c cVar) {
        switch (this.f5849e) {
            case 0:
                return new y(this.f5850f, cVar, 0);
            case 1:
                return new y(this.f5850f, cVar, 1);
            case 2:
                return new y(this.f5850f, cVar, 2);
            case 3:
                return new y(this.f5850f, cVar, 3);
            default:
                return new y(this.f5850f, cVar, 4);
        }
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        hf.y yVar = (hf.y) obj;
        yb.c cVar = (yb.c) obj2;
        switch (this.f5849e) {
            case 0:
                y yVar2 = (y) o(yVar, cVar);
                ub.a0 a0Var = ub.a0.f21526a;
                yVar2.u(a0Var);
                return a0Var;
            case 1:
                y yVar3 = (y) o(yVar, cVar);
                ub.a0 a0Var2 = ub.a0.f21526a;
                yVar3.u(a0Var2);
                return a0Var2;
            case 2:
                y yVar4 = (y) o(yVar, cVar);
                ub.a0 a0Var3 = ub.a0.f21526a;
                yVar4.u(a0Var3);
                return a0Var3;
            case 3:
                y yVar5 = (y) o(yVar, cVar);
                ub.a0 a0Var4 = ub.a0.f21526a;
                yVar5.u(a0Var4);
                return a0Var4;
            default:
                y yVar6 = (y) o(yVar, cVar);
                ub.a0 a0Var5 = ub.a0.f21526a;
                yVar6.u(a0Var5);
                return a0Var5;
        }
    }

    @Override // ac.a
    public final Object u(Object obj) {
        int i10 = this.f5849e;
        ub.a0 a0Var = ub.a0.f21526a;
        long j10 = this.f5850f;
        int i11 = 0;
        switch (i10) {
            case 0:
                ub.a.f(obj);
                ef.l lVar = g9.a.f7454a;
                na.q.f("https://www.asmr-300.com/work/" + j10);
                return a0Var;
            case 1:
                ub.a.f(obj);
                ef.l lVar2 = g9.a.f7454a;
                g9.a.d(j10);
                return a0Var;
            case 2:
                ub.a.f(obj);
                ef.l lVar3 = g9.a.f7454a;
                g9.a.d(j10);
                return a0Var;
            case 3:
                ub.a.f(obj);
                ua.l.W(a9.i.c().s().f5579a, false, true, new d9.l(j10, i11));
                ub.p pVar = b9.d.f2273a;
                Iterator it = ud.b.x("RJ" + j10 + ".cover", "RJ" + j10 + ".work", "RJ" + j10 + ".tree").iterator();
                while (it.hasNext()) {
                    File file = new File(b9.d.a(), (String) it.next());
                    if (file.exists()) {
                        file.delete();
                    }
                }
                androidx.media3.exoplayer.offline.b bVar = h9.a.a().f932b;
                int[] iArrCopyOf = Arrays.copyOf(new int[]{0, 1, 2, 3, 4, 5, 7}, 7);
                bVar.b();
                Cursor cursorC = bVar.c(androidx.media3.exoplayer.offline.b.g(iArrCopyOf), null);
                androidx.media3.exoplayer.offline.a aVar = new androidx.media3.exoplayer.offline.a(cursorC, 0);
                try {
                    ArrayList<String> arrayList = new ArrayList();
                    int count = cursorC.getCount();
                    for (int i12 = 0; i12 < count; i12++) {
                        ((Cursor) aVar.f869b).moveToPosition(i12);
                        String str = androidx.media3.exoplayer.offline.b.e(cursorC).f892a.f945a;
                        jc.l.d(str, "id");
                        if (!ef.u.k0(str, "RJ" + j10, false)) {
                            str = null;
                        }
                        if (str != null) {
                            arrayList.add(str);
                        }
                    }
                    aVar.close();
                    ub.p pVar2 = h9.a.f8233a;
                    for (String str2 : arrayList) {
                        androidx.media3.exoplayer.offline.m mVarA = h9.a.a();
                        mVarA.f935e++;
                        mVarA.f933c.obtainMessage(8, str2).sendToTarget();
                    }
                    ka.n.c(na.q.h(R.string.delete_success_files, new Integer(arrayList.size())), 0L, null, null, 511);
                    return a0Var;
                } finally {
                }
            default:
                ub.a.f(obj);
                ua.l.W(a9.i.c().t().f5585a, false, true, new d9.l(j10, 3));
                return a0Var;
        }
    }
}
